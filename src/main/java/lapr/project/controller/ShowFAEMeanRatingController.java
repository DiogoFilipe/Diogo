package lapr.project.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ShowFAEMeanRatingController {

    private FairCenter fc;
    private User u;
    private List<FAE> faeList;

    public ShowFAEMeanRatingController(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
    }

    /**
     * Returns the names of the FAEs that have already made decisions
     *
     * @return names of the FAEs that have already made decisions
     */
    public List<String> getFAEList() {
        this.faeList = fc.getFaeList().getFAEList();
        List<String> faeListString = new ArrayList<>();
        for (FAE fae : faeList) {
            if (!fae.getDecisionList().getDecisionList().isEmpty()) {
                faeListString.add(fae.getName());
            }
        }
        return faeListString;
    }

    /**
     * Returns the FAE's mean rating
     *
     * @param faeName the FAE's name
     * @return the FAE's mean rating
     */
    public double getFAEMeanRating(String faeName) {
        double ratingAverage = 0;
        for (FAE fae : faeList) {
            if (fae.getName().equals(faeName)) {
                List<Decision> decisionList = fae.getDecisionList().getDecisionList();
                double aux = 0;
                for (Decision decision : decisionList) {
                    int sum = decision.getAdequacy() + decision.getFaeKnowledge() + decision.getInvitationAdequacy() + decision.getOverallRecommendation();
                    double average = (double) sum / 4;
                    aux += average;
                }
                ratingAverage = aux / decisionList.size();
            }
        }
        return ratingAverage;
    }

}
