package HotelService;
/** 
 * 
 * @author LIA */
public class gerencia extends javax.swing.JFrame {

    public gerencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FONDO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setText("HOLA \"NAME\", ¿QUÉ DESEAS HACER?");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 470, 40));

        jButton1.setText("CERRAR SESION");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jButton2.setText("ESTADO DE HABITACIÓN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 60));

        jButton3.setText("REGISTRAR UN USUARIO");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 220, 60));

        jButton4.setText("RENTAR UNA HABITACIÓN");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 220, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
