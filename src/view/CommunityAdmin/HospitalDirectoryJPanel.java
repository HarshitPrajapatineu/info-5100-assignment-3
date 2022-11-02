/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.CommunityAdmin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Hospital;
import model.SystemData;

/**
 *
 * @author dell
 */
public class HospitalDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHosAdminJPanel
     */
    JPanel userProcessJPanel;
    SystemData sysData;
    private static final String EMPTY_STRING = "";
    Hospital selectedHospital;
    String selectedcommunity;
    
    public HospitalDirectoryJPanel(JPanel userProcessJPanel, SystemData sysData, String communityName) {
        this.userProcessJPanel = userProcessJPanel;
        this.sysData = sysData;
        initComponents();
        selectedcommunity = communityName;
        CommunityJTextField.setText(selectedcommunity);
        renderView(communityName);
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
        HospitalDirectoryjTable = new javax.swing.JTable();
        viewJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        searchJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        phoneJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hospitalIDJTextField = new javax.swing.JTextField();
        hospitalNameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CommunityJTextField = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(620, 540));
        setMinimumSize(new java.awt.Dimension(620, 540));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Directory");

        HospitalDirectoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HospitalDirectoryjTable);
        if (HospitalDirectoryjTable.getColumnModel().getColumnCount() > 0) {
            HospitalDirectoryjTable.getColumnModel().getColumn(0).setResizable(false);
            HospitalDirectoryjTable.getColumnModel().getColumn(1).setResizable(false);
            HospitalDirectoryjTable.getColumnModel().getColumn(2).setResizable(false);
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

        jLabel2.setText("Hospital Name :");

        phoneJTextField.setEnabled(false);

        jLabel6.setText("Phone :");

        addressJTextField.setEnabled(false);

        jLabel9.setText("Address:");

        jLabel3.setText("Hospital ID :");

        hospitalIDJTextField.setEnabled(false);

        hospitalNameJTextField.setEnabled(false);

        jLabel4.setText("Community:");

        CommunityJTextField.setEnabled(false);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneJTextField)
                                    .addComponent(addressJTextField)
                                    .addComponent(CommunityJTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hospitalNameJTextField)))
                        .addGap(320, 320, 320)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hospitalIDJTextField)
                        .addGap(326, 326, 326))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hospitalNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hospitalIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CommunityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        
        int selectedRow = HospitalDirectoryjTable.getSelectedRow();
        if (selectedRow < 0) {
            showMessageDialog(this, "Please select a row.");
            return;
        }
        getDataInForm(selectedRow);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedRow = HospitalDirectoryjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) HospitalDirectoryjTable.getModel();
        
        int selectedOption = JOptionPane.showConfirmDialog(this, "do you want to delete this record?", "Are you sure?",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (selectedOption == 0) {
            int HospitalID = (int)model.getValueAt(selectedRow,0);
//            Hospital selectedHospital = HospitalDirectoryjTable.
            sysData.getHospitalList().remove(HospitalID);
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
        AddHospitalJPanel addHospitalJPanel = new AddHospitalJPanel(userProcessJPanel, null, false, selectedcommunity, sysData);
        userProcessJPanel.add("AddHospitalJPanel", addHospitalJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        
        
        int selectedRow = HospitalDirectoryjTable.getSelectedRow();
        if (selectedRow < 0) {
            showMessageDialog(this, "Please select a row.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) HospitalDirectoryjTable.getModel();
        int HospitalID = (int)model.getValueAt(selectedRow,0);
        Hospital selectedHospital = sysData.getHospitalById(HospitalID);
        AddHospitalJPanel addHospitalJPanel = new AddHospitalJPanel(userProcessJPanel, selectedHospital, true, selectedcommunity, sysData);
        userProcessJPanel.add("AddHospitalJPanel", addHospitalJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_editJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(HospitalDirectoryjTable.getModel());
        HospitalDirectoryjTable.setRowSorter(sorter);
        String text = searchJTextField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_searchJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CommunityJTextField;
    private javax.swing.JTable HospitalDirectoryjTable;
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JTextField hospitalIDJTextField;
    private javax.swing.JTextField hospitalNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneJTextField;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables

    private void getDataInForm(int selectedRow) {
        DefaultTableModel model = (DefaultTableModel) HospitalDirectoryjTable.getModel();
    //    int selectedRow = HospitalDirectoryjTable.getSelectedRow();
        int HospitalID = (int)model.getValueAt(selectedRow,0);
        Hospital selectedHospital = sysData.getHospitalById(HospitalID);
        
        hospitalNameJTextField.setText(selectedHospital.getHospitalName());
        hospitalIDJTextField.setText(Integer.toString(selectedHospital.getHospitalId()));
        phoneJTextField.setText(selectedHospital.getPhone());
        addressJTextField.setText(selectedHospital.getAddress().getAddressOne()
            + ", " + 
                selectedHospital.getAddress().getAddressTwo()
            + ", " +
                selectedHospital.getAddress().getPostalCode());
    }
    private void renderView(String communityName) {
        
        cleanForm();
        renderTable(communityName);
        
    }
    
    private void cleanForm() {
        hospitalNameJTextField.setText(EMPTY_STRING);
        hospitalIDJTextField.setText(EMPTY_STRING);
        phoneJTextField.setText(EMPTY_STRING);
        addressJTextField.setText(EMPTY_STRING);
    }
    
    private void renderTable(String communityName) {

        DefaultTableModel dtm = (DefaultTableModel) HospitalDirectoryjTable.getModel();
        dtm.setRowCount(0);
        var hospitalList = sysData.getHospitalList().stream().
                filter(a -> a.getAddress().getCommunityName().equals(communityName)).toList();
        
        if(sysData.hospitalList!= null){
            for (Hospital hosp : hospitalList) {
                Object[] row = new Object[3];
                row[0] = hosp.getHospitalId();
                row[1] = hosp.getHospitalName();
                row[2] = hosp.getPhone();
                dtm.addRow(row);
            }
        }
    }
}
