package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class UserRegistMainWindowController {
    UserRegist ur;
    EncryptionList el;
    FairCenter fc;
    User user;
    Encryption encryption;
    List <User> userList;
    List <Encryption> encryptionsList;
    private String name;
    private String username;
    private String atribute;
    private String email;
    private int shift;
    private String keyword;
    
    /**
     * Constructor
     */
    public UserRegistMainWindowController(){
        this.fc = new FairCenter();
        
     
    }

    /**
     * Verifys the password 
     * @param password - password to be verified
     * @return 
     */
    public boolean verifyPassword(String password) {
   return user.verifyPassword(password);
    }
    
    
    /**
     * Return the new user
     * @param name - user's name
     * @param username - user's username
     * @param password - user's password
     * @param email - user's email
     * @return returns user
     */
    public User createUser(String name, String username, String password, String email) {
        User user = new User(name,username,email,password);
        return user;
    }
    public Encryption createEncryption(int shift,User user,String keyword){
        Encryption encryption = new Encryption(user,keyword,shift);
        return encryption;
    
    } 
    
   public String cipherPassword(String password,int shift){
       String cipheredPassword = encryption.cipherPassword(password,shift);
       return cipheredPassword;
   }
    
   public String chiperAttributes(String attribute,int shift,String keyword){
       String cipheredAttribute = encryption.cipherAttribute(keyword,attribute,shift);
       return cipheredAttribute;
   }
   
    /**
     * returns the userList with the added user
     * @param user- user to be added
     * @return userList with the new user
     */
    public boolean addUser(User user) {
      return ur.addUser(user);
    }
    
         
     /**
      * gerates a random number
      * @return random number
      */    
     public int gerateShift(){
         int number = encryption.gerateShift();
     
     return number;
     }
    
     /**
      * verifies the size of the keyword and if it only has letters
      * @return 
      */
     public boolean verifyKeyword(String keyword){
     return encryption.verifyKeyword(keyword);
     }
     
     
    /**
     * Adds an encryption to the encryptionsList
     * @param encryption - encryption to be added
     * @return 
     */   
    public boolean addEncryption(Encryption encryption) {
      return el.addEncryption(encryption);
    }
     
    /**
     * Verifys if the name only has letters
     * @param name - name to be verified
     * @return 
     */
    public boolean verifyName(String name){
    return user.verifyName(name);
    }
    
    /**
     * Verifys if the username already exists
     * @param username - username to be verified
     * @return 
     */
    public boolean verifyUsername(String username){
    return user.verifyUsername(username);
    }
    
    /**
     * Verifys the email format
     * @param email - email to be verified
     * @return
     */
    public boolean verifyEmail(String email){
    return user.verifyEmail(email);}
}
