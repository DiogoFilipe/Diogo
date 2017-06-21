/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.FairCenter;
import lapr.project.model.User;

/**
 *
 * @author Diogo
 */
public class ShowGlobalAcceptanceRateController {
    
    FairCenter fc;
    User u;
    
    public ShowGlobalAcceptanceRateController(FairCenter fc,User u){
        this.fc=fc;
        this.u=u;
    }
    
    public List<String> getListApplicationsRejected(){
        return fc.getApplicationListRejected();
    }
    
    public List<String> getListApplicationsAccepted(){
        return fc.getApplicationListAccepted();
    }
    
    public double getAcceptanceRating(){
        int accepted = getListApplicationsAccepted().size();
        int rejected = getListApplicationsRejected().size();
        double rating = (accepted/(rejected+accepted))*100;
        return rating;
    }
}
