package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Event implements EventState, Serializable {

    private static final long serialVersionUID = -284198138063507889L;

    /**
     * title of the event
     */
    private String title;

    /**
     * description
     */
    private String description;

    /**
     * place of the event
     */
    private String place;

    /**
     * event's start date
     */
    private Date startDate;

    /**
     * event's end date
     */
    private Date endDate;

    /**
     * application's submission start date
     */
    private Date submissionStartDate;

    /**
     * application's submission end date
     */
    private Date submissionEndDate;

    /**
     * event state
     */
    private State state;

    /**
     * list of faes
     */
    private FAEList faeList;

    /**
     * list of applications
     */
    private ApplicationList applicationList;

    /**
     * list of assignments
     */
    private AssignmentList assignmentList;

    /**
     * list of organizers
     */
    private OrganizerList organizerList;

    /**
     * list of stands
     */
    private StandRegist standList;

    /**
     * list os stands assignments
     */
    private AssignmentListStand assignmentListStand;

    /**
     * description by omission
     */
    private final String DESCRIPTION_BY_OMISSION = "No description";

    /**
     * place by omission
     */
    private final String PLACE_BY_OMISSION = "No localization";

    /**
     * empty constructor
     */
    public Event() {
        this.state = EventState.State.Created;
        this.place = PLACE_BY_OMISSION;
        this.description = DESCRIPTION_BY_OMISSION;
    }
 
    public Event(String title,String description,String place,Date startDate,Date endDate, Date submissionStartDate,Date submissionEndDate){
    this.title=title;
    this.description = description;
    this.place = place;
    this.startDate = startDate;
    this.endDate = endDate;
    this.submissionStartDate = submissionStartDate;
    this.submissionEndDate = submissionEndDate;
    }
     
    public Event(String title, String description, String place, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, FAEList faeList, ApplicationList applicationList, AssignmentList assignmentList, OrganizerList organizerList, StandRegist standList, AssignmentListStand assignmentListStand) {
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
        this.state = EventState.State.FAESet;
        this.standList = standList;
        this.assignmentListStand = assignmentListStand;
    }

    public Event(String title) {
        this.title = title;
        this.description = DESCRIPTION_BY_OMISSION;
        this.place = PLACE_BY_OMISSION;
        this.assignmentList = new AssignmentList();
        this.faeList = new FAEList();
        this.applicationList = new ApplicationList();
        this.organizerList = new OrganizerList();
        this.state = EventState.State.Created;
        this.standList = new StandRegist();
        this.assignmentListStand = new AssignmentListStand();
    }

    /**
     * Returns the Event's title
     *
     * @return Event's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the Event's description
     *
     * @return Event's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the Event's place
     *
     * @return Event's place
     */
    public String getPlace() {
        return place;
    }

    /**
     * Returns the Event's start date
     *
     * @return Event's start date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Returns the Event's end date
     *
     * @return Event's end date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Returns the Event's date for the beginning of the submission of
     * applications
     *
     * @return Event's date for the beginning of the submission of applications
     */
    public Date getSubmissionStartDate() {
        return submissionStartDate;
    }

    /**
     * Returns the Event's date for the end of the submission of applications
     *
     * @return Event's date for the end of the submission of applications
     */
    public Date getSubmissionEndDate() {
        return submissionEndDate;
    }

    /**
     * Returns the Event's state
     *
     * @return Event's state
     */
    public State getState() {
        return state;
    }

    /**
     * Returns the list of FAEs of the Event
     *
     * @return list of FAEs of the Event
     */
    public FAEList getFAEList() {
        return faeList;
    }

    /**
     * Returns the list of Applications of the Event
     *
     * @return list of Applications of the Event
     */
    public ApplicationList getApplicationList() {
        return applicationList;
    }

    /**
     * Returns the list of Assignments of the Event
     *
     * @return list of Assignments of the Event
     */
    public AssignmentList getAssignmentList() {
        return assignmentList;
    }

    /**
     * Returns the list of Organizers of the Event
     *
     * @return list of Organizers of the Event
     */
    public OrganizerList getOrganizerList() {
        return organizerList;
    }

    /**
     * Returns the list of Stands of the Event
     *
     * @return list of Stands of the Event
     */
    public StandRegist getStandList() {
        return standList;
    }

    /**
     * @return the listAssignedStands
     */
    public AssignmentListStand getListAssignedStands() {
        return assignmentListStand;
    }

    /**
     * @param assignmentListStand list of stands assigned
     */
    public void setListAssignedStands(AssignmentListStand assignmentListStand) {
        this.assignmentListStand = assignmentListStand;
    }

    /**
     * Modifies the Event's title
     *
     * @param title Event's title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Modifies the Event's description
     *
     * @param description Event's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Modifies the Event's place of occurrence
     *
     * @param place Event's place of occurrence
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Modifies the Event's start date
     *
     * @param startDate Event's start date
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Modifies the Event's end date
     *
     * @param endDate Event's end date
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Modifies the Event's date for the start of the submission of applications
     *
     * @param submissionStartDate inicial date to submit applications
     */
    public void setSubmissionStartDate(Date submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }

    /**
     * Modifies the Event's date for the end of the submission of applications
     *
     * @param submissionEndDate Event's date for the end of the submission of
     * applications
     */
    public void setSubmissionEndDate(Date submissionEndDate) {
        this.submissionEndDate = submissionEndDate;
    }

    /**
     * Modifies the Event's state
     *
     * @param state Event's state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Modifies the Event's Application list
     *
     * @param applicationList Event's Application list
     */
    public void setApplicationList(ApplicationList applicationList) {
        this.applicationList = applicationList;
    }

    /**
     * Modifies the Event's Assignment list
     *
     * @param assignmentList Event's Assignment list
     */
    public void setAssignmentList(AssignmentList assignmentList) {
        this.assignmentList = assignmentList;
    }

    /**
     * Modifies the Event's Organizer list
     *
     * @param organizerList Event's Organizer list
     */
    public void setOrganizerList(OrganizerList organizerList) {
        this.organizerList = organizerList;
    }

    /**
     * Modifies the Event's Stand list
     *
     * @param standList Event's Stand list
     */
    public void setStandList(StandRegist standList) {
        this.standList = standList;
    }

    /**
     * Textual representation of the Event
     *
     * @return textual representation of the Event
     */
    @Override
    public String toString() {
        return String.format("#EVENT# %nTitle: %s %nDescription: %s %nPlace of occurence: %s %nStart Date: %s %nEnd Date: %s %nApplication Submission Start Date: %s %nApplication Submission End Date: %s", title, description, place, getStartDate().toYearMonthDayString(), getEndDate().toYearMonthDayString(), getSubmissionStartDate().toYearMonthDayString(), getSubmissionEndDate().toYearMonthDayString());
    }

    /**
     * Returns a list of Strings that represent the Applications a
     * representantive has done
     *
     * @param u User that corresponds to the representative
     * @return list of Strings that represent the Applications a representantive
     * has done
     */
    public List<String> getRepresentativeListApplications(Representative u) {
        List<String> representativeApplications = new ArrayList<>();
        for (Application a : applicationList.getApplicationList()) {
            if (a.getCompanyName().equalsIgnoreCase(u.getCompanyName())) {
                representativeApplications.add(a.getCompanyName());
            }
        }
        return representativeApplications;
    }

    /**
     * checks if the user are fae
     *
     * @param user
     * @return true if the user is fae of this event
     */
    public boolean isFAE(User user) {
        for (FAE f : faeList.getFAEList()) {
            if (user.getName().equals(f.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return list of Strings with the organizers username
     */
    public List<String> getOrganizerListString() {
        List<String> organizerListString = new ArrayList<>();
        for (Organizer o : organizerList.getOrganizerList()) {
            organizerListString.add(o.getUsername());
        }
        return organizerListString;
    }
}
