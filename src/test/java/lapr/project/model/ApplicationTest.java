/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Node;

/**
 *
 * @author João Domingues
 */
public class ApplicationTest {
    
    protected Application a;
    protected List<Keyword> klist;
    protected List<String> products;
    protected Decision dec;
    
    public ApplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new Application("tap1", "aeroportosacarneiro", 987654321,"somos uma empresa", klist, dec, 385.5, 20,products);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCompanyName method, of class Application.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        String expResult = "tap1";
        String result = a.getCompanyName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAddress method, of class Application.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String expResult = "aeroportosacarneiro";
        String result = a.getAddress();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getContact method, of class Application.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        int expResult = 987654321;
        int result = a.getContact();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescription method, of class Application.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "somos uma empresa";
        String result = a.getDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addKeyword method, of class Application.
     */
    @Test
    public void testAddKeyword() {
        System.out.println("addKeyword");
        Keyword word1 = new Keyword("conhecimento");
        a.addKeyword(word1);
        List<Keyword> result = a.getKeywordList();
        assertEquals(a.getKeywordList(), result);
        
    }

    /**
     * Test of getKeywordList method, of class Application.
     */
    @Test
    public void testGetKeywordList() {
        System.out.println("getKeywordsList");
        List<Keyword> result = a.getKeywordList();
        assertEquals(a.getKeywordList(), result);
        
    }

    /**
     * Test of HasStand method, of class Application.
     */
    @Test
    public void testHasStand() {
        System.out.println("HasStand");
        boolean expResult = false;
        boolean result = a.HasStand();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHasStand method, of class Application.
     */
    @Test
    public void testSetHasStand() {
        System.out.println("setHasStand");
        boolean hasStand = true;
        a.setHasStand(hasStand);
        boolean expResult = true;
        boolean result = a.HasStand();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of exportContentToXMLNode method, of class Application.
     */
    @Test
    public void testExportContentToXMLNode() throws Exception {
        System.out.println("exportContentToXMLNode");
        Node result = a.exportContentToXMLNode();
        assertEquals(a.exportContentToXMLNode(), result);
        
    }

    /**
     * Test of hashCode method, of class Application.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int result = a.hashCode();
        assertEquals(a.hashCode(), result);
       
    }

    /**
     * Test of equals method, of class Application.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = a;
        boolean expResult = false;
        boolean result = a.equals(o);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getInvites method, of class Application.
     */
    @Test
    public void testGetInvites() {
        System.out.println("getInvites");
        int expResult = 20;
        int result = a.getInvites();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setInvites method, of class Application.
     */
    @Test
    public void testSetInvites() {
        System.out.println("setInvites");
        int invites = 36;
        a.setInvites(invites);
        int result = a.getInvites();
        assertEquals(result, invites);
        
    }

    /**
     * Test of getBoothArea method, of class Application.
     */
    @Test
    public void testGetBoothArea() {
        System.out.println("getBoothArea");
        double expResult = 385.5;
        double result = a.getBoothArea();
        assertEquals(expResult, result, 385.5);
        
    }

    /**
     * Test of setBoothArea method, of class Application.
     */
    @Test
    public void testSetBoothArea() {
        System.out.println("setBoothArea");
        double expResult = 35.5;
        a.setBoothArea(expResult);
        double result = a.getBoothArea();
        assertEquals(expResult, result, 35.5);
        
    }

    /**
     * Test of getD method, of class Application.
     */
    @Test
    public void testGetD() {
        System.out.println("getD");
        Decision result = a.getD();
        assertEquals(dec, result);
        
    }

    /**
     * Test of setD method, of class Application.
     */
    @Test
    public void testSetD() {
        System.out.println("setD");
        Decision de = dec;
        a.setD(de);
        Decision result = a.getD();
        assertEquals(result, de);
        
    }

    /**
     * Test of setState method, of class Application.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        ApplicationState.State state = ApplicationState.State.Assigned;
        a.setState(state);
        ApplicationState.State result = a.getState();
        assertEquals(result, state);
        
    }

    /**
     * Test of setCompanyName method, of class Application.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "ryanair";
        a.setCompanyName(companyName);
        String result = a.getCompanyName();
        assertEquals(result, companyName);
        
    }

    /**
     * Test of setAddress method, of class Application.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "aeroportoisep2016";
        a.setAddress(address);
        String result = a.getAddress();
        assertEquals(result, address);
    }

    /**
     * Test of setContact method, of class Application.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        int contact = 123456789;
        a.setContact(contact);
        int result = a.getContact();
        assertEquals(result, contact);
    }

    /**
     * Test of setKeywordList method, of class Application.
     */
    @Test
    public void testSetKeywordList() {
        System.out.println("setKeywordList");
         List<Keyword> keywordList = a.getKeywordList();
         a.setKeywordList(keywordList);
         List<Keyword> result = keywordList;
         assertEquals(result, keywordList);
         
       
    }

    /**
     * Test of setDescription method, of class Application.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "confianca";
        a.setDescription(description);
        String result = a.getDescription();
        assertEquals(result, description);
        
    }

    /**
     * Test of getState method, of class Application.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        ApplicationState.State expResult = a.getState();
        ApplicationState.State result = a.getState();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProducts method, of class Application.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        List<String> expResult = a.getProducts();
        List<String> result = a.getProducts();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setProducts method, of class Application.
     */
    @Test
    public void testSetProducts() {
        System.out.println("setProducts");
        List<String> products = a.getProducts();
        a.setProducts(products);
        List<String> result = a.getProducts();
        assertEquals(products, result);
        
        
    }

    /**
     * Test of getContactString method, of class Application.
     */
    @Test
    public void testGetContactString() {
        System.out.println("getContactString");
        String expResult = a.getContactString();
        String result = a.getContactString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNInvitesString method, of class Application.
     */
    @Test
    public void testGetNInvitesString() {
        System.out.println("getNInvitesString");
        String expResult = a.getNInvitesString();
        String result = a.getNInvitesString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAreaString method, of class Application.
     */
    @Test
    public void testGetAreaString() {
        System.out.println("getAreaString");
        String expResult = a.getAreaString();
        String result = a.getAreaString();
        assertEquals(expResult, result);
       
    }
    
}
