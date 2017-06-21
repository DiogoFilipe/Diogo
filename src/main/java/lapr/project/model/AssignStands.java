/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author João Domingues
 */
public class AssignStands implements Serializable{

    /**
     * stand
     */
    private Stand stand;
    
    /**
     * application
     */
    private Application application;

    /**
     * 
     * @param stand stand that will be assigned
     * @param application application that will have the stand
     */
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
