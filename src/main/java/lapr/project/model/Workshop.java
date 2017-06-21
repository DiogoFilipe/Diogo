/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author Diogo
 */
public class Workshop implements Serializable{
    
    /**
     * title of the workshop
     */
    private String title;
    
    /**
     * description of the workshop
     */
    private String description;
    
    /**
     * 
     * @param title title of the workshop
     * @param description description of the workshop
     */
    public Workshop(String title,String description){
      this.title=title;
      this.description=description;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    } 
}
