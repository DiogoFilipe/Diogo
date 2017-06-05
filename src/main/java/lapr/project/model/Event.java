package lapr.project.model;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Event {
    
      
    private String title;
    private String description;
    private String local;
  //  private Date beginDate;
  //  private Date endDate;
  //  private Date submissionBeginDate;
  //  private Date submissionEndDate;
    private int acceptanceRate;
    
   // private FAEList faeList;
    private ApplicationsList applicationsList;
   // private AssignmentList assignmentList;


public Event(String title, String description, String local, Date beginDate, Date endDate, Date submissionBeginDate, Date submissionEndDate, int acceptanceRate,FAEList faeList, ApplicationsList applicationsList, AssignmentList assignmentList) {
        this.title =  title;
        this.description = description;
        this.local = local;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.submissionBeginDate = submissionBeginDate;
        this.submissionEndDate = submissionEndDate;
        
     //   this.listaAtribuicao = new ListaAtribuicao();
     //   this.listaFAE = new ListaFAE();
        this.applicationsList = new ApplicationsList();

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
     * Returns the Event´s FAE list
     * @return Event´s faeList
     */
   // public FAEList getFAEList(){
   //     return faeList;
   // }
    
     /**DEVOLVE LISTA DE CANDIDATURAS
     * 
     * @return 
     */
    //public ApplicationsList getApplicationsList(){
    //    return applicationsList;
    //}
    
     /**DEVOLVE LISTA DE CANDIDATURAS
     * 
     * @return 
     */
//    public AssignmentList getAssignmentList(){
//        return assignmentList;
//    }
    
//    
//     public void setAssignmentList(AssignmentList assignmentList){
//        this.assignmentList = assignmentList;
//    }
//    
//    public void setFAEList(FAEList faeList){
//        this.faeList = faeList;
//    }
//    
//    public void setApplicationsList(ApplicationsList applicationsList){
//        this.listaCandidaturas = applicationsList;
//    }
//

  @Override
    public String toString() {
        
        String text = String.format("#EVENT# %nTitle: %s %nDescription: %s %nLocal de realização: %s %nBegins: %d %nEnds: %s %nApplication Submission opens: %d %nApplication Submission closes: %d",
                title, description, local, beginDate, endDate, submissionBeginDate, submissionEndDate,acceptanceRate );
                
        return text;
    }
}