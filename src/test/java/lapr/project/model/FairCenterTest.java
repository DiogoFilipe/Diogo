///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lapr.project.model;
//
//import java.util.ArrayList;
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
// * @author HP
// */
//public class FairCenterTest {
//    protected FairCenter fc;
//    protected UserRegist userRegist;
//    protected EventRegist eventRegist;
//    protected ExhibitionList exhibitionList;
//    protected CongressList congressList;
//    protected OrganizerList organizerList;
//    protected StandRegist standRegist;
//    protected EncryptionList encryptionList;
//    protected Encryption fcEncryption;
//    protected FAEList faeList;
//    protected EventManagerList eventManagerList;
//    protected RepresentativeList representativeList;
//    protected User user;
//    protected List<String> applicationsAccepted = new ArrayList<>();
//    protected List<String> applicationsRejected = new ArrayList<>();
//     
//    public FairCenterTest() {
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
//        fc = new FairCenter();
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getUserRegist method, of class FairCenter.
//     */
//    @Test
//    public void testGetUserRegist() {
//        System.out.println("getUserRegist");
//        UserRegist expResult = userRegist;
//        UserRegist result = fc.getUserRegist();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getFcEncryption method, of class FairCenter.
//     */
//    @Test
//    public void testGetFcEncryption() {
//        System.out.println("getFcEncryption");
//        Encryption expResult = fcEncryption;
//        Encryption result = fc.getFcEncryption();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getEncryptionList method, of class FairCenter.
//     */
//    @Test
//    public void testGetEncryptionList() {
//        System.out.println("getEncryptionList");
//        EncryptionList expResult = encryptionList;
//        EncryptionList result = fc.getEncryptionList();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getEventRegist method, of class FairCenter.
//     */
//    @Test
//    public void testGetEventRegist() {
//        System.out.println("getEventRegist");
//        EventRegist expResult = eventRegist;
//        EventRegist result = fc.getEventRegist();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getEventList method, of class FairCenter.
//     */
//    @Test
//    public void testGetEventList() {
//        System.out.println("getEventList");
//        List<Event> expResult = eventRegist.getEventList();
//        List<Event> result = fc.getEventList();
//        assertEquals(expResult, result);
//    }
//
//
//    /**
//     * Test of newUser method, of class FairCenter.
//     */
//    @Test
//    public void testNewUser() {
//        System.out.println("newUser");
//        fc.newUser(user);
//        List <User> users = fc.getUserRegist().getUserList();
//        assertEquals(users, this.fc.getUserRegist().getUserList());
//        
//    }
//
//    /**
//     * Test of getEvent method, of class FairCenter.
//     */
//    @Test
//    public void testGetEvent_String() {
//        System.out.println("getEvent");
//        String title = "";
//        Event expResult = new Event(title);
//        Event result = fc.getEvent(title);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setEventRegist method, of class FairCenter.
//     */
//    @Test
//    public void testSetEventRegist() {
//        System.out.println("setEventRegist");
//        fc.setEventRegist(eventRegist);
//        assertEquals(eventRegist, fc.getEventList());
//    }
//
//    /**
//     * Test of setEncryptionList method, of class FairCenter.
//     */
//    @Test
//    public void testSetEncryptionList() {
//        System.out.println("setEncryptionList");
//        fc.setEncryptionList(encryptionList);
//        assertEquals(encryptionList,fc.getEncryptionList());
//    }
//
//    /**
//     * Test of setUserRegist method, of class FairCenter.
//     */
//    @Test
//    public void testSetUserRegist() {
//        System.out.println("setUserRegist");
//        fc.setUserRegist(userRegist);
//        assertEquals(userRegist,fc.getUserRegist());
//    }
//
//    /**
//     * Test of getOrganizerList method, of class FairCenter.
//     */
//    @Test
//    public void testGetOrganizerList() {
//        System.out.println("getOrganizerList");
//        OrganizerList expResult = organizerList;
//        OrganizerList result = fc.getOrganizerList();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setOrganizerList method, of class FairCenter.
//     */
//    @Test
//    public void testSetOrganizerList() {
//        System.out.println("setOrganizerList");
//        fc.setOrganizerList(organizerList);
//        assertEquals(organizerList,fc.getOrganizerList());
//    }
//
//    /**
//     * Test of getStandRegist method, of class FairCenter.
//     */
//    @Test
//    public void testGetStandRegist() {
//        System.out.println("getStandRegist");
//        StandRegist expResult = standRegist;
//        StandRegist result = fc.getStandRegist();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setStandRegist method, of class FairCenter.
//     */
//    @Test
//    public void testSetStandRegist() {
//        System.out.println("setStandRegist");
//        fc.setStandRegist(standRegist);
//        assertEquals(standRegist,fc.getStandRegist());
//    }
//
//    /**
//     * Test of getApplicationListAccepted method, of class FairCenter.
//     */
//    @Test
//    public void testGetApplicationListAccepted() {
//        System.out.println("getApplicationListAccepted");
//        List<String> result = fc.getApplicationListAccepted();
//        assertEquals(result,applicationsAccepted);
//    }
//
//    /**
//     * Test of getApplicationListRejected method, of class FairCenter.
//     */
//    @Test
//    public void testGetApplicationListRejected() {
//        System.out.println("getApplicationListRejected");
//        List<String> result = fc.getApplicationListRejected();
//        assertEquals(result,applicationsRejected);
//    }
//
//   
//    /**
//     * Test of getEventManagerList method, of class FairCenter.
//     */
//    @Test
//    public void testGetEventManagerList() {
//        System.out.println("getEventManagerList");
//        EventManagerList expResult = eventManagerList;
//        EventManagerList result = fc.getEventManagerList();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setEventManagerList method, of class FairCenter.
//     */
//    @Test
//    public void testSetEventManagerList() {
//        System.out.println("setEventManagerList");
//        fc.setEventManagerList(eventManagerList);
//        assertEquals(eventManagerList,fc.getEventManagerList());
//    }
//
//    /**
//     * Test of getExhibitionList method, of class FairCenter.
//     */
//    @Test
//    public void testGetExhibitionList() {
//        System.out.println("getExhibitionList");
//        ExhibitionList expResult = exhibitionList;
//        ExhibitionList result = fc.getExhibitionList();
//        assertEquals(expResult,result);
//    }
//
//    /**
//     * Test of setExhibitionList method, of class FairCenter.
//     */
//    @Test
//    public void testSetExhibitionList() {
//        System.out.println("setExhibitionList");
//        fc.setExhibitionList(exhibitionList);
//        assertEquals(exhibitionList,fc.getExhibitionList());
//    }
//
//    /**
//     * Test of getCongressList method, of class FairCenter.
//     */
//    @Test
//    public void testGetCongressList() {
//        System.out.println("getCongressList");
//        CongressList expResult = congressList;
//        CongressList result = fc.getCongressList();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setCongressList method, of class FairCenter.
//     */
//    @Test
//    public void testSetCongressList() {
//        System.out.println("setCongressList");
//        fc.setCongressList(congressList);
//        assertEquals(congressList,fc.getCongressList());
//    }
//
//    /**
//     * Test of isFAEOrOrganizer method, of class FairCenter.
//     */
//    @Test
//    public void testIsFAEOrOrganizer() {
//        System.out.println("isFAEOrOrganizer");
//        User u = new User("Tiago","tiago7","tiago@gmail.com","Portugal13");
//        Organizer o = new Organizer("Tiago","tiago7","tiago@gmail.com","Portugal13");
//        fc.getOrganizerList().addOrganizer(o);
//        boolean expResult = true;
//        boolean result = fc.isFAEOrOrganizer(u);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getFaeList method, of class FairCenter.
//     */
//    @Test
//    public void testGetFaeList() {
//        System.out.println("getFAEList");
//        FAEList expResult = faeList;
//        FAEList result = fc.getFaeList();
//        assertEquals(expResult, result);
//
//    }
//
//    /**
//     * Test of setFaeList method, of class FairCenter.
//     */
//    @Test
//    public void testSetFaeList() {
//        System.out.println("setFAEList");
//        fc.setFaeList(faeList);
//        assertEquals(faeList,fc.getFaeList());
//    }
//
//    /**
//     * Test of getRepresentativeList method, of class FairCenter.
//     */
//    @Test
//    public void testGetRepresentativeList() {
//        System.out.println("getRepresentativeList");
//        RepresentativeList expResult = representativeList;
//        RepresentativeList result = fc.getRepresentativeList();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setRepresentativeList method, of class FairCenter.
//     */
//    @Test
//    public void testSetRepresentativeList() {
//        System.out.println("setRepresentativeList");
//        fc.setRepresentativeList(representativeList);
//        assertEquals(representativeList,fc.getRepresentativeList());
//    }
//    
//}
