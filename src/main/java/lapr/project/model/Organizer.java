package lapr.project.model;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Organizer extends User {
    
    private User user;
    
    public Organizer(User user){
        this.user = user;
    }
    
    public Organizer(String name,String username,String email,String password){
        super(name,username,email,password);
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
        if(this.getUser() != null){
            return this.getUser().equals(user);
        }
        return false;
    }
    
        @Override
    public String toString(){
        return getUser() != null ? getUser().toString() : null;
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
        return otherOrganizer.isUser(getUser());
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

   /**
    * 
    * @return the name of the user 
    */
    @Override
    public String getName() {
        return super.getName(); 
    }
    
    
    
}
