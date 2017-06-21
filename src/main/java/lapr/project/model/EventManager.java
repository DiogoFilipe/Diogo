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
public class EventManager extends User implements Serializable{
    
    /**
     * 
     * @param name name of the event manager
     * @param username name in the platform
     * @param email his email
     * @param password password
     */
    public EventManager(String name,String username,String email,String password){
        super(name,username,email,password);
    }

    /**
     * 
     * @return his email 
     */
    @Override
    public String getEmail() {
        return super.getEmail();
    }

   /**
    * 
    * @return his name 
    */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * 
     * @return his password 
     */
    @Override
    public String getPassword() {
        return super.getPassword();
    }

    /**
     * 
     * @param user user
     * @param username name on the platform
     * @return if the user has is
     */
    @Override
    public boolean hasTheUsername(User user, String username) {
        return super.hasTheUsername(user, username);
    }

    /**
     * 
     * @return his name on paltform 
     */
    @Override
    public String getUsername() {
        return super.getUsername();
    }

    /**
     * 
     * @param name set a new name 
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * 
     * @param email set a new email
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     * 
     * @param password set a new password
     */
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    /**
     * 
     * @param username set new username 
     */
    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

   /**
    * empty constructor
    */
    public EventManager() {
    }

    /**
     * 
     * @return all the data of the event manager 
     */
    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
