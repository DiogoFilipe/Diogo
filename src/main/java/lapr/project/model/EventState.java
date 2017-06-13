/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Diogo
 */
public interface EventState {
    
    public enum State{
        Created , FAESet , OpenForApplications , ClosedForApplications , AssignedApplications , ApplicationsBeingDecided , EventReady 
    }
    
}
