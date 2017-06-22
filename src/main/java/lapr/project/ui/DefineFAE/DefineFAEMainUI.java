/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui.DefineFAE;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import lapr.project.controller.DefineFAEController;
import lapr.project.model.Event;
import lapr.project.model.FAE;
import lapr.project.model.FAEList;
import lapr.project.model.User;

/**
 *
 * @author João Domingues
 */
public class DefineFAEMainUI extends javax.swing.JFrame {

    private static final long serialVersionUID = -2218373573308231822L;

    DefineFAEController controller;
    DefaultListModel modelEvents;
    DefaultListModel modelUsers;
    DefaultListModel modelFaes;
    JFrame parent;

    /**
     * Creates new form DefineFAEMainUI param controller
     */
    public DefineFAEMainUI(JFrame parent, DefineFAEController controller) {
        this.controller = controller;
        this.parent = parent;
        initComponents();
        ListModel model = new DefaultListModel();
        this.listEvent.setModel(model);
        prepareEventsList();
        setLocationRelativeTo(null);
        pack();
        this.setVisible(true);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }

        });

    }

    /**
     * Creates new form ChanceApplicationMainUI
     */
    private DefineFAEMainUI() {
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

    private void btnConfirmOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOperationActionPerformed
        if (listFAE.getModel().getSize() > 0) {
            JOptionPane.showMessageDialog(null, "FAE successfully defined!");
            dispose();
            parent.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "FAE was not defined successfully!");
        }
    }//GEN-LAST:event_btnConfirmOperationActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        close();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void confirmEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEventActionPerformed
        int selectedindex = listEvent.getSelectedIndex();
        if (selectedindex != -1) {
            listEvent.setEnabled(false);
            confirmEvent.setEnabled(false);
            controller.setEventSelect(controller.getEventsRegist().getEventList().get(selectedindex));
            prepareUsersList();
        }
    }//GEN-LAST:event_confirmEventActionPerformed

    private void confirmUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUserActionPerformed
        int selectedindex = listUser.getSelectedIndex();
        if (selectedindex != -1) {
            listUser.setEnabled(false);
            controller.setUserSelect(controller.getUsersList().get(selectedindex));
            this.listUser.setEnabled(false);
            this.confirmUser.setEnabled(false);
            prepareFAEList();
        }
    }//GEN-LAST:event_confirmUserActionPerformed
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
            java.util.logging.Logger.getLogger(DefineFAEMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefineFAEMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefineFAEMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefineFAEMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefineFAEMainUI().setVisible(true);
            }
        });
    }
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
    private javax.swing.JList<Event> listEvent;
    private javax.swing.JList<FAE> listFAE;
    private javax.swing.JList<User> listUser;
    // End of variables declaration//GEN-END:variables

    private void prepareEventsList() {
        List<Event> events = this.controller.getEventsRegist().getEventList();
        modelEvents = new DefaultListModel();
        for (Event event : events) {
            modelEvents.addElement(event);
        }
        this.listEvent.setModel(modelEvents);
    }

    private void prepareUsersList() {
        List<User> users = this.controller.generateUsersList(this.controller.getEventSelect());
        modelUsers = new DefaultListModel();
        for (User u : users) {
            modelUsers.addElement(u);
        }
        this.listUser.setModel(modelUsers);
        this.listUser.setEnabled(true);
        this.confirmUser.setEnabled(true);
    }

    private void prepareFAEList() {
        User u = this.controller.getUserSelected();
        Event e = this.controller.getEventSelect();

        controller.addFAE(u, e);

        List<FAE> faeslist = this.controller.getFAEList();

        modelFaes = new DefaultListModel();
        for (FAE faelist : faeslist) {
            modelFaes.addElement(faeslist);
        }
        this.listFAE.setModel(modelFaes);
        this.btnConfirmOperation.setEnabled(true);

    }

    private void close() {
        String[] opYesNo = {"Yes", "No"};
        int answer = JOptionPane.showOptionDialog(this,
                "Do you want to cancel the Define FAE process?",
                "Application of Lapr",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opYesNo,
                opYesNo[1]);

        final int Yes = 0;
        if (answer == Yes) {
            dispose();
            parent.setVisible(true);
        } else {

        }
    }

}
