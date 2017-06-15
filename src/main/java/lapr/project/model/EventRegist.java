package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class EventRegist implements Serializable {

    FairCenter fc;

    /**
     * Event list
     */
    private final List<Event> eventsList;

    /**
     * Constructor
     */
    public EventRegist() {
        eventsList = new ArrayList<>();
    }

    /**
     * Method that returns the event list of a given organizer
     *
     * @param o is the organizer
     * @param eventsList
     * @return events list of an organizer
     */
    public List<Event> getOrganizerEventsRegist(Organizer o, List<Event> eventsList) {
        List<Event> organizersList = new ArrayList<>();
        eventsList.stream().filter((e) -> (e.getOrganizerList().containsOrganizer(o))).forEachOrdered((e) -> {
            organizersList.add(e);
        });
        return organizersList;
    }
//    
//    /**
//     * Method that returns the event list of a given fae
//     * @param fae
//     * @return events list of fae
//     * 
//    */
//    public List<Event> getFAEEventsRegist (FAE fae) {
//        List<Event> fl = new ArrayList<>();
//        for (int i = 0; i < eventsList.size(); i++) {
//            for (int j = 0; j < eventsList.get(i).getFAEList().size(); j++) {
//                if (eventsList.get(i).getFAEList().get(j).getUsername().equals(fae.getUsername())) {
//                    fl.add(eventsList.get(i));
//                }
//            }
//
//        }
//        return fl;    
//    }
//    
//    /**
//     * Method that returns the event list of a given fae, through a User object
//     * @param user
//     * @return events list of fae
//     */
//    public List<Event> getFAEEventsRegist (User user) {
//        List<Event> fl = new ArrayList<>();
//        for (int i = 0; i < eventsList.size(); i++) {
//            for (int j = 0; j < eventsList.get(i).getFAEList().size(); j++) {
//                if (eventsList.get(i).getFAEList().get(j).getUsername().equals(user.getUsername())) {
//                    fl.add(eventsList.get(i));
//                }
//            }
//
//        }
//        return fl;    
//    } 

    /**
     * Lets get the Events List ready for submission
     *
     * @return Events List
     */
    public List<Event> getEventsReadyForSubmission() {
        List<Event> ReadyEvents = new ArrayList<>();
        eventsList.stream().filter((e) -> ((Date.currentDate().difference(e.getStartDate())) >= 0 && (Date.currentDate().difference(e.getStartDate())) <= 0)).forEachOrdered((e) -> {
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
        if (!eventsList.contains(event)) {
            return eventsList.add(event);
        }
        return false;
    }

    /**
     * Gets the list of events
     *
     * @return Events List
     */
    public List<Event> getEventList() {
        return eventsList;
    }

    /**
     * Event list size
     *
     * @return int With the size of the event list
     */
    public int Size() {
        return eventsList.size();
    }

    /**
     * Get event through your position in the list
     *
     * @param i
     * @return event
     */
    public Event GetEvent(int i) {
        return eventsList.get(i);
    }

    /**
     * Returns the index of an event in the list
     *
     * @param event
     * @return int With the position of the event
     */
    public int INDEXOF(Event event) {
        return eventsList.indexOf(event);
    }

    /**
     * Remove an event from the list
     *
     * @param event the event to remove
     * @return boolean depending on the success of the operation
     */
    public boolean removeEvent(Event event) {
        return eventsList.remove(event);
    }

    /**
     * Checks whether the list contains a certain event
     *
     * @param event to check if its on the list
     * @return true or false
     */
    public boolean CONTAINS(Event event) {
        return eventsList.contains(event);
    }

    /**
     * Verifies if an Event with the title introduced as been already created
     *
     * @param title title introduced
     * @return false if there is no Event with such title / true if there is an
     * Event already created with the given title
     */
    public boolean validateEvent(String title) {
        return eventsList.stream().anyMatch((event) -> (event.getTitle().equalsIgnoreCase(title)));
    }

    /**
     * Sets the data of the new event
     *
     * @param e Event in the initial state
     * @param title Event's title
     * @param description Event's title
     * @param place Event's place of occurrence
     * @param startDate Event's start date
     * @param endDate Event's end date
     * @param submissionStartDate Event's submission start date
     * @param submissionEndDate Event's submission end date
     */
    public void setData(Event e, /*type,*/ String title, String description, String place, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate) {
        /*type*/
        e.setTitle(title);
        e.setDescription(description);
        e.setPlace(place);
        e.setStartDate(startDate);
        e.setEndDate(endDate);
        e.setSubmissionStartDate(submissionStartDate);
        e.setSubmissionEndDate(submissionEndDate);
    }

    /**
     * Adds the created Event to the list of Events
     *
     * @param e created Event
     */
    public void registerEvent(Event e) {
        eventsList.add(e);
    }

}
