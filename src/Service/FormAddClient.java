package Service;

import Entidades.Cliente;
import HotelService.*;
import Entidades.Personal;
import static SQLConex.Conection.getConeccion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class FormAddClient extends javax.swing.JFrame {

    Cliente client;
    static Connection Con;
    static PreparedStatement ps;
    static ResultSet rs;


    /**
     * Creates new form FormAddPersonal
     */
    public FormAddClient() {
        initComponents();
        setTitle("REGISTRO DEL CLIENTE");       
        setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtApMat = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumExt = new javax.swing.JTextField();
        txtNumInt = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtDelg = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtTelLocal = new javax.swing.JTextField();
        txtTelMovil = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 300, -1));

        txtApPat.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtApPat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPatActionPerformed(evt);
            }
        });
        getContentPane().add(txtApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 220, -1));

        txtApMat.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtApMat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 220, -1));

        txtCalle.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 280, -1));

        txtNumExt.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtNumExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumExtActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 85, -1));

        txtNumInt.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtNumInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNumInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 85, -1));

        txtColonia.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });
        getContentPane().add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, -1));

        txtDelg.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtDelg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDelg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDelgActionPerformed(evt);
            }
        });
        getContentPane().add(txtDelg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 140, -1));

        txtCP.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 150, -1));

        txtTelLocal.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtTelLocal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTelLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 180, -1));

        txtTelMovil.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtTelMovil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTelMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 180, -1));

        btn_insert.setBackground(new java.awt.Color(222, 74, 16));
        btn_insert.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btn_insert.setText("REGISTRAR");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 160, 40));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 300, -1));

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 220, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 140, 220, -1));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CALLE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 30));

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NUM EXT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 30));

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NUM INT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, 30));

        jLabel7.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("COLONIA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 60, 20));

        jLabel8.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DELEGACION / MUNICIPIO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 160, 20));

        jLabel9.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("C.P.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, 20));

        jLabel10.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TEL LOCAL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        jLabel11.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 180, -1));

        jLabel12.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TEL MOVIL");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 180, -1));

        txtEmail.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 180, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddCliente.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed

        this.client = new Cliente(
                txtName.getText().toUpperCase(), txtApPat.getText().toUpperCase(),
                txtApMat.getText().toUpperCase(), txtCalle.getText().toUpperCase(),
                txtNumExt.getText().toUpperCase(), txtNumInt.getText().toUpperCase(),
                txtColonia.getText().toUpperCase(), txtDelg.getText().toUpperCase(),
                txtCP.getText().toUpperCase(), txtTelLocal.getText(),
               txtTelMovil.getText(), txtEmail.getText());
        execurequery(client);
                
    }//GEN-LAST:event_btn_insertActionPerformed

    private void txtDelgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDelgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDelgActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void txtApPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPatActionPerformed

    private void txtNumExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumExtActionPerformed

    public void execurequery(Cliente prsn) {
        //System.out.println(prsn.toString());
        //System.out.println(prsn);
        
        String query = "INSERT INTO cliente("
                    + "nombre,apellido_m,apellido_p,calle,numero_ext,"
                    + "numero_int,colonia,delegacion,cp,tel_local,tel_movil,email"
                    + ") VALUES ( " + prsn + ")";
        
        System.out.println(query);

        Con = getConeccion();
        PreparedStatement psmtpersonal = null;
        PreparedStatement psmtcredencial = null;

        try {
            Con.setAutoCommit(false);
            psmtpersonal = Con.prepareStatement(query);
            psmtpersonal.executeUpdate();
                       
            //commit mysql
            int value = JOptionPane.showConfirmDialog(null, "¿CONFIRMAS LOS DATOS?"
                    + "\nID: "+prsn.getid_Cliente()+ "\nNombre: " +prsn.getName(),
                    "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
            System.out.println(value);
            //SI 0; NO 1; CANCEL 2
            switch (value) {
                case 0:
                    Con.commit();
                    JOptionPane.showMessageDialog(this, "Se agrego el usuario: " +prsn.getName()+ "\nCon el ID: "+prsn.getid_Cliente());
                    break;
                case 1:
                    Con.rollback();
                    JOptionPane.showMessageDialog(this, "Se aborto la operación");
                    break;                            
                default:
                    break;
            }

        } catch (SQLException ex) {
            System.err.print("ERROR: " + ex.getMessage());
            if (Con != null) {
                System.out.println("implement Rollback");
                try {
                    Con.rollback();
                } catch (SQLException e) {
                    System.out.println("No se pudo deshacer la acción: "
                            + e);
                }
            }
        }

    }

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
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btn_insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDelg;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JTextField txtTelLocal;
    private javax.swing.JTextField txtTelMovil;
    // End of variables declaration//GEN-END:variables
}
