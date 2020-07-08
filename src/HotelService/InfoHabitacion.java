/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelService;

import Entidades.Habitacion;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class InfoHabitacion extends javax.swing.JFrame {
    
    String name;
    int idPersonal, TypeForm;
    /**
     * Creates new form InfoHabitacion
     */
    public InfoHabitacion() {
        initComponents();
    }

    public InfoHabitacion(String name, int idPersonal, int TypeForm) {
        initComponents();
        this.name = name;
        this.idPersonal = idPersonal;
        this.TypeForm = TypeForm;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FLAT_NUMBER = new javax.swing.JComboBox<>();
        ROOM_NUMBER = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
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
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FLAT_NUMBER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONA UN PISO", "1° PISO", "2° PISO", "3° PISO", "4° PISO", "5° PISO", "6° PISO", "7° PISO", "8° PISO", "9° PISO", "10° PISO" }));
        FLAT_NUMBER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FLAT_NUMBERItemStateChanged(evt);
            }
        });
        getContentPane().add(FLAT_NUMBER, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 190, 40));

        ROOM_NUMBER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ROOM_NUMBERItemStateChanged(evt);
            }
        });
        getContentPane().add(ROOM_NUMBER, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 210, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("INFORMACIÓN DE HABITACIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 560, 50));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 110, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 110, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 110, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 120, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 90, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 90, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 290, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 120, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 110, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 130, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NUM. HABITACIÓN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CATEGORIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CAPACIDAD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("COSTO POR NOCHE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CAMAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTADO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NOMBRE CLIENTE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CHECK IN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CHECK OUT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("COSTO TOTAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
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
            FLAT_NUMBER.setEnabled(tf);
        }
    }//GEN-LAST:event_FLAT_NUMBERItemStateChanged

    private void ROOM_NUMBERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ROOM_NUMBERItemStateChanged
        
    }//GEN-LAST:event_ROOM_NUMBERItemStateChanged

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        switch (TypeForm) {
            case 0:
                
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(InfoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FLAT_NUMBER;
    private javax.swing.JComboBox<String> ROOM_NUMBER;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
