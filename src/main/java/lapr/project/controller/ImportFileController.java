/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.*;

/**
 *
 * @author HP
 */
public class ImportFileController {
    private String filename;
    private FairCenter fc;
    
    public ImportFileController(String filename){
    this.filename = filename;}
    
    /**
     * Reads the content of the file
     */
    public void readFile(){
    ReadFile.readFile(filename, fc);
    }
    
}
