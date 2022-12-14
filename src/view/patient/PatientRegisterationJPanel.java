/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.patient;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Patient;
import model.SystemData;

/**
 *
 * @author DKapoor
 */
public class PatientRegisterationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegisterationJPanel
     */
    JPanel userProcessJPanel;
    SystemData sysData;
    ArrayList<Patient> patientList;
    public PatientRegisterationJPanel(JPanel userProcessJPanel, SystemData sysData) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
        this.sysData = sysData;
        this.patientList = sysData.patientList;
        prepCityDDList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNameTextField = new javax.swing.JTextField();
        jMobileNumberTextField = new javax.swing.JTextField();
        jEmailIdTextField = new javax.swing.JTextField();
        jSaveButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLastNameTextField = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jGenderComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jAddressLine1TextField = new javax.swing.JTextField();
        jAddressLine2TextField = new javax.swing.JTextField();
        jPostalCodeTextField = new javax.swing.JTextField();
        jCommunityNameTextField = new javax.swing.JTextField();
        cityJComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setBackground(new java.awt.Color(253, 228, 227));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Patient registeration");

        jLabel1.setText("First Name ");

        jLabel3.setText("Gender");

        jLabel4.setText("Mobile Number");

        jLabel5.setText("Email Id");

        jSaveButton.setText("Save");
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("DOB");

        jLabel7.setText("Last Name");

        jGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender", "Other" }));
        jGenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Address Line 1");

        jLabel9.setText("Address Line 2");

        jLabel10.setText("City");

        jLabel11.setText("Postal Code ");

        jLabel12.setText("Community name");

        jCommunityNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCommunityNameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backJButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEmailIdTextField)
                                    .addComponent(jMobileNumberTextField)
                                    .addComponent(jAddressLine1TextField)
                                    .addComponent(jAddressLine2TextField)
                                    .addComponent(jPostalCodeTextField)
                                    .addComponent(jCommunityNameTextField)
                                    .addComponent(cityJComboBox, 0, 172, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLastNameTextField, jNameTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jMobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jEmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jAddressLine1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jAddressLine2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPostalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCommunityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSaveButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed
        String firstName = jNameTextField.getText();
        String lastName = jLastNameTextField.getText();
        Date dob = jDateChooser.getDate();
        Integer gender = jGenderComboBox.getSelectedIndex();
        String emailId = jEmailIdTextField.getText();
        String mobNum = jMobileNumberTextField.getText();
        String addressLine1 = jAddressLine1TextField.getText();
        String addressLine2 = jAddressLine2TextField.getText();
        int city = cityJComboBox.getSelectedIndex();
        String postalCode = jPostalCodeTextField.getText();
        String communityName = jCommunityNameTextField.getText();
        
        if (firstName.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your first name");
            jNameTextField.requestFocus();
        }
        else if (!firstName.matches("^[a-zA-Z ]*$")){
            JOptionPane.showMessageDialog(null, "Please enter proper first name");
            jNameTextField.requestFocus();
        }
        else if (lastName.equals("")){
            JOptionPane.showMessageDialog(null, "Last name can't be null");
            jLastNameTextField.requestFocus();
        }
        else if (!lastName.matches("^[a-zA-Z ]*$")){
            JOptionPane.showMessageDialog(null, "Please enter proper last name");
            jLastNameTextField.requestFocus();
        }
        else if (dob == null){
            JOptionPane.showMessageDialog(null, "Please enter date of birth");
        }
        else if (mobNum.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter mobile number");
            jMobileNumberTextField.requestFocus();
        }
        else if (Pattern.matches("^(\\d{3}[- .]?){2}\\d{4}$", mobNum)){
            JOptionPane.showMessageDialog(null, "Please enter valid mobile number");
            jMobileNumberTextField.requestFocus();
        }
        else if (emailId.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter email Id");
            jEmailIdTextField.requestFocus();
        }
        else if (!emailId.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            JOptionPane.showMessageDialog(null, "Please enter valid email address");
            jEmailIdTextField.requestFocus();
        }  
        else if (addressLine1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter address line 1");
            jAddressLine1TextField.requestFocus();
        }
        else if (postalCode.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter postal code");
            jPostalCodeTextField.requestFocus();
        }
        else if (communityName.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter community name");
            jCommunityNameTextField.requestFocus();
        }
        else{
            Patient newPatient = new Patient();

            newPatient.setFirstName(firstName);
            newPatient.setLastName(lastName);
            newPatient.setDob(dob);
            newPatient.setGender(gender);
            newPatient.setEmailId(emailId);
            newPatient.setPhone(mobNum);
            
            Address address = new Address();
            address.setAddressOne(addressLine1);
            address.setAddressTwo(addressLine2);
            address.setCity(city);
            address.setPostalCode(postalCode);
            address.setCommunityName(communityName);

            newPatient.setAddress(address);
            patientList.add(newPatient);

            JOptionPane.showMessageDialog(this, "You are registered successfully! Your patient ID is "+newPatient.getPatientId());

            jNameTextField.setText("");
            jLastNameTextField.setText("");
            jDateChooser.setDate(null);
            jGenderComboBox.setSelectedIndex(0);
            jEmailIdTextField.setText("");
            jMobileNumberTextField.setText("");
            jAddressLine1TextField.setText("");
            jAddressLine2TextField.setText("");
            cityJComboBox.setSelectedIndex(0);
            jPostalCodeTextField.setText("");
            jCommunityNameTextField.setText("");
        }
    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void jGenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderComboBoxActionPerformed
        // TODO add your 
    }//GEN-LAST:event_jGenderComboBoxActionPerformed

    private void jCommunityNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCommunityNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCommunityNameTextFieldActionPerformed

    private void prepCityDDList() {
        sysData.getCityDDList().forEach(x -> cityJComboBox.addItem(x));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JTextField jAddressLine1TextField;
    private javax.swing.JTextField jAddressLine2TextField;
    private javax.swing.JTextField jCommunityNameTextField;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JTextField jEmailIdTextField;
    private javax.swing.JComboBox<String> jGenderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLastNameTextField;
    private javax.swing.JTextField jMobileNumberTextField;
    private javax.swing.JTextField jNameTextField;
    private javax.swing.JTextField jPostalCodeTextField;
    private javax.swing.JButton jSaveButton;
    // End of variables declaration//GEN-END:variables
}
