/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.assignment;

import java.io.Serializable;
import java.util.List;
import lapr.project.model.Assignment;
import lapr.project.model.Event;

/**
 *
 * @author João Domingues
 */
public interface Algorithm extends Serializable{
    /**
     * Abstract method that allows you to execute the attribution algorithms for a certain event
     * @param event
     * @return Assignment List generated
     */
    public abstract List<Assignment> DoDistribution(Event event);
}
