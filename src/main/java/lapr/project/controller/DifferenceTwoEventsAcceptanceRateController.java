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
 * @author João Domingues
 */
public class DifferenceTwoEventsAcceptanceRateController {
    
    FairCenter fc;
    User u;

    public DifferenceTwoEventsAcceptanceRateController(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
    }
    
    public List<String> getEventList(){
        return fc.getEventRegist().getEventListString();
    }

    public List<String> getApplicationsDecided(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationListAccepted();
    }

    public List<String> getApplicationsRejected(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationListRejected();
    }
    
    public double acceptanceRate(String e){
        List<String> accepted = getApplicationsDecided(e);
        List<String> rejected = getApplicationsRejected(e);
        return (double) (accepted.size()/(rejected.size()+accepted.size()))*100;
    }
    
    public double differenceAcceptanceRate(String e, String evt){
        return Math.abs((acceptanceRate(e)-(acceptanceRate(evt))));
    }
    
}
