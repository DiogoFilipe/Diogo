package lapr.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;
import lapr.project.utils.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class CreateEventController implements Serializable{

        
            
    /**
     * fair center
     */
    private FairCenter fc;

    /**
     *
     * @param fc fair center
     */
    public CreateEventController(FairCenter fc) {
        this.fc = fc;
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
     * Sets the data of the new Congress
     *
     * @param title Congress's title
     * @param description Congress's title
     * @param place Congress's place of occurrence
     * @param startDate Congress's start date
     * @param endDate Congress's end date
     * @param submissionStartDate Congress's submission start date
     * @param submissionEndDate Congress's submission end date
     * @param organizerList Congress's Organizer list
     */
    public void setDataCongress(String title, String description, String place, String startDate, String endDate, String submissionStartDate, String submissionEndDate, List<String> organizerList) {
        if (!fc.getEventRegist().validateEvent(title)) {
            Congress e = new Congress();
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
            e.setState(EventState.State.Created);
            fc.getCongressList().getCongressList().add(e);
        }
    }

    /**
     *
     * @param title exhibition title
     * @param description exhibition description
     * @param place exhibition place
     * @param startDate exhibition start date
     * @param endDate exhibition end date
     * @param submissionStartDate exhibition submission start date
     * @param submissionEndDate exhibition submission end date
     * @param organizerList exhibition organizersList
     */
    public void setDataExhibition(String title, String description, String place, String startDate, String endDate, String submissionStartDate, String submissionEndDate, List<String> organizerList) {
        if (!fc.getEventRegist().validateEvent(title)) {
            Exhibition e = new Exhibition();
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
            e.setState(EventState.State.Created);
            fc.getExhibitionList().getExhibitionList().add(e);
        }
    }

    public void validateString(String s, String m) {
        if (s.trim().equals(" ") || s.equals("")) {
            throw new EmptySpaceException(m);
        }
    }

    public void validateYear(String s, String m) {
        String[] date = s.split("/");
        if (date[0].length() != 4 || date[0].contains("[a-zA-Z+]")) {
            throw new InvalidYearException(m);
        }
    }
    
    public void validateMonth(String s, String m) {
        String[] date = s.split("/");
        if (date[1].length() != 2 || date[1].contains("[a-zA-Z+]")|| Integer.parseInt(date[1])<0 ||Integer.parseInt(date[1])>12) {
            throw new InvalidMonthException(m);
        }
    }
    
    public void validateDay(String s, String m) {
        String[] date = s.split("/");
        if (date[2].length() != 2 || date[2].contains("[a-zA-Z+]")|| Integer.parseInt(date[2])<0 ||Integer.parseInt(date[2])>31) {
            throw new InvalidDayException(m);
        }
    }
    
}
