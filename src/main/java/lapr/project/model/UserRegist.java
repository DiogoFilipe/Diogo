/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Domingues
 */
public class UserRegist {
    
    private List<User> userList;
    
   
    public UserRegist(){
        userList = new ArrayList<>();
    }

    /**
     * Adds an user to the userList
     * @param user - user to be added to the list
     * @return returns the user list
      */
    public boolean addUser(User user) {
      return userList.add(user);
    }

    /**
     * Returns the user list
     * @return the user list
     */
    public List<User> getUserList() {
        return new ArrayList<>(this.userList);
    }
    
    /**
     * Verifies if the user is in the list
     * @param user - user to be verified 
     * @return 
     */
    public boolean validatesUser(User user){
        return !userList.contains(user);
    }
    
    /**
     * Returns the user of the username
     * @param username - username of the pretended user
     * @return the user of the username
     */
    public User getUser(String username){
        for(User user : this.userList){
            if(user.hasTheUsername(username)){
                return user;
            }
        }
        return null;
    }
        
}
