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
 * @author Diogo
 */
public class WorkshopList {
    
    /**
     * list of workshops
     */   
    private List<Workshop> workshopList;
    
    /**
     * empty constructor
     */
    public WorkshopList(){
        this.workshopList=new ArrayList<>();
    }
    
    /**
     * @return the workshopList
     */
    public List<Workshop> getWorkshopList() {
        return workshopList;
    }

    /**
     * @param workshopList the workshopList to set
     */
    public void setWorkshopList(List<Workshop> workshopList) {
        this.workshopList = workshopList;
    }
    
}
