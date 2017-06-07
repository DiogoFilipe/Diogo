package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.FAE;
import lapr.project.model.User;
import lapr.project.utils.Date;
/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class EventRegist implements Serializable{
    /**
     * Event list
     */
    private final List<Event> eventsList;
    
    /**
     * Constructor
     */
    public EventRegist(){
        eventsList=new ArrayList<>();
    }
    
    /**
     * Method that returns the event list of a given fae
     * @param fae
     * @return events list of fae
     * 
    */
    public List<Event> getFAEEventsRegist (FAE fae) {
        List<Event> FaeList = new ArrayList<>();
        for (int i = 0; i < eventsList.size(); i++) {
            for (int j = 0; j < eventsList.get(i).getFAEList().size(); j++) {
                if (eventsList.get(i).getFAEList().get(j).getFaeUsername().equals(fae.getFaeUsername())) {
                    FaeList.add(eventsList.get(i));
                }
            }

        }
        return FaeList;    
    }
    
    /**
     * Method that returns the event list of a given fae, through a User object
     * @param user
     * @return events list of fae
     */
    public List<Event> getFAEEventsRegist (User user) {
        List<Event> FaeList = new ArrayList<>();
        for (int i = 0; i < eventsList.size(); i++) {
            for (int j = 0; j < eventsList.get(i).getFAEList().size(); j++) {
                if (eventsList.get(i).getFAEList().get(j).getFaeUsername().equals(user.getUsername())) {
                    FaeList.add(eventsList.get(i));
                }
            }

        }
        return FaeList;    
    } 
    
    /**
     * Lets get the Events List ready for submission
     * @return Events List
     */
    public List<Event> getEventsReadyForSubmission(){
        List<Event> ReadyEvents= new ArrayList<>();
        for (Event e : eventsList) {
            if ((Date.currentDate().difference(e.getStartDate()))>=0 && (Date.currentDate().difference(e.getStartDate()))<=0 ) {
                ReadyEvents.add(e);
            }
        }
        return ReadyEvents;
    }
    
    /**
     * Lets you get an event through your id
     * @param eventID
     * @return Event corresponding to id
     */
    public Event getEvent (int eventID){
        int pos=-1;
        for (Event e : eventsList) {
            if(e.getEventID()== eventID){
                pos=eventsList.indexOf(e);
            }
        }
    return eventsList.get(pos);
    }
    /**
     * Allows you to add an event to the regists
     * @param event
     * @return boolean depending on the success of the operation
     */
    public boolean addEvent(Event event){
        if (!eventsList.contains(event)) {
            return eventsList.add(event);
        }
        return false;
    }
    
     /**
     * Gets the list of events
     * @return Events List
     */
    public List<Event> getEventList() {
        return eventsList;
    }
    
    /**
     * Event list size
     * @return int With the size of the event list
     */
    public int Size(){
        return eventsList.size();
    }

    /**
     * Get event through your position in the list
     * @param i
     * @return event
     */
    public Event GetEvent(int i){
        return eventsList.get(i);
    }

    /**
     * Returns the index of an event in the list
     * @param event
     * @return int With the position of the event
     */
    public int INDEXOF(Event event) {
        return eventsList.indexOf(event);
    }
    
    /**
     * Remove an event from the list
     * @param evento
     * @return boolean depending on the success of the operation
     */
    public boolean removeEvent(Event event){
        return eventsList.remove(event);
    }
    
    /**
     * Checks whether the list contains a certain event
     * @param evento
     * @return true or false
     */
    public boolean CONTAINS(Event event){
        return eventsList.contains(event);
    }
}
