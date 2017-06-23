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
public class AssignmentListTest {
    protected AssignmentList al;
    
    public AssignmentListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        al = new AssignmentList();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAssignmentList method, of class AssignmentList.
     */
    @Test
    public void testGetAssignmentList() {
        System.out.println("getAssignmentList");
        List<Assignment> result = al.getAssignmentList();
        assertEquals(al.getAssignmentList(), result);
       
    }
    
}
