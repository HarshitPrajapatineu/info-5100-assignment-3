/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.doctor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterList;
import model.Patient;
import model.SystemData;
import model.VitalSign;

/**
 *
 * @author DKapoor
 */
public class ViewVitalSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorJPanel
     */
    JPanel userProcessJPanel;
    SystemData sysData;
    Patient patient;
    int doctorId;
    EncounterList encounterList;
    
    public ViewVitalSignJPanel(JPanel userProcessJPanel, SystemData sysData, Patient patient, int doctorId) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
        this.sysData = sysData;
        this.patient = patient;
        this.doctorId = doctorId;
        Encounter encounter = sysData.getVitalSignsByPatientId(patient.getPatientId());
        
        Object row[] = {encounter.getPatientId(), encounter.getVitalSign().getTemperature(), encounter.getVitalSign().getBloodPressure(),
        encounter.getVitalSign().getPulse(), encounter.getDiagnosis(), encounter.getPrescription()};
        DefaultTableModel vitalSignModel = (DefaultTableModel) jVitalSignsTable.getModel();
        vitalSignModel.addRow(row);
        populateTable();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jVitalSignsTable = new javax.swing.JTable();
        jViewButton = new javax.swing.JButton();
        jEditButton = new javax.swing.JButton();
        jAddButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTemperatureTextField = new javax.swing.JTextField();
        jBpTextField = new javax.swing.JTextField();
        jPulseTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDiagnosisTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPrescriptionTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(620, 540));
        setMinimumSize(new java.awt.Dimension(620, 540));
        setPreferredSize(new java.awt.Dimension(620, 540));
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vital Signs");

        backJButton.setBackground(new java.awt.Color(253, 228, 227));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jVitalSignsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Temperature", "BP", "Pulse", "Diagnosis", "Prescription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jVitalSignsTable);

        jViewButton.setText("View");
        jViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewButtonActionPerformed(evt);
            }
        });

        jEditButton.setText("Edit");
        jEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditButtonActionPerformed(evt);
            }
        });

        jAddButton.setText("Add");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jDeleteButton.setText("Delete");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Temperature");

        jLabel9.setText("BP");

        jLabel10.setText("Pulse");

        jLabel12.setText("Prescription");

        jLabel13.setText("Diagnosis");

        jDiagnosisTextArea.setColumns(20);
        jDiagnosisTextArea.setRows(5);
        jScrollPane2.setViewportView(jDiagnosisTextArea);

        jPrescriptionTextArea.setColumns(20);
        jPrescriptionTextArea.setRows(5);
        jScrollPane3.setViewportView(jPrescriptionTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTemperatureTextField)
                                            .addComponent(jBpTextField)
                                            .addComponent(jPulseTextField)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(backJButton)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddButton)
                    .addComponent(jViewButton)
                    .addComponent(jEditButton)
                    .addComponent(jDeleteButton))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jBpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jPulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewButtonActionPerformed
        int rowIndex = jVitalSignsTable.getSelectedRow();
        if (rowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
        }
        else{
        DefaultTableModel model = (DefaultTableModel) jVitalSignsTable.getModel();
        Encounter selectedEncounter = (Encounter)model.getValueAt(rowIndex, 0);
        
        jTemperatureTextField.setText(String.valueOf(selectedEncounter.getVitalSign().getTemperature()));
        jBpTextField.setText(String.valueOf(selectedEncounter.getVitalSign().getBloodPressure()));
        jPulseTextField.setText(String.valueOf(selectedEncounter.getVitalSign().getPulse()));
        jDiagnosisTextArea.setText(selectedEncounter.getDiagnosis());
        jPrescriptionTextArea.setText(selectedEncounter.getPrescription());
        }
    }//GEN-LAST:event_jViewButtonActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        float temperature = Float.parseFloat(jTemperatureTextField.getText());
        float bloodPressure = Float.parseFloat(jBpTextField.getText());
        int pulse = Integer.parseInt(jPulseTextField.getText());
        String diagnosis = jDiagnosisTextArea.getText();
        String prescription = jPrescriptionTextArea.getText();
        
        int patientId = patient.getPatientId();
        
        Encounter enc = new Encounter();
        
        VitalSign vs = new VitalSign();
        vs.setTemperature(temperature);
        vs.setBloodPressure(bloodPressure);
        vs.setPulse(pulse);
        
        enc.setDoctorId(doctorId);
        enc.setPatientId(patientId);
        enc.setVitalSign(vs);
        enc.setDiagnosis(diagnosis);
        enc.setPrescription(prescription);
        
        populateTable();

    }//GEN-LAST:event_jAddButtonActionPerformed

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        
    }//GEN-LAST:event_formHierarchyChanged

    private void jEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditButtonActionPerformed
        if (jTemperatureTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "View the data first to edit");
        }
        else{
            DefaultTableModel model = (DefaultTableModel)jVitalSignsTable.getModel();
            int rowIndex = jVitalSignsTable.getSelectedRow();
            Encounter enc = (Encounter)model.getValueAt(rowIndex, 0);
                
            VitalSign vs = enc.getVitalSign();
            float temperature = Float.parseFloat(jTemperatureTextField.getText());
            float bloodPressure = Float.parseFloat(jBpTextField.getText());
            int pulse = Integer.parseInt(jPulseTextField.getText());
            String diagnosis = jDiagnosisTextArea.getText();
            String prescription = jPrescriptionTextArea.getText();
            
            vs.setTemperature(temperature);
            vs.setBloodPressure(bloodPressure);
            vs.setPulse(pulse);
            
            enc.setVitalSign(vs);
            enc.setDiagnosis(diagnosis);
            enc.setPrescription(prescription);
            populateTable();

        }
        
    }//GEN-LAST:event_jEditButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        if (jVitalSignsTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Table is empty");
        }
        else{
            int rowIndex = jVitalSignsTable.getSelectedRow();
            if (rowIndex < 0){
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
            else{
                DefaultTableModel model = (DefaultTableModel)jVitalSignsTable.getModel();
                Encounter enc = (Encounter)model.getValueAt(rowIndex, 0);

                encounterList.deleteEncounter(enc);
                JOptionPane.showMessageDialog(this, "The selected encounter is deleted.");
                
                jTemperatureTextField.setText("");
                jBpTextField.setText(String.valueOf(""));
                jPulseTextField.setText(String.valueOf(""));
                jDiagnosisTextArea.setText("");
                jPrescriptionTextArea.setText("");
                
                populateTable();
            }
        }
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jVitalSignsTable.getModel();
        model.setRowCount(0);
        for (Encounter enc : encounterList.getEncounterList()){
            Object[] row = new Object[9];
            row[0] = enc.getVitalSign().getTemperature();
            row[1] = enc.getVitalSign().getBloodPressure();
            row[2] = enc.getVitalSign().getPulse();
            row[3] = enc.getDiagnosis();
            row[4] = enc.getPrescription();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jAddButton;
    private javax.swing.JTextField jBpTextField;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JTextArea jDiagnosisTextArea;
    private javax.swing.JButton jEditButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jPrescriptionTextArea;
    private javax.swing.JTextField jPulseTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTemperatureTextField;
    private javax.swing.JButton jViewButton;
    private javax.swing.JTable jVitalSignsTable;
    // End of variables declaration//GEN-END:variables
}
