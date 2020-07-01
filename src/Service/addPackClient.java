package Service;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class addPackClient extends javax.swing.JFrame {

    JTextField box0;

    public addPackClient() {
        initComponents();
        setLocationRelativeTo(null);
        NUMBER_ROOM.addItem("# HABITACIONES");
        NUMBER_ROOM.addItem("1");
        NUMBER_ROOM.addItem("2");
        NUMBER_ROOM.addItem("3");
        NUMBER_ROOM.addItem("4");
        NUMBER_ROOM.addItem("5");
        NUMBER_ROOM.addItem("6");
        NUMBER_ROOM.addItem("7");
        NUMBER_ROOM.addItem("8");
        NUMBER_ROOM.addItem("9");
        NUMBER_ROOM.addItem("10");
        disable();

    }

    public void noches() {

        int Eday, Emonth, Eyear, Sday, Smonth, Syear, noches;

        Eday = check_in.getCalendar().get(Calendar.DAY_OF_MONTH);
        Emonth = check_in.getCalendar().get(Calendar.MONTH) + 1;
        Eyear = check_in.getCalendar().get(Calendar.YEAR);
        System.out.println("ENTRADA: " + Eday + "/" + Emonth + "/" + Eyear);

        Sday = check_out.getCalendar().get(Calendar.DAY_OF_MONTH);
        Smonth = check_out.getCalendar().get(Calendar.MONTH) + 1;
        Syear = check_out.getCalendar().get(Calendar.YEAR);
        System.out.println("SALIDA:  " + Sday + "/" + Smonth + "/" + Syear);

        Date checkIn = new Date(Eyear, Emonth, Eday);
        Date checkOut = new Date(Syear, Smonth, Sday);
        Days.setText("" + (int) (TimeUnit.DAYS.convert((checkOut.getTime() - checkIn.getTime()), TimeUnit.MILLISECONDS)));

        if (Integer.parseInt(Days.getText().toString()) < 0) {
            JOptionPane.showMessageDialog(null, "SU FEHCA DE SALIDA NO PUEDE SER INFERIOR A LA DE SU ENTRADA", "ADVETENCIA", 2);
            Days.setText(null);
        }

    }

    public void disable() {
        ROOM1.setVisible(false);
        PERSON1.setVisible(false);
        ROOM2.setVisible(false);
        PERSON2.setVisible(false);
        ROOM3.setVisible(false);
        PERSON3.setVisible(false);
        ROOM4.setVisible(false);
        PERSON4.setVisible(false);
        ROOM5.setVisible(false);
        PERSON5.setVisible(false);
        ROOM6.setVisible(false);
        PERSON6.setVisible(false);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);

    }

    public void ROOM1() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(false);
        PERSON2.setVisible(false);
        ROOM3.setVisible(false);
        PERSON3.setVisible(false);
        ROOM4.setVisible(false);
        PERSON4.setVisible(false);
        ROOM5.setVisible(false);
        PERSON5.setVisible(false);
        ROOM6.setVisible(false);
        PERSON6.setVisible(false);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM2() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(false);
        PERSON3.setVisible(false);
        ROOM4.setVisible(false);
        PERSON4.setVisible(false);
        ROOM5.setVisible(false);
        PERSON5.setVisible(false);
        ROOM6.setVisible(false);
        PERSON6.setVisible(false);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM3() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(false);
        PERSON4.setVisible(false);
        ROOM5.setVisible(false);
        PERSON5.setVisible(false);
        ROOM6.setVisible(false);
        PERSON6.setVisible(false);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM4() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(true);
        PERSON4.setVisible(true);
        ROOM5.setVisible(false);
        PERSON5.setVisible(false);
        ROOM6.setVisible(false);
        PERSON6.setVisible(false);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM5() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(true);
        PERSON4.setVisible(true);
        ROOM5.setVisible(true);
        PERSON5.setVisible(true);
        ROOM6.setVisible(false);
        PERSON6.setVisible(false);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM6() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(true);
        PERSON4.setVisible(true);
        ROOM5.setVisible(true);
        PERSON5.setVisible(true);
        ROOM6.setVisible(true);
        PERSON6.setVisible(true);
        ROOM7.setVisible(false);
        PERSON7.setVisible(false);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM7() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(true);
        PERSON4.setVisible(true);
        ROOM5.setVisible(true);
        PERSON5.setVisible(true);
        ROOM6.setVisible(true);
        PERSON6.setVisible(true);
        ROOM7.setVisible(true);
        PERSON7.setVisible(true);
        ROOM8.setVisible(false);
        PERSON8.setVisible(false);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM8() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(true);
        PERSON4.setVisible(true);
        ROOM5.setVisible(true);
        PERSON5.setVisible(true);
        ROOM6.setVisible(true);
        PERSON6.setVisible(true);
        ROOM7.setVisible(true);
        PERSON7.setVisible(true);
        ROOM8.setVisible(true);
        PERSON8.setVisible(true);
        ROOM9.setVisible(false);
        PERSON9.setVisible(false);
    }

    public void ROOM9() {
        ROOM1.setVisible(true);
        PERSON1.setVisible(true);
        ROOM2.setVisible(true);
        PERSON2.setVisible(true);
        ROOM3.setVisible(true);
        PERSON3.setVisible(true);
        ROOM4.setVisible(true);
        PERSON4.setVisible(true);
        ROOM5.setVisible(true);
        PERSON5.setVisible(true);
        ROOM6.setVisible(true);
        PERSON6.setVisible(true);
        ROOM7.setVisible(true);
        PERSON7.setVisible(true);
        ROOM8.setVisible(true);
        PERSON8.setVisible(true);
        ROOM9.setVisible(true);
        PERSON9.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Days = new javax.swing.JTextField();
        check_in = new com.toedter.calendar.JDateChooser();
        check_out = new com.toedter.calendar.JDateChooser();
        NUMBER_ROOM = new javax.swing.JComboBox<>();
        ROOM1 = new javax.swing.JLabel();
        ROOM2 = new javax.swing.JLabel();
        ROOM3 = new javax.swing.JLabel();
        ROOM4 = new javax.swing.JLabel();
        ROOM5 = new javax.swing.JLabel();
        ROOM6 = new javax.swing.JLabel();
        ROOM7 = new javax.swing.JLabel();
        ROOM8 = new javax.swing.JLabel();
        ROOM9 = new javax.swing.JLabel();
        PERSON1 = new javax.swing.JTextField();
        PERSON2 = new javax.swing.JTextField();
        PERSON3 = new javax.swing.JTextField();
        PERSON4 = new javax.swing.JTextField();
        PERSON5 = new javax.swing.JTextField();
        PERSON6 = new javax.swing.JTextField();
        PERSON7 = new javax.swing.JTextField();
        PERSON8 = new javax.swing.JTextField();
        PERSON9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CHECK IN");

        jLabel2.setText("CHECK OUT");

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("NOCHES");

        Days.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NUMBER_ROOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMBER_ROOMActionPerformed(evt);
            }
        });

        ROOM1.setText("HABITACION #1");

        ROOM2.setText("HABITACION #2");

        ROOM3.setText("HABITACION #3");

        ROOM4.setText("HABITACION #4");

        ROOM5.setText("HABITACION #5");

        ROOM6.setText("HABITACION #6");

        ROOM7.setText("HABITACION #7");

        ROOM8.setText("HABITACION #8");

        ROOM9.setText("HABITACION #9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ROOM1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PERSON1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(check_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addComponent(jButton1))
                        .addComponent(NUMBER_ROOM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ROOM6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ROOM7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PERSON7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(check_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM7)
                                    .addComponent(PERSON7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM8)
                                    .addComponent(PERSON8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM9)
                                    .addComponent(PERSON9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM3)
                                    .addComponent(PERSON3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM4)
                                    .addComponent(PERSON4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM5)
                                    .addComponent(PERSON5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ROOM6)
                                    .addComponent(PERSON6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)))
                .addGap(18, 18, 18)
                .addComponent(NUMBER_ROOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ROOM1)
                    .addComponent(PERSON1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ROOM2)
                    .addComponent(PERSON2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        noches();
        //getDateCalendar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NUMBER_ROOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMBER_ROOMActionPerformed

        int NUM_ROOM = NUMBER_ROOM.getSelectedIndex();

        switch (NUM_ROOM) {
            case 0:
                //JOptionPane.showMessageDialog(null, "SELECCIONE UNA HABITACION");
                disable();
                break;
            case 1:
                ROOM1();
                break;
            case 2:
                ROOM2();
                break;
            case 3:
                ROOM3();
                break;
            case 4:
                ROOM4();
                break;
            case 5:
                ROOM5();
                break;
            case 6: 
                ROOM6();
                break;
            case 7:
                ROOM7();
                break;
            case 8:
                ROOM8();
                break;
            case 9:
                ROOM9();
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "CONTATCTANDO CON UN ASESOR...");
                disable();
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_NUMBER_ROOMActionPerformed

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
            java.util.logging.Logger.getLogger(addPackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addPackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addPackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPackClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Days;
    private javax.swing.JComboBox<String> NUMBER_ROOM;
    private javax.swing.JTextField PERSON1;
    private javax.swing.JTextField PERSON2;
    private javax.swing.JTextField PERSON3;
    private javax.swing.JTextField PERSON4;
    private javax.swing.JTextField PERSON5;
    private javax.swing.JTextField PERSON6;
    private javax.swing.JTextField PERSON7;
    private javax.swing.JTextField PERSON8;
    private javax.swing.JTextField PERSON9;
    private javax.swing.JLabel ROOM1;
    private javax.swing.JLabel ROOM2;
    private javax.swing.JLabel ROOM3;
    private javax.swing.JLabel ROOM4;
    private javax.swing.JLabel ROOM5;
    private javax.swing.JLabel ROOM6;
    private javax.swing.JLabel ROOM7;
    private javax.swing.JLabel ROOM8;
    private javax.swing.JLabel ROOM9;
    private com.toedter.calendar.JDateChooser check_in;
    private com.toedter.calendar.JDateChooser check_out;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
