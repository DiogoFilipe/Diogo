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
public class AssignmentTest {
    protected Assignment ass;
    protected List<FAE> faeList;
    protected Application a;
    protected List<FAE> faeList2;
    protected Application a2;
    
    public AssignmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ass = new Assignment(faeList,a);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFAEList method, of class Assignment.
     */
    @Test
    public void testGetFAEList() {
        System.out.println("getFAEList");
        List<FAE> result = ass.getFAEList();
        assertEquals(ass.getFAEList(), result);
    
    }

    /**
     * Test of getApplication method, of class Assignment.
     */
    @Test
    public void testGetApplication() {
        System.out.println("getApplication");
        Application result = ass.getApplication();
        assertEquals(ass.getApplication(), result);
        
    }

    /**
     * Test of setFAEList method, of class Assignment.
     */
    @Test
    public void testSetFAEList() {
        System.out.println("setFAEList");
        ass.setFAEList(faeList2);
        assertEquals(ass.getFAEList(), faeList2);
        
    }

    /**
     * Test of setApplication method, of class Assignment.
     */
    @Test
    public void testSetApplication() {
        System.out.println("setApplication");
        ass.setApplication(a2);
        assertEquals(ass.getApplication(), a2);
        
    }
    
}
