/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class AssignmentList {

    /**
     * list of assignments
     */
    private List<Assignment> assignmentList;

    /**
     * empty constructor
     */
    public AssignmentList() {
        assignmentList = new ArrayList<>();
    }

    /**
     * Returns the List of assignments
     *
     * @return Assignment´s list
     */
    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }
}
