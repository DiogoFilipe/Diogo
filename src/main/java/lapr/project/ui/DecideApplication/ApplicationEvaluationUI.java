/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui.DecideApplication;

import javax.swing.JOptionPane;
import lapr.project.controller.DecideApplicationController;
import lapr.project.model.Decision;
import lapr.project.model.FAE;
import lapr.project.model.FairCenter;
import lapr.project.model.User;
import lapr.project.ui.MainWindow;
import lapr.project.utils.EmptySpaceException;

/**
 *
 * @author João Domingues
 */
public class ApplicationEvaluationUI extends javax.swing.JFrame {

    /**
     * serial version
     */
    private static final long serialVersionUID = 1127362L;
    
    /**
     * application company
     */
    private String application;
    
    /**
     * event title
     */
    private String event;

    /**
     * fair center
     */
    private FairCenter fc;
    
    /**
     * user
     */
    private User u;

    /**
     * controller
     */
    DecideApplicationController controller;

    /**
     * 
     * @param fc fair center
     * @param u user
     * @param event event title
     * @param application application company
     */
    public ApplicationEvaluationUI(FairCenter fc, User u, String event, String application) {
        this.fc = fc;
        this.u = u;
        this.event = event;
        this.application = application;
        controller = new DecideApplicationController(fc, u);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(ApplicationEvaluationUI.this, "Do you want to close the application?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("       Evaluation");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton1.setText("0");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton2.setText("1");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton3.setText("2");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton4.setText("0");

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton5.setText("0");

        buttonGroup4.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton6.setText("0");

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton7.setText("1");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton8.setText("1");

        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton9.setText("1");

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton10.setText("2");

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton11.setText("2");

        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton12.setText("2");

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton13.setText("3");

        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton14.setText("3");

        buttonGroup3.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton15.setText("3");

        buttonGroup4.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton16.setText("3");

        buttonGroup1.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton17.setText("4");

        buttonGroup2.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton18.setText("4");

        buttonGroup3.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton19.setText("4");

        buttonGroup4.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton20.setText("4");

        buttonGroup1.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton21.setText("5");

        buttonGroup2.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton22.setText("5");

        buttonGroup3.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton23.setText("5");

        buttonGroup4.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton24.setText("5");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Knowledge about the event topic:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Application adequacy for the event:  ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Invitation quantity adequacy: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Overall recommendation:");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton18)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton21))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton17)
                            .addComponent(jRadioButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton18)
                            .addComponent(jRadioButton22)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton23))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton24))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt click 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int knowledgeTopic = Integer.parseInt(buttonGroup1.getSelection().toString());
            controller.validateNumber(knowledgeTopic, "knowledge topic");
            int adequacy = Integer.parseInt(buttonGroup2.getSelection().toString());
            controller.validateNumber(adequacy, "adequacy");
            int invitationQuantity = Integer.parseInt(buttonGroup3.getSelection().toString());
            controller.validateNumber(invitationQuantity, "invitation quantity");
            int overall = Integer.parseInt(buttonGroup4.getSelection().toString());
            controller.validateNumber(overall, "overall");
            Decision d = new Decision(knowledgeTopic, adequacy, invitationQuantity, overall);
            ((FAE) u).getDecisionList().getDecisionList().add(d);
            JOptionPane.showMessageDialog(ApplicationEvaluationUI.this, "Application evaluated with success", "SUCCESS", JOptionPane.DEFAULT_OPTION);
        } catch (EmptySpaceException e) {
            JOptionPane.showMessageDialog(ApplicationEvaluationUI.this, e.getMessage());
        }
        MainWindow mainWindow = new MainWindow(fc, u);
        mainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SelectApplicationUI decideApplication = new SelectApplicationUI(fc, u, event);
        decideApplication.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
