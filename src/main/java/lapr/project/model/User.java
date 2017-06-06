package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class User implements Serializable{
    
    private String name;
    private String username;
    private String email;
    private String password;
    
    public User(String name,String username,String email,String password){
        this.name = name;
        this.username = username;
        this.email = email;
        //this.password = password; - Password needs to be stored encrypted
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
       
    @Override
    public String toString() {
        return String.format("Name: %s %nUsername: %s %nEmail: %s%n", name, username, email);
    }
    
    //Password related methods
    
}
