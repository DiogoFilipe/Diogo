
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class FAEList {
    
    private List<FAE> FAEList;
    
    
    public FAEList() {
        FAEList = new ArrayList<>();
    }
    
    /**
     * Returns the List of FAE
     * @return List of FAE
     */
    public List<FAE> getFAEList(){
        return FAEList;
    }
    
    /**
     * Defines the FAE List
     * @param FAEList 
     */
    public void setFAE(List<FAE> FAEList){
        this.FAEList = FAEList;
    }
    
    /**
     * Adds a new FAE to the FAEList
     * @param fae - FAE to be added to the FAE List
     * @return The FAE List
     */
    public boolean addFAE(FAE fae){
        if(FAEList.contains(fae)){
            return false;
        }
        return FAEList.add(fae);
    }
    /**
     * Verefies if there is any FAE
     * @return 
     */
     public boolean isEmpty() {
        return FAEList.isEmpty();
    }
     
     public boolean containsFAE(FAE fae){
         return FAEList.contains(fae);
     }
    
}
