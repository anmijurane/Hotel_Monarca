package Service;

import Entidades.Reserva;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class addPackClient extends javax.swing.JFrame {

    String ingreso, salida, room, night, person;
    int p1, p2, p3, p4, p5, p6, p7, p8, p9;
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

    }
    
    public addPackClient(Reserva rvs) {
        initComponents();
        setLocationRelativeTo(null);
        this.rvs = rvs;
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
        check_in.setDateFormatString(rvs.getCheckIn());
        check_out.setDateFormatString(rvs.getCheckOut());
        Days.setText(rvs.getNoches());
        disable();

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

    public void n_personas() {

        int valor = NUMBER_ROOM.getSelectedIndex();
        switch (valor) {
            case 0:

                break;
            case 1:
                p1 = Integer.parseInt(PERSON1.getText());
                break;
            case 2:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText());
                break;
            case 3:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText());
                break;
            case 4:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText())
                        + Integer.parseInt(PERSON4.getText());
                break;
            case 5:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText())
                        + Integer.parseInt(PERSON4.getText()) + Integer.parseInt(PERSON5.getText());
                break;
            case 6:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText())
                        + Integer.parseInt(PERSON4.getText()) + Integer.parseInt(PERSON5.getText()) + Integer.parseInt(PERSON6.getText());
                break;
            case 7:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText())
                        + Integer.parseInt(PERSON4.getText()) + Integer.parseInt(PERSON5.getText()) + Integer.parseInt(PERSON6.getText())
                        + Integer.parseInt(PERSON7.getText());
                break;
            case 8:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText())
                        + Integer.parseInt(PERSON4.getText()) + Integer.parseInt(PERSON5.getText()) + Integer.parseInt(PERSON6.getText())
                        + Integer.parseInt(PERSON7.getText()) + Integer.parseInt(PERSON8.getText());
                break;
            case 9:
                p1 = Integer.parseInt(PERSON1.getText()) + Integer.parseInt(PERSON2.getText()) + Integer.parseInt(PERSON3.getText())
                        + Integer.parseInt(PERSON4.getText()) + Integer.parseInt(PERSON5.getText()) + Integer.parseInt(PERSON6.getText())
                        + Integer.parseInt(PERSON7.getText()) + Integer.parseInt(PERSON8.getText()) + Integer.parseInt(PERSON9.getText());
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
        PERSON1 = new javax.swing.JTextField();
        PERSON2 = new javax.swing.JTextField();
        PERSON3 = new javax.swing.JTextField();
        PERSON4 = new javax.swing.JTextField();
        PERSON5 = new javax.swing.JTextField();
        PERSON6 = new javax.swing.JTextField();
        PERSON7 = new javax.swing.JTextField();
        PERSON8 = new javax.swing.JTextField();
        PERSON9 = new javax.swing.JTextField();
        check_in = new com.toedter.calendar.JDateChooser();
        check_out = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOCHES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, -1));

        Days.setFont(new java.awt.Font("Candara Light", 0, 12)); // NOI18N
        Days.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Days, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 360, 50, -1));

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

        PERSON1.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 43, -1));

        PERSON2.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 43, -1));

        PERSON3.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 43, -1));

        PERSON4.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 43, -1));

        PERSON5.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 43, -1));

        PERSON6.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 43, -1));

        PERSON7.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 43, -1));

        PERSON8.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 43, -1));

        PERSON9.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        PERSON9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(PERSON9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 43, -1));
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
    public static javax.swing.JTextField PERSON1;
    public static javax.swing.JTextField PERSON2;
    public static javax.swing.JTextField PERSON3;
    public static javax.swing.JTextField PERSON4;
    public static javax.swing.JTextField PERSON5;
    public static javax.swing.JTextField PERSON6;
    public static javax.swing.JTextField PERSON7;
    public static javax.swing.JTextField PERSON8;
    public static javax.swing.JTextField PERSON9;
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
    // End of variables declaration//GEN-END:variables
}
