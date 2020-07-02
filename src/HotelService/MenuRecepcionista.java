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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO = new javax.swing.JLabel();
        SesionClose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        addUserHuesped = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FONDO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setText("HOLA \"NAME\", ¿QUÉ DESEAS HACER?");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 470, 40));

        SesionClose.setText("CERRAR SESION");
        SesionClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionCloseActionPerformed(evt);
            }
        });
        getContentPane().add(SesionClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jButton2.setText("ESTADO DE HABITACIÓN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 60));

        addUserHuesped.setText("REGISTRAR UN USUARIO");
        addUserHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserHuespedActionPerformed(evt);
            }
        });
        getContentPane().add(addUserHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 220, 60));

        jButton4.setText("RENTAR UNA HABITACIÓN");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 220, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserHuespedActionPerformed
        new FormAddClient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addUserHuespedActionPerformed

    private void SesionCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SesionCloseActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SesionCloseActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton SesionClose;
    private javax.swing.JButton addUserHuesped;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
