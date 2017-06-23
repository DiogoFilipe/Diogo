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
public class AssignmentListStandTest {
    
    public AssignmentListStandTest() {
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
     * Test of getStandsAssigned method, of class AssignmentListStand.
     */
    @Test
    public void testGetStandsAssigned() {
        System.out.println("getStandsAssigned");
        AssignmentListStand instance = new AssignmentListStand();
        List<AssignStands> expResult = null;
        List<AssignStands> result = instance.getStandsAssigned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStandsAssigned method, of class AssignmentListStand.
     */
    @Test
    public void testSetStandsAssigned() {
        System.out.println("setStandsAssigned");
        List<AssignStands> standsAssigned = null;
        AssignmentListStand instance = new AssignmentListStand();
        instance.setStandsAssigned(standsAssigned);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class AssignmentListStand.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        AssignStands s = null;
        AssignmentListStand instance = new AssignmentListStand();
        boolean expResult = false;
        boolean result = instance.validate(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newStandAssignment method, of class AssignmentListStand.
     */
    @Test
    public void testNewStandAssignment() {
        System.out.println("newStandAssignment");
        Stand s = null;
        Application a = null;
        AssignmentListStand instance = new AssignmentListStand();
        AssignStands expResult = null;
        AssignStands result = instance.newStandAssignment(s, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AssignmentStandsRegist method, of class AssignmentListStand.
     */
    @Test
    public void testAssignmentStandsRegist() {
        System.out.println("AssignmentStandsRegist");
        Boolean b = null;
        AssignStands as = null;
        AssignmentListStand instance = new AssignmentListStand();
        instance.AssignmentStandsRegist(b, as);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStandApplication method, of class AssignmentListStand.
     */
    @Test
    public void testGetStandApplication() {
        System.out.println("getStandApplication");
        Application a = null;
        AssignmentListStand instance = new AssignmentListStand();
        Stand expResult = null;
        Stand result = instance.getStandApplication(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
