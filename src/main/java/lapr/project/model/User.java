package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class User implements Serializable {

    /**
     * name
     */
    private String name;

    /**
     * name on the platform
     */
    private String username;

    /**
     * email
     */
    private String email;

    /**
     * password
     */
    private String password;

    /**
     * DEFAULT NAME
     */
    private final String NAME_DEFAULT = "no name";
    /**
     * DEFAULT EMAIL
     */
    private final String EMAIL_DEFAULT = "no email";
    /**
     * DEFAULT USERNAME
     */
    private final String USERNAME_DEFAULT = "no username";
    /**
     * DEFAULT PASSWORD
     */
    private final String PASSWORD_DEFAULT = "no password";

    /**
     * constructor of the user
     *
     * @param name is the name of the user
     * @param username is the user name in the platform
     * @param email is the user's e-mail
     * @param password is the user's password
     */
    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /**
     * empty constructor
     */
    public User() {
        name = NAME_DEFAULT;
        email = EMAIL_DEFAULT;
        username = USERNAME_DEFAULT;
        password = PASSWORD_DEFAULT;
    }

    /**
     *
     * @return user password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the User's name
     *
     * @return User's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the User's username
     *
     * @return User's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the User's email
     *
     * @return User's email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return all user's data
     */
    @Override
    public String toString() {
        return String.format("Name: %s %nUsername: %s %nEmail: %s%n", name, username, email);
    }

    /**
     * Verifies if the username equals
     *
     * @param username username
     * @param user user
     * @return returns true if the user has the username
     */
    public boolean hasTheUsername(User user, String username) {
        if (username == null) {
            return false;
        }
        return (user.getUsername()).equalsIgnoreCase(username);
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
