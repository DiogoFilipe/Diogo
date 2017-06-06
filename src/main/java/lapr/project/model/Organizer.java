package lapr.project.model;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Organizer {
    
    User user;
    
    public Organizer(User user){
        this.user = user;
    }
        
    public void setUser(User user){
        this.user = user;
    }
    
   
    
    /**Verifies if the two users are equal
     * 
     * @param user - user to compare
     * @return 
     */
    public boolean isUser(User user){
        if(this.user != null){
            return this.user.equals(user);
        }
        return false;
    }
    
        @Override
    public String toString(){
        return user != null ? user.toString() : null;
    }
    
  /**Validates object, verifying what type it is and if it exists
   * 
   * @param object - object to compare
   * @return
   */
    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        
        Organizer otherOrganizer = (Organizer) object;
        return otherOrganizer.isUser(user);
    }
    
}
