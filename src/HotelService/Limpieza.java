package HotelService;

import Entidades.Habitacion;
import static SQLConex.Conection.getConeccion;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Limpieza extends javax.swing.JFrame {

    Habitacion hab;

    /**
     * Creates new form Limpieza
     */
    public Limpieza() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void habitacion(int n_habitacion) {
        Connection Con;
        PreparedStatement ps;
        ResultSet rs;

        hab = new Habitacion(n_habitacion, "Individual", "1", 1,"mantenimiento");
        llenarDatosEt();
        /*try {

            Con = getConeccion();
            ps = Con.prepareStatement("SELECT habitacion.id_habitacion, "
                    + "categoria.categoria, "
                    + "categoria.capacidad, "
                    + "categoria.camas, "
                    + "estado.nombre "
                    + "FROM habitacion, categoria, estado "
                    + "WHERE habitacion.id_habitacion = ? "
                    + "AND habitacion.id_categoria = categoria.id_categoria "
                    + "AND habitacion.id_estado = estado.id_estado "
                    + " GROUP BY habitacion.id_habitacion");

            ps.setInt(1, n_habitacion);
            System.out.println(ps);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("estado.nombre"));
                hab = new Habitacion(
                        rs.getInt("habitacion.id_habitacion"),
                        rs.getString("categoria.categoria"),
                        rs.getString("categoria.capacidad"),
                        rs.getInt("categoria.camas"),
                        rs.getString("estado.nombre"));

                llenarDatosEt();
                Con.close();

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }*/
    }

    public void llenarDatosEt() {
        et_habitacion.setText("HABITACIÓN: " + hab.getId_habitacion());
        et_camas.setText("" + hab.getCamas());
        et_capacidad.setText(hab.getCapacidad());
        et_categoria.setText(hab.getCategoria());
        System.out.println(hab);
        String lmpz = hab.getEstado();
        if (lmpz.equals("LIMPIEZA")) {
            limpiando.setSelected(true);
            estadoHabitacion.setVisible(false);
        } else {
            estadoHabitacion.setVisible(true);
            estadoHabitacion.setText(hab.getEstado());
            estadoHabitacion.setSelected(true);
        }
        //et_estado.setText(hab.getEstado());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupOne = new javax.swing.ButtonGroup();
        FLAT_NUMBER = new javax.swing.JComboBox<>();
        ROOM_NUMBER = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        et_categoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        et_capacidad = new javax.swing.JLabel();
        et_habitacion = new javax.swing.JLabel();
        et_camas = new javax.swing.JLabel();
        limpiando = new javax.swing.JRadioButton();
        estadoHabitacion = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FLAT_NUMBER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONA UN PISO", "1° PISO", "2° PISO", "3° PISO", "4° PISO", "5° PISO", "6° PISO", "7° PISO", "8° PISO", "9° PISO", "10° PISO" }));
        FLAT_NUMBER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FLAT_NUMBERItemStateChanged(evt);
            }
        });
        getContentPane().add(FLAT_NUMBER, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 40));

        ROOM_NUMBER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION" }));
        ROOM_NUMBER.setToolTipText(FLAT_NUMBER.getName());
        ROOM_NUMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOM_NUMBERActionPerformed(evt);
            }
        });
        getContentPane().add(ROOM_NUMBER, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 200, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CATEGORÍA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 130, -1));

        et_categoria.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        et_categoria.setForeground(new java.awt.Color(0, 0, 0));
        et_categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 130, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ESTADO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 80, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CAPACIDAD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 130, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CAMAS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 90, -1));

        et_capacidad.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        et_capacidad.setForeground(new java.awt.Color(0, 0, 0));
        et_capacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 120, 30));

        et_habitacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        et_habitacion.setForeground(new java.awt.Color(0, 0, 0));
        et_habitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        et_habitacion.setText("HABITACIÓN: ");
        getContentPane().add(et_habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 360, 30));

        et_camas.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        et_camas.setForeground(new java.awt.Color(0, 0, 0));
        et_camas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_camas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 140, 30));

        btnGroupOne.add(limpiando);
        limpiando.setText("LIMPIEZA");
        limpiando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiandoActionPerformed(evt);
            }
        });
        getContentPane().add(limpiando, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 160, -1));

        btnGroupOne.add(estadoHabitacion);
        estadoHabitacion.setText("\"   \"");
        estadoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(estadoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 160, -1));

        btnUpdate.setText("ACTUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, -1, -1));

        btnExit.setText("SALIR");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 100, -1));

        BACKGROUND.setForeground(new java.awt.Color(0, 0, 0));
        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FLAT_NUMBERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FLAT_NUMBERItemStateChanged
        Habitacion Flat = new Habitacion();
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            //System.out.println(FLAT_NUMBER.getSelectedIndex());
            int index = FLAT_NUMBER.getSelectedIndex();
            boolean tf = true;
            switch (index) {
                case 0:
                    tf = false;
                    break;
                case 1:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatOne()));
                    tf = true;
                    break;
                case 2:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatTwo()));
                    tf = true;
                    break;
                case 3:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatTree()));
                    tf = true;
                    break;
                case 4:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatFour()));
                    tf = true;
                    break;
                case 5:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatFive()));
                    tf = true;
                    break;
                case 6:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatSix()));
                    tf = true;
                    break;
                case 7:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatSeven()));
                    tf = true;
                    break;
                case 8:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatEight()));
                    tf = true;
                    break;
                case 9:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatNine()));
                    tf = true;
                    break;
                case 10:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(Flat.getFlatTen()));
                    tf = true;
                    break;
                default:
                    throw new AssertionError();
            }
            ROOM_NUMBER.setEnabled(tf);
        }
    }//GEN-LAST:event_FLAT_NUMBERItemStateChanged

    private void ROOM_NUMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOM_NUMBERActionPerformed
        habitacion(new Integer(ROOM_NUMBER.getSelectedItem().toString()));
    }//GEN-LAST:event_ROOM_NUMBERActionPerformed

    private void limpiandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiandoActionPerformed
        isCheckLimpieza();
    }//GEN-LAST:event_limpiandoActionPerformed

    private void estadoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoHabitacionActionPerformed
        isCheckLimpieza();
    }//GEN-LAST:event_estadoHabitacionActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Connection Con = null;
        PreparedStatement PrepSta = null;
        ResultSet rs = null;

        try {
            Con.setAutoCommit(false);
            Con = getConeccion();
            PrepSta = Con.prepareStatement("UPDATE habitacion SET id_estado = ? WHERE id_habitacion = ?");
            PrepSta.setInt(1, getState(hab.getEstado()));
            PrepSta.setInt(2, hab.getId_habitacion());

        } catch (SQLException e) {
        }
//        System.out.println(getState(hab.getEstado()));

    }//GEN-LAST:event_btnUpdateActionPerformed

    public void isCheckLimpieza() {
        if (limpiando.isSelected()) {
            hab.setEstado("limpieza");
            System.out.println("Limpiando");
        } else if (estadoHabitacion.isSelected()) {
            hab.setEstado("disponible");
            System.out.println("Disponible");
        }
    }
    
    public int getState(String strState){
        int state;
        switch (strState) {
            case "DISPONIBLE":
                state = 1;
                break;
            case "OCUPADO":
                state = 2;
                break;
            case "LIMPIEZA":
                state = 3;
                break;
            case "MANTENIMIENTO":
                state = 4;
                break;
            default:
                throw new AssertionError();
        }
        return state;
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
            java.util.logging.Logger.getLogger(Limpieza.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Limpieza.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Limpieza.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Limpieza.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Limpieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JComboBox<String> FLAT_NUMBER;
    private javax.swing.JComboBox<String> ROOM_NUMBER;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroupOne;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JRadioButton estadoHabitacion;
    private javax.swing.JLabel et_camas;
    private javax.swing.JLabel et_capacidad;
    private javax.swing.JLabel et_categoria;
    private javax.swing.JLabel et_habitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton limpiando;
    // End of variables declaration//GEN-END:variables
}
