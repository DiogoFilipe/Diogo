package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FairCenter implements Serializable {

    
    private EventRegist eventRegist;
    private static FairCenter fc = new FairCenter();
    private UserRegist userRegist;
    private List<User> users;
    private List<User> notRegisteredUsers;
    private List<Event> events;

    /**
     * Constructor
     */
    public FairCenter() {
      this.users = new ArrayList<>();
      this.events =  new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }


    public List<Event> getEvents() {
        return events;
    }
    
    public static List<Event> getEventList(){
    return fc.getEvents();}

    public void setUsers(List<User> users) {
        this.users = users;
    }
  
    
    public void setEvents(List<Event> events) {
        this.events = events;
    }

 
    
    
    /**
     * Allows you to add a new user to the user regist
     *
     * @param user
     */
    public void newUser(User user) {
        userRegist.addUser(user);
    }

    /**
     * Allows you to add a new event to the event regist
     *
     * @param event
     */
    public void newEvent(Event event) {
        eventRegist.addEvent(event);
    }

    public static Event getEvent(String title){
    for(Event event : fc.getEvents()){
    if(event.getTitle().equals(title)){
    return event;}}
    return null;
    }
}
