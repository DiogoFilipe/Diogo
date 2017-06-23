package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class FrequencyKeyword implements Serializable {

    private static final long serialVersionUID = 1984238808121345987L;

    /**
     * title of the event
     */
    private String e;

    /**
     * list of keywords
     */
    private List<Keyword> keywords;

    /**
     * fair center
     */
    private FairCenter fc;

    public FrequencyKeyword(List<Keyword> keywords, String e) {
        this.keywords = keywords;
        this.e = e;
    }

    /**
     * @return the e
     */
    public String getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(String e) {
        this.e = e;
    }

    /**
     * @return the keywords
     */
    public List<Keyword> getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    /**
     *
     * @param e event title
     * @return a list of doubles with the frequencie of every keyword
     */
    public List<Double> calcFreq(String e) {
        List<Double> frequencies = new ArrayList<>();
        for (Keyword j : fc.getEventRegist().getEvent(e).getApplicationList().getKeywordsList()) {
            int tot = 0;
            int cont = 0;
            for (Keyword k : fc.getEventRegist().getEvent(e).getApplicationList().getKeywordsList()) {
                if (j.equals(k)) {
                    cont++;
                }
                tot++;
            }
            double freq = (cont / tot) * 100;
            frequencies.add(freq);
        }
        return frequencies;
    }

}
