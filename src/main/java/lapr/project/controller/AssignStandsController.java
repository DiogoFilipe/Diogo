
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

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * event
     */
    private Event e;

    /**
     * user
     */
    private User u;

    /**
     * list applications
     */
    private List<Application> applicationList;

    /**
     * stand
     */
    private Stand s;

    /**
     * list of stands
     */
    private List<Stand> standList;

    /**
     * list assigns
     */
    private List<AssignStands> assignstands;

    /**
     * application
     */
    private Application a;

    /**
     * assingn stands class
     */
    private AssignStands as;

    /**
     *
     * @param fc fair center
     * @param u user
     */
    public AssignStandsController(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;

    }

    /**
     *
     * @param a application
     */
    public void selectApplication(Application a) {
        this.a = a;

    }

    /**
     *
     * @param e event
     * @return stand list not assigned
     */
    public List<Stand> getStands(Event e) {

        return this.e.getStandList().getNotAssignedStands();
    }

    /**
     *
     * @return stand list
     */
    public List<Stand> getStandsList() {
        return standList;
    }

    /**
     * @return stand selected
     */
    public Stand getStandSelected() {
        return s;
    }

    /**
     * Method that returns a events list ready for submission
     *
     * @return events list active
     */
    public List<Event> getEventsList() {
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
     * @param a application
     */
    public void setApplicationSelect(Application a) {
        this.a = a;
    }

    /**
     *
     * @param event event
     */
    public void setEventSelect(Event event) {
        this.e = event;
    }

    /**
     *
     * @param stand stand
     */
    public void setStandSelect(Stand stand) {
        this.s = stand;
    }

    /**
     *
     * @param e event
     * @return list of applications of the event
     */
    public List<Application> generateApplicationsList(Event e) {

        ApplicationList applicationList = new ApplicationList();

        return this.applicationList;
    }

    /**
     *
     * @param s stand
     * @param a application
     * @return the new assignment of the stand with the application
     */
    public AssignStands createAssignment(Stand s, Application a) {
        return e.getListAssignedStands().newStandAssignment(s, a);
    }

    /**
     *
     * @param as assign stand
     * @return if the assign stand is valid
     */
    public boolean validate(AssignStands as) {
        return e.getListAssignedStands().validate(as);

    }

    /**
     *
     * @param validate boolean if is valid
     * @param sa assign stand
     */
    public void AssignStand(boolean validate, AssignStands sa) {
        if (validate == true) {
            e.getListAssignedStands().AssignmentStandsRegist(validate, sa);

        }

    }

}
