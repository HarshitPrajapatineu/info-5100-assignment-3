/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.patient;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;
import model.SystemData;

/**
 *
 * @author DKapoor
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    JPanel userProcessJPanel;
    SystemData sysData;
    ArrayList<Patient> patientList;
    public PatientJPanel(JPanel userProcessJPanel, SystemData sysData) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
        this.sysData = sysData;
        this.patientList = sysData.patientList;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jAppointmentButton = new javax.swing.JButton();
        jEncounterButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPatientIdSearchField = new javax.swing.JTextField();
        jRegisterButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(620, 540));
        setMinimumSize(new java.awt.Dimension(620, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient's Console");

        backJButton.setBackground(new java.awt.Color(253, 228, 227));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jAppointmentButton.setBackground(new java.awt.Color(255, 255, 255));
        jAppointmentButton.setText("Book an appointment");
        jAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAppointmentButtonActionPerformed(evt);
            }
        });

        jEncounterButton.setBackground(new java.awt.Color(255, 255, 255));
        jEncounterButton.setText("View Encounter History");
        jEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEncounterButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient ID *");

        jRegisterButton.setText("Register");
        jRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("If you do not have a patient ID, register here!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPatientIdSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPatientIdSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRegisterButton)
                    .addComponent(jLabel4))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAppointmentButtonActionPerformed
        if (jPatientIdSearchField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter yout patient Id please. If you do not have a patient ID, please register yourself first.");
        }
        else{
            
            int patientId = Integer.parseInt(jPatientIdSearchField.getText());
            if (!sysData.isPatientExists(patientId)){
                JOptionPane.showMessageDialog(this, "Please enter a valid patient ID");
            }
            else{      
                PatientAppointmentJPanel patientAppointmentJPanel = new PatientAppointmentJPanel(userProcessJPanel, sysData, patientId);
                userProcessJPanel.add("PatientAppointmentJPanel", patientAppointmentJPanel);
                CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
                layout.next(userProcessJPanel);
            }
        }
    }//GEN-LAST:event_jAppointmentButtonActionPerformed

    private void jEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEncounterButtonActionPerformed
        if (jPatientIdSearchField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter yout patient Id please. If you do not have a patient ID, please register yourself first.");
        }
        else{
            int patientId = Integer.parseInt(jPatientIdSearchField.getText());
            if (!sysData.isPatientExists(patientId)){
                JOptionPane.showMessageDialog(this, "Please enter a valid patient ID");
            }
            else{
                EncounterHistoryJPanel encounterHistoryJPanel = new EncounterHistoryJPanel(userProcessJPanel, sysData, patientId);
                userProcessJPanel.add("EncounterHistoryJPanel", encounterHistoryJPanel);
                CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
                layout.next(userProcessJPanel);
            }
        }
    }//GEN-LAST:event_jEncounterButtonActionPerformed

    private void jRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterButtonActionPerformed
        PatientRegisterationJPanel patientRegisterationJPanel = new PatientRegisterationJPanel(userProcessJPanel, sysData);
        userProcessJPanel.add("PatientRegisterationJPanel", patientRegisterationJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_jRegisterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jAppointmentButton;
    private javax.swing.JButton jEncounterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jPatientIdSearchField;
    private javax.swing.JButton jRegisterButton;
    // End of variables declaration//GEN-END:variables
}
