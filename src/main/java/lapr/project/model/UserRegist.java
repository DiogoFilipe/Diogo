/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class UserRegist {

    private List<User> userList;

    public UserRegist() {
        this.userList = new ArrayList<>();
    }

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
     * Verifies if the user is in the list
     *
     * @param user - user to be verified
     * @return
     */
    public boolean isUser(User user) {
        return userList.contains(user);
    }

    /**
     *
     * @param index
     * @return
     */
    public User getUserByIndex(int index) {
        return userList.get(index);

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

}
