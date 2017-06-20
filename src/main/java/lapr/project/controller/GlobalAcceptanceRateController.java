package lapr.project.controller;

import java.util.List;
import lapr.project.model.FairCenter;
import lapr.project.model.User;

/**
 *
 * @author Diogo
 */
public class GlobalAcceptanceRateController {

    FairCenter fc;
    User u;

    public GlobalAcceptanceRateController(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
    }
    
    public List<String> getEventList(){
        return fc.getEventRegist().getEventListString();
    }

    public List<String> getApplicationsDecided(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationListAccepted();
    }

    public List<String> getApplicationsRejected(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationListRejected();
    }
    
    public double acceptanceRate(String e){
        List<String> accepted = getApplicationsDecided(e);
        List<String> rejected = getApplicationsRejected(e);
        return (accepted.size()/(rejected.size()+accepted.size()))*100;
    }
}
