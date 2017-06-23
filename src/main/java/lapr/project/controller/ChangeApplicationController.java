/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.FairCenter;
import lapr.project.model.Keyword;
import lapr.project.model.Representative;
import lapr.project.model.User;
import lapr.project.utils.EmptySpaceException;

/**
 *
 * @author Diogo
 */
public class ChangeApplicationController {

    /**
     * fair center
     */
    private FairCenter fc;
    
    /**
     * user
     */
    private User user;

    /**
     * 
     * @param fc fair center
     * @param user user
     */
    public ChangeApplicationController(FairCenter fc, User user) {
        this.user = user;
        this.fc = fc;
    }

    /**
     * 
     * @return list of events 
     */
    public List<String> getListEvents() {
        return fc.getEventRegist().getEventListString();
    }

    /**
     * 
     * @param e event title
     * @return list of applications of the representative
     */
    public List<String> getListApplicationsRepresentative(String e) {
        return fc.getEventRegist().getEvent(e).getRepresentativeListApplications((Representative) user);
    }

    /**
     * 
     * @param e event title
     * @param a application company
     * @return true if it deletes the application
     */
    public boolean deleteApplication(String e, String a) {
        return fc.getEventRegist().getEvent(e).getApplicationList().getApplicationList().remove(fc.getEventRegist().getEvent(e).getApplicationList().getApplicationByCompanyName(a));
    }

    /**
     * 
     * @param companyName name of the company
     * @param address address of the company
     * @param contact contact of the company
     * @param description description
     * @param area area needed
     * @param invites number of invites
     * @param keywordsList list of keywords
     * @return the new applicaiton
     */
    public Application createApplication(String companyName, String address, int contact, String description, double area, int invites, List<Keyword> keywordsList) {
        Application newApplication = new Application(companyName, address, contact, description, area, invites, keywordsList);
        return newApplication;
    }

    /**
     * 
     * @param e event title
     * @return list of applications of the event
     */
    public List<Application> getApplicationsListOfTheEvent(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationList();
    }

    /**
     *
     * @param s string given
     * @param m parameter that can fails
     */
    public void validateString(String s, String m) {
        if (s.trim().equals(" ") || s.equals("")) {
            throw new EmptySpaceException(m);
        }
    }
    
    /**
     * 
     * @param s String of a number
     * @param m parameter that can fail
     */
    public void validateNumber(String s,String m){
        if(s.trim().equals(" ") || s.trim().equals("") || Integer.parseInt(s)<0 || s.contains("[a-zA-Z+]") ){
            throw new EmptySpaceException(m);
        }
    }
}
