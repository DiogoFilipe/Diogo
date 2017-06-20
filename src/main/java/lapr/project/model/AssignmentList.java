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

    private List<Assignment> assignmentList;

    public AssignmentList() {
        assignmentList = new ArrayList<>();
    }

    /**
     * Returns the List of assignments
     *
     * @return Assignment´s list
     */
    public List<Assignment> getAssignmentList() {
        return new ArrayList<>(this.assignmentList);
    }

    /**
     * Returns the number of assignments
     *
     * @return number of assignments
     */
    public int getSize() {
        return assignmentList.size();
    }

    /**
     * Removes an assignment from the list
     *
     * @param assignment - assignment to be removed
     */
    public void remove(Assignment assignment) {
        assignmentList.remove(assignment);
    }

    /**
     * Adds an assignment to the assignment List
     *
     * @param assignment - assignment to be added
     * @return
     */
    public boolean registAssignment(Assignment assignment) {
        if (!assignmentList.contains(assignment)) {
            assignmentList.add(assignment);
            return true;
        }
        return false;
    }

    /**
     * Verefies if there are any assignments
     *
     * @return
     */
    public boolean isEmpty() {
        return assignmentList.isEmpty();
    }

}
