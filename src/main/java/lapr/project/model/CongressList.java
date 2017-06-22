/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class CongressList implements Serializable {
    
    /**
     * list of congresses
     */
    private List<Congress> congressList;
    
    /**
     * 
     * @param congressList list of congresses 
     */
    public CongressList(List<Congress> congressList){
        this.congressList=congressList;
    }
    
    /**
     * empty constructor
     */
    public CongressList(){
        this.congressList= new ArrayList<>();
    }

    /**
     * @return the congressList
     */
    public List<Congress> getCongressList() {
        return congressList;
    }

    /**
     * @param congressList the congressList to set
     */
    public void setCongressList(List<Congress> congressList) {
        this.congressList = congressList;
    }
    
    
}
