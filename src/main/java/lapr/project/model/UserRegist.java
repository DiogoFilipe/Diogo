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
 * @author 1160590_1160795_1160844_1161241_1162109
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
        return userList;
    }
    
    /**
     * Verifies if the user is in the list
     * @param user - user to be verified 
     * @return 
     */
    public boolean isUser(User user){
        return userList.contains(user);
    }
    
    
    /**
     * Returns the user of the username
     * @param usernameOrEmail the what he puts on log in
     * @return the user of the username
     */
    public User getUser(String usernameOrEmail){
        for(User user : this.userList){
            if(user.hasTheUsername(usernameOrEmail)|| user.verifyEmail(usernameOrEmail)){
                return user;
            }
        }
        return null;
    }
        
}
