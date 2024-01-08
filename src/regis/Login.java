
package regis;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import db.MySqlConnection;

/**
 *
 * @author SIGMA
 */
public class Login extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null ;
    PreparedStatement pst = null;
    private Home HomeFrame;
    
    public Login() {
          initComponents();
          con = MySqlConnection.mycon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        BG_Log = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        tfSignin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 520));
        jPanel1.setLayout(null);

        BG_Log.setBackground(new java.awt.Color(255, 255, 255));
        BG_Log.setPreferredSize(new java.awt.Dimension(270, 697));

        jLabel1.setBackground(new java.awt.Color(0, 102, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Getting Started");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Username");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 102, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Password");

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setForeground(new java.awt.Color(0, 102, 51));

        tfSignin.setBackground(new java.awt.Color(0, 153, 51));
        tfSignin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfSignin.setForeground(new java.awt.Color(255, 255, 255));
        tfSignin.setText("Sign In");
        tfSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSigninActionPerformed(evt);
            }
        });

        jLabel4.setText("Dont have an Account? ");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(51, 255, 51));
        jButton2.setText("Sign Up Here");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(51, 204, 255));
        jButton3.setText("Forgot Password?");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plogin.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout BG_LogLayout = new javax.swing.GroupLayout(BG_Log);
        BG_Log.setLayout(BG_LogLayout);
        BG_LogLayout.setHorizontalGroup(
            BG_LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG_LogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG_LogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(BG_LogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BG_LogLayout.createSequentialGroup()
                        .addGroup(BG_LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BG_LogLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(0, 186, Short.MAX_VALUE))
                    .addGroup(BG_LogLayout.createSequentialGroup()
                        .addGroup(BG_LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1)
                            .addGroup(BG_LogLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG_LogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(BG_LogLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BG_LogLayout.setVerticalGroup(
            BG_LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_LogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(7, 7, 7)
                .addComponent(tfSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BG_LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel4))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jPanel1.add(BG_Log);
        BG_Log.setBounds(0, -10, 410, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tfSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSigninActionPerformed
    String un = jTextField1.getText();
    String ps = new String(jPasswordField1.getPassword());

    try {
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        pst = con.prepareStatement(sql);

        pst.setString(1, un);
        pst.setString(2, ps);

        rs = pst.executeQuery();
        if (rs.next()) {
            JOptionPane.showMessageDialog(rootPane, "Login Berhasil");

            // Buat instance Home jika belum ada
            if (HomeFrame == null) {
                HomeFrame = new Home();
            }

            // Set visibilitas Home ke true
            HomeFrame.setVisible(true);

            // Set visibilitas Login ke false
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Login gagal");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_tfSigninActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        ForgotP ForgotPFrame = new ForgotP();
        ForgotPFrame.setVisible(true);
        ForgotPFrame.pack();
        ForgotPFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_Log;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton tfSignin;
    // End of variables declaration//GEN-END:variables
}
