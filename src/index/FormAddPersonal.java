package index;

import Entidades.Personal;
import static SQLConex.Conection.getConeccion;
import com.placeholder.PlaceHolder;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class FormAddPersonal extends javax.swing.JFrame {

    Personal person;
    static Connection Con;
    static PreparedStatement ps;
    static ResultSet rs;
    
    PlaceHolder ph;
    /**
     * Creates new form FormAddPersonal
     */
    public FormAddPersonal() {        
        initComponents();
        setLocationRelativeTo(null);
        AddCbx();
        Holder();
    }
    
    public void Holder(){
        
        btn_insert.requestFocus();
        ph = new PlaceHolder(txtName, "NOMBRE");
        ph = new PlaceHolder(txtApPat, "AP. PATERNO");
        ph = new PlaceHolder(txtApMat, "AP. MATERNO");
        ph = new PlaceHolder(txtCalle, "CALLE");
        ph = new PlaceHolder(txtNumExt, "NUM. EXT");
        ph = new PlaceHolder(txtNumInt, "NUM. INT");
        ph = new PlaceHolder(txtColonia, "COLONIA");
        ph = new PlaceHolder(txtDelg, "DELEGACIÓN O MUNICIPIO");
        ph = new PlaceHolder(txtCP, "CP");
        ph = new PlaceHolder(txtTelLocal ,"TEL. LOCAL");
        ph = new PlaceHolder(txtTelMovil, "TEL. MÓVIL");
        
    }
    
    public static void AddCbx(){
        
        try {            
            
            cbxArea.addItem(":-AREA-:");
            cbxDepto.addItem(":-DEPARTAMENTO-:");
            cbxCargo.addItem(":-CARGO-:");
            
            Con = getConeccion();
            ps = Con.prepareStatement("SELECT nombre FROM area");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cbxArea.addItem(rs.getString("nombre"));
            }                        
            
            ps = Con.prepareStatement("SELECT nombre FROM departamento");        
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cbxDepto.addItem(rs.getString("nombre"));
            }
            
            ps = Con.prepareStatement("SELECT nombre FROM cargo");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                cbxCargo.addItem(rs.getString("nombre"));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FormAddPersonal.class.getName()).log(Level.SEVERE, null, ex);
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
        cbxDepto = new javax.swing.JComboBox<>();
        cbxArea = new javax.swing.JComboBox<>();
        cbxCargo = new javax.swing.JComboBox<>();
        btn_insert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_insert.setText("jButton1");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(cbxDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(txtNumInt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDelg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_insert)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDelg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btn_insert)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
                       
        this.person = new Personal(
            txtName.getText().toUpperCase(), txtApPat.getText().toUpperCase(),
            txtApMat.getText().toUpperCase(), txtCalle.getText().toUpperCase(),
            txtNumExt.getText().toUpperCase(), txtNumInt.getText().toUpperCase(),
            txtColonia.getText().toUpperCase(),  txtDelg.getText().toUpperCase(),
            txtCP.getText().toUpperCase(), txtTelLocal.getText(),
            txtTelMovil.getText(), cbxArea.getSelectedIndex(),
            cbxDepto.getSelectedIndex(), cbxCargo.getSelectedIndex());            
        execurequery(person);
        
    }//GEN-LAST:event_btn_insertActionPerformed

    public void execurequery(Personal prsn){        
        System.out.println(prsn.toString());
        System.out.println(prsn.getCredencial());
        
        /*
        Con = getConeccion();
        PreparedStatement psmtpersonal = null;
        PreparedStatement psmtcredencial = null;        
        
        try {
            Con.setAutoCommit(false);
            psmtpersonal = Con.prepareStatement("INSERT INTO personal("
                + "nombre,apellido_m,apellido_p,calle,numero_ext,"
                + "numero_int,colonia,delegacion,cp,tel_local,tel_movil,"
                + "id_area,id_dpto,id_cargo,id_personal) VALUES ( " + prsn +")");                                              
            psmtpersonal.executeUpdate();
            
            psmtcredencial = Con.prepareStatement("INSERT INTO credencial("
                + "id_personal,nombre,id_area,id_dpto,id_cargo,password) VALUES ("
                + prsn.getCredencial()+")");
            psmtcredencial.executeUpdate();
            
            //commit mysql
            Con.commit();
            
        } catch (SQLException ex) {            
            System.err.print("ERROR: " +ex.getMessage());
            if (Con!=null) {
                System.out.println("implement Rollback");
                try {
                    Con.rollback();                    
                } catch (SQLException e) {
                    System.out.println("No se pudo deshacer la acción: "
                    + e);
                }                                
            }
        }
        */
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
            java.util.logging.Logger.getLogger(FormAddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insert;
    private static javax.swing.JComboBox<String> cbxArea;
    private static javax.swing.JComboBox<String> cbxCargo;
    private static javax.swing.JComboBox<String> cbxDepto;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDelg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumExt;
    private javax.swing.JTextField txtNumInt;
    private javax.swing.JTextField txtTelLocal;
    private javax.swing.JTextField txtTelMovil;
    // End of variables declaration//GEN-END:variables
}
