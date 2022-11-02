/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.hospitalAdmin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Doctor;
import model.Hospital;
import model.SystemData;
import view.CommunityAdmin.AddHospitalJPanel;
import view.admin.*;

/**
 *
 * @author dell
 */
public class DoctorDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHosAdminJPanel
     */
    
    JPanel userProcessJPanel;
    SystemData sysData;
    private static final String EMPTY_STRING = "";
    Doctor selectedDoctor;
    int inthospID;
    
    public DoctorDirectoryJPanel(JPanel userProcessJPanel, String community, SystemData sysData, int hospID) {
        this.userProcessJPanel = userProcessJPanel;
        this.sysData = sysData;
        initComponents();
 //       renderTable(hospID);
        HospitalIDJTextField.setText(String.valueOf(hospID));
        inthospID=hospID;
        renderTable(inthospID);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorDirectoryjTable = new javax.swing.JTable();
        viewJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        searchJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        EmpIDJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DoctorNameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ExpertiseJComboBox = new javax.swing.JComboBox<>();
        HospitalIDJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CommunityJTextField = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(620, 540));
        setMinimumSize(new java.awt.Dimension(620, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Doctor Directory");

        DoctorDirectoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Doctor Name", "Expertise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorDirectoryjTable);
        if (DoctorDirectoryjTable.getColumnModel().getColumnCount() > 0) {
            DoctorDirectoryjTable.getColumnModel().getColumn(0).setResizable(false);
            DoctorDirectoryjTable.getColumnModel().getColumn(1).setResizable(false);
            DoctorDirectoryjTable.getColumnModel().getColumn(2).setResizable(false);
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

        backJButton.setText("Go Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        EmpIDJTextField.setEditable(false);
        EmpIDJTextField.setEnabled(false);

        jLabel2.setText("Emp ID:");

        DoctorNameJTextField.setEditable(false);
        DoctorNameJTextField.setEnabled(false);

        jLabel6.setText("Doctor Name:");

        jLabel11.setText("Expertise:");

        ExpertiseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anesthesiology", "DermatologyNeurology", "Neurology", "Orthopedic", "Pathology", "General Physician", "Surgery" }));
        ExpertiseJComboBox.setEnabled(false);

        HospitalIDJTextField.setEditable(false);
        HospitalIDJTextField.setEnabled(false);
        HospitalIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalIDJTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Hospital ID: ");

        jLabel13.setText("Community:");

        CommunityJTextField.setEditable(false);
        CommunityJTextField.setEnabled(false);
        CommunityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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
                        .addComponent(searchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DoctorNameJTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HospitalIDJTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExpertiseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmpIDJTextField)))
                        .addGap(320, 320, 320)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CommunityJTextField)
                .addGap(326, 326, 326))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addJButton, deleteJButton, editJButton, searchJButton, viewJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(13, 13, 13)
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
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DoctorNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ExpertiseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(HospitalIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CommunityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EmpIDJTextField, jLabel2});

    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        int selectedRow = DoctorDirectoryjTable.getSelectedRow();
        if (selectedRow < 0) {
            showMessageDialog(this, "Please select a row.");
            return;
        }
        getDataInForm(selectedRow);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedRow = DoctorDirectoryjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) DoctorDirectoryjTable.getModel();
        
        int selectedOption = JOptionPane.showConfirmDialog(this, "do you want to delete this record?", "Are you sure?",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (selectedOption == 0) {
            int DoctorID = (int)model.getValueAt(selectedRow,0);
//            Hospital selectedHospital = HospitalDirectoryjTable.
            sysData.getDoctorList().remove(DoctorID);
//            refreshView();
//            setAllFieldsEnabled(false);
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.previous(userProcessJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        AddDoctorJPanel addDoctorJPanel = new AddDoctorJPanel(userProcessJPanel, null, false, sysData, inthospID);
        userProcessJPanel.add("AddUserJPanel", addDoctorJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void HospitalIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalIDJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalIDJTextFieldActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        
        int selectedRow = DoctorDirectoryjTable.getSelectedRow();
        
        if (selectedRow < 0) {
            showMessageDialog(this, "Please select a row.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) DoctorDirectoryjTable.getModel();
        int HospitalID = (int)model.getValueAt(selectedRow,0);
        Doctor selectedDoctor = sysData.getDoctorById(HospitalID);
        
        AddDoctorJPanel addDoctorJPanel = new AddDoctorJPanel(userProcessJPanel, selectedDoctor, true, sysData, inthospID);
        userProcessJPanel.add("AddUserJPanel", addDoctorJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_editJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(DoctorDirectoryjTable.getModel());
        DoctorDirectoryjTable.setRowSorter(sorter);
        String text = searchJTextField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void CommunityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommunityJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CommunityJTextField;
    private javax.swing.JTable DoctorDirectoryjTable;
    private javax.swing.JTextField DoctorNameJTextField;
    private javax.swing.JTextField EmpIDJTextField;
    private javax.swing.JComboBox<String> ExpertiseJComboBox;
    private javax.swing.JTextField HospitalIDJTextField;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables

private void getDataInForm(int selectedRow) {
    
    DefaultTableModel model = (DefaultTableModel) DoctorDirectoryjTable.getModel();
    int EmployeeID = (int)model.getValueAt(selectedRow,0);
    Doctor selectedDoctor = sysData.getDoctorById(EmployeeID);
    
    EmpIDJTextField.setText(Integer.toString(selectedDoctor.getEmpId()));
    DoctorNameJTextField.setText(selectedDoctor.getDoctorName());
    HospitalIDJTextField.setText(Integer.toString(selectedDoctor.getHospitalId()));
    ExpertiseJComboBox.setSelectedItem(selectedDoctor.getExpertise());
    
}

private void renderTable(int hospitalId) {

        DefaultTableModel dtm = (DefaultTableModel) DoctorDirectoryjTable.getModel();
        dtm.setRowCount(0);
        var doctorList = sysData.getDoctorList().stream().
                filter(a -> a.getHospitalId() == hospitalId).toList();
        
        if(doctorList!= null){
            for (Doctor doc : doctorList) {
                Object[] row = new Object[3];
                row[0] = doc.getEmpId();
                row[1] = doc.getDoctorName();
                row[2] = doc.getExpertise();
                dtm.addRow(row);
            }
        }
    }

}
