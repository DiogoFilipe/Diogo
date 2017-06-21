package lapr.project.model;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Representative extends User{
    
   /**
    * name of the company
    */
    private String companyName;
    
    /**
     * 
     * @param user real name
     * @param username name in the platform
     * @param email his email
     * @param password string that protect his account
     * @param companyName name of the company
     */
    public Representative(String user,String username,String email,String password,String companyName){
        super(user,username,email,password);
        this.companyName=companyName;
    }
    
    /**
     * empty constructor 
     */
   public Representative(){
        super();
    }

   /**
    * 
    * @return representative's email 
    */
    @Override
    public String getEmail() {
        return super.getEmail(); 
    }

    /**
     * 
     * @return representative's password 
     */
    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    /**
     * 
     * @return representative's username 
     */
    @Override
    public String getUsername() {
        return super.getUsername(); 
    }
    
    /**
     * 
     * @return representative's name 
     */

    @Override
    public String getName() {
        return super.getName(); 
    }

    /**
     * 
     * @param email representative's email 
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email); 
    }

    /**
     * 
     * @param password representative's password 
     */
    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    /**
     * 
     * @param name representatives name 
     */
    @Override
    public void setName(String name) {
        super.setName(name); 
    }

    /**
     * 
     * @param username representative's username 
     */
    @Override
    public void setUsername(String username) {
        super.setUsername(username); 
    }

    /**
     * 
     * @return all data about representative 
     */
    @Override
    public String toString() {
        return super.toString()+" Company Name: "+companyName; 
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    /**
     * 
     * @return returns if representative has company name 
     */
    public boolean hasCompanyName(){
        return !(companyName == null||companyName.trim().equalsIgnoreCase(" "));
    }
    
}
