package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.*;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class ShowEventStandsInformationController {

    FairCenter fc;
    Organizer organizer;
    EventRegist er;
    Event e;
    List<Stand> standList;

    /**
     * user
     */
    private User u;

    public ShowEventStandsInformationController(FairCenter fc, User user) {
        this.fc = fc;
        this.u = user;
    }

    /**
     * Returns a list with the titles of the Event's the user logged in is an
     * Organizer of
     *
     * @return list with the titles of the Event's the user logged in is an
     * Organizer of
     */
    public List<String> getOrganizerEventList() {
        return fc.getEventRegist().getOrganizerEventList((Organizer)u);
    }

    /**
     * Returns an array of doubles that represents the classes of the frequency
     * distribution table for an Event
     *
     * @param eventTitle the Event's title
     * @return array of doubles that represents the classes of the frequency
     * distribution table
     */
    public double[][] getStandAreasClasses(String eventTitle) {
        List<Event> eventList = er.getEventList();
        for (Event event : eventList) {
            if (event.getTitle().equals(eventTitle)) {
                this.e = event;
            }
        }
        this.standList = e.getStandList().getStandList();
        int nStands = standList.size();
        int k = (int) Math.ceil(1 + 3.322 * Math.log(nStands));
        double minimum = 9000, maximum = -9000;
        for (Stand stand : standList) {
            if (stand.getArea() < minimum) {
                minimum = stand.getArea();
            }
            if (stand.getArea() > maximum) {
                maximum = stand.getArea();
            }
        }
        double range = maximum - minimum;
        double classWidth = range / k;
        double[][] classes = new double[k][2];
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                classes[i][0] = minimum;
                classes[i][1] = minimum + classWidth;
            } else {
                classes[i][0] = classes[i - 1][1];
                classes[i][1] = classes[i][0] + classWidth;
            }
        }
        return classes;
    }

    /**
     * Returns an array of integers that represent the absolute frequencies of
     * each class of the frequency distribution table
     *
     * @return array of integers that represent the absolute frequencies of each
     * class of the frequency distribution table
     */
    public int[] absoluteFrequency() {
        int cont = 0;
        List<Double> areaList = new ArrayList<>();
        for (Stand stand : standList) {
            areaList.add(stand.getArea());
        }
        int[] absoluteFrequency = new int[(int) Math.ceil(1 + 3.322 * Math.log(standList.size()))];
        double[][] classes = getStandAreasClasses(e.getTitle());
        for (int i = 0; i < classes.length; i++) {
            for (double area : areaList) {
                if (area >= classes[i][0] && area < classes[i][1]) {
                    cont++;
                }
            }
            absoluteFrequency[i] = cont;
        }
        return absoluteFrequency;
    }

    /**
     * Returns an array of doubles that represent the relative frequencies of
     * each class of the frequency distribution table
     *
     * @return array of doubles that represent the relative frequencies of each
     * class of the frequency distribution table
     */
    public double[] relativeFrequency() {
        double[] relativeFrequency = new double[(int) Math.ceil(1 + 3.322 * Math.log(standList.size()))];
        int[] absoluteFrequency = absoluteFrequency();
        for (int i = 0; i < relativeFrequency.length - 1; i++) {
            relativeFrequency[i] = (double) absoluteFrequency[i] / standList.size();
        }
        return relativeFrequency;
    }

    /**
     * Returns the average area of the Event's Stand list
     *
     * @return average area of the Event's Stand list
     */
    public double calcAverageArea() {
        double totalArea = 0;
        for (Stand stand : standList) {
            totalArea += stand.getArea();
        }
        return totalArea / standList.size();
    }

    /**
     * Returns the mean deviation of the Event's Stand list
     *
     * @return mean deviation of the Event's Stand list
     */
    public double calcMeanDeviation() {
        double aux1 = 0, aux2 = 0;
        for (Stand stand : standList) {
            aux1 = Math.pow(Math.abs(stand.getArea() - calcAverageArea()), 2);
            aux2 += aux1;
        }
        return Math.sqrt(aux2 / standList.size());
    }
}
