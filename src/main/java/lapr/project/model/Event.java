package lapr.project.model;

import java.util.List;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Event {

    /**
     * Identification number of an event
     */
    private int eventID;

    /**
     * Event id by default
     */
    private static final int EVENT_ID_DEFAULT = 0;

    
    private String title;
    private String description;
    private String place;
    private Date startDate;
    private Date endDate;
    private Date submissionStartDate;
    private Date submissionEndDate;
    private int acceptanceRate;

    private FAEList FAEsList;
    private ApplicationsList applicationsList;
    private AssignmentsList assignmentsList;
    private OrganizersList organizersList;

    public Event(String title, String description, String local, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, int acceptanceRate, FAEList faeList, ApplicationsList applicationsList, AssignmentsList assignmentsList, OrganizersList organizersList) {
        this.title = title;
        this.description = description;
        this.place = local;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        
        this.assignmentsList = new AssignmentsList();
        this.FAEsList = new FAEList();
        this.applicationsList = new ApplicationsList();
        this.organizersList = organizersList;
    }

    /**
     * @return the eventoID
     */
    public int getEventID() {
        return eventID;
    }

    /**
     * @return the StartDate
     */
    public Date getStartDate() {
        return startDate;
    }
    
    
    /**
     * Returns the Event's title
     *
     * @return User's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the Event´s description
     *
     * @return Event´s description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the Event´s local
     *
     * @return Event´s local
     */
    public String getLocal() {
        return place;
    }

    /**
     * Returns the Event´s beginning date
     *
     * @return Event´s beginning date
     */
    // public Date getBeginDate() {
    //     return beginDate;
    // }
    
    /**
     * Returns the Event´s ending date
     *
     * @return Event´s ending date
     */
    //public Date getEndDate() {
    //    return endDate;
    // }
    
    /**
     * Returns the Event´s date for the beginning of the submission of
     * applications
     *
     * @return Event´s date for the beginning of the submission of applications
     */
    //public Date getSubmissionBeginningDate() {
    //    return submissionBeginningDate;
    //}
    
    /**
     * Returns the Event´s date for the ending of the submission of applications
     *
     * @return Event´s date for the ending of the submission of applications
     */
    //public Date getSubmissionEndingDate() {
    //    return submissionEndingDate;
    //}

    /**
     * Returns the Event´s FAEs list
     *
     * @return Event´s faeList
     */

    public FAEList getFAEsRegist() {
        return FAEsList;
    }
    
    /**
     * Allows you to get the Faes list of an event
     * @return Faes List
     */
    public List<FAE> getFAEList(){
        return getFAEsRegist().getFAEList();
    }


    /**
     * @return the applicationsList
     */
    public ApplicationsList getApplicationsList() {
        return applicationsList;
    }

    /**
     * @return the assignmentsList
     */
    public AssignmentsList getAssignmentsList() {
        return assignmentsList;
    }

   /**
    * change the assignmentsList
    * @param assignmentsList the assignmentsList to set 
    */
    public void setAssignmentsList(AssignmentsList assignmentsList) {
        this.assignmentsList = assignmentsList;
    }
    /**
     * change the FAEs List
     * @param FAEsList 
     */
    public void setFAEList(FAEList FAEsList){
        this.FAEsList = FAEsList;
    }
/**
 * Change the applications list
 * @param applicationsList the applicationsList to set
 */
    public void setApplicationsList(ApplicationsList applicationsList) {
        this.applicationsList = applicationsList;
    }
    

    @Override
    public String toString() {

        String text = String.format("#EVENT# %nTitle: %s %nDescription: %s %nLocal de realização: %s %nBegins: %d %nEnds: %s %nApplication Submission opens: %d %nApplication Submission closes: %d",
                title, description, place, startDate, getEndDate(), getSubmissionStartDate(), getSubmissionEndDate(), getAcceptanceRate());

        return text;
    }

    /**
     * @param eventID the eventID to set
     */
    public void setEventID(int eventID) {
        this.eventID = eventID;
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
     * @param place the local to set
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
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the submissionStartDate
     */
    public Date getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * @param submissionStartDate the submissionStartDate to set
     */
    public void setSubmissionStartDate(Date submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * @return the submissionEndDate
     */
    public Date getSubmissionEndDate() {
        return submissionEndDate;
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
    public FAEList getFaeList() {
        return FAEsList;
    }

    /**
     * @return the organizersList
     */
    public OrganizersList getOrganizersList() {
        return organizersList;
    }

    /**
     * @param organizersList the organizersList to set
     */
    public void setOrganizersList(OrganizersList organizersList) {
        this.organizersList = organizersList;
    }
}
