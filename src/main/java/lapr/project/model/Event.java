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
    private static final int EVENT_ID_DEFAULT=0;
    
      
    private String title;
    private String description;
    private String local;
    private Date startDate;
    private Date endDate;
    private Date submissionStartDate;
    private Date submissionEndDate;
    private int acceptanceRate;
    
    private FAEList FAEsList;
    private ApplicationsList applicationsList;
    private AssignmentsList assignmentsList;
      

public Event(String title, String description, String local, Date startDate, Date endDate, Date submissionStartDate, Date submissionEndDate, int acceptanceRate,FAEList faeList, ApplicationsList applicationsList, AssignmentsList assignmentsList) {
        this.title =  title;
        this.description = description;
        this.local = local;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submissionStartDate = submissionStartDate;
        this.submissionEndDate = submissionEndDate;
        
        this.assignmentsList = new AssignmentsList();
        this.FAEsList = new FAEList();
        this.applicationsList = new ApplicationsList();

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
     * @return User's title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Returns the Event´s description
     * @return Event´s description
     */
    public String getDescription() {
        return description;
    }
    
   /**
    * Returns the Event´s local
     * @return Event´s local
     */
    public String getLocal() {
        return local;
    }
    
    /**
     * Returns the Event´s beginning date
     * @return Event´s beginning date
     */
   // public Date getBeginDate() {
   //     return beginDate;
   // }

    /**
     * Returns the Event´s ending date
     * @return Event´s ending date
     */
   //public Date getEndDate() {
   //    return endDate;
   // }
    
    /**
     * Returns the Event´s date for the beginning of the submission of applications
     * @return Event´s date for the beginning of the submission of applications
     */
    //public Date getSubmissionBeginningDate() {
    //    return submissionBeginningDate;
    //}
    
    /**
     * Returns the Event´s date for the ending of the submission of applications
     * @return Event´s date for the ending of the submission of applications
     */
    //public Date getSubmissionEndingDate() {
    //    return submissionEndingDate;
    //}
    
     /**
     * @return the Faes List
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

    
     /**DEVOLVE LISTA DE CANDIDATURAS
     * 
     * @return 
     */
    public ApplicationsList getApplicationsList(){
        return applicationsList;
    }
    
     /**DEVOLVE LISTA DE CANDIDATURAS
     * 
     * @return 
     */
    public AssignmentsList getAssignmentsList(){
        return assignmentsList;
    }
    
    
     public void setAssignmentsList(AssignmentsList assignmentsList){
        this.assignmentsList = assignmentsList;
    }
    
    public void setFAEList(FAEList FAEsList){
        this.FAEsList = FAEsList;
    }
    
    public void setApplicationsList(ApplicationsList applicationsList){
        this.applicationsList = applicationsList;
    }


  @Override
    public String toString() {
        
        String text = String.format("#EVENT# %nTitle: %s %nDescription: %s %nLocal de realização: %s %nBegins: %d %nEnds: %s %nApplication Submission opens: %d %nApplication Submission closes: %d",
                title, description, local, startDate, endDate, submissionStartDate, submissionEndDate,acceptanceRate );
                
        return text;
    }
    }