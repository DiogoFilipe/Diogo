/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JOptionPane;
import lapr.project.model.FairCenter;
import lapr.project.model.User;
import lapr.project.ui.AcceptanceRate50.AcceptanceRateOver50;
import lapr.project.ui.AssignStands.AssignStandsMainUI;
import lapr.project.ui.ChangeApplication.ChangeApplicationMainWindow;
import lapr.project.ui.CreateEvent.CreateEventMain;
import lapr.project.ui.CreateStand.CreateStandMainUI;
import lapr.project.ui.DecideApplication.DecideApplicationMainUI;
import lapr.project.ui.DefineFAE.DefineFAEMainUI;
import lapr.project.ui.EventGlobalAcceptanceRate.EventAcceptanceRateMainUI;
import lapr.project.ui.ExportAllData.ExportAllDataMainUI;
import lapr.project.ui.ImportFile.ImportFileMainUI;
import lapr.project.ui.ListApplications.ListApplicationsMainWindow;
import lapr.project.ui.ShowEventKeywords.ShowEventKeywordsWindow;
import lapr.project.ui.ShowEventStandsInformation.ShowEventStandsInformationUI;
import lapr.project.ui.ShowFaeMeanRating.ShowFaeMeanRatingMainUI;
import lapr.project.ui.ShowGlobalAcceptanceRate.ShowGlobalAcceptanceRateWindow;
import lapr.project.ui.SubmitApplication.SubmitApplicationMainUI;
import lapr.project.utils.DontHavePermissionException;

/**
 *
 * @author Diogo
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * serial version
     */
    private static final long serialVersionUID = -570279213872066293L;

    /**
     * fair center
     */
    private FairCenter fc;

    /**
     * user
     */
    private User u;

    /**
     * Creates new form MainWindow
     *
     * @param fc faircenter
     * @param u user
     */
    public MainWindow(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(MainWindow.this, "Do you want to close the application?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logOut = new javax.swing.JButton();
        createEvent = new javax.swing.JButton();
        defineFAE = new javax.swing.JButton();
        decideApplication = new javax.swing.JButton();
        submitApplication = new javax.swing.JButton();
        changeApplication = new javax.swing.JButton();
        createStand = new javax.swing.JButton();
        assignStand = new javax.swing.JButton();
        listApplications = new javax.swing.JButton();
        exportAllData = new javax.swing.JButton();
        importEventData = new javax.swing.JButton();
        eventSubmissionKeywords = new javax.swing.JButton();
        eventAcceptanceRate = new javax.swing.JButton();
        standsInformation = new javax.swing.JButton();
        globalRate = new javax.swing.JButton();
        Acceptance50 = new javax.swing.JButton();
        FAEMeanRating = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logOut.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logOut.setText("LogOut");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        createEvent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        createEvent.setText("Create Event");
        createEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventActionPerformed(evt);
            }
        });

        defineFAE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        defineFAE.setText("Define FAE");
        defineFAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineFAEActionPerformed(evt);
            }
        });

        decideApplication.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        decideApplication.setText("Decide Application");
        decideApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decideApplicationActionPerformed(evt);
            }
        });

        submitApplication.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitApplication.setText("Submit Application");
        submitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitApplicationActionPerformed(evt);
            }
        });

        changeApplication.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        changeApplication.setText("Change Application");
        changeApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeApplicationActionPerformed(evt);
            }
        });

        createStand.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        createStand.setText("Create Stand");
        createStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStandActionPerformed(evt);
            }
        });

        assignStand.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        assignStand.setText("Assign Stand ");
        assignStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignStandActionPerformed(evt);
            }
        });

        listApplications.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        listApplications.setText("List Applications");
        listApplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listApplicationsActionPerformed(evt);
            }
        });

        exportAllData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exportAllData.setText("Export All Data To File");
        exportAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportAllDataActionPerformed(evt);
            }
        });

        importEventData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        importEventData.setText("Import Event Data");
        importEventData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importEventDataActionPerformed(evt);
            }
        });

        eventSubmissionKeywords.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eventSubmissionKeywords.setText("Event Submission Keywords");
        eventSubmissionKeywords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventSubmissionKeywordsActionPerformed(evt);
            }
        });

        eventAcceptanceRate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eventAcceptanceRate.setText("Event Acceptance Rate");
        eventAcceptanceRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventAcceptanceRateActionPerformed(evt);
            }
        });

        standsInformation.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        standsInformation.setText("Event Stands Information");
        standsInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standsInformationActionPerformed(evt);
            }
        });

        globalRate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        globalRate.setText("Global Acceptance Rate");
        globalRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                globalRateActionPerformed(evt);
            }
        });

        Acceptance50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Acceptance50.setText("Acceptance Rate >50%?");
        Acceptance50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acceptance50ActionPerformed(evt);
            }
        });

        FAEMeanRating.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FAEMeanRating.setText("FAE mean rating");
        FAEMeanRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAEMeanRatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 447, Short.MAX_VALUE)
                .addComponent(logOut)
                .addGap(392, 392, 392))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportAllData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defineFAE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(importEventData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(decideApplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eventSubmissionKeywords))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changeApplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eventAcceptanceRate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitApplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(standsInformation))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listApplications)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FAEMeanRating))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createStand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(globalRate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignStand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Acceptance50)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createEvent)
                    .addComponent(exportAllData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defineFAE)
                    .addComponent(importEventData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decideApplication)
                    .addComponent(eventSubmissionKeywords))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitApplication)
                    .addComponent(standsInformation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeApplication)
                    .addComponent(eventAcceptanceRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createStand)
                    .addComponent(globalRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignStand)
                    .addComponent(Acceptance50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listApplications)
                    .addComponent(FAEMeanRating))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(logOut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LogInWindow logIn = new LogInWindow(fc);
        logIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void createEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventActionPerformed
        CreateEventMain event = new CreateEventMain(fc, u);
        event.setVisible(true);
        dispose();

    }//GEN-LAST:event_createEventActionPerformed

    private void defineFAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineFAEActionPerformed

        DefineFAEMainUI defineFAE = new DefineFAEMainUI(fc, u);
        defineFAE.setVisible(true);
        dispose();
    }//GEN-LAST:event_defineFAEActionPerformed

    private void decideApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decideApplicationActionPerformed

        DecideApplicationMainUI decideApplication = new DecideApplicationMainUI(fc, u);
        decideApplication.setVisible(true);
        dispose();

    }//GEN-LAST:event_decideApplicationActionPerformed

    private void submitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitApplicationActionPerformed

        SubmitApplicationMainUI submitApplication = new SubmitApplicationMainUI(fc, u);
        submitApplication.setVisible(true);
        dispose();

    }//GEN-LAST:event_submitApplicationActionPerformed

    private void changeApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeApplicationActionPerformed

        ChangeApplicationMainWindow changeApplication = new ChangeApplicationMainWindow(fc, u);
        changeApplication.setVisible(true);
        dispose();

    }//GEN-LAST:event_changeApplicationActionPerformed

    private void createStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStandActionPerformed
        CreateStandMainUI createStand = new CreateStandMainUI(fc, u);
        createStand.setVisible(true);
        dispose();

    }//GEN-LAST:event_createStandActionPerformed

    private void assignStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignStandActionPerformed

        AssignStandsMainUI assignStand = new AssignStandsMainUI(fc, u);
        assignStand.setVisible(true);
        dispose();

    }//GEN-LAST:event_assignStandActionPerformed

    private void listApplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listApplicationsActionPerformed

        ListApplicationsMainWindow listApplications = new ListApplicationsMainWindow(fc, u);
        listApplications.setVisible(true);
        dispose();

    }//GEN-LAST:event_listApplicationsActionPerformed

    private void exportAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAllDataActionPerformed

        ExportAllDataMainUI exportData = new ExportAllDataMainUI(fc, u);
        exportData.setVisible(true);
        dispose();
    }//GEN-LAST:event_exportAllDataActionPerformed

    private void importEventDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importEventDataActionPerformed

        ImportFileMainUI importMain = new ImportFileMainUI(fc, u);
        importMain.setVisible(true);
        dispose();
    }//GEN-LAST:event_importEventDataActionPerformed

    private void eventSubmissionKeywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventSubmissionKeywordsActionPerformed

        ShowEventKeywordsWindow eventKeywords = new ShowEventKeywordsWindow(fc, u);
        eventKeywords.setVisible(true);
        dispose();


    }//GEN-LAST:event_eventSubmissionKeywordsActionPerformed

    private void eventAcceptanceRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventAcceptanceRateActionPerformed

        EventAcceptanceRateMainUI eventAcceptanceRate = new EventAcceptanceRateMainUI(fc, u);
        eventAcceptanceRate.setVisible(true);
        dispose();
    }//GEN-LAST:event_eventAcceptanceRateActionPerformed

    private void standsInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standsInformationActionPerformed
        ShowEventStandsInformationUI showStands = new ShowEventStandsInformationUI(fc, u);
        showStands.setVisible(true);
        dispose();
    }//GEN-LAST:event_standsInformationActionPerformed

    private void globalRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_globalRateActionPerformed

        ShowGlobalAcceptanceRateWindow globalRate = new ShowGlobalAcceptanceRateWindow(fc, u);
        globalRate.setVisible(true);
        dispose();
    }//GEN-LAST:event_globalRateActionPerformed

    private void FAEMeanRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAEMeanRatingActionPerformed

        ShowFaeMeanRatingMainUI FAEMeanRating = new ShowFaeMeanRatingMainUI(fc, u);
        FAEMeanRating.setVisible(true);
        dispose();
    }//GEN-LAST:event_FAEMeanRatingActionPerformed

    private void Acceptance50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acceptance50ActionPerformed

        AcceptanceRateOver50 acceptanceRate50 = new AcceptanceRateOver50(fc, u);
        acceptanceRate50.setVisible(true);
        dispose();
    }//GEN-LAST:event_Acceptance50ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceptance50;
    private javax.swing.JButton FAEMeanRating;
    private javax.swing.JButton assignStand;
    private javax.swing.JButton changeApplication;
    private javax.swing.JButton createEvent;
    private javax.swing.JButton createStand;
    private javax.swing.JButton decideApplication;
    private javax.swing.JButton defineFAE;
    private javax.swing.JButton eventAcceptanceRate;
    private javax.swing.JButton eventSubmissionKeywords;
    private javax.swing.JButton exportAllData;
    private javax.swing.JButton globalRate;
    private javax.swing.JButton importEventData;
    private javax.swing.JButton listApplications;
    private javax.swing.JButton logOut;
    private javax.swing.JButton standsInformation;
    private javax.swing.JButton submitApplication;
    // End of variables declaration//GEN-END:variables
}
