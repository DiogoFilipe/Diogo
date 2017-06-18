package lapr.project.controller;

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
    Event e = new Event();

    public CreateEventController() {

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
    public void setData(/*type,*/String title, String description, String place, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, List<Organizer> organizerList) {
        if (!er.validateEvent(title)) {
            /*type*/
            e.setTitle(title);
            e.setDescription(description);
            e.setPlace(place);
            e.setStartDate(startDate);
            e.setEndDate(endDate);
            e.setSubmissionStartDate(submissionStartDate);
            e.setSubmissionEndDate(submissionEndDate);
            OrganizerList ol = new OrganizerList(organizerList);
            e.setOrganizerList(ol);
        }
    }

}
