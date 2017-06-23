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

/**
 *
 * @author João Domingues
 */
public class AssignStandsTest {
    
    protected AssignStands as;
    protected Stand stand;
    protected Application a;
    protected Stand bis;
    protected Application b;
    
    public AssignStandsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        as = new AssignStands(stand, a);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStand method, of class AssignStands.
     */
    @Test
    public void testGetStand() {
        System.out.println("getStand");
        Stand result = as.getStand();
        assertEquals(as.getStand(), result);
        
    }

    /**
     * Test of setStand method, of class AssignStands.
     */
    @Test
    public void testSetStand() {
        System.out.println("setStand");
        as.setStand(bis);
        Stand result = as.getStand();
        assertEquals(bis, result);
       
    }

    /**
     * Test of getApplication method, of class AssignStands.
     */
    @Test
    public void testGetApplication() {
        System.out.println("getApplication");
        Application result = as.getApplication();
        assertEquals(as.getApplication(), result);
        
    }

    /**
     * Test of setApplication method, of class AssignStands.
     */
    @Test
    public void testSetApplication() {
        System.out.println("setApplication");
        as.setApplication(b);
        Application result = as.getApplication();
        assertEquals(b, result);
        
    }
    
}
