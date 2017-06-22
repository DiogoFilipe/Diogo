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
public interface EventState {

    public enum State {
        Initial, Created, FAESet, OpenForApplications, ClosedForApplications, AssignedApplications, ApplicationsBeingDecided, EventReady
    }

}
