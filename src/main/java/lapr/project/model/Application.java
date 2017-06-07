package lapr.project.model;

import lapr.project.utils.Exportable;
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
public class Application implements Importable<Application>, Exportable {
	private static final String ROOT_ELEMENT_NAME = "application";
	private static final String DESCRIPTION_BY_OMISSION = "no description";
	private static final String KEYWORDS_ELEMENT_NAME = "keywords";
        private static final String COMPANYNAME_BY_OMISSION = "no company name";
        private static final String ADDRESS_BY_OMISSION = "no address";
        private static final String CONTACT_BY_OMISSION = "no contact";
        private static final int FAEKNOWLEDGE_BY_OMISSION = 0;
        private static final int ADEQUACY_BY_OMISSION = 0;
        private static final int INVITATIONADEQUACY_BY_OMISSION = 0;
        private static final int OVERALLRECOMMENDATION_BY_OMISSION = 0;
        
        
        
        
        private String companyName;
        private String address;
        private String contact;
	private final List<Keyword> keywordList = new ArrayList<>();
	private String description = "";
        private int faeKnowledge;
        private int adequacy;
        private int invitationAdequacy;
        private int overallRecommendation;

	/**
	 * Constructor for Application
	 *
	 * @param description CandidaturaDescription
	 * @param keywordList Keyword List
	 */
	public Application(String companyName,String address,String contact,String description, List<Keyword> keywordList, int faeKnowledge,int adequacy,int invitationAdequacy,int overallRecommendation) {
            
                this.companyName = companyName;
                this.address = address;
                this.contact = contact;
		this.description = description;
		this.keywordList.addAll(keywordList);
                this.faeKnowledge = faeKnowledge;
                this.adequacy = adequacy;
                this.invitationAdequacy=invitationAdequacy;
                this.overallRecommendation = overallRecommendation;
                
	}

         public Application() {
                this.companyName = COMPANYNAME_BY_OMISSION;
                this.address = ADDRESS_BY_OMISSION;
                this.contact = CONTACT_BY_OMISSION;
		this.description = DESCRIPTION_BY_OMISSION;
                this.faeKnowledge = FAEKNOWLEDGE_BY_OMISSION;
                this.adequacy = ADEQUACY_BY_OMISSION;
                this.invitationAdequacy=INVITATIONADEQUACY_BY_OMISSION;
                this.overallRecommendation = OVERALLRECOMMENDATION_BY_OMISSION;
         }
        
        
        

//	/**
//	 * Default public constructor.
//	 */
//	public Application() {
//
//	}

        /**
         * Returns the company name
         * @return companies name
         */
        public String getCompanyName() {
           return companyName;
        }

  
        /**
         * Returns the representative´s address
         * @return representative´s address
         */
        public String getAddress() {
           return address;
        }

        /**
         * Returns the representative´s contact
         * @return representatives´s contact
         */
        public String getContact() {
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
        * Returns the fae´s avaliation about the application adequacy
        * @return fae´s opinion,from 0 to 5, about the application adequacy
        */
        public int getAdequacy(){
        return adequacy;
        }
        
        /**
         * Returns the fae´s self avaliation over his knowledge about the application´s theme
         * @return Fae´s self avaliation over his knowledge about the application´s theme
         */
        public int getFAEKnowledge(){
        return faeKnowledge;}
        
        /**
         * Returns the application´s invitation adequacy
         * @return The application´s invitation adequacy
         */
        public int getInvitationAdequacy(){
        return invitationAdequacy;}

        /**
         * Returns the fae Knowledge over the the application´s theme
         * @return The fae Knowledge over the the application´s theme
         */
        public int getFaeKnowledge() {
        return faeKnowledge;
        }

        /**
         * Returns tbe overall recommendation of the application
         * @return overall recommendation of the application
         */
        public int getOverallRecommendation() {
        return overallRecommendation;
        }

        /**
         * Defines the fae´s knowledge over the application theme
         * @param faeKnowledge defined
         */
        public void setFaeKnowledge(int faeKnowledge) {
        this.faeKnowledge = faeKnowledge;
        }

        /**
         * Defines the application´s overall recommendation
         * @param overallRecommendation defined
         */
        public void setOverallRecommendation(int overallRecommendation) {
         this.overallRecommendation = overallRecommendation;
        }
        
        

        /**
         * Defines the application´s companyName
         * @param companyName defined
         */
        public void setCompanyName(String companyName) {
          this.companyName = companyName;
        }

        /**
         * Defines the company´s address
         * @param address defined
         */
        public void setAddress(String address) {
          this.address = address;
        }

        /**
         * Defines the representative´s contact
         * @param contact defined
         */
        public void setContact(String contact) {
          this.contact = contact;
        }

        /**
         * Defines the application´s description
         * @param description defined
         */
        public void setDescription(String description) {
          this.description = description;
        }
        
        /**
         * Defines the faeKnowledge
         * @param faeKnowledge defined
         */
        public void setFAEKnowledge(int faeKnowledge){
          this.faeKnowledge = faeKnowledge;
        }

        /**
         * Defines the adequacy of the application
         * @param adequacy defined
         */
        public void setAdequacy(int adequacy) {
          this.adequacy = adequacy;
        }

        /**
         * Defines the invitationAdequacy of the application
         * @param invitationAdequacy defined
         */
        public void setInvitationAdequacy(int invitationAdequacy) {
          this.invitationAdequacy = invitationAdequacy;
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

	@Override
	public Node exportContentToXMLNode() throws ParserConfigurationException {
		Node rootNode = null;

		DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
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
		for (Keyword keyword : getKeywordList()
				) {
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
        
       }
