package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FairCenter implements Serializable{
    
     /**
     * Algoritms regist
     */
    private AlgorithmsRegist algorithmsRegist;
    /**
     * Events regist
     */
    private EventRegist eventRegist;
    /**
     * Users regist
     */
    private UserRegist usersRegist;
    
    /**
     * Constructor
     */
    public FairCenter(){
        algorithmsRegist=new AlgorithmsRegist();
        eventRegist= new EventRegist();
        usersRegist=new UserRegist(); 
    }
    
        /**
     * @return the Users regist
     */
    public UserRegist getUsersRegist() {
        return usersRegist;
    }

    /**
     * @return the Algorithms regist
     */
    public AlgorithmsRegist getAlgorithmsRegist() {
        return algorithmsRegist;
    }

    /**
     * @return the event regist
     */
    public EventRegist getEventRegist() {
        return eventRegist;
    }
    
    /**
     * Allows you to add a new user to the user regist
     * @param utilizador 
     */
    public void newUser(User user){
        usersRegist.addUser(user);
    }

    /**
     * Allows you to add a new event to the event regist
     * @param evento 
     */
    public void newEvent(Event event){
        eventRegist.addEvent(event);
    }


    
}
