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

    private static final long serialVersionUID = -885585687637408380L;

    /**
     * list of organizers
     */
    private List<Organizer> organizerList;

    /**
     * empty constructor
     */
    public OrganizerList() {
        organizerList = new ArrayList<>();
    }

    /**
     *
     * @param organizerList list of organizers
     */
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
     *
     * @param organizer the organizer that will be added to the list
     * @return true if the organizers was add to the list
     */
    public boolean addOrganizer(Organizer organizer) {
        if (organizerList.contains(organizer)) {
            return false;
        }
        return organizerList.add(organizer);
    }

    /**
     * Returns the organizer of the username
     *
     * @param usernameOrEmail
     * @return the organizer with the username
     */
    public Organizer getOrganizer(String usernameOrEmail) {
        for (Organizer organizer : organizerList) {
            if (organizer.getUsername().equals(usernameOrEmail) || organizer.getEmail().equals(usernameOrEmail)) {
                return organizer;
            }
        }
        return null;
    }

    /**
     *
     * @param u user
     * @return true if the user is an organizer
     */
    public boolean isOrganizer(User u) {
        for (Organizer o : organizerList) {
            if (o.getUsername().equals(u.getUsername())) {
                return true;
            }
        }
        return false;
    }
}
