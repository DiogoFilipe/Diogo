
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
      * Encripts the atribute of the user
      * @param keyword - keyword chosen by the user
      * @param atribute - atribute to be encripted
      * @param shift - number of deslocations wanted by the user
      * @return returns the encripted atribute
      */
   public String ceaserCipher(String keyword,String atribute, int shift){
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
        String encripted = "";
        char []clone = new char[letters.length];
        char [] key = keyword.toCharArray();
        char [] atrib = atribute.toCharArray();
        char ch;
    
    for(int i = 0; i < keyword.length(); i++){
         letters[i] =  key[i];
       }   
    
     for(int i = 0; i < letters.length; i++){
         clone [i]  = letters[i];
  
       }   
         
                   
         
         for (int j = 0; j < letters.length-(shift+1); j++) {
             
             letters[j]= letters[j+shift];
           
         }
         int i=0;
         for (int k = 0; k < shift+1; k++) {
             letters[letters.length-(shift+1)+i] = clone[k];
             i++;
         }
         
           for (int l = 0; l < atrib.length; l++) {
            
          
                 char c =atrib[l];
            
               if (c == 'a' || c == 'A') {
                ch = letters[0];
                encripted += ch;
               }
               if (c == 'b' || c == 'B') {
                ch = letters[1];
                encripted += ch;
               }
               if (c == 'c' || c == 'C') {
                ch = letters[2];
                encripted += ch;
               }
               if (c == 'd' || c == 'D') {
                ch = letters[3];
                encripted += ch;
               }
               if (c == 'e' || c == 'E') {
                ch = letters[4];
                encripted += ch;
               }
               if (c == 'f' || c == 'F') {
                ch = letters[5];
                encripted += ch;
               }
               if (c == 'g' || c == 'G') {
                ch = letters[6];
                encripted += ch;
               }
                if (c == 'h'|| c == 'H') {
                ch = letters[7];
                encripted += ch;
               }
               if (c == 'i' || c == 'I') {
                ch = letters[8];
                encripted += ch;
               }
               if (c == 'j' || c == 'J') {
                ch = letters[9];
                encripted += ch;
               }
               if (c == 'k' || c == 'K') {
                ch = letters[10];
                encripted += ch;
               }
               if (c == 'l' || c == 'L') {
                ch = letters[11];
                encripted += ch;
               }
               if (c == 'm' || c == 'M') {
                ch = letters[12];
                encripted += ch;
               }
               if (c == 'n' || c == 'N') {
                ch= letters[13];
                encripted += ch;
               }
               if (c == 'o' || c == 'O') {
                ch = letters[14];
                encripted += ch;
               }
               if (c == 'p' || c == 'P') {
                ch = letters[15];
                encripted += ch;
               }
               if (c == 'q' || c == 'Q') {
                ch = letters[16];
                encripted += ch;
               }
               if (c == 'r' || c == 'R') {
                ch = letters[17];
                encripted += ch;
               }
               if (c == 's' || c == 'S') {
                ch = letters[18];
                encripted += ch;
               }
               if (c == 't' || c == 'T') {
                ch = letters[19];
                encripted += ch;
               }
               if (c == 'u' || c == 'U') {
                ch = letters[20];
                encripted += ch;
               }
               if (c == 'v' || c == 'V') {
                ch = letters[21];
                encripted += ch;
               }
               if (c == 'w' || c == 'W') {
                ch = letters[22];
                encripted += ch;
               }
               if (c == 'x' || c == 'X') {
                ch = letters[23];
                encripted += ch;
               }
               if (c == 'y' || c == 'Y') {
                ch = letters[24];
                encripted += ch;
               }
               if (c == 'z' || c == 'Z') {
                ch = letters[25];
                encripted += ch;
               }
             
         }
    
    return encripted;
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
    
     /**
     * encriptes the password with shifting
     * @param password - password to be creapted
     * @param shift - number of deslocations
     * @return - returns the encripted password
     */
    public String cipherPassword(String password, int shift){
    String encripted = "";
    int pass = password.length();
    for(int i = 0; i < pass; i++){
        char c = (char)(password.charAt(i) + shift);
        if (c > 'z')
            encripted += (char)(password.charAt(i) - (26-shift));
        else
            encripted += (char)(password.charAt(i) + shift);
    }
    return encripted;
}
    
    
}
