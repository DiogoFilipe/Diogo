package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;
import lapr.project.utils.EmptySpaceException;

/**
 *
 * @author 1160590_1160795_1160844_1161249_1162109
 */
public class SubmitApplicationController {

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * event
     */
    private Event e;

    /**
     * application
     */
    private Application a;

    /**
     * applications list
     */
    private List<Application> al;

    /**
     * user
     */
    private User u;

    /**
     *
     * @param fc fair center
     * @param u user
     */
    public SubmitApplicationController(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
    }

    /**
     * 
     * @return list of events opeen for applications
     */
    public List<String> getListEventsOpenForApplications() {
        List<String> eventsOpenForApplicationsListString = new ArrayList<>();
        List<Event> eventList = fc.getEventRegist().getEventList();
        for (Event event : eventList) {
            if (event.getState() == EventState.State.OpenForApplications) {
                eventsOpenForApplicationsListString.add(event.getTitle());
            }
        }
        return eventsOpenForApplicationsListString;
    }

    /**
     * 
     * @param companyName name of the company
     * @param address address of the company
     * @param contact contact of the company
     * @param description description
     * @param area area needed
     * @param invites number of invites
     * @param keywordsList list of keywords
     * @return the new applicaiton
     */
    public Application createApplication(String companyName, String address, int contact, String description, double area, int invites, List<Keyword> keywordsList) {
        Application newApplication = new Application(companyName, address, contact, description, area, invites, keywordsList);
        return newApplication;
    }

    /**
     *
     * @param e event title
     * @return list of applications of the event
     */
    public List<Application> getApplicationsListOfTheEvent(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationList();
    }
    
        /**
     *
     * @param s string given
     * @param m parameter that can fails
     */
    public void validateString(String s, String m) {
        if (s.trim().equals(" ") || s.equals("")) {
            throw new EmptySpaceException(m);
        }
    }
    
    /**
     * 
     * @param s String of a number
     * @param m parameter that can fail
     */
    public void validateNumber(String s,String m){
        if(s.trim().equals(" ") || s.trim().equals("") || Integer.parseInt(s)<0 || s.contains("[a-zA-Z+]") ){
            throw new EmptySpaceException(m);
        }
    }
}
