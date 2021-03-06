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
        jTTittle.setText("INICIO DE SESION");
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTTittle = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTTittle.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jTTittle.setForeground(new java.awt.Color(28, 27, 26));
        jTTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jTTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 230, 30));

        jUser.setBackground(new java.awt.Color(245, 224, 192));
        jUser.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 360, 40));

        jPassword.setBackground(new java.awt.Color(245, 224, 192));
        jPassword.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 360, 40));

        btnSignIn.setBackground(new java.awt.Color(222, 74, 16));
        btnSignIn.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("INGRESAR");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 150, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 80, 40));

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(249, 112, 38));
        jButton1.setFont(new java.awt.Font("Candara Light", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(28, 27, 26));
        jButton1.setText("RECUPERAR CONTRASEÑA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        iniciosesion();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new RecuperarContrase(jUser.getText()).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                String name = res.getString("nombre").toUpperCase();
                int idCargo = res.getInt("id_cargo");
                int idPersonal = res.getInt("id_personal");
                JOptionPane.showMessageDialog(this, "BIENVENIDO: " + name.toUpperCase());
                switch (idCargo) {
                    case 2: //Gerente Menu
                        new MenuGerencia(name, idPersonal).setVisible(true);
                        this.dispose();
                        break;
                    case 6: //Recepcion Menu
                        new MenuRecepcionista(name, idPersonal).setVisible(true);
                        this.dispose();
                        break;
                    case 7: //Limpieza Interfaz
                        new Limpieza(name, idPersonal).setVisible(true);
                        this.dispose();
                        break;
                    case 8: //Mantenimiento Interfaz
                        new Mantenimiento(name, idPersonal).setVisible(true);
                        this.dispose();
                        break;                            
                    default:
                        JOptionPane.showMessageDialog(this, "¡SIN ACCESO!");
                        throw new AssertionError();
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "ACCESO DENEGADO");
                //jUser.setText("");
                jPassword.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel jTTittle;
    private javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}


/*Consulta del departamento en la BD
|    1 | DIRECCIÓN     |
|    2 | VENTAS        |
|    3 | CALL CENTER   |
|    4 | ATC. TEL      |
|    5 | RECEPCIÓN     |
|    6 | LIMPIEZA      |
|    7 | CONSERJERIA   |
|    8 | HOSPITALARIO  |
|    9 | RESERVACIONES |
|   10 | CONTABILIDAD  |
|   11 | COSTOS        |
|   12 | AUDITORIA     |
|   13 | DES HUMANO    |
*/