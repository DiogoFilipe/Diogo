
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
    List<User> userList;
    List<Encryption> encryptionsList;
    Encryption encryption;

    /**
     * Constructor
     */
    public LogInController(FairCenter fc){
        this.fc = fc;
    
    }

    /**
     * Returns the userlist
     *
     * @return the userList
     */
   public List <User> getUsers(){
   
       return fc.getUserRegist().getUserList();
   }
   
    
   
   /**
    * Gets the user using his username
    * @param username - username of the wanted user
    * @return the user
    */
    public User getUser(String username){
        for(User u : fc.getUserRegist().getUserList()){
            if(u.getName().equals(username))
                return u;
        }
        return null;
    }

    /**
     * Returns the shift of a given encryption
     *
     * @param user - user´s encryption
     * @return the shift
     */
    public int getShift(User user) {
        for (Encryption e : el.getEncryptionsList()) {
            if (e.getUser().getUsername().equals(user.getUsername())) {
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
   
       
    
    public String verifyEncryptionUserGetKeyword(User user){
    String kw = Encryption.verifyEncryptionUserGetKeyword(user,fc);
    return kw;
    }
    
    public int verifyEncryptionUserGetShift(User user){
    int shift = Encryption.verifyEncryptionUserGetShift(user,fc);
    return shift;
    }

        

}
