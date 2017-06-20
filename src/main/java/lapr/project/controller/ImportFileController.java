/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.File;
import lapr.project.model.*;

/**
 *
 * @author HP
 */
public class ImportFileController {
    FairCenter fc;
    
    public ImportFileController(FairCenter fc){
    this.fc = fc;}

   
    /**
     * Reads the content of the file
     */
    public boolean fileReader(File file){

        return ReadFile.readFile(file, fc);
    }

    }
