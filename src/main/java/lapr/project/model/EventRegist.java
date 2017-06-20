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

    FairCenter fc;
    UserRegist ur;

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
    public List<String> getOrganizerEventsListOrdenedByState(Organizer o) {
        List<String> organizerEventsList = new ArrayList<>();
        for (Event e : eventList) {
            if (e.getOrganizerList().containsOrganizer(o)) {
                organizerEventsList.add(e.getTitle());
            }
        }
        return organizerEventsList;
    }

    public List<String> getFAEEventsList(FAE fae) {
        List<String> FAEEventsList = new ArrayList<>();
        for (Event e : eventList) {
            if (e.getFAEList().containsFAE(fae)) {
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
    public List<Event> getEventsReadyForSubmission() {
        List<Event> ReadyEvents = new ArrayList<>();
        eventList.stream().filter((e) -> ((Date.currentDate().difference(e.getStartDate())) >= 0 && (Date.currentDate().difference(e.getStartDate())) <= 0)).forEachOrdered((e) -> {
            ReadyEvents.add(e);
        });
        return ReadyEvents;
    }

    /**
     * Allows you to add an event to the regists
     *
     * @param event
     * @return boolean depending on the success of the operation
     */
    public boolean addEvent(Event event) {
        if (!eventList.contains(event)) {
            return eventList.add(event);
        }
        return false;
    }

    /**
     * Gets the list of events
     *
     * @return Events List
     */
    public List<Event> getEventList() {
        return eventList;
    }

    /**
     * Event list size
     *
     * @return int With the size of the event list
     */
    public int Size() {
        return eventList.size();
    }

    /**
     * Get event through your position in the list
     *
     * @param i
     * @return event
     */
    public Event GetEvent(int i) {
        return eventList.get(i);
    }

    /**
     * Returns the index of an event in the list
     *
     * @param event
     * @return int With the position of the event
     */
    public int IndexOf(Event event) {
        return eventList.indexOf(event);
    }

    /**
     * Remove an event from the list
     *
     * @param event the event to remove
     * @return boolean depending on the success of the operation
     */
    public boolean removeEvent(Event event) {
        return eventList.remove(event);
    }

    /**
     * Checks whether the list contains a certain event
     *
     * @param event to check if its on the list
     * @return true or false
     */
    public boolean Contains(Event event) {
        return eventList.contains(event);
    }

    /**
     * Verifies if an Event with the title introduced as been already created
     *
     * @param title title introduced
     * @return false if there is no Event with such title / true if there is an
     * Event already created with the given title
     */
    public boolean validateEvent(String title) {
        return eventList.stream().anyMatch((event) -> (event.getTitle().equalsIgnoreCase(title)));
    }

    /**
     * Returns a list of Events that the user identified by the username given
     * is an Organizer of
     *
     * @param username User's username
     * @return list of Events that the user identified by the username given is
     * an Organizer of
     */
    public List<Event> getOrganizerEventList(String username) {
        User u = ur.getUser(username);
        Organizer o = new Organizer(u);
        List<Event> organizerEventList = new ArrayList<>();
        for (Event e : eventList) {
            List<Organizer> tempList = e.getOrganizerList().getOrganizerList();
            boolean flag = tempList.contains(o);
            if (flag) {
                organizerEventList.add(e);
            }
        }
        return organizerEventList;
    }

    public Event getEvent(String title) {
        for (Event event : eventList) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }
    
    public List<String> getEventListString(){
        List<String> eventListString=new ArrayList<>();
        for(Event e: eventList){
            eventListString.add(e.getTitle());
        }
        return eventListString;
    }

}
