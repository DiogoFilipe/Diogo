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
 * @author Diogo
 */
public class EventManagerList implements Serializable{

    /**
     * list of event managers
     */
    private List<EventManager> eventManagerList;
    
    /**
     * 
     * @param eventManagerList list of event managers
     */
    public EventManagerList(List<EventManager> eventManagerList){
        this.eventManagerList=eventManagerList;
    }
    
    /**
     * empty constructor
     */
    public EventManagerList(){
        this.eventManagerList= new ArrayList<>();
    }

    /**
     * @return the eventManagerList
     */
    public List<EventManager> getEventManagerList() {
        return eventManagerList;
    }

    /**
     * @param eventManagerList the eventManagerList to set
     */
    public void setEventManagerList(List<EventManager> eventManagerList) {
        this.eventManagerList = eventManagerList;
    }

}
