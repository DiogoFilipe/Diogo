package lapr.project.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ReadFile implements Serializable {

    private static final long serialVersionUID = 825844789963152265L;

    /**
     * Trys to read the file
     *
     * @param fileName - name of the file with the content
     * @param fc - the fairCenter
     * @return
     */
    public static boolean readFile(File file, FairCenter fc) {
        try (Scanner scanner = new Scanner(file)) {
            String line;
            String[] data;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                if (line.length() > 0) {
                    data = line.split(";");
                    classeInfo(data, fc);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    /**
     * depending on the second string of the line the data shall be treated
     * differently
     *
     * @param data - data with the content of the line
     * @param fc - the fairCenter
     */
    private static void classeInfo(String[] data, FairCenter fc) {
        Event e;

        switch (data[1].toLowerCase()) {
            case "true":
                e = returnEvent(data[0], fc);              
                registEventInformation(data, e, fc);
                
                break;
            case "false":
                e = returnEvent(data[0], fc);
                registEventInformation(data, e, fc);
                break;
            case "stand":
                e = returnEvent(data[0], fc);
                registStand(data[2], e);
                break;
            default:
                break;
        }
    }

    /**
     * Regists the information regarding the applications and their decisions
     *
     * @param data - data with the content of the line
     * @param event - application´s event
     * @param fairCenter - the fairCenter
     */
    private static void registEventInformation(String[] data, Event event, FairCenter fc) {
        Assignment assignment;
        List<FAE> decisionFae = new ArrayList<>();
        Application application;
        Decision decision1;
        Decision decision2;
        FAE fae1;
        FAE fae2;
       int shift = fc.getFcEncryption().getShift();
        

        List<Keyword> keywords = new ArrayList<>(data[23].split(",").length);
        for (String keys : data[23].split(",")) {
                String ks = Encryption.cipherWithShift(keys, shift);
                keywords.add(new Keyword(ks));
        }
        application = returnApplication(fc,event, data[2], data[3], data[4],keywords);

        decision1 = makeNewDecision(fc,data[1],data[5], data[6], data[7], data[8], data[9]);
        fae1 = returnFAE(data[10], data[12], data[11], data[13], event, fc);
        application.setD(decision1);

        decisionFae.add(fae1);

        decision2 = makeNewDecision(fc,data[1],data[14], data[15], data[16], data[17], data[18]);
        fae2 = returnFAE(data[19], data[21], data[20], data[22], event, fc);
        application.setD(decision2);
        decisionFae.add(fae2);
        assignment = new Assignment(decisionFae,application);
        event.getAssignmentList().getAssignmentList().add(assignment);


        event.getApplicationList().getApplicationList().add(application);
    }

    /**
     * Returns the event with the title
     *
     * @param title - title of the event
     * @param fairCenter - the fairCenter
     * @return the matching event or the created event
     */
    private static Event returnEvent(String title, FairCenter fc) {
        Event e = null;
       int shift = fc.getFcEncryption().getShift();
                
        
        String cipheredTitle = Encryption.cipherWithShift(title, shift);
        if (fc.getEventRegist().getEvent(cipheredTitle) == null) {
            e = new Exhibition(cipheredTitle);
            List<User> organizerList = new ArrayList<>();
            for(User u : organizerList){
                Organizer o = new Organizer(u);
            e.getOrganizerList().addOrganizer(o);}
            fc.getEventRegist().getEventList().add(e);
       
        } 
           
        
       return e; 
        
    }

    /**
     * Returns the application with the same description. If it doesn´t exist creates a new one 
     * @param event - event that has the application
     * @param description - applications's description
     * @param area - applications´s pretended area
     * @param ninvites - applications's invites
     * @return the matching application or the created one
     */
    private static Application returnApplication(FairCenter fc,Event event, String description, String area, String ninvites,List <Keyword> keywords) {
        int shift = fc.getFcEncryption().getShift();
        
        String descript = Encryption.cipherWithShift(description, shift);
        
        
        
        Application application = event.getApplicationList().getApplication(descript);

        if (application == null) {
            double boothArea = Double.parseDouble(area);
            int invites = Integer.parseInt(ninvites);
            application = new Application(invites,boothArea,description,keywords);

        }
        return application;

    }

    /**
     * Returns the decision made over an application
     *
     * @param decision - decision made over the application
     * @param justification - decision´s justification
     * @param faeKnowledge - faeKnowledge parameter
     * @param adequacy - adequacy parameter
     * @param invitationAdequacy - invitationAdequacy paramenter
     * @param recommendation - application´s recommendation
     * @return decision
     */
    private static Decision makeNewDecision(FairCenter fc,String decision,String justification, String faeKnowledge, String adequacy, String invitationAdequacy, String recommendation) {
        boolean dec = false;
        if("true".equalsIgnoreCase(decision)){
            dec = true;
        }else{
            if("false".equalsIgnoreCase(decision)){
                dec = false;
        }}
        
       int shift = fc.getFcEncryption().getShift();

        String justific = Encryption.cipherWithShift(justification, shift);
            
        int faeKnowledgeInt = Integer.parseInt(faeKnowledge);
        int adequacyInt = Integer.parseInt(adequacy);
        int invitationAdequacyInt = Integer.parseInt(invitationAdequacy);
        int recommendationInt = Integer.parseInt(recommendation);

        return new Decision(dec, justific,faeKnowledgeInt,adequacyInt,invitationAdequacyInt,recommendationInt);
    }

    /**
     * Returns the fae with the same username, if it doesn't exist return fae
     *
     * @param name - name of the fae
     * @param email - email of the fae
     * @param username - username of the fae
     * @param password - password of the fae
     * @param event - event that contains the fae
     * @param fairCenter - the fairCenter
     * @return the fae
     */
    private static FAE returnFAE(String name, String email, String username, String password, Event event, FairCenter fc) {
       User user = null;
        for (User u : fc.getUserRegist().getUserList()) {
            for (int i = 0; i < 11; i++) {
               if(u.getName().equals(Encryption.cipherWithShift(name, i))){
                 user = fc.getUserRegist().getUser(u.getName());              
               }              
            } 
        }


        FAE f;
        
            int shift = Encryption.gerateShift();      
            String nam = Encryption.cipherWithShift(name, shift);
            String mail = Encryption.cipherWithShift(email, shift);
            String usernam = Encryption.cipherWithShift(username, shift);
            String pass = Encryption.cipherWithShift(password, shift);
       
        if (user == null) {
            user = new User(nam,usernam,mail ,pass);
            fc.getUserRegist().getUserList().add(user);
            f = new FAE(nam,usernam,mail,pass);
            Encryption encryption = new Encryption(user,shift);
            fc.getEncryptionList().getEncryptionsList().add(encryption);
            event.getFAEList().getFAEList().add(f);
            return f;
        } else {
            if (event.isFAE(user)) {
                return event.getFAEList().getFAE(usernam);
            } else {
                f = new FAE(nam,usernam,mail,pass);
                event.getFAEList().getFAEList().add(f);
                return f;
            }
        }
    }

    /**
     * Regists stand in the event
     *
     * @param area - area of the stand
     * @param event - event that contains the stands
     */
    private static void registStand(String area, Event event) {
        double areaFloat = Double.parseDouble(area);

        Stand s = new Stand(areaFloat);

        event.getStandList().getStandList().add(s);
    }
}
