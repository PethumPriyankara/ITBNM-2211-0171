/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author pethum  priyankara
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
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

        Background = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        Heading2 = new javax.swing.JLabel();
        Loadingpg = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 204));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Heading.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 204));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("MANCHESTER CITY FOOTBALL");
        Background.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 860, 30));

        Heading2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        Heading2.setForeground(new java.awt.Color(102, 255, 0));
        Heading2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading2.setText("THE CLUB (R)");
        Background.add(Heading2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 220, 30));

        Loadingpg.setBackground(new java.awt.Color(255, 0, 0));
        Background.add(Loadingpg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NEW HOME.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Welcome wel = new Welcome();
        wel.setVisible(true);
        
       UserLogin H1 = new UserLogin();
        try{
            for (int a = 0; a < 100; a= a+4){
                 Thread.sleep(100);
                 
                
                System.out.println(a);
                wel.Loadingpg.setValue(a);
                
            }
        }catch(Exception e){
        
        }
        
            wel.setVisible(false);
           H1.setVisible(true);
        
        wel.dispose();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Heading2;
    private javax.swing.JProgressBar Loadingpg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}