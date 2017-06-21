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
    private User user;
    private Decision decision;

    /**
     * constructor
     *
     * @param name is the name of the FAE
     * @param username is the FAE's name in the platform
     * @param email is the e-mail of the FAE
     * @param password is the FAE's password
     * @param professionalExperience his professional experience
     * @param decision made by the fae
     */
    public FAE(String name, String username, String email, String password, int professionalExperience, Decision decision) {
        super(name, username, email, password);
        this.professionalExperience = professionalExperience;
        this.decision = decision;
    }

    /**
     * 
     * @param name name of fae
     * @param username name in platform of fae
     * @param email email of the fae
     * @param password his password
     */
    public FAE(String name, String username, String email, String password) {
        super(name, username, email, password);
    }

    /**
     *
     * @param u an user
     */
    public FAE(User u) {
        this.user = u;
    }

    /**
     * empty constructor
     */
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

    /**
     *
     * @return
     */
    public boolean valid() {
        // Introduzir as validações aqui
        return true;
    }
}
