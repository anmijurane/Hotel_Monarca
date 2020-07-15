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
        setTitle("MENU-RECEPCIÓN");
        this.setResizable(false);
        this.name = name;
        this.idPersonal = idPersonal;
        jT_Tittle.setText("HOLA "+name.toUpperCase()+", ¿QUÉ DESEAS HACER?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jT_Tittle = new javax.swing.JLabel();
        SesionClose = new javax.swing.JButton();
        btnEdoHabitacion = new javax.swing.JButton();
        addUserHuesped = new javax.swing.JButton();
        btnRentarHab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jT_Tittle.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jT_Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jT_Tittle.setText("HOLA \"NAME\", ¿QUÉ DESEAS HACER?");
        getContentPane().add(jT_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 470, 40));

        SesionClose.setBackground(new java.awt.Color(222, 74, 16));
        SesionClose.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        SesionClose.setText("CERRAR SESION");
        SesionClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionCloseActionPerformed(evt);
            }
        });
        getContentPane().add(SesionClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, 180, 40));

        btnEdoHabitacion.setBackground(new java.awt.Color(204, 85, 39));
        btnEdoHabitacion.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnEdoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnEdoHabitacion.setText("INFO DE HABITACIÓN");
        btnEdoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEdoHabitacion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEdoHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdoHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 260, 40));

        addUserHuesped.setBackground(new java.awt.Color(255, 102, 0));
        addUserHuesped.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        addUserHuesped.setForeground(new java.awt.Color(255, 255, 255));
        addUserHuesped.setText("REGISTRAR UN USUARIO");
        addUserHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserHuespedActionPerformed(evt);
            }
        });
        getContentPane().add(addUserHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 260, 40));

        btnRentarHab.setBackground(new java.awt.Color(222, 74, 16));
        btnRentarHab.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnRentarHab.setForeground(new java.awt.Color(255, 255, 255));
        btnRentarHab.setText("RENTAR UNA HABITACIÓN");
        btnRentarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentarHabActionPerformed(evt);
            }
        });
        getContentPane().add(btnRentarHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 260, 40));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 27, 26));
        jLabel1.setText("MENU, RECEPCIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserHuespedActionPerformed
        new FormAddClient(name,idPersonal,2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addUserHuespedActionPerformed

    private void SesionCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SesionCloseActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SesionCloseActionPerformed

    private void btnEdoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdoHabitacionActionPerformed
        new InfoHabitacion(name, idPersonal, 2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEdoHabitacionActionPerformed

    private void btnRentarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarHabActionPerformed
        new RentarHabitacion(name, idPersonal,2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRentarHabActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton SesionClose;
    private javax.swing.JButton addUserHuesped;
    private javax.swing.JButton btnEdoHabitacion;
    private javax.swing.JButton btnRentarHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jT_Tittle;
    // End of variables declaration//GEN-END:variables
}
