package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class RepresentativeList implements Serializable{
    
     
    /**
     * list of representatives
     */
    private List<Representative> representativeList;
    
    /**
     * empty constructor
     */
    public RepresentativeList(){
        this.representativeList=new ArrayList<>();
    }
    
    /**
     * 
     * @param representativeList list of representatives 
     */
    public RepresentativeList(List<Representative> representativeList){
        this.representativeList=representativeList;
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
    

}
