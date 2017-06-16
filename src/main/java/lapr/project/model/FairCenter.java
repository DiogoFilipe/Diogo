package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FairCenter implements Serializable {

    ///**
    // * Algoritms regist
    // */
    //private AlgorithmsRegist algorithmRegist;
    /**
     * Events regist
     */
    private EventRegist eventRegist;
    /**
     * Users regist
     */
    private UserRegist userRegist;

    /**
     * Constructor
     */
    public FairCenter() {
    //    algorithmRegist = new AlgorithmsRegist();
        eventRegist = new EventRegist();
        userRegist = new UserRegist();
    }

    /**
     * @return the User regist
     */
    public UserRegist getUserRegist() {
        return userRegist;
    }

    ///**
    // * @return the Algorithms regist
    // */
    //public AlgorithmsRegist getAlgorithmsRegist() {
    //    return algorithmRegist;
    //}

    /**
     * @return the event regist
     */
    public EventRegist getEventRegist() {
        return eventRegist;
    }

    /**
     * Allows you to add a new user to the user regist
     *
     * @param user
     */
    public void newUser(User user) {
        userRegist.addUser(user);
    }

    /**
     * Allows you to add a new event to the event regist
     *
     * @param event
     */
    public void newEvent(Event event) {
        eventRegist.addEvent(event);
    }

}
