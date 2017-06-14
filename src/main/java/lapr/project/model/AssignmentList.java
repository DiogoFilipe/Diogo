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
 * @author HP
 */
public class AssignmentList {
    
    private List<Assignment> assignmentsList;

    public AssignmentList() {
        assignmentsList = new ArrayList<>();
    }
    
    /**
     * Returns the List of assignments
     * @return Assignment´s list
     */
     public List<Assignment> getAssignmentsList(){
        return new ArrayList<>(this.assignmentsList);
    }
     
     /**
      * Returns the number of assignments
      * @return number of assignments
      */
     public int getSize(){
        return assignmentsList.size();
    }
     
     /**
      * Removes an assignment from the list
      * @param assignment - assignment to be removed
      */
     public void remove(Assignment assignment) {
        assignmentsList.remove(assignment);
    }
     
     /**
      * Adds an assignment to the assignment List
      * @param assignment - assignment to be added
      * @return 
      */
     public boolean registsAssignment(Assignment assignment) {
        if(!assignmentsList.contains(assignment)){
            assignmentsList.add(assignment);
            return true;
        }
        return false;
    }
     
     /**
      * Verefies if there are any assignments
      * @return 
      */
      public boolean isEmpty(){
        return assignmentsList.isEmpty();
    }
    
     
     
}
