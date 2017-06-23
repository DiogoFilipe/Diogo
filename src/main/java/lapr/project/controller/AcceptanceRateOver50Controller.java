/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author Diogo
 */
public class AcceptanceRateOver50Controller {

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * 
     * @param fc fair center 
     */
    public AcceptanceRateOver50Controller(FairCenter fc) {
        this.fc = fc;
    }

    /**
     * 
     * @return returns a list of strings with the event title 
     */
    public List<String> getEventList() {
        return fc.getEventRegist().getEventListString();
    }

    /**
     * 
     * @param e event title
     * @return true if the acceptance rate is over 50
     */
    public boolean getAcceptanceRate(String e) {
        int accepted = fc.getApplicationListAccepted().size();
        int rejected = fc.getApplicationListRejected().size();
        return ((double) accepted / (rejected + accepted) > 0.5);
    }
}
