package lapr.project.controller;

import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.EventRegist;
import lapr.project.model.Organizer;

/**
 *
 * @author Diogo
 */
public class ListApplicationsController {
    
    private EventRegist eventRegist;
    
    /**
     *
     * @param o the organizer
     * @return the list of events of this organizer
     */
    public List<Event>  getOrganizerEventList(Organizer o){
        return  eventRegist.getOrganizerEventsRegist(o);
    }
    
    /**
     * 
     * @param e the event
     * @return the list of applications
     */
    public List<Application> getApplicationsList(Event e){
        return e.getApplicationList();
    }    
    
    
}
