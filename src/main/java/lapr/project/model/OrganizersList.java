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
public class OrganizersList implements Serializable {

    private List<Organizer> organizersList;

    public OrganizersList() {
        organizersList = new ArrayList<>();
    }

    /**
     * @return the organizersList
     */
    public List<Organizer> getOrganizersList() {
        return organizersList;
    }

    /**
     * @param organizersList the organizersList to set
     */
    public void setOrganizersList(List<Organizer> organizersList) {
        this.organizersList = organizersList;
    }

    public boolean addOrganizer(Organizer organizer){
        if(organizersList.contains(organizer)){
            return false;
        }
        return organizersList.add(organizer);
    }
    
    public boolean isEmpty() {
        return organizersList.isEmpty();
    }
    
    public boolean containsOrganizer(Organizer organizer)
    {
        return organizersList.contains(organizer);
    }
}
