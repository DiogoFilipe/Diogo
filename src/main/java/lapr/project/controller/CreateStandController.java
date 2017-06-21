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
    FairCenter fc;
    private Stand stand;
    private EventRegist eventList;
    private User user;
  
    
    
    public CreateStandController(FairCenter fc,User user){
        this.user = user;
        this.fc = fc;
    }
    
    public boolean verifyArea(String area){
    return Stand.verifyArea(area);}
    
   
    public boolean addStand(Event event,Stand stand){
    return event.addStand(stand);}
    
    public List<Event> getEventList(){
    return fc.getEventList();}
    
    public Event getEvent(String title){
    return fc.getEvent(title);}
}
