package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class EncryptionList implements Serializable{

    /**
     * list of encryptions
     */
    private List<Encryption> encryptionsList;

    /**
     * Constructor
     */
    public EncryptionList() {
        encryptionsList = new ArrayList<>();
    }

    /**
     * Returns the List of Encryptions
     *
     * @return List of Encryptions
     */
    public List<Encryption> getEncryptionsList() {
        return encryptionsList;
    }


    /**
     * Defines the Encryptions List
     *
     * @param encryptionsList
     */
    public void setEncryptionList(List<Encryption> encryptionsList) {
        this.encryptionsList = encryptionsList;
    }

    /**
     * Returns the shift of a given encryption
     *
     * @param user - user´s encryption
     * @return the shift
     */
    public int getShift(User user) {
        for (Encryption e : encryptionsList) {
            if (e.getUser().getUsername().equals(user.getUsername())) {
                return e.getShift();
            }
        }
        return -1;
    }
    
    /**
     * 
     * @param user user
     * @return the keyword of the user
     */   
    public String verifyEncryptionUserGetKeyword(User user) {
        String kw = "";
        for (Encryption e : encryptionsList) {
            if (e.getUser().equals(user)) {
                kw = e.getKeyword();
            }
        }
        return kw;
    }

    /**
     * 
     * @param user user
     * @return the shift used by this user 
     */
    public int verifyEncryptionUserGetShift(User user) {
        int shift = 0;
        for (Encryption e :encryptionsList) {
            if (e.getUser().equals(user)) {
                shift = e.getShift();
            }
        }
        return shift;
    }
}
