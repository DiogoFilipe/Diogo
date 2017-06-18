/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import algorithms.assignment.Algorithm;
import java.util.List;
import lapr.project.model.Assignment;
import lapr.project.model.AssignmentList;
import lapr.project.model.Event;
import lapr.project.model.FairCenter;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class AssignApplicationController {
    
    private final FairCenter fc;
    private Event event;
    private Algorithm algorithm;
    private AssignmentList assignmentList;
    private List<Assignment> aL;
    
    
    /**
     * Constructor that receives as parameter an object Fair Center
     * @param fc - object Fair Center
     */
    public AssignApplicationController(FairCenter fc) {
        this.fc = fc;
        this.assignmentList = new AssignmentList();
    }
}
