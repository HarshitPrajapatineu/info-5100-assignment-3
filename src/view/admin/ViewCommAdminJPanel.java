/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Community;
import model.CommunityAdmin;
import model.HospitalAdmin;
import model.SystemData;

/**
 *
 * @author dell
 */
public class ViewCommAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHosAdminJPanel
     */
    JPanel userProcessJPanel;
    SystemData sysData;
    
    private static final String EMPTY_STRING = "";
    CommunityAdmin selectedCommunityAdmin;
    Community selectedCommmunity;
    public ViewCommAdminJPanel(JPanel userProcessJPanel, SystemData sysData) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
        this.sysData = sysData;
        
        prepCityDDList();
        renderView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewUserJTable = new javax.swing.JTable();
        viewJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        searchJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addressTwoJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneJTextField = new javax.swing.JTextField();
        dobJDateChooser = new com.toedter.calendar.JDateChooser();
        firstNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        postalCodeJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        genderJComboBox = new javax.swing.JComboBox<>();
        addressOneJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hospitalNameJTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hospitalContactJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cityJComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        postalCodeJTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(620, 540));
        setMinimumSize(new java.awt.Dimension(620, 540));

        viewUserJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User ID", "Name", "Email ID", "Community Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewUserJTable);
        if (viewUserJTable.getColumnModel().getColumnCount() > 0) {
            viewUserJTable.getColumnModel().getColumn(0).setResizable(false);
            viewUserJTable.getColumnModel().getColumn(1).setResizable(false);
            viewUserJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        viewJButton.setText("View Details");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        editJButton.setText("Edit Details");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        addJButton.setText("Add Details");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        searchJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/search.png"))); // NOI18N
        searchJButton.setText(" Search");
        searchJButton.setMaximumSize(new java.awt.Dimension(53, 25));
        searchJButton.setMinimumSize(new java.awt.Dimension(53, 25));
        searchJButton.setPreferredSize(new java.awt.Dimension(53, 25));
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Manage Community Admin");

        backJButton.setBackground(new java.awt.Color(253, 228, 227));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Phone :");

        addressTwoJTextField.setEnabled(false);

        jLabel4.setText("Date of Birth :");

        jLabel3.setText("Last Name :");

        jLabel11.setText("City :");

        phoneJTextField.setEnabled(false);

        dobJDateChooser.setEnabled(false);

        firstNameJTextField.setEnabled(false);

        jLabel2.setText("First Name :");

        lastNameJTextField.setEnabled(false);

        jLabel5.setText("Gender :");

        jLabel8.setText("Address Line 2 :");

        jLabel9.setText("Address Line 1 :");

        emailJTextField.setEnabled(false);
        emailJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJTextFieldActionPerformed(evt);
            }
        });

        postalCodeJTextField.setEnabled(false);
        postalCodeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalCodeJTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Email ID :");

        cityJComboBox.setEnabled(false);

        genderJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender", "Other" }));
        genderJComboBox.setEnabled(false);
        genderJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderJComboBoxActionPerformed(evt);
            }
        });

        addressOneJTextField.setEnabled(false);

        jLabel10.setText("Postal Code :");

        jLabel12.setText("Community Name :");

        hospitalNameJTextField.setEnabled(false);

        jLabel14.setText("Community Contact :");

        hospitalContactJTextField.setEnabled(false);

        jLabel17.setText("City :");

        cityJComboBox1.setFocusable(false);

        jLabel15.setText("Postal Code :");

        postalCodeJTextField1.setEditable(false);
        postalCodeJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalCodeJTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityJComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressOneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genderJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameJTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hospitalNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailJTextField)
                            .addComponent(addressTwoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addComponent(postalCodeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(lastNameJTextField)
                        .addComponent(dobJDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addComponent(hospitalContactJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(postalCodeJTextField1))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressOneJTextField, addressTwoJTextField, cityJComboBox, dobJDateChooser, emailJTextField, firstNameJTextField, genderJComboBox, hospitalContactJTextField, hospitalNameJTextField, jLabel10, jLabel11, jLabel12, jLabel14, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, lastNameJTextField, phoneJTextField, postalCodeJTextField});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(genderJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressTwoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postalCodeJTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addressOneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hospitalNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(hospitalContactJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cityJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(postalCodeJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressOneJTextField, addressTwoJTextField, cityJComboBox, dobJDateChooser, emailJTextField, firstNameJTextField, genderJComboBox, hospitalContactJTextField, hospitalNameJTextField, jLabel2, jLabel3, lastNameJTextField, phoneJTextField, postalCodeJTextField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel14, jLabel4, jLabel7, jLabel8});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addJButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addJButton, deleteJButton, editJButton, searchJButton, viewJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteJButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedRow = viewUserJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewUserJTable.getModel();
        int commAdminId = (int) model.getValueAt(selectedRow, 0);
        sysData.getCommunityAdminList().remove(sysData.getCommunityAdminById(commAdminId));
        renderView();
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        AddCommunityAdminJPanel addCommunityAdminJPanel = new AddCommunityAdminJPanel(userProcessJPanel, sysData, null);
        userProcessJPanel.add("AddCommunityAdminJPanel", addCommunityAdminJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        AddCommunityAdminJPanel addCommunityAdminJPanel = new AddCommunityAdminJPanel(userProcessJPanel, sysData, selectedCommunityAdmin);
        userProcessJPanel.add("AddCommunityAdminJPanel", addCommunityAdminJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_editJButtonActionPerformed

    private void genderJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderJComboBoxActionPerformed

    private void postalCodeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalCodeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalCodeJTextFieldActionPerformed

    private void emailJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJTextFieldActionPerformed

    private void postalCodeJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalCodeJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalCodeJTextField1ActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(viewUserJTable.getModel());
        viewUserJTable.setRowSorter(sorter);
        String text = searchJTextField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_searchJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField addressOneJTextField;
    private javax.swing.JTextField addressTwoJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JComboBox<String> cityJComboBox1;
    private javax.swing.JButton deleteJButton;
    private com.toedter.calendar.JDateChooser dobJDateChooser;
    private javax.swing.JButton editJButton;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JComboBox<String> genderJComboBox;
    private javax.swing.JTextField hospitalContactJTextField;
    private javax.swing.JTextField hospitalNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField phoneJTextField;
    private javax.swing.JTextField postalCodeJTextField;
    private javax.swing.JTextField postalCodeJTextField1;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton viewJButton;
    private javax.swing.JTable viewUserJTable;
    // End of variables declaration//GEN-END:variables
    private void getDataInForm() {

        // set data for community admin
        firstNameJTextField.setText(selectedCommunityAdmin.getFirstName());
        lastNameJTextField.setText(selectedCommunityAdmin.getLastName());
        genderJComboBox.setSelectedIndex(selectedCommunityAdmin.getGender());
        dobJDateChooser.setDate(selectedCommunityAdmin.getDob());
        phoneJTextField.setText(selectedCommunityAdmin.getPhone());
        emailJTextField.setText(selectedCommunityAdmin.getEmailId());
        addressOneJTextField.setText(selectedCommunityAdmin.getAddress().getAddressOne());
        addressTwoJTextField.setText(selectedCommunityAdmin.getAddress().getAddressTwo());
        cityJComboBox.setSelectedIndex(selectedCommunityAdmin.getAddress().getCity());
        postalCodeJTextField.setText(selectedCommunityAdmin.getAddress().getPostalCode());
        
        // set data for community
//        communityNameJTextField.setText(selectedCommunity.getCommunityName());
//        communityContactJTextField.setText(selectedCommunity.getPhone());
//        communityAddressJTextField.setText(selectedCommunity.getAddress().getAddressOne() + ", " +
//                selectedCommunity.getAddress().getAddressTwo()+ ", " +
//                selectedCommunity.getAddress().getPostalCode());
        
    }

    private void renderView() {
        renderTable();
        cleanForm();
        
    }
    
    private void cleanForm() {

        firstNameJTextField.setText(EMPTY_STRING);
        lastNameJTextField.setText(EMPTY_STRING);
        genderJComboBox.setSelectedIndex(0);
        dobJDateChooser.setDate(null);
        phoneJTextField.setText(EMPTY_STRING);
        emailJTextField.setText(EMPTY_STRING);
        addressOneJTextField.setText(EMPTY_STRING);
        addressTwoJTextField.setText(EMPTY_STRING);
        postalCodeJTextField.setText(EMPTY_STRING);
        cityJComboBox.setSelectedIndex(0);
    }

    private void renderTable() {

        DefaultTableModel dtm = (DefaultTableModel) viewUserJTable.getModel();
        dtm.setRowCount(0);
        if(sysData.getCommunityAdminList() != null){
            for (CommunityAdmin cAdmin : sysData.getCommunityAdminList()) {
                Object[] row = new Object[4];
                row[0] = cAdmin.getPersonId();
                row[1] = cAdmin.getFirstName() + " " + cAdmin.getLastName();
                row[2] = cAdmin.getEmailId();
                row[3] = sysData.getCommunityById(cAdmin.getCommId()).getCommName();
                dtm.addRow(row);
            }
        }
        
    }

    private void prepCityDDList() {
        sysData.getCityDDList().forEach(x -> cityJComboBox.addItem(x));
    }

}
