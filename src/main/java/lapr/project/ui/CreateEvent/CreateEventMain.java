package lapr.project.ui.CreateEvent;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import lapr.project.controller.CreateEventController;
import lapr.project.model.*;
import lapr.project.ui.MainWindow;
import lapr.project.utils.Date;
import lapr.project.utils.EmptySpaceException;
import lapr.project.utils.InvalidDayException;
import lapr.project.utils.InvalidMonthException;
import lapr.project.utils.InvalidYearException;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class CreateEventMain extends javax.swing.JFrame {

    /**
     * serial version
     */
    private static final long serialVersionUID = 8799413810693056904L;

    /**
     * fair center
     */
    private FairCenter fc;
    
    /**
     * user
     */
    private User u;
    
    /**
     * list of organizers of the event
     */
    private List<String> organizerListEvent;
    
    /**
     * list of users
     */
    private List<String> userList;

    /**
     * controller
     */
    CreateEventController controller;
    
    /**
     * model to users list
     */
    private DefaultListModel<String> model;
    
    /**
     * model to organizers list
     */
    private  DefaultListModel<String> model1;

    /**
     * Creates new form CreateEventMain
     *
     * @param fc fair center
     * @param u user
     */
    public CreateEventMain(FairCenter fc, User u) {
        this.fc = fc;
        this.u = u;
        this.organizerListEvent = new ArrayList<>();
        controller = new CreateEventController(fc);
        this.userList = controller.getUserList();       
        this.setVisible(true);
        initComponents();          
        jComboBox1.addItem("Congress");
        jComboBox1.addItem("Exhibition");
        model = new DefaultListModel<>(); 
        for(String x : userList){
            model.addElement(x);
        }
        OrganizerList.setModel(model);
        jScrollPane1.setViewportView(OrganizerList);
        model1 = new DefaultListModel<>(); 
        ChosenOrganizerList.setModel(model1);
        jScrollPane2.setViewportView(ChosenOrganizerList);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(CreateEventMain.this, "Do you want to close the application?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }

        });
     
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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

        PlaceLabel.setText("Place");

        DataFormatNoteLabel.setText("Insert all date's in the yyyy/mm/dd format.");

        jScrollPane1.setViewportView(OrganizerList);

        AddOrganizerButton.setText("Add ->");
        AddOrganizerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizerButtonActionPerformed(evt);
            }
        });

        RemoveOrganizer.setText("<- Remove");
        RemoveOrganizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveOrganizerActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ChosenOrganizerList);

        OrganizerNoteLabel.setText("Select two or more organizers.");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel)
                    .addComponent(TypeLabel)
                    .addComponent(PlaceLabel)
                    .addComponent(DataFormatNoteLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndSubDateLabel)
                            .addComponent(StartSubDateLabel)
                            .addComponent(EndDateLabel)
                            .addComponent(StartDateLabel)
                            .addComponent(DescriptionLabel))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EndDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StartSubDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EndSubDateInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlaceInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
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
                .addContainerGap(30, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescriptionLabel)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(DataFormatNoteLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(OkButton))
                .addContainerGap(67, Short.MAX_VALUE))
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

    /**
     * 
     * @param evt click 
     */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        MainWindow mainWindow = new MainWindow(fc, u);
        mainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        String type = jComboBox1.getSelectedItem().toString();
        int shift = fc.getFcEncryption().getShift();
        try {
            String place = PlaceInputTextField.getText();
            String plc = controller.cipherWithShift(place, shift);
            controller.validateString(place, "place");
            String submisionStartDate = StartSubDateInputTextField.getText();
            Date submissionStartDate = Date.StringToDate(submisionStartDate);
            String description = jTextArea1.getText();
            String descript = controller.cipherWithShift(description, shift);
            controller.validateString(description, "description");
            String edDate = EndDateInputTextField.getText();
            Date endDate = Date.StringToDate(edDate);
            String starDate = StartDateInputTextField.getText();
            Date startDate = Date.StringToDate(starDate);
            String title = TitleInputTextField.getText();
            String ttl = controller.cipherWithShift(title, shift);
            controller.validateString(title, "title");
            String submisionEndDate = EndSubDateInputTextField.getText();            
            Date submissionEndDate = Date.StringToDate(submisionEndDate);
            
              
            if (type.equals("Congress")) {
                
                Congress congress = new Congress(ttl, descript, plc, startDate, endDate, submissionStartDate, submissionEndDate);
                fc.getEventList().add(congress);
                JOptionPane.showMessageDialog(CreateEventMain.this, "Congress created with success", "SUCCESS", JOptionPane.OK_OPTION);
                  MainWindow main = new MainWindow(fc, u);
                main.setVisible(true);
                dispose();
            } else if (type.equals("Exhibition")) {
                Exhibition exhibition = new Exhibition(ttl, descript, plc, startDate, endDate, submissionStartDate, submissionEndDate);
                fc.getEventList().add(exhibition);
                JOptionPane.showMessageDialog(CreateEventMain.this, "Exhibition created with success", "SUCCESS", JOptionPane.OK_OPTION);
                  MainWindow main = new MainWindow(fc, u);
                main.setVisible(true);
                dispose();
            }
        } catch (EmptySpaceException | InvalidDayException | InvalidMonthException | InvalidYearException e) {
            JOptionPane.showMessageDialog(CreateEventMain.this, e.getMessage());
        }
    
                                            
    }//GEN-LAST:event_OkButtonActionPerformed

    /**
     * 
     * @param evt click
     */
    private void AddOrganizerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizerButtonActionPerformed
        String user = OrganizerList.getSelectedValue();
        model1.addElement(user);
        model.removeElement(user);
    }//GEN-LAST:event_AddOrganizerButtonActionPerformed

    /**
     * 
     * @param evt click 
     */
    private void RemoveOrganizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveOrganizerActionPerformed
        String organizer = ChosenOrganizerList.getSelectedValue();
        userList.add(organizer);
        organizerListEvent.remove(organizer);
    }//GEN-LAST:event_RemoveOrganizerActionPerformed

    private void TitleInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleInputTextFieldActionPerformed

    private void StartDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateInputTextFieldActionPerformed

    private void EndDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateInputTextFieldActionPerformed

    private void StartSubDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartSubDateInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartSubDateInputTextFieldActionPerformed

    private void EndSubDateInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndSubDateInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndSubDateInputTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrganizerButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JList<String> ChosenOrganizerList;
    private javax.swing.JLabel DataFormatNoteLabel;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
