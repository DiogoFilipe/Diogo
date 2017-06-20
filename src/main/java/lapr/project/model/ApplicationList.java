package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ApplicationList implements Serializable {

    private List<Application> applicationList;

    public ApplicationList() {
        applicationList = new ArrayList<>();
    }

    public List<Application> getApplicationList() {
        return applicationList;
    }

    public List<String> getApplicationsList() {
        List<String> applications = new ArrayList<>();
        for (Application a : applicationList) {
            applications.add(a.getCompanyName());
        }
        return applications;
    }

    /**
     * Return´s the size of the applicationsList
     *
     * @return List´s size
     */
    public int getSize() {
        return applicationList.size();
    }

    /**
     * Defines the applicationsList
     *
     * @param applicationList the list of applications
     */
    public void setListaCandidatura(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    /**
     * Removes an application from the applications list
     *
     * @param application - Application to be removed
     * @return
     */
    public boolean removerCandidatura(Application application) {
        return applicationList.remove(application);
    }

    /**
     * Adds an application to the applications List
     *
     * @param application - Applcation to be added
     * @return
     */
    public boolean registApplication(Application application) {
        if (!applicationList.contains(application)) {
            return this.applicationList.add(application);
        }
        return false;
    }

    /**
     * Verifies there are any existing applications
     *
     * @return
     */
    public boolean isEmpty() {
        return applicationList.isEmpty();
    }

    public Application getApplication(String description) {
        for (Application a : applicationList) {
            if (a.getDescription().equals(description)) {
                return a;
            }
        }
        return null;
    }
}
