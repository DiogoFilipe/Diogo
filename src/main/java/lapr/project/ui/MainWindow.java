/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JOptionPane;
import lapr.project.model.FairCenter;
import lapr.project.model.User;
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
    FairCenter fc;

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeApplication)
                            .addComponent(createStand)
                            .addComponent(assignStand)
                            .addComponent(listApplications))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defineFAE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(importEventData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(decideApplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eventSubmissionKeywords))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitApplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eventAcceptanceRate)))
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
                    .addComponent(eventAcceptanceRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeApplication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createStand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignStand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listApplications)
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
        try {
            fc.getEventManagerList().isEventManager(u);
            CreateEventMain createEvent = new CreateEventMain(fc, u);
            createEvent.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_createEventActionPerformed

    private void defineFAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineFAEActionPerformed
        try {
            fc.getFAEList().isFAE(u);
            DefineFAEMainUI defineFAE = new DefineFAEMainUI(fc, u);
            defineFAE.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_defineFAEActionPerformed

    private void decideApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decideApplicationActionPerformed
        try {
            fc.isFAEOrOrganizer(u);
            DecideApplicationMainUI decideApplication = new DecideApplicationMainUI(fc, u);
            decideApplication.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_decideApplicationActionPerformed

    private void submitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitApplicationActionPerformed
        try {
            fc.isRepresentative(u);
            SubmitApplicationMainUI submitApplication = new SubmitApplicationMainUI(fc, u);
            submitApplication.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_submitApplicationActionPerformed

    private void changeApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeApplicationActionPerformed
        try {
            fc.isRepresentative(u);
            ChangeApplicationMainWindow changeApplication = new ChangeApplicationMainWindow(fc, u);
            changeApplication.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_changeApplicationActionPerformed

    private void createStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStandActionPerformed
        try {
            fc.isOrganizer(u);
            CreateStandMainUI createStand = new CreateStandMainUI(fc, u);
            createStand.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_createStandActionPerformed

    private void assignStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignStandActionPerformed
        try {
            fc.isOrganizer(u);
            AssignStandsMainUI assignStand = new AssignStandsMainUI(fc, u);
            assignStand.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_assignStandActionPerformed

    private void listApplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listApplicationsActionPerformed
        try {
            fc.isOrganizer(u);
            ListApplicationsMainWindow listApplications = new ListApplicationsMainWindow(fc, u);
            listApplications.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_listApplicationsActionPerformed

    private void exportAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAllDataActionPerformed
        try {
            fc.isOrganizer(u);
            ExportAllDataMainUI exportData = new ExportAllDataMainUI(fc, u);
            exportData.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_exportAllDataActionPerformed

    private void importEventDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importEventDataActionPerformed
        try {
            fc.isOrganizer(u);
            ImportFileMainUI importMain = new ImportFileMainUI(fc, u);
            importMain.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_importEventDataActionPerformed

    private void eventSubmissionKeywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventSubmissionKeywordsActionPerformed

            
        
    }//GEN-LAST:event_eventSubmissionKeywordsActionPerformed

    private void eventAcceptanceRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventAcceptanceRateActionPerformed
        try{
            fc.isEventManager(u);
            EventAcceptanceRateMainUI eventAcceptanceRate = new EventAcceptanceRateMainUI(fc,u);
            eventAcceptanceRate.setVisible(true);
            dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(MainWindow.this, "You don't have permission to access this topic");
        }
    }//GEN-LAST:event_eventAcceptanceRateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignStand;
    private javax.swing.JButton changeApplication;
    private javax.swing.JButton createEvent;
    private javax.swing.JButton createStand;
    private javax.swing.JButton decideApplication;
    private javax.swing.JButton defineFAE;
    private javax.swing.JButton eventAcceptanceRate;
    private javax.swing.JButton eventSubmissionKeywords;
    private javax.swing.JButton exportAllData;
    private javax.swing.JButton importEventData;
    private javax.swing.JButton listApplications;
    private javax.swing.JButton logOut;
    private javax.swing.JButton submitApplication;
    // End of variables declaration//GEN-END:variables
}
