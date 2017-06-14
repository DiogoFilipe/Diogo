package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class UserRegistMainWindowController {
    UserRegist ur;
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
    boolean sinal=false;
    boolean lowerCase=false;
    boolean upperCase=false;
    boolean number=false;
    boolean verify=false;
    
    char [] ch = password.toCharArray();
    for(char c : ch){
    if(c==';'|| c==',' || c=='.' || c==':' || c=='-'){
        sinal = true;
    
    }
    if(Character.isLowerCase(c)){
    lowerCase=true;}
    
    if(Character.isUpperCase(c)){
    upperCase=true;}
    
    if(Character.isDigit(c)){
    number = true;}
    }
    if(sinal==true & lowerCase==true & upperCase==true & number==true){
    verify=true;}
    return verify; 
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
        this.name = name;
        this.username =  username;
        this.email = email;
        this.atribute = password;
        user.setName(name);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        
        return user;
                
        
    }
    
    /**
     * Creates and returns the new Encryption
     * @param user - user that made the encryption
     * @param keyword - keyword inserted by the user
     * @param shift - shift of the encryption
     * @return encryption;
     */
    public Encryption createEncryption(User user,String keyword,int shift){
        this.user = user;
        this.keyword = keyword;
        this.shift = shift;
        encryption.setKeyword(keyword);
        encryption.setShift(shift);
        encryption.setUser(user);
        
        return encryption;
        
    }
    

    /**
     * returns the userList with the added user
     * @param user- user to be added
     * @return userList with the new user
     */
    public boolean addUser(User user) {
      return userList.add(user);
    }
    
    /**
     * 
     * @param username - username to verify if it exists
     * @return 
     */
    public boolean verifyUsername(String username){
        for(User u : userList){
         if(u.getUsername().equals(username))
             return false;
             }
        return true;
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
     
     public String cipherPasswordDecript(String encriptedPassword, int shift){
         String encripted = "";
    int pass = encriptedPassword.length();
    for(int i = 0; i < pass; i++){
        char c = (char)(encriptedPassword.charAt(i) - shift);
        if (c > 'z')
            encripted += (char)(encriptedPassword.charAt(i) + (26-shift));
        else
            encripted += (char)(encriptedPassword.charAt(i) - shift);
    }
    return encripted;
         
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
        * Verifys if the keyword is between 5 and 7
        * @param keyword - keyword to verify size
        * @return
        */
       public boolean verifyKeyword(String keyword){
       if(keyword.length()>7 || keyword.length()<5){
           return false;
       
       }
       return true;
       }
       
       
    /**
     * Adds an encryption to the encryptionsList
     * @param encryption - encryption to be added
     * @return 
     */   
    public boolean addEncryption(Encryption encryption) {
      return encryptionsList.add(encryption);
    }
     
    
}
