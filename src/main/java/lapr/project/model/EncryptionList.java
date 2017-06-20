package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class EncryptionList {

    private List<Encryption> encryptionsList;
    private EncryptionList el = new EncryptionList();

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

    public List<Encryption> getEncryptions() {
        List<Encryption> encryptions = el.getEncryptionsList();
        return encryptions;
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
     * Adds a new Encryption to the EncryptionsList
     *
     * @param encryption
     * @return The EncryptionsList
     */
    public boolean addEncryption(Encryption encryption) {
        if (encryptionsList.contains(encryption)) {
            return false;
        }
        return encryptionsList.add(encryption);
    }

    public boolean registEncryption(Encryption encryption) {
        return el.addEncryption(encryption);
    }

    /**
     * Verefies if there is any encryption
     *
     * @return
     */
    public boolean isEmpty() {
        return encryptionsList.isEmpty();
    }

    /**
     * check if the list already contains encryptions
     *
     * @param encryption that will check if is on the list
     * @return true if the encryption already is on the list
     */
    public boolean containsEncryption(Encryption encryption) {
        return encryptionsList.contains(encryption);
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
}
