package lapr.project.controller;

import java.util.List;
import lapr.project.model.EventRegist;
import lapr.project.model.FairCenter;
import lapr.project.model.Organizer;
import lapr.project.model.OrganizerList;
import lapr.project.model.User;

/**
 *
 * @author Diogo
 */
public class ListApplicationsController {
    
    private EventRegist eventRegist;
    private OrganizerList organizerList;
    private FairCenter fc;
    private User u;
    
    
    public ListApplicationsController(FairCenter fc, User u){
        this.fc=fc;
        this.u=u;
    }
    
    public boolean isOrganizer(User u){
        return organizerList.containsOrganizer((Organizer)u);
    }
    
    /**
     *
     * @param o the organizer
     * @return the list of events of this organizer
     */
    public List<String>  getOrganizerEventsList(Organizer o){
        return  eventRegist.getOrganizerEventsListOrdenedByState(o);
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
