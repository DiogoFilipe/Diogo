/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Application;
import lapr.project.model.FairCenter;
import lapr.project.model.FrequencyKeyword;
import lapr.project.model.Keyword;
import lapr.project.model.Organizer;
import lapr.project.model.User;

/**
 *
 * @author Diogo
 */
public class ShowEventKeywordsController {

    FairCenter fc;
    User user;

    public ShowEventKeywordsController(FairCenter fc, User user) {
        this.fc = fc;
        this.user = user;
    }

    public boolean isOrganizer(User u) {
        return fc.getOrganizerList().getOrganizerList().contains((Organizer) u);
    }

    public List<String> getEventListOrganizer(User user) {
        return fc.getEventRegist().getOrganizerEventList((Organizer) user);
    }

    public List<Keyword> getKeywordsList(String e) {
        List<Application> applicationsList = fc.getEvent(e).getApplicationList().getApplicationList();
        List<Keyword> keywords = new ArrayList<>();
        for (Application a : applicationsList) {
            keywords.addAll(a.getKeywordList());
        }
        return keywords;
    }

    /**
     *
     * @param e the event
     * @return the list of applications
     */
    public List<String> getKeywordsListString(String e) {
        List<Keyword> keywords = getKeywordsList(e);
        List<String> keyword = new ArrayList<>();
        for (Keyword k : keywords) {
            keyword.add(k.getValue());
        }
        return keyword;
    }

    /**
     *
     * @param e
     * @return
     */
    public List<Double> getFrequencesList(String e) {
        List<Keyword> keywords = getKeywordsList(e);
        FrequencyKeyword freq = new FrequencyKeyword(keywords, e);
        return freq.calcFreq(e);
    }
}
