/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
public class KeywordTest {
   
    protected Keyword kw;
    
    
    
    
    public KeywordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         kw = new Keyword("isep");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class Keyword.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        String expResult = "isep";
        String result = kw.getValue();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of exportContentToXMLNode method, of class Keyword.
     */
    @Test
    public void testExportContentToXMLNode() throws Exception {
        System.out.println("exportContentToXMLNode");
        Node result = kw.exportContentToXMLNode();
        assertEquals(kw.exportContentToXMLNode(), result);
        
    }

    /**
     * Test of setValue method, of class Keyword.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        String value = "informatica";
        kw.setValue(value);
        String result = kw.getValue();
        assertEquals(result, value);
       
    }
    
}
