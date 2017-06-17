package lapr.project.controller;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ShowEventStandsInformationController {
    
    public List<Event> getOrganizerEventList() {
        
    }
    
    public List<Stand> getEventStandsInformation(Event e) {
        
        return e.getStandList();
        
        //This goes in the UI, not here
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
            if (stand.getArea() >= 10 && stand.area < 20) {
                standsAreaFrom10to20.add(stand.getArea());
            }
            if (stand.getArea() >= 20 && stand.area < 30) {
                standsAreaFrom20to30.add(stand.getArea());
            }
            if (stand.getArea() >= 30) {
                standsAreaBiggerThan30.add(stand.getArea());
            }
        }
        
        averageArea = totalArea / nStands;
        //mean deviation calculation
        */
        
    }
    
}
