/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui.ImportFile;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.controller.ImportFileController;
import lapr.project.model.*;
import lapr.project.ui.MainWindow;

/**
 *
 * @author João Domingues
 */
public class ImportFileMainUI extends javax.swing.JFrame {

    private ImportFileController controller;
    private FairCenter fc;
    private User user;
    /**
     * Creates new form ImportFileMainUI
     */
    public ImportFileMainUI(FairCenter fc,User user) {
        this.user = user;
        this.fc = fc;
        initComponents();
        selectFile();
    }
    
    public void selectFile(){
    JFileChooser fileChooser = new JFileChooser();
     int returnVal = fileChooser.showOpenDialog(this);
     controller = new ImportFileController(fc);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String filename= fileChooser.getSelectedFile().getName();
            String typ = filename.substring(filename.lastIndexOf("."),filename.length());
            File file = fileChooser.getSelectedFile();
            if(typ.equals(".xml")){
                try {
                    if(true == controller.readXML(file)){
                        MainWindow main = new MainWindow(fc,user);
                        main.setVisible(true);
                        dispose();
                    }   } catch (ParserConfigurationException ex) {
                    Logger.getLogger(ImportFileMainUI.class.getName()).log(Level.SEVERE, null, ex);
                }
}
            if(typ.equals(".csv")){
            if(true == controller.fileReader(file)){
            MainWindow main = new MainWindow(fc,user);
            main.setVisible(true);
            dispose();
            }} else{
            }
        
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
