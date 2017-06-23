/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui.AssignStands;

import javax.swing.DefaultListModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import lapr.project.controller.AssignStandsController;
import lapr.project.model.Application;
import lapr.project.model.AssignStands;
import lapr.project.model.Event;
import lapr.project.model.FairCenter;
import lapr.project.model.Stand;
import lapr.project.model.User;
import lapr.project.ui.MainWindow;

/**
 *
 * @author João Domingues
 */
public class AssignStandsMainUI extends javax.swing.JFrame {
    
    /**
     * serial
     */
    private static final long serialVersionUID = 18372931L;

    /**
     * controller
     */
    AssignStandsController controller;

    /**
     * fc
     */
    private FairCenter fc;

    /**
     * user
     */
    private User u;

    /**
     * model to the jList of events
     */
    private DefaultListModel<String> modelEvents;

    /**
     * model to the jList of the applications
     */
    private DefaultListModel<String> modelApplications;
    
    /**
     * model to the jList of the stands
     */
    private DefaultListModel<String> modelStands;
    
    /**
     * model to the jList of the assignments
     */
    private DefaultListModel<String> modelAssignment;

    /**
     * param controller Creates new form DefineFAEMainUI param controller
     * @param fc fair center
     * @param u user
     */
    public AssignStandsMainUI(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(AssignStandsMainUI.this, "Do you want to close the application?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
        initComponents();
        DefaultListModel<String> model = new DefaultListModel<>();
        this.listEvent.setModel(model);
        prepareEventsList();
        pack();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEvent = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listApplication = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listStand = new javax.swing.JList<>();
        confirmEvent = new javax.swing.JButton();
        confirmApplication = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        confirmOperation = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listAssign = new javax.swing.JList<>();
        confirmStand = new javax.swing.JButton();
        newAssignment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Select an event");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Application");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Stand");

        jScrollPane1.setViewportView(listEvent);

        jScrollPane2.setViewportView(listApplication);

        jScrollPane3.setViewportView(listStand);

        confirmEvent.setText("Confirm Event");
        confirmEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEventActionPerformed(evt);
            }
        });

        confirmApplication.setText("ConfirmApplication");
        confirmApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmApplicationActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        confirmOperation.setText("Confirm");
        confirmOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOperationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Assignment List:");

        jScrollPane4.setViewportView(listAssign);

        confirmStand.setText("Confirm Stand");
        confirmStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmStandActionPerformed(evt);
            }
        });

        newAssignment.setText("New Assignment");
        newAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAssignmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(newAssignment))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmOperation))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmEvent)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(119, 119, 119)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmApplication)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(confirmStand))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(confirmEvent))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(confirmApplication)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmStand)
                                .addGap(18, 18, 18)
                                .addComponent(newAssignment)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReturn)
                            .addComponent(confirmOperation))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt click 
     */
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        MainWindow main = new MainWindow(fc,u);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void confirmOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOperationActionPerformed
        if (listAssign.getModel().getSize() > 0) {
            JOptionPane.showMessageDialog(null, "Assign Stands successfully defined!");
            MainWindow main = new MainWindow(fc,u);
            main.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Assign Stands was not defined successfully!");
        }
    }//GEN-LAST:event_confirmOperationActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void confirmEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEventActionPerformed
        int selectedindex = listEvent.getSelectedIndex();
        if (selectedindex != -1) {
            listEvent.setEnabled(false);
            confirmEvent.setEnabled(false);
            controller.setEventSelect(controller.getEventsList().get(selectedindex));
            prepareApplicationsList();
        }
    }//GEN-LAST:event_confirmEventActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void newAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAssignmentActionPerformed
        listApplication.setEnabled(true);
        listStand.setEnabled(true);
        this.confirmApplication.setEnabled(true);
        this.confirmStand.setEnabled(true);
        this.newAssignment.setEnabled(false);
    }//GEN-LAST:event_newAssignmentActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void confirmStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmStandActionPerformed
        int selectedindex = listStand.getSelectedIndex();
        if (selectedindex != -1) {
            listStand.setEnabled(false);
            controller.setStandSelect(controller.getStandsList().get(selectedindex));
            this.listStand.setEnabled(false);
            this.confirmStand.setEnabled(false);
            prepareAssignmentList();
        }
    }//GEN-LAST:event_confirmStandActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void confirmApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmApplicationActionPerformed
        int selectedindex = listApplication.getSelectedIndex();
        if (selectedindex != -1) {
            listApplication.setEnabled(false);
            controller.setApplicationSelect(controller.getAppicationsList().get(selectedindex));
            this.listApplication.setEnabled(false);
            this.confirmApplication.setEnabled(false);
            prepareStandList();
        }
    }//GEN-LAST:event_confirmApplicationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton confirmApplication;
    private javax.swing.JButton confirmEvent;
    private javax.swing.JButton confirmOperation;
    private javax.swing.JButton confirmStand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listApplication;
    private javax.swing.JList<String> listAssign;
    private javax.swing.JList<String> listEvent;
    private javax.swing.JList<String> listStand;
    private javax.swing.JButton newAssignment;
    // End of variables declaration//GEN-END:variables

    /**
     * sets the model for the list of events
     */
    private void prepareEventsList() {
        List<Event> events = this.controller.getEventsList();
        modelEvents = new DefaultListModel<>();
        for (Event event : events) {
            modelEvents.addElement(event.getTitle());
        }
        this.listEvent.setModel(modelEvents);
    }

    /**
     * sets the model for the list of applications
     */
    private void prepareApplicationsList() {
        List<Application> applications = this.controller.generateApplicationsList(this.controller.getEventSelect());
        modelApplications = new DefaultListModel<>();
        for (Application a : applications) {
            modelApplications.addElement(a.getCompanyName());
        }
        this.listApplication.setModel(modelApplications);
        this.listApplication.setEnabled(true);
        this.confirmApplication.setEnabled(true);
    }

    /**
     * stets the model for the list of stands
     */
    private void prepareStandList() {
        List<Stand> stands = this.controller.getStands(this.controller.getEventSelect());
        modelStands = new DefaultListModel<>();
        for (Stand s : stands) {
            modelStands.addElement(s.getID());
        }
        this.listStand.setModel(modelStands);
        this.listStand.setEnabled(true);
        this.confirmStand.setEnabled(true);
    }

    /**
     * prepars the assignment list model
     */
    private void prepareAssignmentList() {
        Stand stand = this.controller.getStandSelected();
        Application a = this.controller.getApplicationSelected();

        AssignStands as = this.controller.createAssignment(stand, a);

        boolean validate = this.controller.validate(as);

        controller.AssignStand(validate, as);

        List<AssignStands> assignstands = this.controller.getStandsAssigned();

        modelAssignment = new DefaultListModel<>();
        for (AssignStands astands : assignstands) {
            modelAssignment.addElement(astands.toString());
        }
        this.listAssign.setModel(modelAssignment);
        this.newAssignment.setEnabled(true);
        this.confirmOperation.setEnabled(true);
    }
}
