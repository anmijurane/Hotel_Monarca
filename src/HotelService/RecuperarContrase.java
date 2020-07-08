/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelService;

import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Montzerrat Rivera
 */
public class RecuperarContrase extends javax.swing.JFrame {

    private String idUser;

    /**
     * Creates new form RecuperarContrase
     */
    public RecuperarContrase() {
        initComponents();
    }

    public RecuperarContrase(String idUSer) {
        initComponents();
        this.idUser = idUSer;
        jTidUser.setText(idUSer);
        jEmail.requestFocus();
    }

    public boolean EqualsPass() {
        String pass1 = String.valueOf(jPassword.getPassword());
        String pass2 = String.valueOf(jPasswordConfirm.getPassword());
        if (pass1.equals(pass2)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "NO COINCIDEN LAS CONTRASEÑAS");
            return false;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTidUser = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jPasswordConfirm = new javax.swing.JPasswordField();
        btnConfirmUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 27, 26));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECUPERACIÓN DE CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 620, 40));

        jLabel4.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Correo Electrónico:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, 30));

        jLabel3.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre de usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, 30));

        jLabel5.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nueva Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 170, 30));

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirnar Contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 180, 30));

        jTidUser.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jTidUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTidUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTidUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 290, 30));

        jEmail.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 290, 30));

        jPassword.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 290, 30));

        jPasswordConfirm.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jPasswordConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 290, 30));

        btnConfirmUpdate.setBackground(new java.awt.Color(222, 74, 16));
        btnConfirmUpdate.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        btnConfirmUpdate.setText("CONFIRMAR");
        btnConfirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTidUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidUserActionPerformed
    private void btnConfirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmUpdateActionPerformed
        //UPDATE habitacion SET id_estado = ? WHERE id_habitacion = ?
        if (EqualsPass()) {
            Connection Con = getConeccion();
            PreparedStatement ps;
            ResultSet rs;

            try {
                ps = Con.prepareStatement("UPDATE credencial SET password = md5(\""+String.valueOf(jPassword.getPassword())+"\") WHERE id_personal = ? AND email = ?");
                ps.setString(1, jTidUser.getText());
                ps.setString(2, jEmail.getText());
                int update = ps.executeUpdate();                
                if (update != 0) {
                    System.out.println("Lineas actualizadas: " +update);
                    JOptionPane.showMessageDialog(this, "SE HA ACTUALIZADO LA CONTRASEÑA");
                    this.dispose();
                }
                
            } catch (SQLException e) {
            }
        }

    }//GEN-LAST:event_btnConfirmUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperarContrase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContrase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmUpdate;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordConfirm;
    private javax.swing.JTextField jTidUser;
    // End of variables declaration//GEN-END:variables
}
