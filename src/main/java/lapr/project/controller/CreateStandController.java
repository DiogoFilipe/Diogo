
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author HP
 */
public class CreateStandController {

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * user
     */
    private User u;

    /**
     * 
     * @param fc fair center
     * @param u user
     */
    public CreateStandController(FairCenter fc, User u) {
        this.u = u;
        this.fc = fc;
    }

    /**
     * 
     * @param area area
     * @return true if the area is a double
     */
    public boolean verifyArea(String area) {
        return Stand.verifyArea(area);
    }

    /**
     * 
     * @param event event
     * @param stand stand
     * @return 
     */
    public boolean addStand(Event event, Stand stand) {
        return event.getStandList().getStandList().add(stand);
    }

    /**
     * 
     * @return list of events 
     */
    public List<Event> getEventList() {
        return fc.getEventList();
    }

    /**
     * 
     * @return list of strings with events title 
     */
    public List<String> getEventListString() {
        return fc.getEventRegist().getOrganizerEventList((Organizer) u);
    }

    /**
     * 
     * @param title title of the event
     * @return the event with this title
     */
    public Event getEvent(String title) {
        return fc.getEvent(title);
    }
}
