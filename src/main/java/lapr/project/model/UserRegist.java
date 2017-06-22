/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class UserRegist implements Serializable {

    /**
     * list of users
     */
    private List<User> userList;

    /**
     * empty constructor
     */
    public UserRegist() {
        this.userList = new ArrayList<>();
    }

    /**
     *
     * @param user user
     * @return if the list don't contains the user, it adds him
     */
    public boolean registUser(User user) {
        if (!userList.contains(user)) {
            return userList.add(user);
        }
        return false;
    }

    /**
     * Returns the user list
     *
     * @return the user list
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * Returns the user of the username
     *
     * @param usernameOrEmail the what he puts on log in
     * @return the user of the username
     */
    public User getUser(String usernameOrEmail) {
        for (User user : this.userList) {
            if (user.getUsername().equals(usernameOrEmail) || user.getEmail().equals(usernameOrEmail)) {
                return user;
            }
        }
        return null;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    /**
     * verifys if username already exists
     *
     * @param username - username to verify if it exists
     * @return
     */
    public boolean verifyUsername(String username) {
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifys if the name only has letters
     *
     * @param name - name to be tested
     * @return
     */
    public boolean verifyName(String name) {
        boolean check = true;
        char[] chars = name.toCharArray();
        if (chars.length < 1) {
            check = false;
        }

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                check = false;
            }
        }
        return check;
    }

    /**
     *
     * @param email
     * @return true if the email has a @ and a point
     */
    public boolean verifyEmail(String email) {
        boolean at = false;
        boolean point = false;
        char[] chars = email.toCharArray();

        for (User u : userList) {
            if (u.getEmail().equals(email)) {
                return false;
            }
        }

        if (chars.length < 1) {
            return false;
        }
        for (char c : chars) {
            if (c == '@') {
                at = true;
            }
            if (c == '.') {
                point = true;
            }
        }
        return at == true & point == true;
    }

    /**
     * Verifys the password
     *
     * @param password - password to be verified
     * @return
     */
    public boolean verifyPassword(String password) {
        boolean sinal = false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean number = false;
        boolean verify = false;

        char[] ch = password.toCharArray();
        if (ch.length < 1) {
            return false;
        }
        for (char c : ch) {
            if (c == ';' || c == ',' || c == '.' || c == ':' || c == '-') {
                sinal = true;

            }
            if (Character.isLowerCase(c)) {
                lowerCase = true;
            }

            if (Character.isUpperCase(c)) {
                upperCase = true;
            }

            if (Character.isDigit(c)) {
                number = true;
            }
        }
        if (sinal == true & lowerCase == true & upperCase == true & number == true) {
            verify = true;
        }
        return verify;
    }

    /**
     * 
     * @return list of Strings with the username of all users 
     */
    public List<String> getUserListString() {
        List<String> userListString = new ArrayList<>();
        for (User u : userList) {
            userListString.add(u.getUsername());
        }
        return userListString;
    }

}
