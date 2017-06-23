/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.JOptionPane;
import lapr.project.model.FairCenter;
import lapr.project.model.User;
import lapr.project.ui.CreateEvent.CreateEventMain;
import lapr.project.ui.DecideApplication.DecideApplicationMainUI;
import lapr.project.ui.DefineFAE.DefineFAEMainUI;
import lapr.project.ui.SubmitApplication.SubmitApplicationMainUI;

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(logOut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createEvent))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(defineFAE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(decideApplication))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submitApplication)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(createEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(defineFAE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decideApplication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitApplication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
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
            JOptionPane.showMessageDialog(MainWindow.this, e.getMessage());
        }
    }//GEN-LAST:event_createEventActionPerformed

    private void defineFAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineFAEActionPerformed
        try {
            fc.getFAEList().isFAE(u);
            DefineFAEMainUI defineFAE = new DefineFAEMainUI(fc, u);
            defineFAE.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.this, e.getMessage());
        }
    }//GEN-LAST:event_defineFAEActionPerformed

    private void decideApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decideApplicationActionPerformed
        try{
            fc.isFAEOrOrganizer(u);
            DecideApplicationMainUI decideApplication = new DecideApplicationMainUI(fc,u);
            decideApplication.setVisible(true);
            dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(MainWindow.this,e.getMessage());
        }
    }//GEN-LAST:event_decideApplicationActionPerformed

    private void submitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitApplicationActionPerformed
       try{
           fc.isRepresentative(u);
           SubmitApplicationMainUI submitApplication = new SubmitApplicationMainUI(fc,u);
           submitApplication.setVisible(true);
           dispose();
       }catch(Exception e){
           JOptionPane.showMessageDialog(MainWindow.this, e.getMessage());
       }
    }//GEN-LAST:event_submitApplicationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEvent;
    private javax.swing.JButton decideApplication;
    private javax.swing.JButton defineFAE;
    private javax.swing.JButton logOut;
    private javax.swing.JButton submitApplication;
    // End of variables declaration//GEN-END:variables
}
