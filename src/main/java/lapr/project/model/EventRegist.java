package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.FAE;
import lapr.project.model.User;
/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class EventRegist implements Serializable{
    /**
     * Event list
     */
    private final List<Event> EventsList;
    
    /**
     * Constructor
     */
    public EventRegist(){
        EventsList=new ArrayList<>();
    }
    
    /**
     * Method that returns the event list of a given fae
     * @param fae
     * @return events list of fae
     * 
    */
    public List<Event> getFAEEventsRegist (FAE fae) {
        List<Event> FaeList = new ArrayList<>();
        for (int i = 0; i < EventsList.size(); i++) {
            for (int j = 0; j < EventsList.get(i).getFAEList().size(); j++) {
                if (EventsList.get(i).getFAEList().get(j).getFaeUsername().equals(fae.getFaeUsername())) {
                    FaeList.add(EventsList.get(i));
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
        for (int i = 0; i < EventsList.size(); i++) {
            for (int j = 0; j < EventsList.get(i).getFAEList().size(); j++) {
                if (EventsList.get(i).getFAEList().get(j).getFaeUsername().equals(user.getUsername())) {
                    FaeList.add(EventsList.get(i));
                }
            }

        }
        return FaeList;    
    } 
    
    /**
     * Lets get the Events List ready for submission
     * @return Events List
     */
    public List<Event> getEventosProntosParaSubmissao(){
        List<Event> ReadyEvents= new ArrayList<>();
        for (Event e : EventsList) {
            if ((Data.dataAtual().diferenca(e.getDataInicial()))>=0 && (Data.dataAtual().diferenca(e.getDataFinal()))<=0 ) {
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
        for (Event e : EventsList) {
            if(e.getEventID()== eventID){
                pos=EventsList.indexOf(e);
            }
        }
    return EventsList.get(pos);
    }
    /**
     * Allows you to add an event to the regists
     * @param event
     * @return boolean depending on the success of the operation
     */
    public boolean addEvent(Event event){
        if (!EventsList.contains(event)) {
            return EventsList.add(event);
        }
        return false;
    }
    
     /**
     * Gets the list of events
     * @return Events List
     */
    public List<Event> getEvent() {
        return EventsList;
    }
    
    /**
     * Event list size
     * @return int With the size of the event list
     */
    public int Size(){
        return EventsList.size();
    }

    /**
     * Get event through your position in the list
     * @param i
     * @return event
     */
    public Event GetEvent(int i){
        return EventsList.get(i);
    }

    /**
     * Returns the index of an event in the list
     * @param event
     * @return int With the position of the event
     */
    public int INDEXOF(Event event) {
        return EventsList.indexOf(event);
    }
    
    /**
     * Remove an event from the list
     * @param evento
     * @return boolean depending on the success of the operation
     */
    public boolean removeEvent(Event event){
        return EventsList.remove(event);
    }
    
    /**
     * Checks whether the list contains a certain event
     * @param evento
     * @return true or false
     */
    public boolean CONTAINS(Event event){
        return EventsList.contains(event);
    }
}
