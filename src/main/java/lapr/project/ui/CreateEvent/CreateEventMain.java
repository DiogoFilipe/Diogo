/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui.CreateEvent;

import lapr.project.model.Event;
import lapr.project.model.FairCenter;
import lapr.project.ui.MainWindow;
import lapr.project.utils.Date;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class CreateEventMain extends javax.swing.JFrame {

    FairCenter fc;
    private Event event;
      
    /**
     * Creates new form CreateEventMain
     */
    public CreateEventMain() {
       
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
        jPanel1 = new javax.swing.JPanel();
        TypeLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TitleLabel = new javax.swing.JLabel();
        TitleInputTextField = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        StartDateLabel = new javax.swing.JLabel();
        StartDateInputTextField = new javax.swing.JTextField();
        EndDateLabel = new javax.swing.JLabel();
        EndDateInputTextField = new javax.swing.JTextField();
        StartSubDateLabel = new javax.swing.JLabel();
        StartSubDateInputTextField = new javax.swing.JTextField();
        EndSubDateLabel = new javax.swing.JLabel();
        EndSubDateInputTextField = new javax.swing.JTextField();
        OkButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        DescriptionInputTextField = new javax.swing.JTextField();
        PlaceLabel = new javax.swing.JLabel();
        PlaceInputTextField = new javax.swing.JTextField();
        DataFormatNoteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrganizerList = new javax.swing.JList<>();
        AddOrganizerButton = new javax.swing.JButton();
        RemoveOrganizer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChosenOrganizerList = new javax.swing.JList<>();
        OrganizerNoteLabel = new javax.swing.JLabel();

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

        TypeLabel.setText("Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Congress", "Exhibition" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TitleLabel.setText("Title");

        TitleInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleInputTextFieldActionPerformed(evt);
            }
        });

        DescriptionLabel.setText("Description");

        StartDateLabel.setText("Start Date");

        StartDateInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateInputTextFieldActionPerformed(evt);
            }
        });

        EndDateLabel.setText("End Date");

        EndDateInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateInputTextFieldActionPerformed(evt);
            }
        });

        StartSubDateLabel.setText("Start Submission Date");

        StartSubDateInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartSubDateInputTextFieldActionPerformed(evt);
            }
        });

        EndSubDateLabel.setText("End Submission Date ");

        EndSubDateInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndSubDateInputTextFieldActionPerformed(evt);
            }
        });

        OkButton.setText("Create");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DescriptionInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionInputTextFieldActionPerformed(evt);
            }
        });

        PlaceLabel.setText("Place");

        PlaceInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceInputTextFieldActionPerformed(evt);
            }
        });

        DataFormatNoteLabel.setText("Insert all date's in the dd/mm/yyyy format.");

        jScrollPane1.setViewportView(OrganizerList);

        AddOrganizerButton.setText("Add ->");

        RemoveOrganizer.setText("<- Remove");

        jScrollPane2.setViewportView(ChosenOrganizerList);

        OrganizerNoteLabel.setText("Select two or more organizers.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescriptionLabel)
                            .addComponent(TitleLabel)
                            .addComponent(TypeLabel)
                            .addComponent(PlaceLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataFormatNoteLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EndSubDateLabel)
                                    .addComponent(StartSubDateLabel)
                                    .addComponent(EndDateLabel)
                                    .addComponent(StartDateLabel))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartSubDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndSubDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlaceInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitleInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RemoveOrganizer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AddOrganizerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(OrganizerNoteLabel))))
                        .addGap(30, 30, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkButton)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeLabel)
                    .addComponent(OrganizerNoteLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DescriptionInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionLabel))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PlaceInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlaceLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StartDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartDateLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EndDateLabel)
                                    .addComponent(EndDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StartSubDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartSubDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EndSubDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndSubDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(AddOrganizerButton)
                                .addGap(49, 49, 49)
                                .addComponent(RemoveOrganizer))))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(DataFormatNoteLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(OkButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void EndSubDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndSubDateInputTextFieldActionPerformed
       
    }//GEN-LAST:event_EndSubDateInputTextFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        MainWindow mainWindow = new MainWindow(fc);
        mainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void TitleInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleInputTextFieldActionPerformed
        String title = TitleInputTextField.getText();
        event.setTitle(title);
    }//GEN-LAST:event_TitleInputTextFieldActionPerformed

    private void StartDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateInputTextFieldActionPerformed
        String start = StartDateInputTextField.getText();
        Date startDate = Date.StringToDate(start);
        event.setStartDate(startDate);
    }//GEN-LAST:event_StartDateInputTextFieldActionPerformed

    private void EndDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateInputTextFieldActionPerformed
        String end = EndDateInputTextField.getText();
        Date endDate = Date.StringToDate(end);
        event.setEndDate(endDate);
    }//GEN-LAST:event_EndDateInputTextFieldActionPerformed

    private void DescriptionInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionInputTextFieldActionPerformed
        String description = DescriptionInputTextField.getText();
        event.setDescription(description);
    }//GEN-LAST:event_DescriptionInputTextFieldActionPerformed

    private void StartSubDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartSubDateInputTextFieldActionPerformed
        String submissionStart = StartSubDateInputTextField.getText();
        Date submissionStartDate = Date.StringToDate(submissionStart);
        event.setSubmissionStartDate(submissionStartDate);
    }//GEN-LAST:event_StartSubDateInputTextFieldActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
       
    }//GEN-LAST:event_OkButtonActionPerformed

    private void PlaceInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceInputTextFieldActionPerformed
         String local = PlaceInputTextField.getText();
           event.setLocal(local);
    }//GEN-LAST:event_PlaceInputTextFieldActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(CreateEventMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEventMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEventMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEventMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEventMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrganizerButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JList<String> ChosenOrganizerList;
    private javax.swing.JLabel DataFormatNoteLabel;
    private javax.swing.JTextField DescriptionInputTextField;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField EndDateInputTextField;
    private javax.swing.JLabel EndDateLabel;
    private javax.swing.JTextField EndSubDateInputTextField;
    private javax.swing.JLabel EndSubDateLabel;
    private javax.swing.JButton OkButton;
    private javax.swing.JList<String> OrganizerList;
    private javax.swing.JLabel OrganizerNoteLabel;
    private javax.swing.JTextField PlaceInputTextField;
    private javax.swing.JLabel PlaceLabel;
    private javax.swing.JButton RemoveOrganizer;
    private javax.swing.JTextField StartDateInputTextField;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JTextField StartSubDateInputTextField;
    private javax.swing.JLabel StartSubDateLabel;
    private javax.swing.JTextField TitleInputTextField;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
