package HotelService;

import Entidades.Habitacion;
import static SQLConex.Conection.getConeccion;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Limpieza extends javax.swing.JFrame {

    static Connection Con;
    static PreparedStatement ps;
    static ResultSet rs;
    Habitacion hab;
    /**
     * Creates new form Limpieza
     */
    public Limpieza() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    public void habitacion(int n_habitacion) {

        try {

            Con = getConeccion();
            ps = Con.prepareStatement("SELECT habitacion.id_habitacion, "
                    + "categoria.categoria, "
                    + "categoria.capacidad, "
                    + "categoria.camas, "
                    + "estado.nombre "
                    + "FROM habitacion, categoria, estado "
                    + "WHERE habitacion.id_habitacion = ? "
                    + "AND habitacion.id_categoria = categoria.id_categoria "
                    + " GROUP BY habitacion.id_habitacion");
            ps.setInt(1, n_habitacion);
            System.out.println(ps);
            rs = ps.executeQuery();
            if (rs.next()) {
                
                hab = new Habitacion(
                        rs.getInt("habitacion.id_habitacion")
                        ,rs.getString("categoria.camas").toUpperCase()
                        ,""
                        ,0
                        ,"");
                rs.getInt("habitacion.id_habitacion");
                et_habitacion.setText("HABITACIÓN: " + rs.getString("habitacion.id_habitacion").toUpperCase());
                et_camas.setText(rs.getString("categoria.camas").toUpperCase());
                et_capacidad.setText(rs.getString("categoria.capacidad").toUpperCase());
                et_categoria.setText(rs.getString("categoria.categoria").toUpperCase());
                et_estado.setText(rs.getString("estado.nombre").toUpperCase());
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
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

        btnGroupOne = new javax.swing.ButtonGroup();
        FLAT_NUMBER = new javax.swing.JComboBox<>();
        ROOM_NUMBER = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        et_categoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        et_estado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        et_capacidad = new javax.swing.JLabel();
        et_habitacion = new javax.swing.JLabel();
        et_camas = new javax.swing.JLabel();
        limpiando = new javax.swing.JRadioButton();
        disponible = new javax.swing.JRadioButton();
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

        et_categoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        et_categoria.setForeground(new java.awt.Color(0, 0, 0));
        et_categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 130, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ESTADO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 80, -1));

        et_estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        et_estado.setForeground(new java.awt.Color(0, 0, 0));
        et_estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CAPACIDAD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 130, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CAMAS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 90, -1));

        et_capacidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        et_capacidad.setForeground(new java.awt.Color(0, 0, 0));
        et_capacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 120, 30));

        et_habitacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        et_habitacion.setForeground(new java.awt.Color(0, 0, 0));
        et_habitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        et_habitacion.setText("HABITACIÓN: ");
        getContentPane().add(et_habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 350, 30));

        et_camas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        et_camas.setForeground(new java.awt.Color(0, 0, 0));
        et_camas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(et_camas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 140, 30));

        btnGroupOne.add(limpiando);
        limpiando.setText("LIMPIANDO");
        limpiando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiandoActionPerformed(evt);
            }
        });
        getContentPane().add(limpiando, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 100, -1));

        btnGroupOne.add(disponible);
        disponible.setText("DISPONIBLE");
        disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibleActionPerformed(evt);
            }
        });
        getContentPane().add(disponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        BACKGROUND.setForeground(new java.awt.Color(0, 0, 0));
        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String[] flatOne
            = {"SELECIONA UNA HABITACION", "101", "102", "103", "104", "105", "106", "107", "108",
                "109", "110"};
    String[] flatTwo
            = {"SELECIONA UNA HABITACION", "201", "202", "203", "204", "205", "206", "207", "208",
                "209", "210"};
    String[] flatTree
            = {"SELECIONA UNA HABITACION", "301", "302", "303", "304", "305", "306", "307", "308",
                "309", "310"};
    String[] flatFour
            = {"SELECIONA UNA HABITACION", "401", "402", "403", "404", "405", "406", "407", "408",
                "409", "410"};
    String[] flatFive
            = {"SELECIONA UNA HABITACION", "501", "502", "503", "504", "505", "506", "507", "508",
                "509", "510"};
    String[] flatSix
            = {"SELECIONA UNA HABITACION", "601", "602", "603", "604", "605", "606", "607", "608",
                "609", "610"};
    String[] flatSeven
            = {"SELECIONA UNA HABITACION", "701", "702", "703", "704", "705", "706", "707", "708",
                "709", "710"};
    String[] flatEight
            = {"SELECIONA UNA HABITACION", "801", "802", "803", "804", "805", "806", "807", "808",
                "809", "810"};
    String[] flatNine
            = {"SELECIONA UNA HABITACION", "901", "902", "903", "904", "905", "906", "907", "908",
                "909", "910"};
    String[] flatTen
            = {"SELECIONA UNA HABITACION", "1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008",
                "1009", "1010"};


    private void FLAT_NUMBERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FLAT_NUMBERItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            //System.out.println(FLAT_NUMBER.getSelectedIndex());
            int index = FLAT_NUMBER.getSelectedIndex();
            boolean tf = true;
            switch (index) {
                case 0:
                    tf = false;
                    break;
                case 1:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatOne));
                    tf = true;
                    break;
                case 2:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatTwo));
                    tf = true;
                    break;
                case 3:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatTree));
                    tf = true;
                    break;
                case 4:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatFour));
                    tf = true;
                    break;
                case 5:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatFive));
                    tf = true;
                    break;
                case 6:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatSix));
                    tf = true;
                    break;
                case 7:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatSeven));
                    tf = true;
                    break;
                case 8:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatEight));
                    tf = true;
                    break;
                case 9:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatNine));
                    tf = true;
                    break;
                case 10:
                    ROOM_NUMBER.setModel(new DefaultComboBoxModel<>(flatTen));
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
        if (et_categoria.equals("")) {
            btnGroupOne.clearSelection();            
        }
        isCheckLimpieza();
    }//GEN-LAST:event_limpiandoActionPerformed

    private void disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibleActionPerformed
        isCheckLimpieza();
    }//GEN-LAST:event_disponibleActionPerformed

    public void isCheckLimpieza(){
        if (limpiando.isSelected()) {
            System.out.println("Limpiando");
        }else if (disponible.isSelected()) {
            System.out.println("Disponible");
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
            java.util.logging.Logger.getLogger(Limpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Limpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Limpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Limpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.ButtonGroup btnGroupOne;
    private javax.swing.JRadioButton disponible;
    private javax.swing.JLabel et_camas;
    private javax.swing.JLabel et_capacidad;
    private javax.swing.JLabel et_categoria;
    private javax.swing.JLabel et_estado;
    private javax.swing.JLabel et_habitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton limpiando;
    // End of variables declaration//GEN-END:variables
}