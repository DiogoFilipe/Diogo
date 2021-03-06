/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class DefineFAEController {
    /**
     * Fair Center
     */
  private FairCenter fc;
  private EventRegist eventRegist;
  private UserRegist userRegist;
  private OrganizerList organizerList;
  private FAEList FAElist;
  private Event event;
  private User u;
  private FAE fae;
  private List<User> usersList;
  
   /**
     * Class constructor 
     * @param fc DefineFAEController
     */
    public DefineFAEController (FairCenter fc, User u){
        this.fc= fc;
        this.u = u;
    }   
    
    /**
     * Method that returns a events list ready for submission
     * @return events list active
     */
    public List<Event> getEventsList () {
        return fc.getEventRegist().getEventList();
    }
    
    /**
     * @return RegistoEventos
     */
    public EventRegist getEventsRegist() {
        return this.fc.getEventRegist();
    }
    
    
    /**
     *
     * @return
     */
    public List<User> getUsersList(Event e) {
        this.event = event;
        userRegist = fc.getUserRegist();
        return userRegist.getUserList();
    }
    
    
    /**
     * @return user selected
     */
    public User getUserSelected() {
        return u;
    }
    /**
     * 
     * @return Fae list
     */
    public List<FAE> getFAEList(){
        return FAElist.getFAEList();
    }
    
    /**
     *
     * @return
     */
    public Event getEventSelect() {
        return event;
    }
    
     /**
     * @return users list
     */
    public List<User> getUsersList() {
        return usersList;
    }
    
    /**
     *
     * @param event
     */
    public void setEventSelect(Event event) {
        this.event = event;    
    }
    /**
     * 
     * @param u 
     */
    public void setUserSelect(User u){
        this.u = u;
    }
    
    public FAE addFAE(User u, Event event) {
        FAE newFae = new FAE(u);
        event.getFAEList().getFAEList().add(fae);
        return newFae;
    }
    
    public List<User> generateUsersList(Event e) {

        return fc.getUserRegist().getUserList();
    }
}
