/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Domingues
 */
public class AssignmentListStand {
    
     private List<AssignStands> assignstands;

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
        this.assignstands = assignstands;
    }

    public boolean validate(AssignStands s) {

        for (AssignStands as : getStandsAssigned()) {
            if (as.getStand().equals(s.getStand())|| as.getApplication().HasStand() == true) {
                return false;
            }
        }
        return true;
    }

    public AssignStands newAssignStand(Stand s, Application a) {
        return new AssignStands(s, a);
    }

    public void AssignmentStandsRegist(Boolean b, AssignStands as) {
        if (b == true) {
            as.getApplication().setHasStand(true);
            getStandsAssigned().add(as);

        }

    }


    public Stand getStandApplication(Application a) {

        for (AssignStands as : assignstands) {

            if (a == as.getApplication()) {

                return as.getStand();
            }
        }
        return null;
    }
    
}