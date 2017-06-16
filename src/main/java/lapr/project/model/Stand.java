package lapr.project.model;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Stand {
    
    private String id;
    private double area;
    
    private static final int totalStands = 0;
    private static final String ID_PREFIX = "Stand";
    
    /**
     * Constructor for Stand
     * @param area Stand's area
     */
    public Stand(double area) {
        this.id = ID_PREFIX + (totalStands++);
        this.area = area;
    }
    
    /**
     * Returns the Stand's ID
     * @return Stand's ID
     */
    public String getID() {
        return id;
    }
    
    /**
     * Returns the Stand's area
     * @return Stand's area
     */
    public double getArea() {
        return area;
    }
    
    /**
     * Modifies the Stand's ID
     * @param id Stand's ID
     */
    public void setID(String id) {
        this.id = id;
    }
    
    /**
     * Modifies the Stand's area
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    /**
     * Returns a textual representation of the Stand
     * @return textual representation of the Stand
     */
    @Override
    public String toString() {
        return "The stand " + id + " has an area of " + area + "square meters";
    }
    
}
