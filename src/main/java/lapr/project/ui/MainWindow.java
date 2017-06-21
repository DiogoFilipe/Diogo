/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JOptionPane;
import lapr.project.controller.ListApplicationsController;
import lapr.project.model.FairCenter;
import lapr.project.model.Organizer;
import lapr.project.model.User;
import lapr.project.ui.AcceptanceRate50.AcceptanceRateOver50;
import lapr.project.ui.CreateEvent.CreateEventMain;
import lapr.project.ui.CreateStand.CreateStandMainUI;
import lapr.project.ui.DecideApplication.DecideApplicationMainUI;
import lapr.project.ui.DefineFAE.DefineFAEMainUI;
import lapr.project.ui.DifferenceTwoFAEDeviation.DifferenceTwoFAEDeviation;
import lapr.project.ui.EditApplication.EditApplicationMainUI;
import lapr.project.ui.ExportAllData.ExportAllDataMainUI;
import lapr.project.ui.ImportFile.ImportFileMainUI;
import lapr.project.ui.ListApplications.ListApplicationsMainWindow;
import lapr.project.ui.ShowEvenAcceptanceRate.ShowEventAcceptanceRateMainUI;
import lapr.project.ui.ShowEventKeywords.ShowEventKeywordsWindow;
import lapr.project.ui.ShowFaeMeanRating.ShowFaeMeanRatingMainUI;
//import lapr.project.ui.ShowGlobalAcceptanceRate.ShowGlobalAcceptanceRateMainUI;
import lapr.project.ui.SubmitApplication.SubmitApplicationMainUI;
import lapr.project.utils.DontHavePermissionException;

/**
 *
 * @author Diogo
 */
public class MainWindow extends javax.swing.JFrame {

    FairCenter fc;
    User user;
    ListApplicationsController listApplicationController;

    /**
     * Creates new form MainWindow
     *
     * @param fc fairCenter
     * @param user user that logs in
     */
    public MainWindow(FairCenter fc, User user) {

        this.user = user;
        this.fc = fc;

        listApplicationController = new ListApplicationsController(fc, user);
        initComponents();
    }
    

    public MainWindow() {

        listApplicationController = new ListApplicationsController(fc, user);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DefineFAE = new javax.swing.JButton();
        CreateEvent = new javax.swing.JButton();
        DecideApplication = new javax.swing.JButton();
        SubmitApplication = new javax.swing.JButton();
        ChangeApplication = new javax.swing.JButton();
        createStand = new javax.swing.JButton();
        AssignStand = new javax.swing.JButton();
        ListApplications = new javax.swing.JButton();
        ExportAllData = new javax.swing.JButton();
        ImportAllData = new javax.swing.JButton();
        ImportEventData = new javax.swing.JButton();
        EventSubmissionKeywords = new javax.swing.JButton();
        EventAcceptanceRate = new javax.swing.JButton();
        EventStandsInformation = new javax.swing.JButton();
        GlobalAcceptanceRate = new javax.swing.JButton();
        EventAcceptance50 = new javax.swing.JButton();
        Diff2EventsAcceptanceRate = new javax.swing.JButton();
        FAEMeanRating = new javax.swing.JButton();
        SubmissionGlobalMeanRating = new javax.swing.JButton();
        MeanDeviationFAEGlobalMean = new javax.swing.JButton();
        MeanDeviationVsTValueFAE = new javax.swing.JButton();
        Diff2FAEDeviationRating = new javax.swing.JButton();
        logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DefineFAE.setText("Define FAE");
        DefineFAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefineFAEActionPerformed(evt);
            }
        });

        CreateEvent.setText("Create Event");
        CreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEventActionPerformed(evt);
            }
        });

        DecideApplication.setText("Decide Application");
        DecideApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecideApplicationActionPerformed(evt);
            }
        });

        SubmitApplication.setText("Submit Application");
        SubmitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitApplicationActionPerformed(evt);
            }
        });

        ChangeApplication.setText("Change/Remove Application");
        ChangeApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeApplicationActionPerformed(evt);
            }
        });

        createStand.setText("Create Stands");
        createStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStandActionPerformed(evt);
            }
        });

        AssignStand.setText("Assign Stand to Application");
        AssignStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignStandActionPerformed(evt);
            }
        });

        ListApplications.setText("List Applications");
        ListApplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListApplicationsActionPerformed(evt);
            }
        });

        ExportAllData.setText("Expor All Data to File");
        ExportAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportAllDataActionPerformed(evt);
            }
        });

        ImportAllData.setText("Import All Data from a File");
        ImportAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportAllDataActionPerformed(evt);
            }
        });

        ImportEventData.setText("Impor All Event Data from a File");

        EventSubmissionKeywords.setText(" Event Submission Keywords");
        EventSubmissionKeywords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventSubmissionKeywordsActionPerformed(evt);
            }
        });

        EventAcceptanceRate.setText(" Event Acceptance rate");
        EventAcceptanceRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventAcceptanceRateActionPerformed(evt);
            }
        });

        EventStandsInformation.setText("Event Stands Information");

        GlobalAcceptanceRate.setText("Global Acceptance rate");
        GlobalAcceptanceRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GlobalAcceptanceRateActionPerformed(evt);
            }
        });

        EventAcceptance50.setText("Event acceptance rate >50%?");
        EventAcceptance50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventAcceptance50ActionPerformed(evt);
            }
        });

        Diff2EventsAcceptanceRate.setText("Diff between 2 Events acceptance rate");
        Diff2EventsAcceptanceRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diff2EventsAcceptanceRateActionPerformed(evt);
            }
        });

        FAEMeanRating.setText("FAE mean rating");
        FAEMeanRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAEMeanRatingActionPerformed(evt);
            }
        });

        SubmissionGlobalMeanRating.setText("Submission global mean rating");

        MeanDeviationFAEGlobalMean.setText("Mean deviation between FAE avg rating and global mean rating");

        MeanDeviationVsTValueFAE.setText("Diff between mean deviation and T value for FAE avg rating");

        Diff2FAEDeviationRating.setText("Diff between 2 FAE deviation rating");
        Diff2FAEDeviationRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diff2FAEDeviationRatingActionPerformed(evt);
            }
        });

        logOut.setText("LogOut");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SubmissionGlobalMeanRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Diff2EventsAcceptanceRate, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(DefineFAE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DecideApplication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitApplication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChangeApplication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createStand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AssignStand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListApplications, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Diff2FAEDeviationRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ImportAllData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImportEventData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventSubmissionKeywords, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventAcceptanceRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventStandsInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GlobalAcceptanceRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventAcceptance50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MeanDeviationFAEGlobalMean, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(MeanDeviationVsTValueFAE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FAEMeanRating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExportAllData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(logOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateEvent)
                    .addComponent(ExportAllData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefineFAE)
                    .addComponent(ImportAllData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DecideApplication)
                    .addComponent(ImportEventData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitApplication)
                    .addComponent(EventSubmissionKeywords))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeApplication)
                    .addComponent(EventAcceptanceRate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createStand)
                    .addComponent(EventStandsInformation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AssignStand)
                    .addComponent(GlobalAcceptanceRate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListApplications)
                    .addComponent(EventAcceptance50))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Diff2EventsAcceptanceRate)
                    .addComponent(FAEMeanRating))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmissionGlobalMeanRating)
                    .addComponent(MeanDeviationFAEGlobalMean))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MeanDeviationVsTValueFAE)
                    .addComponent(Diff2FAEDeviationRating))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(logOut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEventActionPerformed
//        CreateEventMain createEvent = new CreateEventMain();
//        createEvent.setVisible(true);
//        dispose();
    }//GEN-LAST:event_CreateEventActionPerformed

    private void Diff2EventsAcceptanceRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diff2EventsAcceptanceRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Diff2EventsAcceptanceRateActionPerformed

    private void DefineFAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefineFAEActionPerformed
        DefineFAEMainUI defineFAEUI = new DefineFAEMainUI();
        defineFAEUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_DefineFAEActionPerformed

    private void DecideApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecideApplicationActionPerformed
        DecideApplicationMainUI decideApplication = new DecideApplicationMainUI();
        decideApplication.setVisible(true);
        dispose();
    }//GEN-LAST:event_DecideApplicationActionPerformed

    private void SubmitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitApplicationActionPerformed
        SubmitApplicationMainUI submitApplicationMain = new SubmitApplicationMainUI();
        submitApplicationMain.setVisible(true);
        dispose();
    }//GEN-LAST:event_SubmitApplicationActionPerformed

    private void ChangeApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeApplicationActionPerformed
        EditApplicationMainUI editApplication = new EditApplicationMainUI();
        editApplication.setVisible(true);
        dispose();
    }//GEN-LAST:event_ChangeApplicationActionPerformed

    private void createStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStandActionPerformed
        CreateStandMainUI createStand = new CreateStandMainUI(fc,user);
        createStand.setVisible(true);
        dispose();
    }//GEN-LAST:event_createStandActionPerformed

    private void AssignStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignStandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignStandActionPerformed

    private void ExportAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportAllDataActionPerformed
        ExportAllDataMainUI exportData = new ExportAllDataMainUI();
        exportData.setVisible(true);
        dispose();    }//GEN-LAST:event_ExportAllDataActionPerformed

    private void EventAcceptanceRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventAcceptanceRateActionPerformed
        ShowEventAcceptanceRateMainUI acceptanceRate = new ShowEventAcceptanceRateMainUI();
        acceptanceRate.setVisible(true);
        dispose();
    }//GEN-LAST:event_EventAcceptanceRateActionPerformed

    private void ListApplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListApplicationsActionPerformed
        ListApplicationsMainWindow listApplications = new ListApplicationsMainWindow(fc, user);
        listApplications.setVisible(true);
        dispose();
        try {
            listApplicationController.isOrganizer((Organizer) user);
        } catch (DontHavePermissionException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "You don't have permission to acess this topic.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ListApplicationsActionPerformed

    private void EventSubmissionKeywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventSubmissionKeywordsActionPerformed
//        ShowEventKeywordsWindow showKeywords = new ShowEventKeywordsWindow();
//        showKeywords.setVisible(true);
//        dispose();
    }//GEN-LAST:event_EventSubmissionKeywordsActionPerformed

    private void EventAcceptance50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventAcceptance50ActionPerformed
        AcceptanceRateOver50 acceptanceRateOver50 = new AcceptanceRateOver50();
        acceptanceRateOver50.setVisible(true);
        dispose();
    }//GEN-LAST:event_EventAcceptance50ActionPerformed

    private void Diff2FAEDeviationRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diff2FAEDeviationRatingActionPerformed
        DifferenceTwoFAEDeviation FAEDeviation = new DifferenceTwoFAEDeviation();
        FAEDeviation.setVisible(true);
        dispose();
    }//GEN-LAST:event_Diff2FAEDeviationRatingActionPerformed

    private void ImportAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportAllDataActionPerformed
        ImportFileMainUI importFile = new ImportFileMainUI(fc,user);
        importFile.setVisible(true);
        dispose();
    }//GEN-LAST:event_ImportAllDataActionPerformed

    private void FAEMeanRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAEMeanRatingActionPerformed
        ShowFaeMeanRatingMainUI faeMeanRating = new ShowFaeMeanRatingMainUI();
        faeMeanRating.setVisible(true);
        dispose();
    }//GEN-LAST:event_FAEMeanRatingActionPerformed

    private void GlobalAcceptanceRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GlobalAcceptanceRateActionPerformed
//        ShowGlobalAcceptanceRateMainUI globalAcceptanceRate = new ShowGlobalAcceptanceRateMainUI();
//        globalAcceptanceRate.setVisible(true);
//        dispose();
    }//GEN-LAST:event_GlobalAcceptanceRateActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LogInWindow logIn = new LogInWindow(fc);
        logIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignStand;
    private javax.swing.JButton ChangeApplication;
    private javax.swing.JButton CreateEvent;
    private javax.swing.JButton DecideApplication;
    private javax.swing.JButton DefineFAE;
    private javax.swing.JButton Diff2EventsAcceptanceRate;
    private javax.swing.JButton Diff2FAEDeviationRating;
    private javax.swing.JButton EventAcceptance50;
    private javax.swing.JButton EventAcceptanceRate;
    private javax.swing.JButton EventStandsInformation;
    private javax.swing.JButton EventSubmissionKeywords;
    private javax.swing.JButton ExportAllData;
    private javax.swing.JButton FAEMeanRating;
    private javax.swing.JButton GlobalAcceptanceRate;
    private javax.swing.JButton ImportAllData;
    private javax.swing.JButton ImportEventData;
    private javax.swing.JButton ListApplications;
    private javax.swing.JButton MeanDeviationFAEGlobalMean;
    private javax.swing.JButton MeanDeviationVsTValueFAE;
    private javax.swing.JButton SubmissionGlobalMeanRating;
    private javax.swing.JButton SubmitApplication;
    private javax.swing.JButton createStand;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
