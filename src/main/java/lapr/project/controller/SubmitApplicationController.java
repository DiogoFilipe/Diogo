package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161249_1162109
 */
public class SubmitApplicationController {
    
    FairCenter fc;
    EventRegist er;
    Event e;
    Application a;
    List<Application> al;
    
    public SubmitApplicationController(FairCenter fc) {
        this.fc = fc;
        this.er = fc.getEventRegist();
    }
    
    public List<String> getListEventsOpenForApplications() {
        List<String> eventsOpenForApplicationsListString = new ArrayList<>();
        List<Event> eventList = er.getEventList();
        for (Event event : eventList) {
            if (event.getState() == EventState.State.OpenForApplications) {
                eventsOpenForApplicationsListString.add(event.getTitle());
            }
        }
        return eventsOpenForApplicationsListString;
    }
    
    public void getApplicationList(String eventTitle) {
        List<Event> eventList = er.getEventList();
        for (Event event : eventList) {
            if (event.getTitle().equals(eventTitle)) {
                e = event;
            }
        }
        this.al = e.getApplicationList().getApplicationList();
    }
    
    public void setData(String companyName, String address, int contact, String description, double boothArea, int invites, List<String> keywordListString) {
        List<Keyword> keywordList = new ArrayList<>();
        for (String word : keywordListString) {
            Keyword keyword = new Keyword(word);
            keywordList.add(keyword);
        }
        a = new Application(companyName, address, contact, description, boothArea, invites, keywordList);
    }
    
    public void addApplication() {
        al.add(a);
    }
    
    public void setCreated() {
        a.setState(ApplicationState.State.Created);
    }
    
}
