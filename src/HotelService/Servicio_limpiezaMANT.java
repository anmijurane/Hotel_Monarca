package HotelService;

import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego C
 */
public class Servicio_limpiezaMANT extends javax.swing.JFrame {

    DefaultTableModel STATUS = new DefaultTableModel();
    Connection Con = getConeccion();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public Servicio_limpiezaMANT() {
        initComponents();
        setLocationRelativeTo(null);
        table_status.setModel(STATUS);
        STATUS.addColumn("ID");
        STATUS.addColumn("NOMBRE");
        STATUS.addColumn("HABITACION");
        STATUS.addColumn("ESTADO");
        STATUS.addColumn("FECHA INICIO");
        ID.addItem("SELECCIONE UN ID");
        box_id();

    }
    
    public void clean_table() {
        int filas = table_status.getRowCount();
        for (int i = 0; i < filas; i++) {
            STATUS.removeRow(0);
        }
    }

    public void box_id() {

        try {
            ps = Con.prepareStatement("SELECT * FROM serv_mant_limp group by id_personal");
            rs = ps.executeQuery();

            while (rs.next()) {
                ID.addItem(rs.getString("id_personal"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servicio_limpiezaMANT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void id(String number_employed) {

        String dato[] = new String[5];

        try {

            clean_table();
            ps = Con.prepareStatement("SELECT S.id_personal, S.id_habitacion, S.id_estado, S.fechaini,\n"
                    + "	      P.nombre,E.nombre\n"
                    + "       FROM serv_mant_limp S\n"
                    + "       INNER JOIN personal P ON S.id_personal = P.id_personal\n"
                    + "       INNER JOIN estado E ON S.id_estado = E.id_estado\n"
                    + "       WHERE S.id_personal = " + number_employed);

            rs = ps.executeQuery();

            if (rs.next()) {
                dato[0] = rs.getString("S.id_personal");
                dato[1] = rs.getString("P.nombre");
                dato[2] = rs.getString("S.id_habitacion");
                dato[3] = rs.getString("E.nombre").toUpperCase();
                dato[4] = rs.getString("S.fechaini");
                STATUS.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servicio_limpiezaMANT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_status = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_status.getTableHeader().setResizingAllowed(false);
        table_status.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_status);

        jLabel1.setText("NUMERO DE EMPLEADO:");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed

        int id = ID.getSelectedIndex();

        switch (id) {
            case 0:
                break;
            case 1:
                id(ID.getSelectedItem().toString());
                break;
            case 2:
                break;
            case 3:
                id(ID.getSelectedItem().toString());
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_IDActionPerformed

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
            java.util.logging.Logger.getLogger(Servicio_limpiezaMANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicio_limpiezaMANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicio_limpiezaMANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicio_limpiezaMANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicio_limpiezaMANT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_status;
    // End of variables declaration//GEN-END:variables
}
