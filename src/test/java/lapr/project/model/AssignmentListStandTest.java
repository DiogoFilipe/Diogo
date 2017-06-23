
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author João Domingues
 */
public class AssignmentListStandTest {
    protected AssignmentListStand las;
    protected List<AssignStands> sal;
    protected AssignStands sa;
    protected Application a;
    protected Stand s;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        las = new AssignmentListStand();
        sal = new ArrayList<>();
        las.setStandsAssigned(sal);
        a = new Application();
        s = new Stand(3);
        sa = new AssignStands(s, a);
        sal.add(sa);
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
        List<AssignStands> result = las.getStandsAssigned();
        assertEquals(las.getStandsAssigned(), result);
        
    }

    /**
     * Test of setStandsAssigned method, of class AssignmentListStand.
     */
    @Test
    public void testSetStandsAssigned() {
        System.out.println("setStandsAssigned");
        List<AssignStands> standsAssigned = las.getStandsAssigned();
        las.setStandsAssigned(standsAssigned);
        List<AssignStands> result = standsAssigned;
        assertEquals(standsAssigned, result);
       
    }

    /**
     * Test of validate method, of class AssignmentListStand.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        AssignStands s = sa;
        AssignmentListStand instance = las;
        boolean expResult = false;
        boolean result = instance.validate(s);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of newStandAssignment method, of class AssignmentListStand.
     */
    @Test
    public void testNewStandAssignment() {
         System.out.println("newStandAssignment");
        Stand st = s;
        Application ap = a;
        AssignmentListStand instance = las;
        AssignmentListStand otherInstance = las;
        AssignStands expResult = otherInstance.newStandAssignment(st, ap);
        AssignStands result = instance.newStandAssignment(st, ap);
        Assert.assertFalse(expResult.equals(result));
       
    }

    /**
     * Test of AssignmentStandsRegist method, of class AssignmentListStand.
     */
    @Test
    public void testAssignmentStandsRegist() {
         System.out.println("RegisterStandAssignment");
        Boolean b = true;
        AssignmentListStand instance = las;
        instance.AssignmentStandsRegist(b, sa);
        
    }

    /**
     * Test of getStandApplication method, of class AssignmentListStand.
     */
    @Test
    public void testGetStandApplication() {
        System.out.println("getApplicationStand");
        AssignmentListStand instance = las;
        Stand nullResult = instance.getStandApplication(a);
        Stand expResultNull = s;
        assertEquals(expResultNull,nullResult);
    }
}