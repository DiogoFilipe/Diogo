package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Decision implements Serializable {

    /**
     * decision
     */
    private boolean decision;

    /**
     * justification of the decision
     */
    private String justification;

    /**
     * fae knowledge 0-5
     */
    private int faeKnowledge;

    /**
     * invitation adequacy 0-5
     */
    private int invitationAdequacy;

    /**
     * adequacy 0-5
     */
    private int adequacy;

    /**
     * overall recommendation 0-5
     */
    private int overallRecommendation;

    /**
     * fae knowledge by omission
     */
    private final int FAEKNOWLEDGE_BY_OMISSION = 0;

    /**
     * adequacy by omission
     */
    private final int ADEQUACY_BY_OMISSION = 0;

    /**
     * invitation adequacy by omission
     */
    private final int INVITATIONADEQUACY_BY_OMISSION = 0;

    /**
     * overal recommendation by omission
     */
    private final int OVERALLRECOMMENDATION_BY_OMISSION = 0;

    /**
     * justification by omission
     */
    private final String JUSTIFICATION_BY_OMISSION = "no justification";

    /**
     * Creats an object of the decision type
     *
     * @param decision - decison made by the fae
     * @param justification - justification made by the fae
     * @param faeKnowledge fae knowledge 0-5
     * @param adequacy adequacy 0-5
     * @param invitationAdequacy invitation adequacy 0-5
     * @param overallRecommendation overall recommendation 0-5
     */
    public Decision(boolean decision, String justification, int faeKnowledge, int adequacy, int invitationAdequacy, int overallRecommendation) {
        this.decision = decision;
        this.justification = justification;
        this.faeKnowledge = faeKnowledge;
        this.adequacy = adequacy;
        this.invitationAdequacy = invitationAdequacy;
        this.overallRecommendation = overallRecommendation;
    }

    /**
     * constructor for fae's decision
     * @param faeKnowledge faeKnowledge
     * @param adequacy
     * @param invitationAdequacy
     * @param overallRecommendation 
     */
    public Decision(int faeKnowledge, int adequacy, int invitationAdequacy, int overallRecommendation) {
        this.faeKnowledge = faeKnowledge;
        this.adequacy = adequacy;
        this.invitationAdequacy = invitationAdequacy;
        this.overallRecommendation = overallRecommendation;
    }
    
    public Decision(boolean decision){
        this.decision=decision;
    }

    /**
     *
     * @param decision decision
     * @param justification justification of the decision
     */
    public Decision(boolean decision, String justification) {
        this.decision = decision;
        this.justification = justification;
    }

    /**
     * empty constructor
     */
    public Decision() {
        this.justification = JUSTIFICATION_BY_OMISSION;
        this.faeKnowledge = FAEKNOWLEDGE_BY_OMISSION;
        this.adequacy = ADEQUACY_BY_OMISSION;
        this.invitationAdequacy = INVITATIONADEQUACY_BY_OMISSION;
        this.overallRecommendation = OVERALLRECOMMENDATION_BY_OMISSION;
    }

    /**
     * Returns the justification of the decison
     *
     * @return - returns justification
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Returns the decision
     *
     * @return - returns decision
     */
    public boolean getDecision() {
        return decision;
    }

    /**
     *
     * @return adequacy of the application
     */
    public int getAdequacy() {
        return adequacy;
    }

    /**
     *
     * @return fae knowledge about the application
     */
    public int getFaeKnowledge() {
        return faeKnowledge;
    }

    /**
     *
     * @return invitation adequacy of the event
     */
    public int getInvitationAdequacy() {
        return invitationAdequacy;
    }

    /**
     *
     * @return overall recommendation
     */
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

    /**
     * Returns a decision in textual form
     *
     * @return decison in textual form
     */
    @Override
    public String toString() {
        return String.format("%nState: %b %nJustification:", decision ? "Accepted" : "Rejected", justification);
    }

    /**
     * @param faeKnowledge the faeKnowledge to set
     */
    public void setFaeKnowledge(int faeKnowledge) {
        this.faeKnowledge = faeKnowledge;
    }

    /**
     * @param invitationAdequacy the invitationAdequacy to set
     */
    public void setInvitationAdequacy(int invitationAdequacy) {
        this.invitationAdequacy = invitationAdequacy;
    }

    /**
     * @param adequacy the adequacy to set
     */
    public void setAdequacy(int adequacy) {
        this.adequacy = adequacy;
    }

    /**
     * @param overallRecommendation the overallRecommendation to set
     */
    public void setOverallRecommendation(int overallRecommendation) {
        this.overallRecommendation = overallRecommendation;
    }
}
