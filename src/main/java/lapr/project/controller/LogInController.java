
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class LogInController {
    UserRegist ur;
    EncryptionList el;
    FairCenter fc;
    User user;
    List <User> userList;
    List <Encryption> encryptionsList;
    Encryption encryption;
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
   
       return fc.getUserRegist().getUserList();
   }
   
   /**
    * Adds an user to the userList
    * @param user - user to be added
    * @return 
    */
   public boolean addUser(User user) {
      return userList.add(user);
    }
   
   
    public List<Encryption> getEncryptionsList(){
    return el.getEncryptionsList();}
    
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
        for(User u : fc.getUserRegist().getUserList()){
            if(fc.getUserRegist().getUser(username).hasTheUsername(u,username)){
                return u;
            }
        }
        return null;
    }
    
    
    
    /**
     * Returns the shift of a given encryption
     * @param user -  user´s encryption
     * @return the shift
     */
     public int getShift(User user){
        for(Encryption e : el.getEncryptionsList()){
            if(e.getUser().getUsername().equals(user.getUsername())){
                return e.getShift();
            }
        }
        return -1;
    }
    
     
   public String cipherPassword(String password,int shift){
       String cipheredPassword = Encryption.cipherPassword(password,shift);
       return cipheredPassword;
   }
    
   public String cipherAttributes(String attribute,int shift,String keyword){
       String cipheredAttribute = Encryption.cipherAttribute(keyword,attribute,shift);
       return cipheredAttribute;
   }
   
    public static String decipherPassword(String password,int shift){
       String decipheredPassword = Encryption.decipherPassword(password,shift);
       return decipheredPassword;
   }
    
    
    public String verifyEncryptionUserGetKeyword(User user){
    String kw =Encryption.verifyEncryptionUserGetKeyword(user);
    return kw;
    }
    
    public int verifyEncryptionUserGetShift(User user){
    int shift =Encryption.verifyEncryptionUserGetShift(user);
    return shift;
    }
    
    
}
