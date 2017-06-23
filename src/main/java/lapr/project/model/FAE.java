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

    private static final long serialVersionUID = 5218751268829969735L;

    /**
     * experiência profissional em organização de eventos
     */
    private int professionalExperience;

    /**
     * user
     */
    private User user;

    /**
     * decision of the fae
     */
    private DecisionList decisionList;

    /**
     * constructor
     *
     * @param name is the name of the FAE
     * @param username is the FAE's name in the platform
     * @param email is the e-mail of the FAE
     * @param password is the FAE's password
     * @param professionalExperience his professional experience
     * @param decisionList list of decisions
     */
    public FAE(String name, String username, String email, String password, int professionalExperience, DecisionList decisionList) {
        super(name, username, email, password);
        this.professionalExperience = professionalExperience;
        this.decisionList = decisionList;
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
        this.decisionList = new DecisionList();
    }

    /**
     *
     * @param u an user
     */
    public FAE(User u) {
        this.user = u;
        this.decisionList = new DecisionList();
    }

    /**
     * empty constructor
     */
    public FAE() {
        super();
        this.decisionList = new DecisionList();
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

    /**
     * @return the professionalExperience
     */
    public int getProfessionalExperience() {
        return professionalExperience;
    }

    /**
     * @param professionalExperience the professionalExperience to set
     */
    public void setProfessionalExperience(int professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the decisionList
     */
    public DecisionList getDecisionList() {
        return decisionList;
    }

    /**
     * @param decisionList the decisionList to set
     */
    public void setDecisionList(DecisionList decisionList) {
        this.decisionList = decisionList;
    }
}
