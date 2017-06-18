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
    private static UserRegist ur = new UserRegist();
    
   
    public UserRegist(){
        this.userList = new ArrayList<>();
    }

    /**
     * Adds an user to the userList
     * @param user - user to be added to the list
     * @return returns the user list
      */
    public boolean addUser(User user) {
      return userList.add(user);
    }
    
    public static boolean registUser(User user){
        boolean check=false;
     if(ur.addUser(user)){
     check = true;}
     return check;
    }

    /**
     * Returns the user list
     * @return the user list
     */
    public List<User> getUserList() {
        return userList;
    }
    
    
    
    public static List<User> getUsers(){
    List <User> users = ur.getUserList();
    return users;
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
     *
     * @param index
     * @return
     */
    public User getUserByIndex(int index) {
        return userList.get(index);

    }
    
    public User getUser(String username){
    for(User u : userList){
    if(u.getUsername().equals(username)){
    return u;}
    }
    return null;
    }
    
    
//    /**
//     * Returns the user of the username
//     * @param usernameOrEmail the what he puts on log in
//     * @return the user of the username
//     */
//    public User getUser(String usernameOrEmail){
//        for(User user : this.userList){
//            if(user.hasTheUsername(usernameOrEmail)|| user.verifyEmail(usernameOrEmail)){
//                return user;
//            }
//        }
//        return null;
//    }
        
}
