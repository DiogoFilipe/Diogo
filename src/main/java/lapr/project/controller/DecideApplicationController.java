package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;
import lapr.project.utils.EmptySpaceException;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class DecideApplicationController {

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * event regist
     */
    private EventRegist er;

    /**
     * user regist
     */
    UserRegist ur;

    /**
     * application
     */
    Application a;

    /**
     * user
     */
    User user;

    /**
     * decision
     */
    Decision d;

    /**
     *
     * @param fc fair center
     * @param user user
     */
    public DecideApplicationController(FairCenter fc, User user) {
        this.fc = fc;
        this.er = fc.getEventRegist();
        this.ur = fc.getUserRegist();
        this.user = user;
    }

    /**
     * Returns a list of Events the logged in User belongs to as an FAE
     *
     * @return list of Events the logged in User belongs to as an FAE
     */
    public List<String> getFAEEventList() {
        List<Event> eventList = fc.getEventList();
        List<String> eventListString = new ArrayList<>();
        for (Event event : eventList) {
            if (event.getFAEList().getFAEList().contains((FAE) user)) {
                eventListString.add(event.getTitle());
            }
        }
        return eventListString;
    }

    /**
     * Returns a list of applications that include the FAE
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
            if (assignment.getFAEList().contains((FAE) user) /*&& assignment.getApplication().getState() == ApplicationState.State.Decided*/) {
                applicationListString.add(assignment.getApplication().getCompanyName());
            }
        }
        return applicationListString;
    }

    /**
     * Returns a String containing the Application's details
     *
     * @param eventTitle
     * @param companyName
     * @return String containing the Application's details
     */
    public String getApplicationDetails(String eventTitle, String companyName) {
        Application a = getApplication(eventTitle, companyName);
        return a.getCompanyName() + "\n" + a.getAddress() + "\n" + a.getContact() + "\n" + a.getDescription();
    }

    /**
     * 
     * @param eventTitle event tile
     * @param companyName application's company name
     * @return returns the application with this company name
     */
    public Application getApplication(String eventTitle, String companyName) {
        return fc.getEventRegist().getEvent(eventTitle).getApplicationList().getApplicationByCompanyName(companyName);
    }

    /**
     * Sets the Decision the FAE has made
     *
     * @param decision true if the application is accepted / false if the
     * application is rejected
     * @param justification the Decision's justification
     * @param faeKnowledge the FAE's Knowledge about the Event's topic
     * @param adequacy the Application's adequacy for the Event
     * @param invitationAdequacy the invitations quantity adequacy for the
     * Application
     * @param overallRecomendation overall recommendation
     */
    public void setDecision(boolean decision, String justification, int faeKnowledge, int adequacy, int invitationAdequacy, int overallRecomendation) {
        d = new Decision(decision, justification, faeKnowledge, adequacy, invitationAdequacy, overallRecomendation);
    }

    /**
     * 
     * @param description new description for the application 
     */
    public void setDescription(String description) {
        d.setJustification(description);
    }

    /**
     * Set's the Application's state as decided
     *
     * @param event
     * @param a
     */
    public void setStateApplication(String event, String a) {
        fc.getEventRegist().getEvent(event).getApplicationList().getApplicationByCompanyName(a).setState(ApplicationState.State.Decided);
    }

    /**
     * 
     * @param u user
     * @return true if the user is an organizer
     */
    public boolean isOrganizer(User u) {
        return fc.getOrganizerList().getOrganizerList().contains((Organizer) u);
    }

    /**
     * 
     * @param u user
     * @return true if the user is a fae
     */
    public boolean isFAE(User u) {
        return fc.getFaeList().getFAEList().contains((FAE) u);
    }

    /**
     * 
     * @param s string given
     * @param m string with parameter that can fail
     */
    public void validateString(String s, String m) {
        if (s.trim().equals(" ") || s.equals("")) {
            throw new EmptySpaceException(m);
        }
    }

    /**
     * 
     * @param n number given
     * @param m string with parameter that can fail
     */
    public void validateNumber(int n, String m) {
        if (n < 0 || n > 5 || Integer.toString(n).equals("") || Integer.toString(n).trim().equals(" ")) {
            throw new EmptySpaceException(m);
        }
    }
}
