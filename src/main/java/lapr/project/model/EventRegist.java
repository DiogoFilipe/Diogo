package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class EventRegist implements Serializable {

    /**
     * Event list
     */
    private final List<Event> eventList;

    /**
     * Constructor
     */
    public EventRegist() {
        eventList = new ArrayList<>();
    }

    /**
     * Method that returns the event list of a given organizer
     *
     * @param o is the organizer
     * @return events list of an organizer
     */
    public List<String> getOrganizerEventsList(Organizer o) {
        List<String> organizerEventsList = new ArrayList<>();
        for (Event e : eventList) {
            if (e.getOrganizerList().containsOrganizer(o)) {
                organizerEventsList.add(e.getTitle());
            }
        }
        return organizerEventsList;
    }

    /**
     * 
     * @param fae a fae
     * @return list of strings with event title of this fae
     */
    public List<String> getFAEEventsList(FAE fae) {
        List<String> FAEEventsList = new ArrayList<>();
        for (Event e : eventList) {
            if (e.getFAEList().getFAEList().contains(fae)) {
                FAEEventsList.add(e.getTitle());
            }
        }
        return FAEEventsList;
    }
 

    /**
     * Lets get the Events List ready for submission
     *
     * @return Events List
     */
//    public List<Event> getEventsReadyForSubmission() {
//        List<Event> ReadyEvents = new ArrayList<>();
//        eventList.stream().filter((e) -> ((Date.currentDate().difference(e.getStartDate())) >= 0 && (Date.currentDate().difference(e.getStartDate())) <= 0)).forEachOrdered((e) -> {
//            ReadyEvents.add(e);
//        });
//        return ReadyEvents;
//    }

    /**
     * Gets the list of events
     *
     * @return Events List
     */
    public List<Event> getEventList() {
        return eventList;
    }

    /**
     * Verifies if an Event with the title introduced as been already created
     *
     * @param title title introduced
     * @return false if there is no Event with such title / true if there is an
     * Event already created with the given title
     */
    public boolean validateEvent(String title) {
        for(Event e:eventList){
            if(e.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    
   /**
    * 
    * @param title title of the event
    * @return return the event that has this title
    */
    public Event getEvent(String title) {
        for (Event event : eventList) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }
    
   /**
    * 
    * @return list of strings with event title 
    */
    public List<String> getEventListString(){
        List<String> eventListString=new ArrayList<>();
        for(Event e: eventList){
            eventListString.add(e.getTitle());
        }
        return eventListString;
    }
}
