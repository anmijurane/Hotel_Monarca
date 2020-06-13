package HotelService;

import static SQLConex.Conection.getConeccion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * * * @author LIA
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("INICIO DE SESION");
        // coneccion();                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUser.setBackground(new java.awt.Color(245, 224, 192));
        jUser.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 380, 50));

        jPassword.setBackground(new java.awt.Color(245, 224, 192));
        jPassword.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 380, 50));

        btnSignIn.setBackground(new java.awt.Color(222, 74, 16));
        btnSignIn.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("INGRESAR");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 150, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 80, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 3, 800, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        iniciosesion();
    }//GEN-LAST:event_btnSignInActionPerformed

    public void iniciosesion() {

        Connection con = getConeccion();

        PreparedStatement ps;
        ResultSet res;

        try {
            ps = con.prepareStatement("SELECT * FROM credencial WHERE id_personal='" + 
                    jUser.getText() + "' and password=md5('" +
                    String.valueOf(jPassword.getPassword()) + "')");
            res = ps.executeQuery();

            if (res.next()) {
                JOptionPane.showMessageDialog(this, "BIENVENIDO: " + res.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(this, "ACCESO DENEGADO");
                jUser.setText("");
                jPassword.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}
