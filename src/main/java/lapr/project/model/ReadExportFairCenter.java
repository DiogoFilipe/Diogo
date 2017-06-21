/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ReadExportFairCenter implements Serializable {
    
 public static final String NOME_FICHEIRO_TEXTO = "FairCenter.bin";
 
  public static void saveFairCenter(FairCenter fc) throws IOException {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(NOME_FICHEIRO_TEXTO));
            outputStream.writeObject(fc);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static FairCenter loadFairCenter(FairCenter fc) throws IOException {
        try {          
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(NOME_FICHEIRO_TEXTO));
            try {
                fc = (FairCenter) in.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ReadExportFairCenter.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fc;
    }
       
    
     
}
          
          


