package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FAEList implements Serializable {

    /**
     * servial version
     */
    private static final long serialVersionUID = 5888244207240801590L;

    /**
     * list of faes
     */
    private List<FAE> FAEList;

    /**
     * empty constructor
     */
    public FAEList() {
        FAEList = new ArrayList<>();
    }

    /**
     * Returns the List of FAE
     *
     * @return List of FAE
     */
    public List<FAE> getFAEList() {
        return FAEList;
    }

    /**
     * Defines the FAE List
     *
     * @param FAEList
     */
    public void setFAEList(List<FAE> FAEList) {
        this.FAEList = FAEList;
    }

    /**
     *
     * @param username username given
     * @return the fae with that username
     */
    public FAE getFAE(String username) {
        for (FAE f : FAEList) {
            if (f.getUsername().equals(username)) {
                return f;
            }
        }
        return null;
    }

    /**
     *
     * @param u user
     * @return true if the user is a fae
     */
    public boolean isFAE(User u) {
        for (FAE fae : FAEList) {
            if (u.getUsername().equals(fae.getUsername())) {
                return true;
            }
        }
        return false;
    }
}
