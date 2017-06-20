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

    FairCenter fc;
    EventRegist er;
    UserRegist ur;
    Event e;
    
    public CreateEventController(FairCenter fc) {
        this.fc = fc;
        this.er = fc.getEventRegist();
        this.ur = fc.getUserRegist();
        this.e = new Event();
    }

    /**
     * Returns a list with all the Users' names
     *
     * @return list with all the Users' names
     */
    public List<String> getUserList() {
        List<User> userList = ur.getUserList();
        List<String> userListString = new ArrayList<>();
        //Need to add a try/catch in case the userList is empty
        for (User user : userList) {
            userListString.add(user.getName());
        }
        return userListString;
    }

    /**
     * Sets the data of the new event
     *
     * @param title Event's title
     * @param description Event's title
     * @param place Event's place of occurrence
     * @param startDate Event's start date
     * @param endDate Event's end date
     * @param submissionStartDate Event's submission start date
     * @param submissionEndDate Event's submission end date
     * @param organizerList Event's Organizer list
     */
    public void setData(/*type,*/String title, String description, String place, String startDate, String endDate, String submissionStartDate, String submissionEndDate, List<String> organizerList) {
        if (!er.validateEvent(title)) {
            /*type*/
            e.setTitle(title);
            e.setDescription(description);
            e.setPlace(place);
            e.setStartDate(Date.StringToDate(startDate));
            e.setEndDate(Date.StringToDate(endDate));
            e.setSubmissionStartDate(Date.StringToDate(submissionStartDate));
            e.setSubmissionEndDate(Date.StringToDate(submissionEndDate));
            //Must get a list of strings, and then, convert that list into an Organizer List and set it as the Event's Organizer list
            List<Organizer> eventOrganizerList = new ArrayList<>();
            for (String name : organizerList) {
                for (User user : ur.getUserList()) {
                    if (user.getName().equals(name)) {
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
        er.addEvent(e);
    }
    
    /**
     * Sets the Event's state as Created
     */
    public void setCreated() {
       e.setState(EventState.State.Created);
    }

}
