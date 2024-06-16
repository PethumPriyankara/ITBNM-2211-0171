/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;

/**
 *
 * @author pethum priyankara
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public UserLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Sid_Tf = new javax.swing.JTextField();
        Password_Pf = new javax.swing.JPasswordField();
        Login_Btn = new javax.swing.JButton();
        Cancel_Btn = new javax.swing.JButton();
        Fpass = new javax.swing.JLabel();
        CreateAcc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(555, 240));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 0));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("User ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 160, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 200, 30));

        Sid_Tf.setBackground(new java.awt.Color(255, 204, 204));
        Sid_Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sid_TfActionPerformed(evt);
            }
        });
        jPanel1.add(Sid_Tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 240, 30));

        Password_Pf.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(Password_Pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 240, 30));

        Login_Btn.setBackground(new java.awt.Color(255, 204, 204));
        Login_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login_Btn.setText("Login");
        Login_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Login_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 130, 50));

        Cancel_Btn.setBackground(new java.awt.Color(255, 204, 204));
        Cancel_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel_Btn.setText("Cancel");
        Cancel_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 130, 50));

        Fpass.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        Fpass.setForeground(new java.awt.Color(255, 255, 102));
        Fpass.setText("Forgot password ");
        Fpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FpassMouseClicked(evt);
            }
        });
        jPanel1.add(Fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 230, -1));

        CreateAcc.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        CreateAcc.setForeground(new java.awt.Color(255, 153, 255));
        CreateAcc.setText("Create new User Account");
        CreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccMouseClicked(evt);
            }
        });
        jPanel1.add(CreateAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 250, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new main footb.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccMouseClicked
        // TODO add your handling code here:

        CreateNewUser rg = new CreateNewUser();
        rg.setVisible(true);
        super.dispose();

    }//GEN-LAST:event_CreateAccMouseClicked

    private void FpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FpassMouseClicked
        // TODO add your handling code here:
        ForgotPassword F1 = new ForgotPassword();
        F1.setVisible(true);
        super.dispose();

    }//GEN-LAST:event_FpassMouseClicked

    private void Cancel_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_BtnActionPerformed
        super.dispose();
    }//GEN-LAST:event_Cancel_BtnActionPerformed

    private void Login_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_BtnActionPerformed
        try {
            LoginController.login(Sid_Tf.getText(), Password_Pf.getText());
        }
        catch (Exception e) {
        }

    }//GEN-LAST:event_Login_BtnActionPerformed

    private void Sid_TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sid_TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sid_TfActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Btn;
    private javax.swing.JLabel CreateAcc;
    private javax.swing.JLabel Fpass;
    private javax.swing.JButton Login_Btn;
    private javax.swing.JPasswordField Password_Pf;
    private javax.swing.JTextField Sid_Tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
