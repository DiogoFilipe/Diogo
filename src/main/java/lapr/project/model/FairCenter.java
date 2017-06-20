package lapr.project.model;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FairCenter implements Serializable {

    private EventRegist eventRegist;
    private UserRegist userRegist;
    private OrganizerList organizerList;
    private StandRegist standRegist;
    private EncryptionList encryptionList;

    /**
     * Constructor
     */
    public FairCenter() {
        eventRegist = new EventRegist();
        userRegist = new UserRegist();
        standRegist = new StandRegist();
        organizerList = new OrganizerList();
        encryptionList = new EncryptionList();
    }

    /**
     * @return the registoUtilizadores
     */
    public UserRegist getUserRegist() {
        return userRegist;
    }

    public EncryptionList getEncryptionList() {
        return encryptionList;
    }

    
    /**
     *
     * @return
     */
    public StandRegist getStandReg() {
        return getStandRegist();
    }

    /**
     * @return the eventRegist
     */
    public EventRegist getEventRegist() {
        return eventRegist;
    }

    public List<Event> getEventList() {
        return eventRegist.getEventList();
    }

    public Event getEvent(Event e) {
        return eventRegist.getEvent(e.getTitle());
    }

    /**
     * Allows you to add a new user to the user regist
     *
     * @param user
     */
    public void newUser(User user) {
        userRegist.getUserList().add(user);
    }

    /**
     * Allows you to add a new event to the event regist
     *
     * @param event
     */
    public void newEvent(Event event) {
        eventRegist.addEvent(event);
    }

    public Event getEvent(String title) {
        for (Event event : eventRegist.getEventList()) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

    /**
     * @param eventRegist the eventRegist to set
     */
    public void setEventRegist(EventRegist eventRegist) {
        this.eventRegist = eventRegist;
    }

    public void setEncryptionList(EncryptionList encryptionList) {
        this.encryptionList = encryptionList;
    }
    
    

    /**
     * @param userRegist the userRegist to set
     */
    public void setUserRegist(UserRegist userRegist) {
        this.userRegist = userRegist;
    }

    /**
     * @return the organizerList
     */
    public OrganizerList getOrganizerList() {
        return organizerList;
    }

    /**
     * @param organizerList the organizerList to set
     */
    public void setOrganizerList(OrganizerList organizerList) {
        this.organizerList = organizerList;
    }

    /**
     * @return the standRegist
     */
    public StandRegist getStandRegist() {
        return standRegist;
    }

    /**
     * @param standRegist the standRegist to set
     */
    public void setStandRegist(StandRegist standRegist) {
        this.standRegist = standRegist;
    }

    public File getSelectedFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
