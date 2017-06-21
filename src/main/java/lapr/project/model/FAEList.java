package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FAEList implements Serializable{

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
    public void setFAE(List<FAE> FAEList) {
        this.FAEList = FAEList;
    }

    public FAE getFAE(String username) {
        for (FAE f : FAEList) {
            if (f.getUsername().equals(username)) {
                return f;
            }
        }
        return null;
    }

}
