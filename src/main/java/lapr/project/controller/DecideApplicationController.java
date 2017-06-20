package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class DecideApplicationController {
    
    FairCenter fc;
    EventRegist er;
    UserRegist ur;
    Application a;
    FAE fae;
    Decision d;
    
    public DecideApplicationController(FairCenter fc, User user) {
        this.fc = fc;
        this.er = fc.getEventRegist();
        this.ur = fc.getUserRegist();
        this.a = new Application();
        this.fae = new FAE(user);
    }
    
    /**
     * Returns a list of Events the logged in User belongs to as an FAE
     * 
     * @return list of Events the logged in User belongs to as an FAE
     */
    public List<String> getFAEEventList() {
        List<Event> eventList = er.getEventList();
        List<String> eventListString = new ArrayList<>();
        for (Event event : eventList) {
            if (event.getFAEList().containsFAE(fae)) {
                eventListString.add(event.getTitle());
            }
        }
        return eventListString;
    }
    
    /**
     * Returns a list of Events that include the FAE
     * 
     * @param eventTitle
     * @return 
     */
    public List<String> getFAEApplicationsForDecision(String eventTitle) {
        List<Event> eventList = er.getEventList();
        Event e = new Event();
        for (Event event : eventList) {
            if (event.getTitle().equals(eventTitle)) {
                e = event;
            }
        }
        List<Assignment> assignmentList = e.getAssignmentList().getAssignmentList();
        List<String> applicationListString = new ArrayList<>();
        for (Assignment assignment : assignmentList) {
            if (assignment.getFAEList().contains(fae) /*&& assignment.getApplication().getState() == ApplicationState.State.Decided*/) {
                applicationListString.add(assignment.getApplication().getCompanyName());
            }
        }
        return applicationListString;
    }
    
    /**
     * 
     * @return 
     */
    public String getApplicationDetails() {
        return a.getCompanyName() + "\n" + a.getAddress() + "\n" + a.getContact() + "\n" + a.getDescription();
    }
    
//    /**
//     * 
//     * @param decision
//     * @param justification
//     * @param faeKnowledge
//     * @param adequacy
//     * @param invitationAdequacy
//     * @param overallRecomendation 
//     */
//    public void setDecision(boolean decision, String justification, int faeKnowledge, int adequacy, int invitationAdequacy, int overallRecomendation) {
//        d = new Decision(decision, justification, faeKnowledge, adequacy, invitationAdequacy, overallRecomendation);
//    }
    
//    public void registDecision() {
//        
//    }
    
    public void setStateApplication() {
//        a.setState(ApplicationState.State.Decided);
    }
    
}
