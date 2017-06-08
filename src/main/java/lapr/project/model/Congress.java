/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import lapr.project.utils.Date;

/**
 *
 * @author Diogo
 */
public class Congress extends Event implements Serializable{
    
    public Congress(String title, String description, String local, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, int acceptanceRate, FAEList faeList, ApplicationsList applicationsList, AssignmentsList assignmentsList, OrganizersList organizersList) {
        super(title, description, local, startDate, endDate, submissionStartDate, submissionEndDate, acceptanceRate, faeList, applicationsList, assignmentsList, organizersList);
    }

   /**
    * 
    * @return the acceptance rate
    */
    @Override
    public int getAcceptanceRate() {
        return super.getAcceptanceRate();
    }

    /**
     * 
     * @return the applications list 
     */
    @Override
    public ApplicationsList getApplicationsList() {
        return super.getApplicationsList(); 
    }

    /**
     * 
     * @return the assignment list 
     */
    @Override
    public AssignmentsList getAssignmentsList() {
        return super.getAssignmentsList();
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
     * @return the end date of the congress 
     */
    @Override
    public Date getEndDate() {
        return super.getEndDate(); 
    }
    
    
/**
 * 
 * @return the congress id
 */
    @Override
    public int getEventID() {
        return super.getEventID();
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
     * @return the local of the congress 
     */
    @Override
    public String getLocal() {
        return super.getLocal(); 
    }

    /**
     * 
     * @return the organizers list
     */
    @Override
    public OrganizersList getOrganizersList() {
        return super.getOrganizersList(); 
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
     * @return the submissions start date
     */
    @Override
    public Date getSubmissionStartDate() {
        return super.getSubmissionStartDate(); 
    }

    /**
     * 
     * @return  the congress start date
     */
    @Override
    public Date getStartDate() {
        return super.getStartDate(); 
    }

    /**
     * 
     * @return the congress title 
     */
    @Override
    public String getTitle() {
        return super.getTitle(); 
    }

    /**
     * 
     * @param acceptanceRate the congress acceptance rate
     */
    @Override
    public void setAcceptanceRate(int acceptanceRate) {
        super.setAcceptanceRate(acceptanceRate);
    }

    /**
     * 
     * @param applicationsList the applications list 
     */
    @Override
    public void setApplicationsList(ApplicationsList applicationsList) {
        super.setApplicationsList(applicationsList);
    }

    /**
     * 
     * @param description the description of the congress
     */
    @Override
    public void setDescription(String description) {
        super.setDescription(description); 
    }

    /**
     * 
     * @param assignmentsList  the assignment list
     */
    @Override
    public void setAssignmentsList(AssignmentsList assignmentsList) {
        super.setAssignmentsList(assignmentsList); 
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
     * @param eventID event name 
     */
    @Override
    public void setEventID(int eventID) {
        super.setEventID(eventID);
    }

    /**
     * 
     * @param faeList the fae list
     */
    @Override
    public void setFAEList(FAEList faeList) {
        super.setFAEList(faeList); 
    }

/**
 * 
 * @param local the local of the congress
 */
    @Override
    public void setLocal(String local) {
        super.setLocal(local);
    }
/**
 * 
 * @param organizersList the organizers list
 */
    @Override
    public void setOrganizersList(OrganizersList organizersList) {
        super.setOrganizersList(organizersList); 
    }

    /**
     * 
     * @param startDate the congress start date 
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
    * @param title congress title 
    */
    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }
    
    
}
