package HotelService;

import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego C
 */
public class Servicio_limpiezaMANT extends javax.swing.JFrame {

    DefaultTableModel STATUS = new DefaultTableModel();
    Connection Con = getConeccion();
    PreparedStatement ps;
    ResultSet rs;
    private String name;
    private int idPersonal;

    public Servicio_limpiezaMANT(String name, int idPersonal) {
        initComponents();
        this.name = name;
        this.idPersonal = idPersonal;
        setLocationRelativeTo(null);
        setTitle("SERVICIO DE LIMPIEZA");
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
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_status.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 620, 239));

        jLabel1.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUMERO DE EMPLEADO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 30));

        ID.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 150, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 27, 26));
        jLabel3.setText("SERVCIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnBack.setBackground(new java.awt.Color(204, 51, 0));
        btnBack.setText("REGRESAR");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 110, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MenuGerencia(name, idPersonal).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ID;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_status;
    // End of variables declaration//GEN-END:variables
}
