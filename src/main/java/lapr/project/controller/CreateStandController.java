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
 * @author HP
 */
public class CreateStandController {
    private FairCenter fc;
    private Stand stand;
    private EventRegist eventList;
  
    
    
    public CreateStandController(){
        this.fc = new FairCenter();
    }
    
    public Stand createStand(double area){
       return stand = new Stand(area);
    }
    
    
    public boolean verifyArea(String area){
    return Stand.verifyArea(area);}
    
   
    public boolean addStand(Event event,Stand stand){
    return event.addStand(stand);}
    
    public static List<Event> getEventList(){
    return FairCenter.getEventList();}
    
    public static Event getEvent(String title){
    return FairCenter.getEvent(title);}
}
