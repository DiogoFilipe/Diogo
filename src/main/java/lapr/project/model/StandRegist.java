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
public class StandRegist implements Serializable{
    
    /**
     * list of stands
     */
    private List<Stand> StandList;
    
    /**
     * assignment list stand
     */
    private AssignmentListStand als;

    /**
     * empty constructor
     */
    public StandRegist() {
        StandList = new ArrayList<>();
    }


    /**
     *
     * @return list of stands
     */
    public List<Stand> getStandList() {
        return StandList;
    }
    
    /**
     * 
     * @return all the information 
     */
    @Override
    public String toString() {
        String toString = "";
        for (Object o : getStandList()) {
            toString += o.toString();
        }
        return toString;
    }

    /**
     * 
     * @return List of stands that are not assigned 
     */
    public List<Stand> getNotAssignedStands() {
        List<Stand> standsNotAssigned = new ArrayList<>();
        int flag = 0;
        for (Stand s : getStandList()) {
            for (AssignStands as : getAls().getStandsAssigned()){

                if (as.getStand()==s) {
                    flag = 1;
                }

            }
            if (flag == 0) {
                standsNotAssigned.add(s);
            }
        }
        return standsNotAssigned;
    }

    /**
     * @param StandList the StandList to set
     */
    public void setStandList(List<Stand> StandList) {
        this.StandList = StandList;
    }

    /**
     * @return the als
     */
    public AssignmentListStand getAls() {
        return als;
    }

    /**
     * @param als the als to set
     */
    public void setAls(AssignmentListStand als) {
        this.als = als;
    }
}
