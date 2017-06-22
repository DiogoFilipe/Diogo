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
public class UserTest {
    protected User user;
    
    
    
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        user = new User("Tiago","tiago7","tiago@gmail.com","Portugal13");
       
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "Portugal13";
        String result = user.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Tiago";
        String result = user.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "tiago7";
        String result = user.getUsername();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "tiago@gmail.com";
        String result = user.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = user.toString();
        assertEquals(expResult, user.toString());
        
    }

    /**
     * Test of hasTheUsername method, of class User.
     */
    @Test
    public void testHasTheUsername() {
        System.out.println("hasTheUsername");
        String username = "tiago7";
        assertTrue(user.hasTheUsername(user, username));
        
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        user.setName("Joao");
        assertEquals(this.user.getName(), "Joao");
        
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        user.setUsername("joao9");
        assertEquals(this.user.getUsername(), "joao9");
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        user.setEmail("joao@gmail.com");
        assertEquals(this.user.getEmail(),"joao@gmail.com");
    }
    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        user.setPassword("Porto10");
        assertEquals(this.user.getPassword(),"Porto10");
    }
    
}
