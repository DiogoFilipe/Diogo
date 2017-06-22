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
 * @author HP
 */
public class DecisionList implements Serializable {

    private static final long serialVersionUID = 3799417066092788149L;

    /**
     * list of decisions
     */
    private List<Decision> decisionList;

    /**
     * empty constructor
     */
    public DecisionList() {
        decisionList = new ArrayList<>();
    }

    /**
     * @return the decisionList
     */
    public List<Decision> getDecisionList() {
        return decisionList;
    }

    /**
     * @param decisionList the decisionList to set
     */
    public void setDecisionList(List<Decision> decisionList) {
        this.decisionList = decisionList;
    }

}
