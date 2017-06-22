
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.ApplicationList;
import lapr.project.model.AssignStands;
import lapr.project.model.Event;
import lapr.project.model.FairCenter;
import lapr.project.model.Organizer;
import lapr.project.model.Stand;
import lapr.project.model.User;

/**
 *
 * @author João Domingues
 */
public class AssignStandsController {
    private FairCenter fc;
    private Event e;
    private Organizer o;
    private List<Application> applicationList;
    private Stand s;
    private List<Stand>standList;
    private List<AssignStands> assignstands;

    private Application a;
    private AssignStands as;

    public AssignStandsController(FairCenter fc, Organizer o) {
        this.fc = fc;
        this.o = o;

    }

    /**
     *
     * @param a
     */
    public void selectApplication(Application a) {
        this.a = a;

    }
    /**
     * 
     * @param e
     * @return stand list not assigned
     */
    public List<Stand> getStands(Event e) {

        return this.e.getStandList().getNotAssignedStands();
    }
    /**
     * 
     * @return stand list
     */
    public List<Stand> getStandsList(){
        return standList ; 
    }
    
    /**
     * @return stand selected
     */
    public Stand getStandSelected() {
        return s;
    }
     
    
    /**
     * Method that returns a events list ready for submission
     * @return events list active
     */
    public List<Event> getEventsList () {
        return fc.getEventRegist().getEventList();
    }
    
    /**
     * @return applications list
     */
    public List<Application> getAppicationsList() {
        return applicationList;
    }
    /**
     *
     * @return event
     */
    public Event getEventSelect() {
        return e;
    }
    
    /**
     * @return user selected
     */
    public Application getApplicationSelected() {
        return a;
    }
    
    /**
     * @return the assigns stands 
     */
    public List<AssignStands> getStandsAssigned() {
        return e.getListAssignedStands().getStandsAssigned();
    }
    
    /**
     * 
     * @param u 
     */
    public void setApplicationSelect(Application a){
        this.a = a;
    }
    
    /**
     *
     * @param event
     */
    public void setEventSelect(Event event) {
        this.e = event;    
    }
    
    /**
     *
     * @param stand
     */
    public void setStandSelect(Stand stand) {
        this.s = stand;    
    }
    
    /**
     *
     * @param e
     * @return
     */
    public List<Application> generateApplicationsList(Event e) {
        
        ApplicationList applicationList = new ApplicationList();
        

        return this.applicationList;
    }

    /**
     *
     * @param s
     * @param a
     * @return
     */
    public AssignStands createAssignment(Stand s, Application a) {
        return e.getListAssignedStands().newStandAssignment(s, a);
    }

    /**
     *
     * @param as
     * @return
     */
    public boolean validate(AssignStands as) {
        return e.getListAssignedStands().validate(as);

    }

    /**
     *
     * @param validate
     * @param sa
     */
    public void AssignStand(boolean validate, AssignStands sa) {
        if (validate == true) {
            e.getListAssignedStands().AssignmentStandsRegist(validate, sa);

        }

    }
    
}
