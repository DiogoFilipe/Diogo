package lapr.project.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ReadFile {

    /**
     * Trys to read the file 
     * @param fileName - name of the file with the content
     * @param fc - the fairCenter
     * @return 
     */
    public static boolean readFile(String fileName, FairCenter fc) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
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
     * depending on the second string of the line the data shall be treated differently
     * @param data - data with the content of the line
     * @param fc - the fairCenter
     */
    private static void classeInfo(String[] data, FairCenter fc) {
        Event e;

        switch (data[1].toLowerCase().substring(0, 4)) {
            case "true":
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
     * @param data - data with the content of the line
     * @param event - application´s event
     * @param fairCenter - the fairCenter
     */
    private static void registEventInformation(String[] data, Event event, FairCenter fairCenter) {
        Assignment assignment1;
        Assignment assignment2;
        Application application;
        Decision decision1;
        Decision decision2;
        FAE fae1;
        FAE fae2;

        application = returnApplication(event, data[2], data[3], data[4]);

        decision1 = makeNewDecision(data[1],data[5], data[6], data[7], data[8], data[9]);
        fae1 = returnFAE(data[10], data[12], data[11], data[13], event, fairCenter);
        application.addDecision(decision1);
        assignment1 = new Assignment(fae1,decision1);
        event.getAssignmentList().registAssignment(assignment1);

        decision2 = makeNewDecision(data[1],data[14], data[15], data[16], data[17], data[18]);
        fae2 = returnFAE(data[19], data[21], data[20], data[22], event, fairCenter);
        application.addDecision(decision2);
        assignment2 = new Assignment(fae2,decision2);
        event.getAssignmentList().registAssignment(assignment2);
               
        for(String key : data[23].split(",") ){
            application.addKeyword(new Keyword(key));
        }
        

        event.getApplicationList().registApplication(application);
    }
    
    /**
     * Returns the event with the title
     * @param title -  title of the event
     * @param fairCenter - the fairCenter
     * @return the matching event or the created event
     */
    private static Event returnEvent(String title, FairCenter fairCenter) {
        Event e;
        if (fairCenter.getEventRegist().getEvent(title) == null) {
            e = new Exhibition(title);
            List<User> organizerList = new ArrayList<>();    
            for(User u : organizerList){
               Organizer o = new Organizer(u);
            e.getOrganizerList().addOrganizer(o);}
            fairCenter.getEventRegist().getEventList().add(e);
        } else {
            e = fairCenter.getEventRegist().getEvent(title);
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
    private static Application returnApplication(Event event, String description, String area, String ninvites) {
        Application application = event.getApplicationList().getApplication(description);

        if (application == null) {
            double boothArea = Double.parseDouble(area);
            int invites = Integer.parseInt(ninvites);          
            return new Application(description, boothArea, invites);
        } else {
            return application;
        }
    }

     /**
     * Returns the decision made over an application
     * @param decision - decision made over the application
     * @param justification - decision´s justification
     * @param faeKnowledge - faeKnowledge parameter
     * @param adequacy - adequacy parameter
     * @param invitationAdequacy - invitationAdequacy paramenter
     * @param recommendation - application´s recommendation
     * @return decision
     */
    private static Decision makeNewDecision(String decision,String justification, String faeKnowledge, String adequacy, String invitationAdequacy, String recommendation) {
        boolean dec = false;
        if("true".equalsIgnoreCase(decision)){
        dec = true;
        }else{
            if("false".equalsIgnoreCase(decision)){
                dec = false;
        }}
            
        int faeKnowledgeInt = Integer.parseInt(faeKnowledge);
        int adequacyInt = Integer.parseInt(adequacy);
        int invitationAdequacyInt = Integer.parseInt(invitationAdequacy);
        int recommendationInt = Integer.parseInt(recommendation);

        return new Decision(dec, justification,faeKnowledgeInt,adequacyInt,invitationAdequacyInt,recommendationInt);
    }

    /**
     * Returns the fae with the same username, if it doesn't exist return fae
     * @param name - name of the fae
     * @param email - email of the fae
     * @param username - username of the fae
     * @param password - password of the fae
     * @param event - event that contains the fae
     * @param fairCenter - the fairCenter
     * @return the fae
     */
    private static FAE returnFAE(String name, String email, String username, String password, Event event, FairCenter fairCenter) {
        User user = fairCenter.getUserRegist().getUser(username);

        FAEList faeList = event.getFAEList();
        FAE f = null;
       
        if (user == null) {
            user = new User(name,username,email ,password);
            fairCenter.getUserRegist().addUser(user);
            f = new FAE(user);
            faeList.getFAEList().add(f);
            return f;
        } else {
            if (event.getFAEList().valid(f)) {
                return event.getFAEList().getFAE(username);
            } else {
                f = new FAE(user);
                event.getFAEList().getFAEList().add(f);
                return f;
            }
        }
    }

  /**
   * Regists stand in the event
   * @param area - area of the stand
   * @param event - event that contains the stands
   */
    private static void registStand(String area, Event event) {
        double areaFloat = Double.parseDouble(area);

         Stand s = new Stand(areaFloat);

        event.addStand(s);
    }
}
