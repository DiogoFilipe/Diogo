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
public class Congress extends Event implements Serializable{
    
    public Congress(String title, String description, String place, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, FAEList faeList, ApplicationList applicationList, AssignmentList assignmentList, OrganizerList organizerList) {
        super(title, description, place, startDate, endDate, submissionStartDate, submissionEndDate, faeList, applicationList, assignmentList, organizerList);
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
     * @return the end date of the congress 
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
     * @return the local of the congress 
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
     * @param applicationsList the applications list 
     */
    @Override
    public void setApplicationList(ApplicationList applicationList) {
        super.setApplicationList(applicationList);
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
    public void setPlace(String local) {
        super.setPlace(local);
    }
    /**
     * 
    * @param organizersList the organizers list
    */
    @Override
    public void setOrganizerList(OrganizerList organizerList) {
        super.setOrganizerList(organizerList); 
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
