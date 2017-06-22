package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ApplicationList implements Serializable {

    /**
     * list of applications
     */
    private List<Application> applicationList;

    /**
     *
     * @param applicationList list of applications
     */
    public ApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    /**
     * empty contructor
     */
    public ApplicationList() {
        applicationList = new ArrayList<>();
    }

    /**
     *
     * @return list of applications
     */
    public List<Application> getApplicationList() {
        return applicationList;
    }

    /**
     *
     * @return list of Strings with the company name of applications
     */
    public List<String> getApplicationsList() {
        List<String> applications = new ArrayList<>();
        for (Application a : applicationList) {
            applications.add(a.getCompanyName());
        }
        return applications;
    }

    /**
     *
     * @param description description of the application
     * @return the application that as that description or null
     */
    public Application getApplication(String description) {
        for (Application a : applicationList) {
            if (a.getDescription().equals(description)) {
                return a;
            }
        }
        return null;
    }

    /**
     *
     * @param companyName name of the company
     * @return the application that as that company name or null
     */
    public Application getApplicationByCompanyName(String companyName) {
        for (Application a : applicationList) {
            if (a.getCompanyName().equals(companyName)) {
                return a;
            }
        }
        return null;
    }

    /**
     *
     * @return the list of keywords of all applications of one event
     */
    public List<Keyword> getKeywordsList() {
        List<Keyword> keywords = new ArrayList<>();
        for (Application a : applicationList) {
            keywords.addAll(a.getKeywordList());
        }
        return keywords;
    }

    /**
     *
     * @return the list of Applications(String with companyName) that were
     * accepted
     */
    public List<String> getApplicationListAccepted() {
        List<String> applicationsAccepted = new ArrayList<>();
        for (Application a : applicationList) {
            if (a.getD().getDecision() == true) {
                applicationsAccepted.add(a.getCompanyName());
            }
        }
        return applicationsAccepted;
    }

    /**
     *
     * @return the list of Applications(String with companyName) that were
     * rejected
     */
    public List<String> getApplicationListRejected() {
        List<String> applicationsRejected = new ArrayList<>();
        for (Application a : applicationList) {
            if (a.getD().getDecision() == false) {
                applicationsRejected.add(a.getCompanyName());
            }
        }
        return applicationsRejected;
    }

    /**
     * @param applicationList the applicationList to set
     */
    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }
}
