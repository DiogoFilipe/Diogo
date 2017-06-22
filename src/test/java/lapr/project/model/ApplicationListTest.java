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

/**
 *
 * @author João Domingues
 */
public class ApplicationListTest {
    
    public ApplicationListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getApplicationList method, of class ApplicationList.
     */
    @Test
    public void testGetApplicationList() {
        System.out.println("getApplicationList");
        ApplicationList instance = new ApplicationList();
        List<Application> expResult = null;
        List<Application> result = instance.getApplicationList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationsList method, of class ApplicationList.
     */
    @Test
    public void testGetApplicationsList() {
        System.out.println("getApplicationsList");
        ApplicationList instance = new ApplicationList();
        List<String> expResult = null;
        List<String> result = instance.getApplicationsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplication method, of class ApplicationList.
     */
    @Test
    public void testGetApplication() {
        System.out.println("getApplication");
        String description = "";
        ApplicationList instance = new ApplicationList();
        Application expResult = null;
        Application result = instance.getApplication(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationByCompanyName method, of class ApplicationList.
     */
    @Test
    public void testGetApplicationByCompanyName() {
        System.out.println("getApplicationByCompanyName");
        String companyName = "";
        ApplicationList instance = new ApplicationList();
        Application expResult = null;
        Application result = instance.getApplicationByCompanyName(companyName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeywordsList method, of class ApplicationList.
     */
    @Test
    public void testGetKeywordsList() {
        System.out.println("getKeywordsList");
        ApplicationList instance = new ApplicationList();
        List<Keyword> expResult = null;
        List<Keyword> result = instance.getKeywordsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationListAccepted method, of class ApplicationList.
     */
    @Test
    public void testGetApplicationListAccepted() {
        System.out.println("getApplicationListAccepted");
        ApplicationList instance = new ApplicationList();
        List<String> expResult = null;
        List<String> result = instance.getApplicationListAccepted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationListRejected method, of class ApplicationList.
     */
    @Test
    public void testGetApplicationListRejected() {
        System.out.println("getApplicationListRejected");
        ApplicationList instance = new ApplicationList();
        List<String> expResult = null;
        List<String> result = instance.getApplicationListRejected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplicationList method, of class ApplicationList.
     */
    @Test
    public void testSetApplicationList() {
        System.out.println("setApplicationList");
        List<Application> applicationList = null;
        ApplicationList instance = new ApplicationList();
        instance.setApplicationList(applicationList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
