
package lapr.project.model;



/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Encryption {
    
    private String keyword;
    private User user;
    private int shift;
    /**
     * Constructor
     * @param user - of the encryption
     * @param keyword - encryption´s keyword
     * @param shift - encrytprions´s shift
     */
    public Encryption(User user, String keyword,int shift){
        this.user = user;
        this.keyword = keyword;
        this.shift = shift;
    
    }

    /**
     * returns the encryption's shift
     * @return shift
     */
    public int getShift() {
        return shift;
    }

   
    /**
     * returns the encryption's keyword
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * returns the encytption´s user
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * defines the user
     * @param user to be defined
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * defines the keyword
     * @param keyword to be defined
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * defines the shift
     * @param shift to be defined
     */
    public void setShift(int shift) {
        this.shift = shift;
    }
    
    
    
    
    
}
