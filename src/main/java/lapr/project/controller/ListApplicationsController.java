package lapr.project.controller;

import java.util.List;
import lapr.project.model.FairCenter;
import lapr.project.model.Organizer;
import lapr.project.model.User;

/**
 *
 * @author Diogo
 */
public class ListApplicationsController {
    
    private FairCenter fc;
    private User u;
    
    
    public ListApplicationsController(FairCenter fc, User u){
        this.fc=fc;
        this.u=u;
    }
    
    public boolean isOrganizer(User u){
        return fc.getOrganizerList().containsOrganizer((Organizer)u);
    }
    
    /**
     *
     * @param u
     * @return the list of events of this organizer
     */
    public List<String>  getOrganizerEventsList(User u){
        return  fc.getEventRegist().getOrganizerEventsListOrdenedByState((Organizer)u);
    }
    
    /**
     * 
     * @param e the event
     * @return the list of applications
     */
    public List<String> getApplicationsList(String e){
        return fc.getEvent(e).getApplicationList().getApplicationsList();
    }    
}
