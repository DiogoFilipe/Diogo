package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Decision implements Serializable {
    
    private boolean decision;
    private String justification;
    
    /**
     * Creats an object of the decision type
     * @param decision - decison made by the fae
     * @param justification - justification made by the fae
     */
    public Decision(boolean decision, String justification){
        this.decision = decision;
        this.justification = justification;
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
     * @return decison in textual form
     */
     @Override
    public String toString(){
        return String.format("%nState: %b %nJustification:", decision ? "Accepted" : "Rejected", justification);
    }
}

