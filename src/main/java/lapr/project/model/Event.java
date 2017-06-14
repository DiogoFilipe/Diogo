package lapr.project.model;

import java.util.List;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Event {

    private String title;
    private String description;
    private String place;
    private Date startDate;
    private Date endDate;
    private Date submissionStartDate;
    private Date submissionEndDate;
    private int acceptanceRate;

    private List<FAE> faeList;
    private List<Application> applicationList;
    private List<Assignment> assignmentList;
    private List<Organizer> organizerList;

    public Event() {

    }

    public Event(String title, String description, String place, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, int acceptanceRate, List<FAE> faeList, List<Application> applicationList, List<Assignment> assignmentList, List<Organizer> organizerList) {
        this.title = title;
        this.description = description;
        this.place = place;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        this.assignmentList = assignmentList;
        this.faeList = faeList;
        this.applicationList = applicationList;
        this.organizerList = organizerList;
    }
    
    /**
     * Returns the Event's title
     * @return Event's title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Returns the Event's description
     * @return Event's description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Returns the Event's place
     * @return Event's place
     */
    public String getPlace() {
        return place;
    } 

    /**
     * Returns the Event's start date
     * @return Event's start date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Returns the Event's end date
     * @return Event's end date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Returns the Event's date for the beginning of the submission of
     * applications
     * @return Event's date for the beginning of the submission of applications
     */
    public Date getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * Returns the Event's FAE list
     * @return Event's FAE list
     */
    public List<FAE> getFAEList() {
        return faeList;
    }

    /**
     * Returns the Event's Application list
     * @return Event's Application list
     */
    public List<Application> getApplicationList() {
        return applicationList;
    }

    /**
     * Modify the Assignments List
     * @param assignmentList the list of assignments to be set
     */
    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    /**
     * Modify the FAEs List
     * @param faeList the list of FAEs to be set
     */
    public void setFAEList(List<FAE> faeList) {
        this.faeList = faeList;
    }

    /**
     * Modify the applications list
     * @param applicationsList the applicationsList to set
     */
    public void setApplicationsList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    @Override
    public String toString() {
        return String.format("#EVENT# %nTitle: %s %nDescription: %s %nPlace of occurence: %s %nStart Date: %s %nEnd Date: %s %nApplication Submission Start Date: %s %nApplication Submission End Date: %s", title, description, place, getStartDate().toYearMonthDayString(), getEndDate().toYearMonthDayString(), getSubmissionStartDate().toYearMonthDayString(), getSubmissionEndDate().toYearMonthDayString());
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param local to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @param submissionStartDate the submissionStartDate to set
     */
    public void setSubmissionStartDate(Date submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * @param submissionEndDate the submissionEndDate to set
     */
    public void setSubmissionEndDate(Date submissionEndDate) {
        this.submissionEndDate = submissionEndDate;
    }

    /**
     * @return the acceptanceRate
     */
    public int getAcceptanceRate() {
        return acceptanceRate;
    }

    /**
     * @param acceptanceRate the acceptanceRate to set
     */
    public void setAcceptanceRate(int acceptanceRate) {
        this.acceptanceRate = acceptanceRate;
    }

    /**
     * @return the faeList
     */
    public List<FAE> getFaeList() {
        return faeList;
    }

    /**
     * @return the organizersList
     */
    public List<Organizer> getOrganizersList() {
        return organizerList;
    }

    /**
     * @param organizersList the organizersList to set
     */
    public void setOrganizersList(List<Organizer> organizerList) {
        this.organizerList = organizerList;
    }

    /**
     *
     * @return submission end date
     */
    public Date getSubmissionEndDate() {
        return submissionEndDate;
    }

    public void addOrganizer(User u) {
        Organizer o = new Organizer(u);
        organizerList.add(o);
    }
    
    public void setCreated() {
        /*set Event's state to created*/
    }

}
