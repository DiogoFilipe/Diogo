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
public class WorkshopList implements Serializable {

    private static final long serialVersionUID = -8135495448757262759L;

    /**
     * list of workshops
     */
    private List<Workshop> workshopList;

    /**
     * empty constructor
     */
    public WorkshopList() {
        this.workshopList = new ArrayList<>();
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
