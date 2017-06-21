/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.IOException;
import lapr.project.model.*;

/**
 *
 * @author HP
 */
public class ExportDataController {
    FairCenter fc;
    User user;
    
    public ExportDataController(FairCenter fc, User user){
        this.fc = fc;
        this.user = user;
    }
    
    public void exportData() throws IOException{
        ReadExportFairCenter.saveFairCenter(fc);      
    }
}
