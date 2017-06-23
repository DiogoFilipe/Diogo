package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class RepresentativeList implements Serializable {

    private static final long serialVersionUID = 374711346216985830L;

    /**
     * list of representatives
     */
    private List<Representative> representativeList;

    /**
     * empty constructor
     */
    public RepresentativeList() {
        this.representativeList = new ArrayList<>();
    }

    /**
     *
     * @param representativeList list of representatives
     */
    public RepresentativeList(List<Representative> representativeList) {
        this.representativeList = representativeList;
    }

    /**
     * @return the representativeList
     */
    public List<Representative> getRepresentativeList() {
        return representativeList;
    }

    /**
     * @param representativeList the representativeList to set
     */
    public void setRepresentativeList(List<Representative> representativeList) {
        this.representativeList = representativeList;
    }

      /**
     *
     * @param u user
     * @return true if the user is a representative
     */
    public boolean isRepresentative(User u) {
        for (Representative r : representativeList) {
            if (r.getUsername().equals(u.getUsername())) {
                return true;
            }
        }
        return false;
    }
}
