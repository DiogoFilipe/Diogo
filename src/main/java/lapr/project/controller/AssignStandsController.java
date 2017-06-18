/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.Event;
import lapr.project.model.FairCenter;
import lapr.project.model.Stand;
import lapr.project.model.User;

/**
 *
 * @author João Domingues
 */
public class AssignStandsController {
    private final FairCenter fc;
    private Event e;
    private Application a;
    private Stand s;
    
    /**
     *
     * @param fc
     * @param u
     */
    public AssignStandsController(FairCenter fc, User u) {
        this.fc = fc;
    }
    
     /**
     *
     * @return
     */
    public List<Event> getEventsListApplicanionsDecided() {   
        return null;
    }
    
    
    /**
     *
     * @return
     */
    public List<Stand> getStandsListAvailable() {
        return fc.getStandReg().getStandsListAvailable();
    }
    /**
     *
     * @return
     */
    public List<Application> getApplicationsListAccepted(Event e) {
       return fc.getEvent(e).getApplicationListAccepted();
        
    }
    
}
