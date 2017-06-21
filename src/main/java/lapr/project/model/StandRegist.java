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
    
    private List<Stand> StandList;
    private AssignmentListStand als;

    /**
     *
     */
    public StandRegist() {
        StandList = new ArrayList<>();
    }


    /**
     *
     * @return
     */
    public List<Stand> getStandList() {
        return StandList;
    }
    
    public boolean valid(Stand s) {
        return (!StandList.contains(s));
    }


    public void addStand(Stand s) {
        getStandList().add(s);
    }

    @Override
    public String toString() {
        String toString = "";
        for (Object o : getStandList()) {
            toString += o.toString();
        }
        return toString;
    }

    

    public List<Stand> getNotAssignedStands() {
        List<Stand> standsNotAssigned = new ArrayList<>();
        int flag = 0;
        for (Stand s : getStandList()) {
            for (AssignStands as : als.getStandsAssigned()) {

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
     * @param sl the sl to set
     */
    public void setSl(List<Stand> sl) {
        this.StandList = sl;
    }
}
