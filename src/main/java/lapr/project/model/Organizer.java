package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Organizer extends User implements Serializable {

    /**
     * user
     */
    private User user;
    
    /**
     * 
     * @param name name of the organizer
     * @param username username of the organizer
     * @param email email of the organizer
     * @param password  password of the organizer
     */
    public Organizer(String name, String username, String email, String password) {
        super(name, username, email, password);
    }
    
    /**
     * 
     * @param u an user 
     */
    public Organizer(User u){
        this.user=u;
    }

    /**
     *
     * @return all data about organizer
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     *
     * @return the name of the user
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     *
     * @return organizer's passowrd
     */
    @Override
    public String getPassword() {
        return super.getPassword();
    }

    /**
     *
     * @return organizer's email
     */
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    /**
     *
     * @return organizer's username
     */
    @Override
    public String getUsername() {
        return super.getUsername();
    }

    /**
     *
     * @param email organizer's email
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     *
     * @param name organizer's name
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     *
     * @param password organizer's password
     */
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    /**
     *
     * @param username organizer's username
     */
    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    /**
     * empty constructor
     */
    public Organizer() {
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

}
