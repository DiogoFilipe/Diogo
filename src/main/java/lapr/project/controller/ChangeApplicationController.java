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

/**
 *
 * @author Diogo
 */
public class ChangeApplicationController {

    FairCenter fc;
    User user;

    public boolean isRepresentative(User u) {
        return ((Representative) u).hasCompanyName();
    }

    public ChangeApplicationController(FairCenter fc, User user) {
        this.user = user;
        this.fc = fc;
    }

    public List<String> getListEvents() {
        return fc.getEventRegist().getEventListString();
    }

    public List<String> getListApplicationsRepresentative(String e) {
        return fc.getEventRegist().getEvent(e).getRepresentativeListApplications((Representative) user);
    }

    public boolean deleteApplication(String e, String a) {
        return fc.getEventRegist().getEvent(e).getRepresentativeListApplications((Representative) user).remove(a);
    }

    public Application createApplication(String companyName, String address, int contact, String description, double area, int invites, List<Keyword> keywordsList) {
        Application newApplication = new Application(companyName, address, contact, description, area, invites, keywordsList);
        return newApplication;
    }

    public void addToEvent(String e,Application a) {
        fc.getEvent(e).addApplication(a);
    }

}
