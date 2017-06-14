
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class LogInController {
    UserRegist ur;
    FairCenter fc;
    User user;
    List <User> userList;
    List <Encryption> encryptionsList;
    
    /**
     * Constructor
     */
    public LogInController(){
        this.fc = new FairCenter();
    
    }
    
    /**
     * Returns the userlist
     * @return the userList
     */
   public List <User> getUsers(){
   
       return ur.getUserList();
   }
   
   /**
    * Adds an user to the userList
    * @param user - user to be added
    * @return 
    */
   public boolean addUser(User user) {
      return userList.add(user);
    }
   
   /**
    * Removes the user
    * @param user - user to be removed
    * @return 
    */
   public boolean removeUser(User user) {
      return userList.remove(user);
    }
   
   /**
    * Gets the user using his username
    * @param username - username of the wanted user
    * @return the user
    */
    public User getUser(String username){
        for(User user : this.userList){
            if(user.hasTheUsername(username)){
                return user;
            }
        }
        return null;
    }
    
    /**
     * Decripts a password to his original form
     * @param encriptedPassword - password to be decripted
     * @param shift - shift of the original encryption
     * @return the decripted form
     */
    public String cipherPasswordDecript(String encriptedPassword, int shift){
         String decripted = "";
    int pass = encriptedPassword.length();
    for(int i = 0; i < pass; i++){
        char c = (char)(encriptedPassword.charAt(i) - shift);
        if (c > 'z')
            decripted += (char)(encriptedPassword.charAt(i) + (26-shift));
        else
            decripted += (char)(encriptedPassword.charAt(i) - shift);
    }
    return decripted;
         
     }
    
    /**
     * Returns the shift of a given encryption
     * @param user -  user´s encryption
     * @return the shift
     */
     public int getShift(User user){
        for(Encryption e : encryptionsList){
            if(e.getUser().getUsername().equals(user.getUsername())){
                return e.getShift();
            }
        }
        return -1;
    }
    
    
    
    
}
