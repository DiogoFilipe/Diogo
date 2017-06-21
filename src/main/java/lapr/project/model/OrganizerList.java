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
public class OrganizerList implements Serializable {

    private List<Organizer> organizerList;

    public OrganizerList() {
        organizerList = new ArrayList<>();
    }
    
    public OrganizerList(List<Organizer> organizerList) {
        this.organizerList = organizerList;
    }

    /**
     * @return the organizerList
     */
    public List<Organizer> getOrganizerList() {
        return organizerList;
    }

    /**
     * @param organizerList the organizeList to set
     */
    public void setOrganizerList(List<Organizer> organizerList) {
        this.organizerList = organizerList;
    }

    /**
     * adds the organizer to the organizerList
     * @param organizer the organizer that will be added to the list
     * @return true if the organizers was add to the list
     */
    public boolean addOrganizer(Organizer organizer){
        if(organizerList.contains(organizer)){
            return false;
        }
        return organizerList.add(organizer);
    }
    
    /**
     * check if the list is empty
     * @return true if the list is empty
     */
    public boolean isEmpty() {
        return organizerList.isEmpty();
    }
    
    /**
     * check if the list contains the organizer
     * @param organizer the organizer that will be checked
     * @return true if the list contains the organizer
     */
    public boolean containsOrganizer(Organizer organizer)
    {
        return organizerList.contains(organizer);
    }

//    public void addOrganizerList(List<Organizer> organizerList) {
//        organizerList.forEach((Organizer) -> {
//            this.organizerList.add(Organizer);
//        });
//    }
    
}
