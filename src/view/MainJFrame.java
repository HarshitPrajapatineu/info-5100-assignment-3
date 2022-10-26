/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import view.CommunityAdmin.CommAdminMainJPanel;
import view.admin.AdminMainJPanel;
import view.hospitalAdmin.HospAdminMainJPanel;
import java.util.ArrayList;
import view.admin.AdminMainJPanel;
import common.Enum;
import java.util.Locale;

/**
 *
 * @author dell
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    ArrayList<String> cityList = new ArrayList<String>();
    
    public MainJFrame() {
        initComponents();
        HomeViewJPanel homeViewPanel = new HomeViewJPanel();
        userProcessJPanel.add("HomeViewJPanel", homeViewPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
        prepCityList();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitJPane = new javax.swing.JSplitPane();
        userControlJPanel = new javax.swing.JPanel();
        adminJButton = new javax.swing.JButton();
        commAdminJButton = new javax.swing.JButton();
        hosAdminJButton = new javax.swing.JButton();
        guestUserJButton = new javax.swing.JButton();
        doctorJButton = new javax.swing.JButton();
        patientJButton = new javax.swing.JButton();
        userProcessJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(780, 540));
        setMinimumSize(new java.awt.Dimension(780, 540));

        splitJPane.setDividerLocation(160);
        splitJPane.setDividerSize(1);

        userControlJPanel.setBackground(new java.awt.Color(255, 255, 255));

        adminJButton.setBackground(new java.awt.Color(253, 228, 227));
        adminJButton.setText("Administrator");
        adminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminJButtonActionPerformed(evt);
            }
        });

        commAdminJButton.setBackground(new java.awt.Color(253, 228, 227));
        commAdminJButton.setText("Community Admin");
        commAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commAdminJButtonActionPerformed(evt);
            }
        });

        hosAdminJButton.setBackground(new java.awt.Color(253, 228, 227));
        hosAdminJButton.setText("Hospital Admin");

        guestUserJButton.setBackground(new java.awt.Color(253, 228, 227));
        guestUserJButton.setText("Guest User");

        doctorJButton.setBackground(new java.awt.Color(253, 228, 227));
        doctorJButton.setText("Doctor");

        patientJButton.setBackground(new java.awt.Color(253, 228, 227));
        patientJButton.setText("Patient");

        javax.swing.GroupLayout userControlJPanelLayout = new javax.swing.GroupLayout(userControlJPanel);
        userControlJPanel.setLayout(userControlJPanelLayout);
        userControlJPanelLayout.setHorizontalGroup(
            userControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminJButton)
                    .addComponent(commAdminJButton)
                    .addComponent(hosAdminJButton)
                    .addComponent(guestUserJButton)
                    .addComponent(doctorJButton)
                    .addComponent(patientJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userControlJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adminJButton, commAdminJButton, doctorJButton, guestUserJButton, hosAdminJButton, patientJButton});

        userControlJPanelLayout.setVerticalGroup(
            userControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userControlJPanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(adminJButton)
                .addGap(18, 18, 18)
                .addComponent(commAdminJButton)
                .addGap(18, 18, 18)
                .addComponent(hosAdminJButton)
                .addGap(18, 18, 18)
                .addComponent(doctorJButton)
                .addGap(18, 18, 18)
                .addComponent(patientJButton)
                .addGap(19, 19, 19)
                .addComponent(guestUserJButton)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        userControlJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adminJButton, commAdminJButton, doctorJButton, guestUserJButton, hosAdminJButton, patientJButton});

        splitJPane.setLeftComponent(userControlJPanel);

        userProcessJPanel.setBackground(new java.awt.Color(255, 255, 255));
        userProcessJPanel.setLayout(new java.awt.CardLayout());
        splitJPane.setRightComponent(userProcessJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitJPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitJPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminJButtonActionPerformed
        AdminMainJPanel adminJPanel = new AdminMainJPanel(userProcessJPanel);
        userProcessJPanel.add("AdminMainJPanel", adminJPanel);
        CardLayout layout = (CardLayout)userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_adminJButtonActionPerformed

    private void commAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commAdminJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commAdminJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    public void prepCityList() {
        for (int i = 0; i < Enum.City.values().length; i++) {
            cityList.add(Enum.City.values()[i].toString().toLowerCase(Locale.getDefault()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminJButton;
    private javax.swing.JButton commAdminJButton;
    private javax.swing.JButton doctorJButton;
    private javax.swing.JButton guestUserJButton;
    private javax.swing.JButton hosAdminJButton;
    private javax.swing.JButton patientJButton;
    private javax.swing.JSplitPane splitJPane;
    private javax.swing.JPanel userControlJPanel;
    private javax.swing.JPanel userProcessJPanel;
    // End of variables declaration//GEN-END:variables
}
