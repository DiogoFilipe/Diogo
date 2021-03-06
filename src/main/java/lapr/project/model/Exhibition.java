/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.List;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_116844_1161241_1162109
 */
public class Exhibition extends Event implements Serializable, EventState {

    private static final long serialVersionUID = 481273598221735134L;

    /**
     * state of the exhibition
     */
    private State exhibitionState;

    public Exhibition(String title, String description, String place, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, FAEList faeList, ApplicationList applicationList, AssignmentList assignmentList, OrganizerList organizerList, StandRegist standList, AssignmentListStand assignmentListStand, WorkshopList workshopList) {
        super(title, description, place, startDate, endDate, submissionStartDate, submissionEndDate, faeList, applicationList, assignmentList, organizerList, standList, assignmentListStand);
        this.exhibitionState = EventState.State.FAESet;
    }

    
     public Exhibition(String title,String description,String place,Date startDate,Date endDate, Date submissionStartDate,Date submissionEndDate){
     super(title,description,place,startDate,endDate,submissionStartDate,submissionEndDate);
     
     }
    /**
     *
     * @param title title of the exhibition
     */
    public Exhibition(String title) {
        super(title);
        this.exhibitionState = EventState.State.Created;
    }

    /**
     * empty constructor
     */
    public Exhibition() {
        super();
        this.exhibitionState = EventState.State.Created;
    }

    /**
     *
     * @return the applications list
     */
    @Override
    public ApplicationList getApplicationList() {
        return super.getApplicationList();
    }

    /**
     *
     * @return the assignment list
     */
    @Override
    public AssignmentList getAssignmentList() {
        return super.getAssignmentList();
    }

    /**
     *
     * @return the description
     */
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    /**
     *
     * @return the end date of the exhibition
     */
    @Override
    public Date getEndDate() {
        return super.getEndDate();
    }

    /**
     *
     * @return the fae list
     */
    @Override
    public FAEList getFAEList() {
        return super.getFAEList();
    }

    /**
     *
     * @return the local of the exhibition
     */
    @Override
    public String getPlace() {
        return super.getPlace();
    }

    /**
     *
     * @return the organizers list
     */
    @Override
    public OrganizerList getOrganizerList() {
        return super.getOrganizerList();
    }

    /**
     *
     * @return the submissions end date
     */
    @Override
    public Date getSubmissionEndDate() {
        return super.getSubmissionEndDate();
    }

    /**
     *
     * @return the exhibition start date
     */
    @Override
    public Date getSubmissionStartDate() {
        return super.getSubmissionStartDate();
    }

    /**
     *
     * @return the exhibition start date
     */
    @Override
    public Date getStartDate() {
        return super.getStartDate();
    }

    /**
     *
     * @return the exhibition title
     */
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    /**
     *
     * @param applicationList to set
     */
    @Override
    public void setApplicationList(ApplicationList applicationList) {
        super.setApplicationList(applicationList);
    }

    /**
     *
     * @param description the description of the exhibition
     */
    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    /**
     *
     * @param assignmentList list of assignments
     */
    @Override
    public void setAssignmentList(AssignmentList assignmentList) {
        super.setAssignmentList(assignmentList);
    }

    /**
     *
     * @param endDate the end date
     */
    @Override
    public void setEndDate(Date endDate) {
        super.setEndDate(endDate);
    }

    /**
     *
     * @param local the local of the exhibition
     */
    @Override
    public void setPlace(String local) {
        super.setPlace(local);
    }

    /**
     *
     * @param organizerList the list of organizers
     */
    @Override
    public void setOrganizerList(OrganizerList organizerList) {
        super.setOrganizerList(organizerList);
    }

    /**
     *
     * @param startDate the exhibition start date
     */
    @Override
    public void setStartDate(Date startDate) {
        super.setStartDate(startDate);
    }

    /**
     *
     * @param submissionEndDate the submission end date
     */
    @Override
    public void setSubmissionEndDate(Date submissionEndDate) {
        super.setSubmissionEndDate(submissionEndDate);
    }

    /**
     *
     * @param submissionStartDate
     */
    @Override
    public void setSubmissionStartDate(Date submissionStartDate) {
        super.setSubmissionStartDate(submissionStartDate);
    }

    /**
     *
     * @param title exhibition title
     */
    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    /**
     * @return the exhibitionState
     */
    public State getExhibitionState() {
        return exhibitionState;
    }

    /**
     * @param exhibitionState the exhibitionState to set
     */
    public void setExhibitionState(State exhibitionState) {
        this.exhibitionState = exhibitionState;
    }
}
