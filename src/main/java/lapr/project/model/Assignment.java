/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class Assignment implements Serializable {

    private static final long serialVersionUID = -4453922120891230830L;

    /**
     * list of fae
     */
    private List<FAE> faeList;

    /**
     * application
     */
    private Application application;

    /**
     *
     * @param faeList list of fae
     * @param application application
     */
    public Assignment(List<FAE> faeList, Application application) {
        this.faeList = faeList;
        this.application = application;
    }

    /**
     * Returns the FAE list an Application has been assigned to
     *
     * @return FAE list an Application has been assigned to
     */
    public List<FAE> getFAEList() {
        return faeList;
    }

    /**
     * Returns the Application linked to the Assignment
     *
     * @return Application linked to the Assignment
     */
    public Application getApplication() {
        return application;
    }

    /**
     * Modifies the FAE list an Application has been assigned to
     *
     * @param faeList FAE list an Application has been assigned to
     */
    public void setFAEList(List<FAE> faeList) {
        this.faeList = faeList;
    }

    /**
     * Modifies the Application this Assignment is linked to
     *
     * @param application
     */
    public void setApplication(Application application) {
        this.application = application;
    }

}
