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
public class DecisionsList implements Serializable {
    
    List<Decision> decisionsList;

    /**
     * 
     */
    public DecisionsList() {
        decisionsList = new ArrayList<>();
    }

    /**
     * Adds a decision do the decisions list
     * @param decisao - decision to be added
     */
    public void addDecision(Decision decision) {
        decisionsList.add(decision);
    }

    /**
     * 
     * Returns the decisions List
     * @return the list of decisions
     */
    public List<Decision> getDecisionsList() {
        return decisionsList;
    }

    /**
     * Removes a decision from the list
     * @param decision - decision to be removed
     * @return
     */
    public boolean removeDecision(Decision decision){
    return decisionsList.remove(decision);
    }    

}
