package lapr.project.controller;

import java.util.List;
import lapr.project.model.FairCenter;
import lapr.project.model.User;

/**
 *
 * @author Diogo
 */
public class EventAcceptanceRateController {

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * user
     */
    private User u;

    /**
     *
     * @param fc fair center
     * @param u user
     */
    public EventAcceptanceRateController(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
    }

    /**
     *
     * @return list of strings with event title
     */
    public List<String> getEventList() {
        return fc.getEventRegist().getEventListString();
    }

    /**
     *
     * @param e event
     * @return list of strings with applications accepted company name
     */
    public List<String> getApplicationsDecided(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationListAccepted();
    }

    /**
     *
     * @param e event title
     * @return list of strings with application rejected company name
     */
    public List<String> getApplicationsRejected(String e) {
        return fc.getEvent(e).getApplicationList().getApplicationListRejected();
    }

    /**
     *
     * @param e event title
     * @return event acceptance rate
     */
    public double acceptanceRate(String e) {
        List<String> accepted = getApplicationsDecided(e);
        List<String> rejected = getApplicationsRejected(e);
        return (accepted.size() / (rejected.size() + accepted.size())) * 100;
    }
}
