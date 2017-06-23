package lapr.project.model;

//import lapr.project.utils.Exportable;
import java.io.Serializable;
import lapr.project.utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Represents a keyword.
 *
 * @author by Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class Keyword implements Serializable {

    private static final long serialVersionUID = -6149514296117538317L;

    /**
     * root element name
     */
    private static final String ROOT_ELEMENT_NAME = "keyword";

    /**
     * value element name
     */
    private static final String VALUE_ELEMENT_NAME = "value";

    /**
     * Keyword representation.
     */
    private String value;

    /**
     * Default empty constructor.
     */
    public Keyword() {

    }

    /**
     * Constructor for Keyword Class.
     *
     * @param keyword Keyword being used.
     */
    public Keyword(String keyword) {
        this.value = keyword;
    }

    /**
     * Obtain keyword value.
     *
     * @return Keyword Value
     */
    public String getValue() {
        return value;
    }

//    @Override
    public Node exportContentToXMLNode() throws ParserConfigurationException {
        Node node = null;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //Create document builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Obtain a new document
        Document document = builder.newDocument();

        //Create root element
        Element elementKeyword = document.createElement(ROOT_ELEMENT_NAME);

        //Create a sub-element
        Element elementValue = document.createElement(VALUE_ELEMENT_NAME);

        //Set the sub-element value
        elementValue.setTextContent(getValue());

        //Add sub-element to root element
        elementKeyword.appendChild(elementValue);

        //Add root element to document
        document.appendChild(elementKeyword);

        node = elementKeyword;

        return node;
    }


    /**
     *
     * @Override public int hashCode() { return getValue().hashCode(); }
     *
     * @Override public boolean equals(Object o) { if (this == o) { return true;
     * } if (!(o instanceof Keyword)) { return false; }
     *
     * Keyword that = (Keyword) o;
     *
     * return getValue().equals(that.getValue());
     *
     * }
     *
     * /
     **
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
