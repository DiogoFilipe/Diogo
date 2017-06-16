/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.EventRegist;
import lapr.project.model.FAEList;
import lapr.project.model.FairCenter;
import lapr.project.model.User;
import lapr.project.model.UserRegist;

/**
 *
 * @author João Domingues
 */
public class DefineFAEController {
    /**
     * Fair Center
     */
  private final FairCenter fc;
  private final EventRegist eventRegist;
  private UserRegist userRegist;
  private FAEList FAElist;
  private Event event;
  private User u;
  
   /**
     * Class constructor 
     * @param fc DefineFAEController
     */
    public DefineFAEController (FairCenter fc){
        this.fc= fc;
        this.eventRegist = fc.getEventRegist();
        this.FAElist = new FAEList();
        this.event = new Event();
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
        userRegist = fc.getUsersRegist();
        return userRegist.getUserList();
    }
    
    /**
     *
     * @return
     */
    public boolean FAEregist() {
        return FAElist.FAEregist(u);
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

    /**
     *
     */
    public void setStateEventFAEDefined() {
        event.
    }
    

  
}
