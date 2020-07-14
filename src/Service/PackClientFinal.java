package Service;

import Entidades.Cliente;
import Entidades.Paquete;
import static SQLConex.Conection.getConeccion;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego C
 */
public class PackClientFinal extends javax.swing.JFrame {

    Cliente cli;
    Paquete pack;

    public PackClientFinal() {
        initComponents();
        setTitle("PAQUETE CLIENTE FINAL");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public PackClientFinal(Cliente cli, Paquete pack) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.cli = cli;
        this.pack = pack;
        PresentarDatosCliente(cli, pack);
        //btnCliente.setVisible(true);
        btnUsuario.setVisible(false);
    }

    Paquete pqt;
    ArrayList<Cliente> cliente = new ArrayList<>();
    int indice;
    Connection Con = getConeccion();
    PreparedStatement insertData;
    ResultSet rsData;

    public PackClientFinal(Paquete pqt, ArrayList<Cliente> clnt, int indice) {
        initComponents();
        this.pqt = pqt;
        this.cliente = clnt;
        this.indice = indice;
        setDato(indice);
        PresentarDatosAdmin(pqt, clnt, indice);
        jLabel8.setVisible(false);
        huespedes.setVisible(false);
//        btnCliente.setVisible(false);
        btnUsuario.setVisible(true);
    }

    public final void setDato(int indx) {
        System.out.println("--------------------------------");
        System.out.println("DATOS DE PACKCLIENTFINAL SETDATO");
        System.out.println("INDICE EN PACKCLIENTFINAL: " + indx);
        System.out.println("ID: " + cliente.get(indx).getId());
        //System.out.println(cliente.get(indice).getName());

        String NombreC = cliente.get(indx).getName()
                + " " + cliente.get(indx).getApellidoPat()
                + " " + cliente.get(indx).getApellidoMat();
        System.out.println(NombreC);
        String Direccion = "Calle: " + cliente.get(indx).getCalle()
                + "  #" + cliente.get(indx).getNumExt()
                + "\nColonia: " + cliente.get(indx).getColonia()
                + "\nDelegacion: " + cliente.get(indx).getDelegacion()
                + "  CP. " + cliente.get(indx).getCp();
        System.out.println("Dirección: " + Direccion);
        System.out.println("Email: " + cliente.get(indx).getEmail());

        System.out.println("NÚM HABITACION: " + pqt.getArrIdHabitaciones().get(0).getIdHabitacion());
        System.out.println("NÚM PERSONAS: " + pqt.getArrIdHabitaciones().get(0).getPersonas());
        System.out.println("CATEGORIA: " + pqt.getArrIdHabitaciones().get(0).getCategoria());
        System.out.println("ENTRADA: " + pqt.getEntrda());
        System.out.println("SALIDA: " + pqt.getSalida());
        System.out.println("--------------------------");
        System.out.println(cliente.toString());
        System.out.println("--------------------------");

        System.out.println(pqt.getArrIdHabitaciones().toString());

    }

    public final void PresentarDatosCliente(Cliente clnt, Paquete pqt) { //DIEGO
        nombre.setText(cli.getName().toUpperCase() + " " + cli.getApellidoMat().toUpperCase() + " " + cli.getApellidoPat().toUpperCase());
        direccion.setText(cli.getCalle().toUpperCase() + " #" + cli.getNumExt() + " " + cli.getColonia().toUpperCase() + " " + cli.getDelegacion().toUpperCase());
        movil.setText(cli.getTelMovil());
        correo.setText(cli.getEmail());
        id.setText(Integer.toString(cli.getid_ClienteSQL()));
        entrada.setText(pack.getEntrda());
        salida.setText(pack.getSalida());
        huespedes.setText(pack.getPersonas());
        total.setText(pack.getCosto());
        habitacion.setText(pack.getArrIdHabitaciones().toString());
        //btnCliente.setVisible(true);
        btnUsuario.setVisible(false);
    }

    public final void PresentarDatosAdmin(Paquete pqt, ArrayList<Cliente> clnt, int indx) {
        //Datos de cliente
        System.out.println("--------------------------------");
        System.out.println("DATOS DE PACKCLIENTFINAL SETDATO");
        System.out.println("INDICE EN PACKCLIENTFINAL: " + indx);
        System.out.println("ID: " + cliente.get(indx).getId());
        //System.out.println(cliente.get(indice).getName());

        String NombreC = cliente.get(indx).getName()
                + " " + cliente.get(indx).getApellidoPat()
                + " " + cliente.get(indx).getApellidoMat();
        nombre.setText(NombreC);
        String Direccion = "CALLE: " + cliente.get(indx).getCalle()
                + "  #" + cliente.get(indx).getNumExt()
                + "  COLONIA: " + cliente.get(indx).getColonia()
                + "  DELEGACIÓN: " + cliente.get(indx).getDelegacion()
                + "  CP. " + cliente.get(indx).getCp();
        direccion.setText(Direccion);
        movil.setText(cliente.get(indx).getTelMovil());
        correo.setText(cliente.get(indx).getEmail());
        id.setText("" + cliente.get(indx).getId());

        //Datos de Habitacion
        entrada.setText(pqt.getEntrda());
        salida.setText(pqt.getSalida());
        total.setText(pqt.getCosto());
        habitacion.setText(pqt.getArrIdHabitaciones().toString());

        System.out.println("Email: " + cliente.get(indx).getEmail());

        System.out.println("NÚM HABITACION: " + pqt.getArrIdHabitaciones().get(0).getIdHabitacion());
        System.out.println("NÚM PERSONAS: " + pqt.getArrIdHabitaciones().get(0).getPersonas());
        System.out.println("CATEGORIA: " + pqt.getArrIdHabitaciones().get(0).getCategoria());
        System.out.println("ENTRADA: " + pqt.getEntrda());
        System.out.println("SALIDA: " + pqt.getSalida());
        System.out.println("--------------------------");
        System.out.println(cliente.toString());
        System.out.println("--------------------------");

        System.out.println(pqt.getArrIdHabitaciones().toString());
        clnt.toString();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        movil = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        habitacion = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        huespedes = new javax.swing.JLabel();
        salida = new javax.swing.JLabel();
        entrada = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS CLIENTE"));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE");

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel2.setText("DIRECCION");

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel3.setText("TEL MOVIL");

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel5.setText("CORREO");

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel4.setText("ID");

        nombre.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        nombre.setText("jLabel6");

        direccion.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        direccion.setText("jLabel7");

        movil.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        movil.setText("jLabel8");

        correo.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        correo.setText("jLabel9");

        id.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        id.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(direccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(movil))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(correo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 641, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("RESERVACION"));

        jLabel6.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel6.setText("ENTRADA");

        jLabel7.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel7.setText("SALIDA");

        jLabel8.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel8.setText("HUESPEDES");

        jLabel9.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel9.setText("TOTAL");

        jLabel10.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jLabel10.setText("HABITACION");

        habitacion.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        habitacion.setText("jLabel11");

        total.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        total.setText("jLabel12");

        huespedes.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        huespedes.setText("jLabel13");

        salida.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        salida.setText("jLabel14");

        entrada.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        entrada.setText("jLabel15");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total)
                    .addComponent(habitacion)
                    .addComponent(huespedes)
                    .addComponent(salida)
                    .addComponent(entrada))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(entrada))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(salida))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(huespedes))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(total))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(habitacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 640, 190));

        jLabel12.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(28, 27, 26));
        jLabel12.setText("PAQUETE CLIENTE FINAL");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        btnUsuario.setText("jButton1");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, -1, -1));

        btnCliente.setText("btnCliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, "¿DESEA CONFIRMAR EL PAQUETE?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "PAQUETE CONFIRMADO \n¡BINVENIDO!", "EXITO", JOptionPane.INFORMATION_MESSAGE);
           // insert();
        } else if (confirmar == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "TU RESERVACION HA SIDO CANCELADA", "CANCELANDO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, "¿DESEA CONFIRMAR EL PAQUETE?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "PAQUETE CONFIRMADO \n¡BINVENIDO!", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            //insertC();
        } else if (confirmar == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "TU RESERVACION HA SIDO CANCELADA", "CANCELANDO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnClienteActionPerformed

    public void insertC() {
        String query = "INSERT INTO cliente("
                + "nombre,apellido_m,apellido_p,calle,numero_ext,"
                + "numero_int,colonia,delegacion,cp,tel_local,tel_movil,email"
                + ") VALUES ( " + cli + ")";
        
        for (int indx = 0; indx < pack.getArrIdHabitaciones().size() - 1; indx++) {
            querySQL(""+pack.getArrIdHabitaciones().get(indx).getIdHabitacion(),
                     ""+cli.getid_ClienteSQL(),
                     pack.getPersonas(),
                     pack.getEntrda(),
                     pack.getSalida(),
                     pack.getCosto()
                    );                        
        }
        
        System.out.println(query);

    }

    public void insert() {
        for (int indx = 0; indx < cliente.size() - 1; indx++) {
            querySQL("" + pqt.getArrIdHabitaciones().get(indx),
                    "" + cliente.get(indice).getId(),
                    pqt.getArrIdHabitaciones().get(indx).getPersonas(),
                    pqt.getEntrda(), pqt.getSalida(), "" + pqt.getCosto());
        }
    }

    public void querySQL(String idHab, String idCliente, String personas, String In, String Out, String costoRnta) {
        String queryRenta = "INSERT INTO renta (id_habitacion, id_cliente, personas, entrada, salida,"
                + "costo_renta, id_metpago) VALUES (" + idHab + ", " + idCliente + ", " + personas + ", \"" + In + "\", \"" + Out + "\", " + costoRnta + ", " + "1)";

        String queryHistHabitacion = "INSERT INTO hist_habitacion(id_habitacion, id_cliente, fentrada, fsalida) VALUES ("
                + idHab + ", " + idCliente + ", \"" + In + "\", \"" + Out + "\")";

        String updateEdoHabitacion = "UPDATE habitacion SET id_estado = 2 WHERE id_habitacion = " + idHab;
        System.out.println("QUERYS");
        System.out.println(queryRenta);
        System.out.println(queryHistHabitacion);
        System.out.println(updateEdoHabitacion);
        System.out.println("=================");
        
        
        
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
            java.util.logging.Logger.getLogger(PackClientFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PackClientFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PackClientFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PackClientFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackClientFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel entrada;
    private javax.swing.JLabel habitacion;
    private javax.swing.JLabel huespedes;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel movil;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel salida;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
