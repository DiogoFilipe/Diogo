/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author João Domingues
 */
public class AssignStands {
    
     private Stand stand;
    private Application application;

    public AssignStands(Stand stand, Application application) {

        this.stand = stand;
        this.application = application;

    }

    /**
     * @return the stand
     */
    public Stand getStand() {
        return stand;
    }

    /**
     * @param stand the stand to set
     */
    public void setStand(Stand stand) {
        this.stand = stand;
    }

    /**
     * @return the application
     */
    public Application getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(Application application) {
        this.application = application;
    }
    
}