
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
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

    private Application a;
    private AssignStands as;

    public AssignStandsController(FairCenter fc, Organizer o) {
        this.fc = fc;
        this.o = o;

    }

    public void selectApplication(Application a) {
        this.a = a;

    }

    public List<Stand> getStands(Event e) {

        return this.e.getStandList().getNotAssignedStands();
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
     * @return event
     */
    public Event getEventSelect() {
        return e;
    }
    
    /**
     *
     * @param event
     */
    public void setEventSelect(Event event) {
        this.e = event;    
    }
    
    public List<Application> generateApplicationsList(Event e) {
        
        UserRegist userList = new UserRegist();
        

        return this.usersList;
    }

    public AssignStands createAssignment(Stand s, Application a) {
        return e.getListAssignedStands().newStandAssignment(s, a);
    }

    public boolean validate(AssignStands as) {
        return e.getListAssignedStands().validate(as);

    }

    public void AssignStand(boolean b, AssignStands sa) {
        if (b == true) {
            e.getListAssignedStands().AssignmentStandsRegist(b, sa);

        }

    }
    
}
