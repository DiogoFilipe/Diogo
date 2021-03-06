package lapr.project.model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FairCenter implements Serializable {

    private static final long serialVersionUID = -4103137155152392812L;

    /**
     * class that has the list of events
     */
    private EventRegist eventRegist;

    /**
     * list of exhibitions
     */
    private ExhibitionList exhibitionList;

    /**
     * list of congresses
     */
    private CongressList congressList;

    /**
     * class that has the list of users
     */
    private UserRegist userRegist;

    /**
     * class that has the list of organizers
     */
    private OrganizerList organizerList;

    /**
     * class that has the list of stands
     */
    private StandRegist standRegist;

    /**
     * class that has the list of encryptions
     */
    private EncryptionList encryptionList;

    private Encryption fcEncryption;

    /**
     * class that has the list of fae
     */
    private FAEList faeList;

    /**
     * class that has the list of event managers
     */
    private EventManagerList eventManagerList;

    /**
     * list of representatives
     */
    private RepresentativeList representativeList;

    
    private List<String> applicationsAccepted;
    private List<String> applicationsRejected;
    /**
     * Constructor
     */
    public FairCenter() {
        eventRegist = new EventRegist();
        userRegist = new UserRegist();
        standRegist = new StandRegist();
        organizerList = new OrganizerList();
        encryptionList = new EncryptionList();
        exhibitionList = new ExhibitionList();
        eventManagerList = new EventManagerList();
        congressList = new CongressList();
        fcEncryption = new Encryption(Encryption.gerateShift());
        representativeList = new RepresentativeList();
    }

    /**
     * @return the registoUtilizadores
     */
    public UserRegist getUserRegist() {
        return userRegist;
    }

    public Encryption getFcEncryption() {
        return fcEncryption;
    }

    /**
     *
     * @return the list of encryptions
     */
    public EncryptionList getEncryptionList() {
        return encryptionList;
    }

    /**
     * @return the eventRegist
     */
    public EventRegist getEventRegist() {
        return eventRegist;
    }

    /**
     *
     * @return list of events
     */
    public List<Event> getEventList() {
        return eventRegist.getEventList();
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
     *
     * @param title title of an event
     * @return the event with this title, or null
     */
    public Event getEvent(String title) {
        for (Event event : this.eventRegist.getEventList()) {
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

    /**
     *
     * @return list of Strings with the company name of the applications that
     * are accepted
     */
    public List<String> getApplicationListAccepted() {
       applicationsAccepted = new ArrayList<>();
        for (Event e : eventRegist.getEventList()) {
            for (Application a : eventRegist.getEvent(e.getTitle()).getApplicationList().getApplicationList()) {
                if (a.getD().getDecision() == true) {
                    applicationsAccepted.add(a.getCompanyName());
                }
            }
        }
        return applicationsAccepted;
    }

    /**
     *
     * @return list of Strings with the company name of the applications that
     * are rejected
     */
    public List<String> getApplicationListRejected() {
        applicationsRejected = new ArrayList<>();
        for (Event e : eventRegist.getEventList()) {
            for (Application a : eventRegist.getEvent(e.getTitle()).getApplicationList().getApplicationList()) {
                if (a.getD().getDecision() == false) {
                    applicationsRejected.add(a.getCompanyName());
                }
            }
        }
        return applicationsRejected;
    }

    

    /**
     * @return the eventManagerList
     */
    public EventManagerList getEventManagerList() {
        return eventManagerList;
    }

    /**
     * @param eventManagerList the eventManagerList to set
     */
    public void setEventManagerList(EventManagerList eventManagerList) {
        this.eventManagerList = eventManagerList;
    }

    /**
     * @return the exhibitionList
     */
    public ExhibitionList getExhibitionList() {
        return exhibitionList;
    }

    /**
     * @param exhibitionList the exhibitionList to set
     */
    public void setExhibitionList(ExhibitionList exhibitionList) {
        this.exhibitionList = exhibitionList;
    }

    /**
     * @return the congressList
     */
    public CongressList getCongressList() {
        return congressList;
    }

    /**
     * @param congressList the congressList to set
     */
    public void setCongressList(CongressList congressList) {
        this.congressList = congressList;
    }

    /**
     *
     * @param u user
     * @return true if the user is an organizer or fae
     */
    public boolean isFAEOrOrganizer(User u) {
        for (Organizer o : organizerList.getOrganizerList()) {
            if (o.getUsername().equals(u.getUsername())) {
                return true;
            }
        }
        for (FAE fae : getFaeList().getFAEList()) {
            if (fae.getUsername().equals(u.getUsername())) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the faeList
     */
    public FAEList getFaeList() {
        return faeList;
    }

    /**
     * @param faeList the faeList to set
     */
    public void setFaeList(FAEList faeList) {
        this.faeList = faeList;
    }

    /**
     * @return the representativeList
     */
    public RepresentativeList getRepresentativeList() {
        return representativeList;
    }

    /**
     * @param representativeList the representativeList to set
     */
    public void setRepresentativeList(RepresentativeList representativeList) {
        this.representativeList = representativeList;
    }
}
