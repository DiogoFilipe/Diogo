/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui.DefineFAE;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import lapr.project.controller.DefineFAEController;
import lapr.project.model.Event;
import lapr.project.model.FAE;
import lapr.project.model.FairCenter;
import lapr.project.model.User;
import lapr.project.ui.MainWindow;

/**
 *
 * @author João Domingues
 */
public class DefineFAEMainUI extends javax.swing.JFrame {
    
    private static final long serialVersionUID = 12175969L;

    /**
     * controller
     */
    DefineFAEController controller;
    
    /**
     * model to jList with events
     */
    private DefaultListModel<String> modelEvents;
    
    /**
     * model to jList with users
     */
    private DefaultListModel<String> modelUsers;
    
    /**
     * model to jLst with fae
     */
    private DefaultListModel<String> modelFaes;

    /**
     * fair center
     */
    private FairCenter fc;
    
    /**
     * user
     */
    private User u;
    
    private DefaultListModel<String> model;

    /**
     * Creates new form DefineFAEMainUI param controller
     *
     * @param fc fair center
     * @param u user
     */
    public DefineFAEMainUI(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
        controller = new DefineFAEController(fc, u);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(DefineFAEMainUI.this, "Do you want to close the application?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }

        });
        initComponents();
        model = new DefaultListModel<>();
        listEvent.setModel(model);
        prepareEventsList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEvent = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listUser = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listFAE = new javax.swing.JList<>();
        confirmEvent = new javax.swing.JButton();
        confirmUser = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnConfirmOperation = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Select an Event");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("User");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("FAE");

        jScrollPane1.setViewportView(listEvent);

        jScrollPane2.setViewportView(listUser);

        jScrollPane3.setViewportView(listFAE);

        confirmEvent.setText("Confirm Event");
        confirmEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEventActionPerformed(evt);
            }
        });

        confirmUser.setText("Confirm User");
        confirmUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUserActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnConfirmOperation.setText("Confirm");
        btnConfirmOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmOperationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmOperation)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(confirmEvent)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(confirmUser)
                        .addGap(174, 174, 174)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnConfirmOperation))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt click 
     */
    private void btnConfirmOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOperationActionPerformed
        if (listFAE.getModel().getSize() > 0) {
            JOptionPane.showMessageDialog(null, "FAE successfully defined!");
            MainWindow main = new MainWindow(fc, u);
            main.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "FAE was not defined successfully!");
        }
    }//GEN-LAST:event_btnConfirmOperationActionPerformed

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
    private void confirmEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEventActionPerformed
        int selectedindex = listEvent.getSelectedIndex();
        if (selectedindex != -1) {
            listEvent.setEnabled(false);
            confirmEvent.setEnabled(false);
            controller.setEventSelect(controller.getEventsRegist().getEventList().get(selectedindex));
            prepareUsersList();
        }
    }//GEN-LAST:event_confirmEventActionPerformed

    /**
     * 
     * @param evt click
     */
    private void confirmUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUserActionPerformed
        int selectedindex = listUser.getSelectedIndex();
        if (selectedindex != -1) {
            listUser.setEnabled(false);
            this.listUser.setEnabled(false);
            this.confirmUser.setEnabled(false);
            prepareFAEList();
        }
    }//GEN-LAST:event_confirmUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmOperation;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton confirmEvent;
    private javax.swing.JButton confirmUser;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listEvent;
    private javax.swing.JList<String> listFAE;
    private javax.swing.JList<String> listUser;
    // End of variables declaration//GEN-END:variables

    /**
     * add events to the jList
     */
    private void prepareEventsList() {
        List<Event> events = this.controller.getEventsRegist().getEventList();
        modelEvents = new DefaultListModel<>();
        for (Event event : events) {
            modelEvents.addElement(event.getTitle());
        }
        this.listEvent.setModel(modelEvents);
    }

    /**
     * add users to the jList
     */
    private void prepareUsersList() {
        List<User> users = this.controller.generateUsersList(this.controller.getEventSelect());
        modelUsers = new DefaultListModel<>();
        for (User u : users) {
            modelUsers.addElement(u.getUsername());
        }
        this.listUser.setModel(modelUsers);
        this.listUser.setEnabled(true);
        this.confirmUser.setEnabled(true);
    }

    /**
     * add users(fae) to the JList
     */
    private void prepareFAEList() {
        int selectedindex = listUser.getSelectedIndex();
        User us = new User();
        String username = modelUsers.getElementAt(selectedindex);
        
        for (User user : fc.getUserRegist().getUserList()) {
            if(user.getName().equals(username)){
                us = user;
            }
            
        }
        Event e = this.controller.getEventSelect();

        
        FAE fae = new FAE(us);
        e.getFAEList().getFAEList().add(fae);
         
        modelFaes = new DefaultListModel<>();
      
        modelFaes.addElement(us.getUsername());
        this.listFAE.setModel(modelFaes);
        this.listFAE.setEnabled(true);
        this.btnConfirmOperation.setEnabled(true);

    }
}
