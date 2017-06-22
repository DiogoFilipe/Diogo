package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class TestIfEventAcceptanceRateIsOver50Controller {

    FairCenter fc;
    
    private static final double CRITICAL_VALUE_95 = 0.5199;
    private static final double CRITICAL_VALUE_99 = 0.5040;

    public TestIfEventAcceptanceRateIsOver50Controller(FairCenter fc) {
        this.fc = fc;
    }

    public List<Event> getEventList() {
        List<Event> eventList1 = fc.getEventRegist().getEventList();
        List<Event> eventList2 = new ArrayList<>();
        for (Event event : eventList1) {
            if (event.getApplicationList().getApplicationList().size() >= 30) {
                eventList2.add(event);
                eventList2.add(event);
            }
        }
        return eventList2;
    }

    public double[] getAcceptedApplicationsProportion() {
        double[] proportionList = new double[getEventList().size()];
        int count = 0, aux = 0;
        for (Event event : getEventList()) {
            List<Application> applicationList = event.getApplicationList().getApplicationList();
            for (Application application : applicationList) {
                if (application.getD().getDecision()) {
                    count++;
                }
            }
            proportionList[aux] = (double) count / applicationList.size();
            aux++;
        }
        return proportionList;
    }
    
    public double[] getCriticalValues() {
        double[] criticalValues = new double[getEventList().size()];
        for (int i = 0; i < criticalValues.length - 1; i = i+2) {
            criticalValues[i] = CRITICAL_VALUE_95;
            criticalValues[i+1] = CRITICAL_VALUE_99;
        }
        return criticalValues;
    }
    
    public int[] getSignificanceLevels() {
        int[] significanceLevels = new int[getEventList().size()];
        for (int i = 0; i < significanceLevels.length - 1; i = i+2) {
            significanceLevels[i] = 95;
            significanceLevels[i] = 99;
        }
        return significanceLevels;
    }
    
    public double[] getObservedValues() {
        double[] observedValues = new double[getEventList().size()];
        List<Event> eventList = fc.getEventRegist().getEventList();
        for (Event event : eventList) {
            List<Application> applicationList = event.getApplicationList().getApplicationList();
            int applicationNumber = applicationList.size();
            int count = 0;
            for (Application application : applicationList) {
                if (application.getD().getDecision()) {
                    count++;
                }
            }
            double p0 = 0.5;
            double p = (double) count / applicationNumber;
            double observedValue = (double) (p - p0) / Math.sqrt((0.5*(1-0.5))/applicationNumber);
            for (int i = 0; i < observedValues.length - 1; i = i+2) {
                observedValues[i] = observedValue;
                observedValues[i+1] = observedValue;
            }
        }
        return observedValues;
    }

}
