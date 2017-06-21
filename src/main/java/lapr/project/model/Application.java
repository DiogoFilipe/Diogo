package lapr.project.model;

//import lapr.project.utils.Exportable;
import lapr.project.utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

/**
 * Candidatura class.
 *
 * @author by Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class Application implements Importable<Application>, ApplicationState {

    private static final String ROOT_ELEMENT_NAME = "application";
    private static final String DESCRIPTION_BY_OMISSION = "no description";
    private static final String KEYWORDS_ELEMENT_NAME = "keywords";
    private static final String COMPANYNAME_BY_OMISSION = "no company name";
    private static final String ADDRESS_BY_OMISSION = "no address";
    private static final int CONTACT_BY_OMISSION = 0;
    private Decision decision = new Decision();
    private static final int INVITES_BY_OMISSION = 0;
    private static final double BOOTHAREA_BY_OMISSION = 0;

    
    private int invites;
    private double boothArea;
    private String companyName;
    private String address;
    private int contact;
    private List<Keyword> keywordList = new ArrayList<>();
    private String description;
    private Decision d;
    private State state;
    private boolean hasStand;

    /**
     * Constructor for Application
     *
     * @param companyName
     * @param address
     * @param contact
     * @param description CandidaturaDescription
     * @param keywordList Keyword List
     * @param decision
     * @param boothArea
     * @param invites
     */
    public Application(String companyName, String address, int contact, String description, List<Keyword> keywordList, Decision decision, double boothArea, int invites) {

        this.companyName = companyName;
        this.address = address;
        this.contact = contact;
        this.description = description;
        this.keywordList.addAll(keywordList);
        this.d = decision;
        this.boothArea = boothArea;
        this.invites = invites;
        this.hasStand = false;
        setState(ApplicationState.State.Created);
    }

    public Application() {
        this.companyName = COMPANYNAME_BY_OMISSION;
        this.address = ADDRESS_BY_OMISSION;
        this.contact = CONTACT_BY_OMISSION;
        this.description = DESCRIPTION_BY_OMISSION;
        this.keywordList.addAll(keywordList);
        this.d = decision;
        this.boothArea = BOOTHAREA_BY_OMISSION;
        this.invites = INVITES_BY_OMISSION;
        this.hasStand = false;
    }

    public Application(String companyName, String address, int contact, String description, double boothArea, int invites, List<Keyword>keywordList) {
        this.companyName = companyName;
        this.address = address;
        this.contact = contact;
        this.description = description;
        this.keywordList.addAll(keywordList);
        this.boothArea=boothArea;
        this.invites=invites;
        this.decision=new Decision();
        this.hasStand = false;
        }

    public Application(int invites, double boothArea, String description,List <Keyword> keys) {
        this.invites = invites;
        this.boothArea = boothArea;
        this.description = description;
        this.companyName = COMPANYNAME_BY_OMISSION;
        this.address = ADDRESS_BY_OMISSION;
        this.contact = CONTACT_BY_OMISSION;
        this.keywordList = keys;
        this.d = decision;
        this.hasStand = false;
        
                
    }

    
    /**
     * Returns the company name
     *
     * @return companies name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Returns the representative´s address
     *
     * @return representative´s address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the representative´s contact
     *
     * @return representatives´s contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * Obtain Candidatura's description.
     *
     * @return Candidatura description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Add a keyword to Candidatura.
     *
     * @param keyword Keyword to be added.
     */
    public void addKeyword(Keyword keyword) {
        getKeywordList().add(keyword);
    }

    /**
     * Obtain the list of existing keywords.
     *
     * @return A list of existing keywords.
     */
    public List<Keyword> getKeywordList() {
        return keywordList;

    }
    
     /**
     * @return the hasStand
     */
    public boolean HasStand() {
        return hasStand;
    }

    /**
     * @param hasStand the hasStand to set
     */
    public void setHasStand(boolean hasStand) {
        this.hasStand = hasStand;
    }

//    @Override
    public Node exportContentToXMLNode() throws ParserConfigurationException {
        Node rootNode = null;

        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        //Create document builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Obtain a new document
        Document document = builder.newDocument();

        //Create root element
        Element elementCandidatura = document.createElement(ROOT_ELEMENT_NAME);

        //Create a sub-element
        Element elementDescription = document.createElement(DESCRIPTION_BY_OMISSION);

        //Set the sub-element value
        elementDescription.setTextContent(getDescription());

        //Add sub-element to root element
        elementCandidatura.appendChild(elementDescription);

        //Create a sub-element
        Element elementKeywords = document.createElement(KEYWORDS_ELEMENT_NAME);
        elementCandidatura.appendChild(elementKeywords);

        //iterate over keywords
        for (Keyword keyword : getKeywordList()) {
            Node keywordNode = keyword.exportContentToXMLNode();
            elementKeywords.appendChild(document.importNode(keywordNode, true));
        }

        //Add root element to document
        document.appendChild(elementCandidatura);

        //It exports only the element representation to XMÇ, ommiting the XML header
        rootNode = elementCandidatura;

        return rootNode;
    }

    @Override
    public Application importContentFromXMLNode(Node node) throws ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Create document builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Obtain a new document
        Document document = builder.newDocument();
        document.appendChild(document.importNode(node, true));

        NodeList elementsCandidatura = document.getElementsByTagName(ROOT_ELEMENT_NAME);

        Node elementCandidatura = elementsCandidatura.item(0);

        //Get description
        this.description = elementCandidatura.getFirstChild().getFirstChild().getNodeValue();

        NodeList elementsKeywords = document.getElementsByTagName(KEYWORDS_ELEMENT_NAME);

        NodeList keywords = elementsKeywords.item(0).getChildNodes();
        for (int position = 0; position < keywords.getLength(); position++) {
            Node keyword = keywords.item(position);
            Keyword keywordExample = new Keyword();

            keywordExample = keywordExample.importContentFromXMLNode(keyword);
            addKeyword(keywordExample);
        }

        return this;
    }

    @Override
    public int hashCode() {
        int result = getDescription().hashCode();
        result = 31 * result + getKeywordList().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Application)) {
            return false;
        }

        Application that = (Application) o;

        if (!getDescription().equals(that.getDescription())) {
            return false;
        }
        return getKeywordList().equals(that.getKeywordList());

    }

    /**
     * @return the invites
     */
    public int getInvites() {
        return invites;
    }

    /**
     * @param invites the invites to set
     */
    public void setInvites(int invites) {
        this.invites = invites;
    }

    /**
     * @return the boothArea
     */
    public double getBoothArea() {
        return boothArea;
    }

    /**
     * @param boothArea the boothArea to set
     */
    public void setBoothArea(double boothArea) {
        this.boothArea = boothArea;
    }

    /**
     * @return the d
     */
    public Decision getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Decision d) {
        this.d = d;
    }

    public void setKeywordList(Keyword keyword) {
        this.keywordList.add(keyword);
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    
}
