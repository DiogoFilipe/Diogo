/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Domingues
 */
public class StandRegist implements Serializable{
    
    private List<Stand> StandList;

    /**
     *
     */
    public StandRegist() {
        StandList = new ArrayList<>();
    }

    /**
     *
     * @param StandList
     */
    public StandRegist(List<Stand> StandList) {
        this.StandList = StandList;
    }

    /**
     *
     * @return
     */
    public List<Stand> getStandList() {
        return StandList;
    }

    /**
     *
     * @param StandList
     * @return
     */
    public boolean setStandList(List<Stand> StandList) {
        this.StandList = StandList;
        return this.StandList.equals(StandList);
    }

    /**
     *
     * @return
     */
    public int size() {
        return StandList.size();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return StandList.isEmpty();
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean contains(Stand s) {
        return StandList.contains(s);
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean add(Stand s) {
        return StandList.add(s);
    }

    /**
     *
     * @param description
     * @param area
     * @return
     */
    public Stand newStand(double area) {
        return new Stand(area);
    }

    /**
     *
     */
    public void clear() {
        StandList.clear();
    }

    /**
     *
     * @param index
     * @return
     */
    public Stand getStandByIndex(int index) {
        return StandList.get(index);
    }


    /**
     *
     * @param index
     * @return
     */
    public Stand removeStandByIndex(int index) {
        return StandList.remove(index);
    }

    @Override
    public String toString() {
        return "RegistoStand{" + "listaStand=" + StandList + '}';
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean validStand(Stand s) {
        // Introduzir as validações aqui

        return true;
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean standRegist(Stand s) {
        return this.add(s);
    }

    /**
     *
     * @return
     */
    public List<Stand> getStandsListAvailable() {
        List<Stand> sl = new ArrayList<>();
        for (Stand s : StandList) {
            if (!s.isBusy()) {
                sl.add(s);
            }
        }
        return sl;
    }
    
}
