/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Event;
import lapr.project.model.FairCenter;

/**
 *
 * @author João Domingues
 */
public class DefineFAEController {
    /**
     * Fair Center
     */
  private FairCenter fc;
  
   /**
     * Class constructor 
     * @param fc DefineFAEController
     */
    public DefineFAEController (FairCenter fc){
        this.fc= fc;
    }
    
    /**
     * Method that returns a events list ready for submission
     * @return events list active
     */
    public List<Event> getEventsActive () {
        return fc.getEventRegist().getEventList();
    }
    
    
    
    

  
}