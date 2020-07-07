package HotelService;

import Service.FormAddClient;

/** 
 * 
 * @author LIA */
public class MenuRecepcionista extends javax.swing.JFrame {
    private String name;
    private int idPersonal;
    
    public MenuRecepcionista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    
    public MenuRecepcionista(String name, int idPersonal){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.name = name;
        this.idPersonal = idPersonal;
        jT_Tittle.setText("HOLA "+name+", ¿QUÉ DESEAS HACER?");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jT_Tittle = new javax.swing.JLabel();
        SesionClose = new javax.swing.JButton();
        btnEdoHabitacion = new javax.swing.JButton();
        addUserHuesped = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jT_Tittle.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jT_Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jT_Tittle.setText("HOLA \"NAME\", ¿QUÉ DESEAS HACER?");
        getContentPane().add(jT_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 470, 40));

        SesionClose.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        SesionClose.setText("CERRAR SESION");
        SesionClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionCloseActionPerformed(evt);
            }
        });
        getContentPane().add(SesionClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 521, 160, 40));

        btnEdoHabitacion.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        btnEdoHabitacion.setText("ESTADO DE HABITACIÓN");
        btnEdoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEdoHabitacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEdoHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdoHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 250, 60));

        addUserHuesped.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        addUserHuesped.setText("REGISTRAR UN USUARIO");
        addUserHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserHuespedActionPerformed(evt);
            }
        });
        getContentPane().add(addUserHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 250, 60));

        jButton4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton4.setText("RENTAR UNA HABITACIÓN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 250, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("MENU, RECEPCIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserHuespedActionPerformed
        new FormAddClient(idPersonal).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addUserHuespedActionPerformed

    private void SesionCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SesionCloseActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SesionCloseActionPerformed

    private void btnEdoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdoHabitacionActionPerformed
        new InfoHabitacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEdoHabitacionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new RentarHabitacion(idPersonal).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton SesionClose;
    private javax.swing.JButton addUserHuesped;
    private javax.swing.JButton btnEdoHabitacion;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jT_Tittle;
    // End of variables declaration//GEN-END:variables
}
