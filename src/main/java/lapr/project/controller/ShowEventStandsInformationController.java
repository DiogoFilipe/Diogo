package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ShowEventStandsInformationController {
    
    EventRegist er;
    
    public List<String> getOrganizerEventList(String username) {
        List<Event> organizerEventList = er.getOrganizerEventList(username);
        List<String> organizerEventListString = new ArrayList<>();
        for (Event event : organizerEventList) {
            organizerEventListString.add(event.getTitle());
        }
        return organizerEventListString;
    }
    
    public List<String> getEventStandsInformation(String title) {
        
        Event e = new Event();
        List<Event> eventList = er.getEventList();
        for (Event event : eventList) {
            if (event.getTitle().equals(title)) {
                e = event;
            }
        }
        
        List<Stand> standList = e.getStandList();
        List<String> standListString = new ArrayList();
        for (Stand stand : standList) {
            standListString.add(stand.getID());
        }
        return standListString;
        
        /*
        List<Stand> standList = e.getStandList();
        List<Double> standsAreaFrom0to10 = new ArrayList<>();
        List<Double> standsAreaFrom10to20 = new ArrayList<>();
        List<Double> standsAreaFrom20to30 = new ArrayList<>();
        List<Double> standsAreaBiggerThan30 = new ArrayList<>();
        int nStands = standList.size();
        double totalArea = 0;
        double averageArea = 0;
        
        //Missing Sturge's rule, still need to do some research on that
        
        for (Stand stand : standList) {
            nStands++;
            totalArea += stand.getArea();
            if (stand.getArea() < 10) {
                standsAreaFrom0to10.add(stand.getArea());
            }
            if (stand.getArea() >= 10 && stand.getArea() < 20) {
                standsAreaFrom10to20.add(stand.getArea());
            }
            if (stand.getArea() >= 20 && stand.getArea() < 30) {
                standsAreaFrom20to30.add(stand.getArea());
            }
            if (stand.getArea() >= 30) {
                standsAreaBiggerThan30.add(stand.getArea());
            }
        }
        
        averageArea = totalArea / nStands;
        
        double aux1 = 0, aux2 = 0;
        for (Stand stand : standList) {
            aux1 = Math.pow(Math.abs(stand.getArea() - averageArea), 2);
            aux2 += aux1; 
        }
        double meanDeviation = Math.sqrt(aux2 / nStands);
        */
        
    }
    
}
