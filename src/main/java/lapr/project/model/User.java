package lapr.project.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class User implements Serializable{
    
    private String name;
    private String username;
    private String email;
    private String password;
    private UserRegist ur;
    private List <User> userList;
    private static User user = new User();
    
    /**
     * DEFAULT NAME
     */
    private static final String NAME_DEFAULT= "no name";
    /**
     * DEFAULT EMAIL
     */
    private static final String EMAIL_DEFAULT= "no email";
    /**
     * DEFAULT USERNAME
     */
    private static final String USERNAME_DEFAULT= "no username";
    /**
     * DEFAULT PASSWORD
     */
    private static final String PASSWORD_DEFAULT= "no password";
    
    
    /**
     * constructor of the user
     * @param name is the name of the user
     * @param username is the user name in the platform
     * @param email is the user's e-mail
     * @param password is the user's password
     */
    public User(String name,String username,String email,String password){
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    
    public User(){
         name=NAME_DEFAULT;
        email=EMAIL_DEFAULT;
        username=USERNAME_DEFAULT;
        password=PASSWORD_DEFAULT;   
    }

    public String getPassword() {
        return password;
    }
    
    

    /**
     * Returns the User's name
     * @return User's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the User's username
     * @return User's username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Returns the User's email
     * @return User's email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
       
    
    @Override
    public String toString() {
        return String.format("Name: %s %nUsername: %s %nEmail: %s%n", name, username, email);
    }
    
    /**
     * Verifies if the username equals 
     * @param username
     * @return 
     */
     public boolean hasTheUsername(String username,User user){
        if(username == null){
            return false;
        }
        return (user.getUsername()).equalsIgnoreCase(username);
    }
     
     public static boolean checkHasUsername(String username,User user){
     return user.hasTheUsername(username,user);}
    
    
    /**
     * verifys if username already exists
     * @param username - username to verify if it exists
     * @return 
     */
    public static boolean verifyUsername(String username){
        
        for(User u : UserRegist.getUsers()){
         if(u.getUsername().equals(username))
             return false;
             }
        return true;
    }
    
    /**
     * Verifys if the name only has letters
     * @param name - name to be tested
     * @return 
     */
    public static boolean verifyName(String name){
        boolean check=true;
        char[] chars = name.toCharArray();
        if (chars.length<1) {
            check = false;     
        }

    for (char c : chars) {
        if(!Character.isLetter(c)) {
            check = false;
        }
    }
    return check;
    }
    
    public static boolean verifyEmail(String email){
        boolean arroba=false;
        boolean ponto = false;
        char[] chars = email.toCharArray();
       
        for(User u : UserRegist.getUsers()){
         if(u.getEmail().equals(email))
             return false;
             }
       
        if (chars.length<1) {
            return false;     
        }
         for (char c : chars) {
            if(c == '@'){
            arroba = true; }
            if(c == '.'){
            ponto = true; }
         }
         if(arroba==true & ponto==true){
         return true;
         }else{
         return false;
         }
    }
    
     /**
     * Verifys the password 
     * @param password - password to be verified
     * @return 
     */
    public static boolean verifyPassword(String password) {
    boolean sinal=false;
    boolean lowerCase=false;
    boolean upperCase=false;
    boolean number=false;
    boolean verify=false;
    
    char [] ch = password.toCharArray();
    if (ch.length<1) {
            return false;     
        }
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
    }


