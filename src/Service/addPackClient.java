package Service;

import Entidades.Reserva;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class addPackClient extends javax.swing.JFrame {

    SpinnerNumberModel sn1, sn2, sn3, sn4, sn5, sn6, sn7, sn8, sn9;
    String ingreso, salida, room, night, person;
    int p1;
    Reserva rvs;

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
        spinner();
    }

    public void spinner() {

        sn1 = new SpinnerNumberModel();
        sn2 = new SpinnerNumberModel();
        sn3 = new SpinnerNumberModel();
        sn4 = new SpinnerNumberModel();
        sn5 = new SpinnerNumberModel();
        sn6 = new SpinnerNumberModel();
        sn7 = new SpinnerNumberModel();
        sn8 = new SpinnerNumberModel();
        sn9 = new SpinnerNumberModel();

        sn1.setValue(1);
        sn2.setValue(1);
        sn3.setValue(1);
        sn4.setValue(1);
        sn5.setValue(1);
        sn6.setValue(1);
        sn7.setValue(1);
        sn8.setValue(1);
        sn9.setValue(1);
        
        
        sn1.setMaximum(4);
        sn1.setMinimum(1);
        sn2.setMaximum(4);
        sn2.setMinimum(1);
        sn3.setMaximum(4);
        sn3.setMinimum(1);
        sn4.setMaximum(4);
        sn4.setMinimum(1);
        sn5.setMaximum(4);
        sn5.setMinimum(1);
        sn6.setMaximum(4);
        sn6.setMinimum(1);
        sn7.setMaximum(4);
        sn7.setMinimum(1);
        sn8.setMaximum(4);
        sn8.setMinimum(1);
        sn9.setMaximum(4);
        sn9.setMinimum(1);

        sp1.setModel(sn1);
        sp2.setModel(sn2);
        sp3.setModel(sn3);
        sp4.setModel(sn4);
        sp5.setModel(sn5);
        sp6.setModel(sn6);
        sp7.setModel(sn7);
        sp8.setModel(sn8);
        sp9.setModel(sn9);

    }

    public void noches() {

        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");

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

        ingreso = f.format(check_in.getDate());
        salida = f.format(check_out.getDate());

        if (Integer.parseInt(Days.getText().toString()) < 0) {
            JOptionPane.showMessageDialog(null, "SU FEHCA DE SALIDA NO PUEDE SER INFERIOR A LA DE SU ENTRADA", "ADVETENCIA", 2);
            Days.setText(null); 
        }

    }

    public void disable() {
        ROOM1.setVisible(false);
        sp1.setVisible(false);
        ROOM2.setVisible(false);
        sp2.setVisible(false);
        ROOM3.setVisible(false);
        sp3.setVisible(false);
        ROOM4.setVisible(false);
        sp4.setVisible(false);
        ROOM5.setVisible(false);
        sp5.setVisible(false);
        ROOM6.setVisible(false);
        sp6.setVisible(false);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);

    }

    public void ROOM1() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(false);
        sp2.setVisible(false);
        ROOM3.setVisible(false);
        sp3.setVisible(false);
        ROOM4.setVisible(false);
        sp4.setVisible(false);
        ROOM5.setVisible(false);
        sp5.setVisible(false);
        ROOM6.setVisible(false);
        sp6.setVisible(false);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM2() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(false);
        sp3.setVisible(false);
        ROOM4.setVisible(false);
        sp4.setVisible(false);
        ROOM5.setVisible(false);
        sp5.setVisible(false);
        ROOM6.setVisible(false);
        sp6.setVisible(false);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM3() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(false);
        sp4.setVisible(false);
        ROOM5.setVisible(false);
        sp5.setVisible(false);
        ROOM6.setVisible(false);
        sp6.setVisible(false);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM4() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(true);
        sp4.setVisible(true);
        ROOM5.setVisible(false);
        sp5.setVisible(false);
        ROOM6.setVisible(false);
        sp6.setVisible(false);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM5() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(true);
        sp4.setVisible(true);
        ROOM5.setVisible(true);
        sp5.setVisible(true);
        ROOM6.setVisible(false);
        sp6.setVisible(false);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM6() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(true);
        sp4.setVisible(true);
        ROOM5.setVisible(true);
        sp5.setVisible(true);
        ROOM6.setVisible(true);
        sp6.setVisible(true);
        ROOM7.setVisible(false);
        sp7.setVisible(false);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM7() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(true);
        sp4.setVisible(true);
        ROOM5.setVisible(true);
        sp5.setVisible(true);
        ROOM6.setVisible(true);
        sp6.setVisible(true);
        ROOM7.setVisible(true);
        sp7.setVisible(true);
        ROOM8.setVisible(false);
        sp8.setVisible(false);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM8() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(true);
        sp4.setVisible(true);
        ROOM5.setVisible(true);
        sp5.setVisible(true);
        ROOM6.setVisible(true);
        sp6.setVisible(true);
        ROOM7.setVisible(true);
        sp7.setVisible(true);
        ROOM8.setVisible(true);
        sp8.setVisible(true);
        ROOM9.setVisible(false);
        sp9.setVisible(false);
    }

    public void ROOM9() {
        ROOM1.setVisible(true);
        sp1.setVisible(true);
        ROOM2.setVisible(true);
        sp2.setVisible(true);
        ROOM3.setVisible(true);
        sp3.setVisible(true);
        ROOM4.setVisible(true);
        sp4.setVisible(true);
        ROOM5.setVisible(true);
        sp5.setVisible(true);
        ROOM6.setVisible(true);
        sp6.setVisible(true);
        ROOM7.setVisible(true);
        sp7.setVisible(true);
        ROOM8.setVisible(true);
        sp8.setVisible(true);
        ROOM9.setVisible(true);
        sp9.setVisible(true);
    }

    public void n_personas() {

        int valor = NUMBER_ROOM.getSelectedIndex();
        switch (valor) {
            case 0:

                break;
            case 1:
                p1 = Integer.parseInt(sp1.getValue().toString());
                break;
            case 2:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString());
                break;
            case 3:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString());
                break;
            case 4:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString())
                        + Integer.parseInt(sp4.getValue().toString());
                break;
            case 5:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString())
                        + Integer.parseInt(sp4.getValue().toString()) + Integer.parseInt(sp5.getValue().toString());
                break;
            case 6:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString())
                        + Integer.parseInt(sp4.getValue().toString()) + Integer.parseInt(sp5.getValue().toString()) + Integer.parseInt(sp6.getValue().toString());
                break;
            case 7:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString())
                        + Integer.parseInt(sp4.getValue().toString()) + Integer.parseInt(sp5.getValue().toString()) + Integer.parseInt(sp6.getValue().toString())
                        + Integer.parseInt(sp7.getValue().toString());
                break;
            case 8:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString())
                        + Integer.parseInt(sp4.getValue().toString()) + Integer.parseInt(sp5.getValue().toString()) + Integer.parseInt(sp6.getValue().toString())
                        + Integer.parseInt(sp7.getValue().toString()) + Integer.parseInt(sp8.getValue().toString());
                break;
            case 9:
                p1 = Integer.parseInt(sp1.getValue().toString()) + Integer.parseInt(sp2.getValue().toString()) + Integer.parseInt(sp3.getValue().toString())
                        + Integer.parseInt(sp4.getValue().toString()) + Integer.parseInt(sp5.getValue().toString()) + Integer.parseInt(sp6.getValue().toString())
                        + Integer.parseInt(sp7.getValue().toString()) + Integer.parseInt(sp8.getValue().toString()) + Integer.parseInt(sp9.getValue().toString());
                break;
            default:
                throw new AssertionError();
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Days = new javax.swing.JTextField();
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
        check_in = new com.toedter.calendar.JDateChooser();
        check_out = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sp1 = new javax.swing.JSpinner();
        sp2 = new javax.swing.JSpinner();
        sp3 = new javax.swing.JSpinner();
        sp4 = new javax.swing.JSpinner();
        sp5 = new javax.swing.JSpinner();
        sp6 = new javax.swing.JSpinner();
        sp7 = new javax.swing.JSpinner();
        sp8 = new javax.swing.JSpinner();
        sp9 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK IN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 150, -1));

        jLabel2.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHECK OUT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 147, -1));

        jButton1.setBackground(new java.awt.Color(222, 74, 16));
        jButton1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOCHES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, -1));

        Days.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        Days.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Days, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 50, -1));

        NUMBER_ROOM.setBackground(new java.awt.Color(255, 153, 51));
        NUMBER_ROOM.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        NUMBER_ROOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMBER_ROOMActionPerformed(evt);
            }
        });
        getContentPane().add(NUMBER_ROOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 170, -1));

        ROOM1.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM1.setText("HABITACION #1");
        getContentPane().add(ROOM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 30));

        ROOM2.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM2.setText("HABITACION #2");
        getContentPane().add(ROOM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, 30));

        ROOM3.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM3.setText("HABITACION #3");
        getContentPane().add(ROOM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, 30));

        ROOM4.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM4.setText("HABITACION #4");
        getContentPane().add(ROOM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, 30));

        ROOM5.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM5.setText("HABITACION #5");
        getContentPane().add(ROOM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, 30));

        ROOM6.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM6.setText("HABITACION #6");
        getContentPane().add(ROOM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, 30));

        ROOM7.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM7.setText("HABITACION #7");
        getContentPane().add(ROOM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, 30));

        ROOM8.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM8.setText("HABITACION #8");
        getContentPane().add(ROOM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, 30));

        ROOM9.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        ROOM9.setText("HABITACION #9");
        getContentPane().add(ROOM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, 30));
        getContentPane().add(check_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 150, -1));
        getContentPane().add(check_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, -1));

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SELECCIONA LA HABITACION A RESERVAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 500, -1));

        jButton2.setBackground(new java.awt.Color(222, 74, 16));
        jButton2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jButton2.setText("CONFIRMAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, -1));
        getContentPane().add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));
        getContentPane().add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));
        getContentPane().add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));
        getContentPane().add(sp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));
        getContentPane().add(sp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));
        getContentPane().add(sp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, -1, -1));
        getContentPane().add(sp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));
        getContentPane().add(sp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));
        getContentPane().add(sp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        noches();
        night = Days.getText();
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
                JOptionPane.showMessageDialog(null, "CONTACTANDO CON UN ASESOR...");
                NUMBER_ROOM.setSelectedIndex(0);
                disable();
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_NUMBER_ROOMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        n_personas();
        person = String.valueOf(p1);
        room = NUMBER_ROOM.getSelectedItem().toString();
        rvs = new Reserva(ingreso, salida, room, night, person);
        new PackClient(rvs).setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JSpinner sp1;
    public static javax.swing.JSpinner sp2;
    public static javax.swing.JSpinner sp3;
    public static javax.swing.JSpinner sp4;
    public static javax.swing.JSpinner sp5;
    public static javax.swing.JSpinner sp6;
    public static javax.swing.JSpinner sp7;
    public static javax.swing.JSpinner sp8;
    public static javax.swing.JSpinner sp9;
    // End of variables declaration//GEN-END:variables
}
