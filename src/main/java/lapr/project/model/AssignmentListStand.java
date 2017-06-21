/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Domingues
 */
public class AssignmentListStand implements Serializable{

    /**
     * list of stands assigned
     */
    private List<AssignStands> assignstands;

    /**
     * empty constructor
     */
    public AssignmentListStand() {
        this.assignstands = new ArrayList<>();

    }

    /**
     * @return the standsAssigned
     */
    public List<AssignStands> getStandsAssigned() {
        return assignstands;
    }

    /**
     * @param standsAssigned the standsAssigned to set
     */
    public void setStandsAssigned(List<AssignStands> standsAssigned) {
        this.assignstands = standsAssigned;
    }

    /**
     * 
     * @param s the assign stands list
     * @return true if the stand isn't assigned
     */
    public boolean validate(AssignStands s) {
        for (AssignStands as : getStandsAssigned()) {
            if (as.getStand().equals(s.getStand()) || as.getApplication().HasStand() == true) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 
     * @param s the stand and a the application
     * @return new assign stand
     */
    public AssignStands newStandAssignment(Stand s, Application a) {
        return new AssignStands(s, a);
    }

    /**
     * 
     * @param b boolean
     * @param as assign Stands
     */
    public void AssignmentStandsRegist(Boolean b, AssignStands as) {
        if (b == true) {
            as.getApplication().setHasStand(true);
            getStandsAssigned().add(as);

        }
    }

    /**
     * 
     * @param a application
     * @return the stand of the application
     */
    public Stand getStandApplication(Application a) {

        for (AssignStands as : assignstands) {

            if (a == as.getApplication()) {

                return as.getStand();
            }
        }
        return null;
    }

}
