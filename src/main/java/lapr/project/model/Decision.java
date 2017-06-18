package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Decision implements Serializable {
    
    private boolean decision;
    private String justification;
    private int faeKnowledge;
    private int invitationAdequacy;
    private int adequacy;
    private int overallRecommendation;
    
    private static final int FAEKNOWLEDGE_BY_OMISSION = 0;
    private static final int ADEQUACY_BY_OMISSION = 0;
    private static final int INVITATIONADEQUACY_BY_OMISSION = 0;
    private static final int OVERALLRECOMMENDATION_BY_OMISSION = 0;
    private static final String JUSTIFICATION_BY_OMISSION = "no justification";
    /**
     * Creats an object of the decision type
     * @param decision - decison made by the fae
     * @param justification - justification made by the fae
     */
    public Decision(boolean decision, String justification,int faeKnowledge, int adequacy,int invitationAdequacy,int overallRecommendation){
        this.decision = decision;
        this.justification = justification;
        this.faeKnowledge = faeKnowledge;
        this.adequacy = adequacy;
        this.invitationAdequacy=invitationAdequacy;
        this.overallRecommendation = overallRecommendation;
    }

    public Decision(boolean decision,String justification) {
        this.decision = decision;
        this.justification = justification;
    }
    
    public Decision(){
        this.decision = false;
        this.justification = JUSTIFICATION_BY_OMISSION;
        this.faeKnowledge = FAEKNOWLEDGE_BY_OMISSION;
        this.adequacy = ADEQUACY_BY_OMISSION;
        this.invitationAdequacy = INVITATIONADEQUACY_BY_OMISSION;
        this.overallRecommendation = OVERALLRECOMMENDATION_BY_OMISSION;
    }
    
    
    
    /**
     * Returns the justification of the decison
     * @return - returns justification
     */
    public String getJustification() {
        return justification;
    }
    
     /**
     * Returns the decision
     * @return - returns decision
     */
    public boolean getDecision() {
        return decision;
    }

    public int getAdequacy() {
        return adequacy;
    }

    public int getFaeKnowledge() {
        return faeKnowledge;
    }

    public int getInvitationAdequacy() {
        return invitationAdequacy;
    }

    public int getOverallRecommendation() {
        return overallRecommendation;
    }
    
    
     /**
     * @param decision - decision defined
     */
    public void setDecision(boolean decision) {
        this.decision = decision;
    }
  
     /**
     * @param justification - justification defined 
     */
    public void setJustification(String justification) {
        this.justification = justification;
    }

    public void setAdequacy(int adequacy) {
        this.adequacy = adequacy;
    }

    public void setFaeKnowledge(int faeKnowledge) {
        this.faeKnowledge = faeKnowledge;
    }

    public void setInvitationAdequacy(int invitationAdequacy) {
        this.invitationAdequacy = invitationAdequacy;
    }

    public void setOverallRecommendation(int overallRecommendation) {
        this.overallRecommendation = overallRecommendation;
    }

    
    /**
     * Returns a decision in textual form
     * @return decison in textual form
     */
     @Override
    public String toString(){
        return String.format("%nState: %b %nJustification:", decision ? "Accepted" : "Rejected", justification);
    }
}

