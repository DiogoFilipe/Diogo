package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;
import lapr.project.utils.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class CreateEventController {

    /**
     * fair center
     */
    private FairCenter fc;

    private Event e;

    /**
     *
     * @param fc fair center
     */
    public CreateEventController(FairCenter fc) {
        this.fc = fc;
        this.e = new Event();
    }

    /**
     * Returns a list with all the Users' usernames
     *
     * @return list with all the Users' usernames
     */
    public List<String> getUserList() {
        return fc.getUserRegist().getUserListString();
    }

    /**
     * Sets the data of the new event
     *
     * @param type type of the event
     * @param title Event's title
     * @param description Event's title
     * @param place Event's place of occurrence
     * @param startDate Event's start date
     * @param endDate Event's end date
     * @param submissionStartDate Event's submission start date
     * @param submissionEndDate Event's submission end date
     * @param organizerList Event's Organizer list
     */
    public void setData(String type, String title, String description, String place, String startDate, String endDate, String submissionStartDate, String submissionEndDate, List<String> organizerList) {
        if (!fc.getEventRegist().validateEvent(title)) {
            e.setTitle(title);
            e.setDescription(description);
            e.setPlace(place);
            e.setStartDate(Date.StringToDate(startDate));
            e.setEndDate(Date.StringToDate(endDate));
            e.setSubmissionStartDate(Date.StringToDate(submissionStartDate));
            e.setSubmissionEndDate(Date.StringToDate(submissionEndDate));
            //Must get a list of strings, and then, convert that list into an Organizer List and set it as the Event's Organizer list
            List<Organizer> eventOrganizerList = new ArrayList<>();
            for (String username : organizerList) {
                for (User user : fc.getUserRegist().getUserList()) {
                    if (user.getUsername().equals(username)) {
                        Organizer o = new Organizer(user);
                        eventOrganizerList.add(o);
                    }
                }
            }
            OrganizerList ol = new OrganizerList(eventOrganizerList);
            e.setOrganizerList(ol);
        }
    }

    /**
     * Adds the created Event to the EventRegist
     */
    public void registerEvent() {
        fc.getEventRegist().getEventList().add(e);
    }

    /**
     * Sets the Event's state as Created
     */
    public void setCreated() {
        e.setState(EventState.State.Created);
    }

    public List<String> getOrganizerList() {
        return fc.getOrganizerListString();
    }
    
    public Organizer getOrganizer(String username){
        return fc.getOrganizerList().getOrganizer(username);
    }

}
