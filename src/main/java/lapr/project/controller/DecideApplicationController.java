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
    User user;
    Decision d;

    public DecideApplicationController(FairCenter fc, User user) {
        this.fc = fc;
        this.er = fc.getEventRegist();
        this.ur = fc.getUserRegist();
        this.a = new Application();
        this.user = user;
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
     * @param companyName
     * @return String containing the Application's details
     */
    public String getApplicationDetails(String companyName) {

        return a.getCompanyName() + "\n" + a.getAddress() + "\n" + a.getContact() + "\n" + a.getDescription();
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
     * Regists the Decision by adding it to the FAE's Decision list
     */
    public void registDecision() {
        ((FAE) user).getDecisionList().getDecisionList().add(d);
    }

    /**
     * Set's the Application's state as decided
     */
    public void setStateApplication() {
        a.setState(ApplicationState.State.Decided);
    }

    public boolean isOrganizer(User u) {
        return fc.getOrganizerList().getOrganizerList().contains((Organizer) u);
    }

    public boolean isFAE(User u) {
        return fc.getFAEList().getFAEList().contains((FAE) u);
    }
}
