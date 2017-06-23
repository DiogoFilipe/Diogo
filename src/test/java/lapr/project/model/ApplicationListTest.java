//package lapr.project.model;
//
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author João Domingues
// */
//public class ApplicationListTest {
//    
//    protected List<Application> applicationList;
//    protected List<Application> ap;
//    protected ApplicationList al;
//    
//    public ApplicationListTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//       al= new ApplicationList(applicationList);
//        
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getApplicationList method, of class ApplicationList.
//     */
//    @Test
//    public void testGetApplicationList() {
//        System.out.println("getApplicationList");
//        List<Application> result = al.getApplicationList();
//        assertEquals(al.getApplicationList(), result);
//        
//    }
//
//    /**
//     * Test of getApplicationsList method, of class ApplicationList.
//     */
//    @Test
//    public void testGetApplicationsList() {
//        System.out.println("getApplicationsList");
//        List<String> result = al.getApplicationsList();
//        assertEquals(al.getApplicationsList(), result);
//       
//    }
//
//    /**
//     * Test of getApplication method, of class ApplicationList.
//     */
//    @Test
//    public void testGetApplication() {
//        System.out.println("getApplication");
//        String description = "";
//        Application result = al.getApplication(description);
//        assertEquals(al.getApplication(description), result);
//        
//    }
//
//    /**
//     * Test of getApplicationByCompanyName method, of class ApplicationList.
//     */
//    @Test
//    public void testGetApplicationByCompanyName() {
//        System.out.println("getApplicationByCompanyName");
//        String companyName = "";
//        Application result = al.getApplicationByCompanyName(companyName);
//        assertEquals(al.getApplicationByCompanyName(companyName), result);
//        
//    }
//
//    /**
//     * Test of getKeywordsList method, of class ApplicationList.
//     */
//    @Test
//    public void testGetKeywordsList() {
//        System.out.println("getKeywordsList");
//        List<Keyword> result = al.getKeywordsList();
//        assertEquals(al.getKeywordsList(), result);
//        
//    }
//
//    /**
//     * Test of getApplicationListAccepted method, of class ApplicationList.
//     */
//    @Test
//    public void testGetApplicationListAccepted() {
//        System.out.println("getApplicationListAccepted");
//        List<String> result = al.getApplicationListAccepted();
//        assertEquals(al.getApplicationListAccepted(), result);
//    }
//
//    /**
//     * Test of getApplicationListRejected method, of class ApplicationList.
//     */
//    @Test
//    public void testGetApplicationListRejected() {
//        System.out.println("getApplicationListRejected");
//        List<String> result = al.getApplicationListRejected();
//        assertEquals(al.getApplicationListRejected(), result);
//        
//    }
//
//    /**
//     * Test of setApplicationList method, of class ApplicationList.
//     */
//    @Test
//    public void testSetApplicationList() {
//        System.out.println("setApplicationList");
//        al.setApplicationList(ap);
//        assertEquals(this.al.getApplicationList(),ap);
//       
//    }
//    
//}
