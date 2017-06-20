/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.EventRegist;
import lapr.project.model.FAE;
import lapr.project.model.FAEList;
import lapr.project.model.FairCenter;
import lapr.project.model.Organizer;
import lapr.project.model.OrganizerList;
import lapr.project.model.User;
import lapr.project.model.UserRegist;

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
     *
     * @return
     */
    public List<User> getUsersList() {
        userRegist = fc.getUserRegist();
        return userRegist.getUserList();
    }
    
    public boolean isOrganizer(Organizer o){
        return organizerList.containsOrganizer(o);
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
     * @return FAE regist
     */
    public boolean FAEregist() {
        return FAElist.FAEregist(u);
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
     * @param index
     */
    public void chooseUser(int index) {
        u = userRegist.getUserByIndex(index);
    }
    
    /**
     *
     * @return
     */
    public Event getEvent() {
        return event;
    }
    
    /**
     *
     * @param event
     */
    public void setEvent(Event event) {
        this.event = event;
        FAElist = event.getFAEList();
    }
    
    public void addFAE(User user, Event evt) {
        FAE newFae = new FAE(user);
        this.fae = newFae;
        FAElist.addFAE(fae);
    }
    
    
    
    
}
