/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Assignment {
    
    private FAE fae;
    private Decision decision;
    private Organizer organizer;
    
    public Assignment(FAE fae, Decision decision){
       this.fae = fae;
       this.decision = decision;
    }
    
    public Assignment(Organizer organizer,Decision decision){
        this.organizer = organizer;
        this.decision = decision;
    }
    
       

    public Decision getDecision() {
        return decision;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public FAE getFae() {
        return fae;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }

    public void setFae(FAE fae) {
        this.fae = fae;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }
    
    
    
}
