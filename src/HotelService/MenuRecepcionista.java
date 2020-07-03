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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FONDO.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setText("HOLA \"NAME\", ¿QUÉ DESEAS HACER?");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 470, 40));

        SesionClose.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        SesionClose.setText("CERRAR SESION");
        SesionClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionCloseActionPerformed(evt);
            }
        });
        getContentPane().add(SesionClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 521, 160, 40));

        jButton2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton2.setText("ESTADO DE HABITACIÓN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 250, 60));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton SesionClose;
    private javax.swing.JButton addUserHuesped;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
