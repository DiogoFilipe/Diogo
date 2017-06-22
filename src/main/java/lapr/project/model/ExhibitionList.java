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
public class ExhibitionList implements Serializable {
    
    /**
     * list of exhibitions
     */
    private List<Exhibition> exhibitionList;
    
    /**
     * 
     * @param exhibitionList list of exhibitions 
     */
    public ExhibitionList(List<Exhibition> exhibitionList){
        this.exhibitionList=exhibitionList;
    }
    
    public ExhibitionList(){
        this.exhibitionList= new ArrayList<>();
    }

    /**
     * @return the exhibitionList
     */
    public List<Exhibition> getExhibitionList() {
        return exhibitionList;
    }

    /**
     * @param exhibitionList the exhibitionList to set
     */
    public void setExhibitionList(List<Exhibition> exhibitionList) {
        this.exhibitionList = exhibitionList;
    }    
}
