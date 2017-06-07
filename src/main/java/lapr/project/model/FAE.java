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
public class FAE extends User implements Serializable {

    /**
     * experiência profissional em organização de eventos
     */
    private int professionalExperience;

    /**
     * constructor
     *
     * @param name is the name of the FAE
     * @param username is the FAE's name in the platform
     * @param email is the e-mail of the FAE
     * @param password is the FAE's password
     * @param professionalExperience
     */
    public FAE(String name, String username, String email, String password, int professionalExperience) {
        super(name, username, email, password);
        this.professionalExperience = professionalExperience;
    }

    public FAE() {
        super();
    }

    /**
     *
     * @return the FAE's e-mail
     */
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    /**
     *
     * @return the FAE's name
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     *
     * @return the FAE's name in the platform
     */
    @Override
    public String getUsername() {
        return super.getUsername();
    }

    /**
     *
     * @return all info of the FAE, except the password
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
