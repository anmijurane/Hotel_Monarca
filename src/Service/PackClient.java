package Service;

import Entidades.Reserva;
import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego C
 */
public class PackClient extends javax.swing.JFrame {

    Reserva rvs;
    Connection Con = getConeccion();
    PreparedStatement ps;
    ResultSet rs;
    String costo;

    public PackClient() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        deshabilitar();
        room();
        query();
        //sele_room();
        type_room();

    }

    public PackClient(Reserva rvs) {
        initComponents();
        this.rvs = rvs;
        fecha_ing.setText(rvs.getCheckIn());
        fecha_sal.setText(rvs.getCheckOut());
        noches.setText(rvs.getNoches());
        room.setText(rvs.getHabitaciones());
        huespedes.setText(rvs.getPersonas());
        setLocationRelativeTo(null);
        setResizable(false);
        deshabilitar();
        room();
        query();
        //sele_room();
        type_room();

    }

    public void deshabilitar() {

        type_1.setVisible(false);
        type_2.setVisible(false);
        type_3.setVisible(false);
        type_4.setVisible(false);
        type_5.setVisible(false);
        type_6.setVisible(false);
        type_7.setVisible(false);
        type_8.setVisible(false);
        type_9.setVisible(false);

        huesp_1.setVisible(false);
        huesp_2.setVisible(false);
        huesp_3.setVisible(false);
        huesp_4.setVisible(false);
        huesp_5.setVisible(false);
        huesp_6.setVisible(false);
        huesp_7.setVisible(false);
        huesp_8.setVisible(false);
        huesp_9.setVisible(false);

        price_1.setVisible(false);
        price_2.setVisible(false);
        price_3.setVisible(false);
        price_4.setVisible(false);
        price_5.setVisible(false);
        price_6.setVisible(false);
        price_7.setVisible(false);
        price_8.setVisible(false);
        price_9.setVisible(false);

    }

    public void habilitar_C1() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());

    }

    public void habilitar_C2() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());

    }

    public void habilitar_C3() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());

    }

    public void habilitar_C4() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);
        type_4.setVisible(true);
        huesp_4.setVisible(true);
        price_4.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());
        huesp_4.setText(addPackClient.PERSON4.getText());

    }

    public void habilitar_C5() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);
        type_4.setVisible(true);
        huesp_4.setVisible(true);
        price_4.setVisible(true);
        type_5.setVisible(true);
        huesp_5.setVisible(true);
        price_5.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());
        huesp_4.setText(addPackClient.PERSON4.getText());
        huesp_5.setText(addPackClient.PERSON5.getText());

    }

    public void habilitar_C6() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);
        type_4.setVisible(true);
        huesp_4.setVisible(true);
        price_4.setVisible(true);
        type_5.setVisible(true);
        huesp_5.setVisible(true);
        price_5.setVisible(true);
        type_6.setVisible(true);
        huesp_6.setVisible(true);
        price_6.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());
        huesp_4.setText(addPackClient.PERSON4.getText());
        huesp_5.setText(addPackClient.PERSON5.getText());
        huesp_6.setText(addPackClient.PERSON6.getText());

    }

    public void habilitar_C7() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);
        type_4.setVisible(true);
        huesp_4.setVisible(true);
        price_4.setVisible(true);
        type_5.setVisible(true);
        huesp_5.setVisible(true);
        price_5.setVisible(true);
        type_6.setVisible(true);
        huesp_6.setVisible(true);
        price_6.setVisible(true);
        type_7.setVisible(true);
        huesp_7.setVisible(true);
        price_7.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());
        huesp_4.setText(addPackClient.PERSON4.getText());
        huesp_5.setText(addPackClient.PERSON5.getText());
        huesp_6.setText(addPackClient.PERSON6.getText());
        huesp_7.setText(addPackClient.PERSON7.getText());

    }

    public void habilitar_C8() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);
        type_4.setVisible(true);
        huesp_4.setVisible(true);
        price_4.setVisible(true);
        type_5.setVisible(true);
        huesp_5.setVisible(true);
        price_5.setVisible(true);
        type_6.setVisible(true);
        huesp_6.setVisible(true);
        price_6.setVisible(true);
        type_7.setVisible(true);
        huesp_7.setVisible(true);
        price_7.setVisible(true);
        type_8.setVisible(true);
        huesp_8.setVisible(true);
        price_8.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());
        huesp_4.setText(addPackClient.PERSON4.getText());
        huesp_5.setText(addPackClient.PERSON5.getText());
        huesp_6.setText(addPackClient.PERSON6.getText());
        huesp_7.setText(addPackClient.PERSON7.getText());
        huesp_8.setText(addPackClient.PERSON8.getText());

    }

    public void habilitar_C9() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);
        type_3.setVisible(true);
        huesp_3.setVisible(true);
        price_3.setVisible(true);
        type_4.setVisible(true);
        huesp_4.setVisible(true);
        price_4.setVisible(true);
        type_5.setVisible(true);
        huesp_5.setVisible(true);
        price_5.setVisible(true);
        type_6.setVisible(true);
        huesp_6.setVisible(true);
        price_6.setVisible(true);
        type_7.setVisible(true);
        huesp_7.setVisible(true);
        price_7.setVisible(true);
        type_8.setVisible(true);
        huesp_8.setVisible(true);
        price_8.setVisible(true);
        type_9.setVisible(true);
        huesp_9.setVisible(true);
        price_9.setVisible(true);

        huesp_1.setText(addPackClient.PERSON1.getText());
        huesp_2.setText(addPackClient.PERSON2.getText());
        huesp_3.setText(addPackClient.PERSON3.getText());
        huesp_4.setText(addPackClient.PERSON4.getText());
        huesp_5.setText(addPackClient.PERSON5.getText());
        huesp_6.setText(addPackClient.PERSON6.getText());
        huesp_7.setText(addPackClient.PERSON7.getText());
        huesp_8.setText(addPackClient.PERSON8.getText());
        huesp_9.setText(addPackClient.PERSON9.getText());

    }

    public void room() {

        int valor = Integer.parseInt(room.getText());

        switch (valor) {
            case 1:
                habilitar_C1();
                break;
            case 2:
                habilitar_C2();
                break;
            case 3:
                habilitar_C3();
                break;
            case 4:
                habilitar_C4();
                break;
            case 5:
                habilitar_C5();
                break;
            case 6:
                habilitar_C6();
                break;
            case 7:
                habilitar_C7();
                break;
            case 8:
                habilitar_C8();
                break;
            case 9:
                habilitar_C9();
                break;
            default:
                throw new AssertionError();
        }
    }

    public void query() {

        try {

            type_1.addItem("");
            type_2.addItem("");
            type_3.addItem("");
            type_4.addItem("");
            type_5.addItem("");
            type_6.addItem("");
            type_7.addItem("");
            type_8.addItem("");
            type_9.addItem("");

            ps = Con.prepareStatement("select * from categoria");
            rs = ps.executeQuery();

            while (rs.next()) {
                type_1.addItem(rs.getString("categoria").toUpperCase());
                type_2.addItem(rs.getString("categoria").toUpperCase());
                type_3.addItem(rs.getString("categoria").toUpperCase());
                type_4.addItem(rs.getString("categoria").toUpperCase());
                type_5.addItem(rs.getString("categoria").toUpperCase());
                type_6.addItem(rs.getString("categoria").toUpperCase());
                type_7.addItem(rs.getString("categoria").toUpperCase());
                type_8.addItem(rs.getString("categoria").toUpperCase());
                type_9.addItem(rs.getString("categoria").toUpperCase());

            }

        } catch (SQLException ex) {
            Logger.getLogger(PackClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void type_room() {

        int valor = Integer.parseInt(room.getText());

        switch (valor) {
            case 1:
                sele_room();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                break;
            case 2:
                sele_room();
                sele_room2();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                break;
            case 3:
                sele_room();
                sele_room2();
                sele_room3();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                break;
            case 4:
                sele_room();
                sele_room2();
                sele_room3();
                sele_room4();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                query_(type_4.getSelectedItem().toString());
                price_4.setText(costo);
                break;
            case 5:
                sele_room();
                sele_room2();
                sele_room3();
                sele_room4();
                sele_room5();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                query_(type_4.getSelectedItem().toString());
                price_4.setText(costo);
                query_(type_5.getSelectedItem().toString());
                price_5.setText(costo);
                break;
            case 6:
                sele_room();
                sele_room2();
                sele_room3();
                sele_room4();
                sele_room5();
                sele_room6();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                query_(type_4.getSelectedItem().toString());
                price_4.setText(costo);
                query_(type_5.getSelectedItem().toString());
                price_5.setText(costo);
                query_(type_6.getSelectedItem().toString());
                price_6.setText(costo);
                break;
            case 7:
                sele_room();
                sele_room2();
                sele_room3();
                sele_room4();
                sele_room5();
                sele_room6();
                sele_room7();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                query_(type_4.getSelectedItem().toString());
                price_4.setText(costo);
                query_(type_5.getSelectedItem().toString());
                price_5.setText(costo);
                query_(type_6.getSelectedItem().toString());
                price_6.setText(costo);
                query_(type_7.getSelectedItem().toString());
                price_7.setText(costo);
                break;
            case 8:
                sele_room();
                sele_room2();
                sele_room3();
                sele_room4();
                sele_room5();
                sele_room6();
                sele_room7();
                sele_room8();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                query_(type_4.getSelectedItem().toString());
                price_4.setText(costo);
                query_(type_5.getSelectedItem().toString());
                price_5.setText(costo);
                query_(type_6.getSelectedItem().toString());
                price_6.setText(costo);
                query_(type_7.getSelectedItem().toString());
                price_7.setText(costo);
                query_(type_8.getSelectedItem().toString());
                price_8.setText(costo);
                break;
            case 9:
                sele_room();
                sele_room2();
                sele_room3();
                sele_room4();
                sele_room5();
                sele_room6();
                sele_room7();
                sele_room8();
                sele_room9();
                query_(type_1.getSelectedItem().toString());
                price_1.setText(costo);
                query_(type_2.getSelectedItem().toString());
                price_2.setText(costo);
                query_(type_3.getSelectedItem().toString());
                price_3.setText(costo);
                query_(type_4.getSelectedItem().toString());
                price_4.setText(costo);
                query_(type_5.getSelectedItem().toString());
                price_5.setText(costo);
                query_(type_6.getSelectedItem().toString());
                price_6.setText(costo);
                query_(type_7.getSelectedItem().toString());
                price_7.setText(costo);
                query_(type_8.getSelectedItem().toString());
                price_8.setText(costo);
                query_(type_9.getSelectedItem().toString());
                price_9.setText(costo);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room() {

        int valor = Integer.parseInt(huesp_1.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_1.setSelectedIndex(1);
                break;
            case 2:
                type_1.setSelectedIndex(2);
                break;
            case 3:
                type_1.setSelectedIndex(3);
                break;
            case 4:
                type_1.setSelectedIndex(4);
                break;
            case 5:
                type_1.setSelectedIndex(5);
                break;
            case 6:
                type_1.setSelectedIndex(6);
                break;
            case 7:
                type_1.setSelectedIndex(7);
                break;
            case 8:
                type_1.setSelectedIndex(8);
                break;
            case 9:
                type_1.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room2() {

        int valor = Integer.parseInt(huesp_2.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_2.setSelectedIndex(1);
                break;
            case 2:
                type_2.setSelectedIndex(2);
                break;
            case 3:
                type_2.setSelectedIndex(3);
                break;
            case 4:
                type_2.setSelectedIndex(4);
                break;
            case 5:
                type_2.setSelectedIndex(5);
                break;
            case 6:
                type_2.setSelectedIndex(6);
                break;
            case 7:
                type_2.setSelectedIndex(7);
                break;
            case 8:
                type_2.setSelectedIndex(8);
                break;
            case 9:
                type_2.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room3() {

        int valor = Integer.parseInt(huesp_3.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_3.setSelectedIndex(1);
                break;
            case 2:
                type_3.setSelectedIndex(2);
                break;
            case 3:
                type_3.setSelectedIndex(3);
                break;
            case 4:
                type_3.setSelectedIndex(4);
                break;
            case 5:
                type_3.setSelectedIndex(5);
                break;
            case 6:
                type_3.setSelectedIndex(6);
                break;
            case 7:
                type_3.setSelectedIndex(7);
                break;
            case 8:
                type_3.setSelectedIndex(8);
                break;
            case 9:
                type_3.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room4() {

        int valor = Integer.parseInt(huesp_4.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_4.setSelectedIndex(1);
                break;
            case 2:
                type_4.setSelectedIndex(2);
                break;
            case 3:
                type_4.setSelectedIndex(3);
                break;
            case 4:
                type_4.setSelectedIndex(4);
                break;
            case 5:
                type_4.setSelectedIndex(5);
                break;
            case 6:
                type_4.setSelectedIndex(6);
                break;
            case 7:
                type_4.setSelectedIndex(7);
                break;
            case 8:
                type_4.setSelectedIndex(8);
                break;
            case 9:
                type_4.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room5() {

        int valor = Integer.parseInt(huesp_5.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_5.setSelectedIndex(1);
                break;
            case 2:
                type_5.setSelectedIndex(2);
                break;
            case 3:
                type_5.setSelectedIndex(3);
                break;
            case 4:
                type_5.setSelectedIndex(4);
                break;
            case 5:
                type_5.setSelectedIndex(5);
                break;
            case 6:
                type_5.setSelectedIndex(6);
                break;
            case 7:
                type_5.setSelectedIndex(7);
                break;
            case 8:
                type_5.setSelectedIndex(8);
                break;
            case 9:
                type_5.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room6() {

        int valor = Integer.parseInt(huesp_6.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_6.setSelectedIndex(1);
                break;
            case 2:
                type_6.setSelectedIndex(2);
                break;
            case 3:
                type_6.setSelectedIndex(3);
                break;
            case 4:
                type_6.setSelectedIndex(4);
                break;
            case 5:
                type_6.setSelectedIndex(5);
                break;
            case 6:
                type_6.setSelectedIndex(6);
                break;
            case 7:
                type_6.setSelectedIndex(7);
                break;
            case 8:
                type_6.setSelectedIndex(8);
                break;
            case 9:
                type_6.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room7() {

        int valor = Integer.parseInt(huesp_7.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_7.setSelectedIndex(1);
                break;
            case 2:
                type_7.setSelectedIndex(2);
                break;
            case 3:
                type_7.setSelectedIndex(3);
                break;
            case 4:
                type_7.setSelectedIndex(4);
                break;
            case 5:
                type_7.setSelectedIndex(5);
                break;
            case 6:
                type_7.setSelectedIndex(6);
                break;
            case 7:
                type_7.setSelectedIndex(7);
                break;
            case 8:
                type_7.setSelectedIndex(8);
                break;
            case 9:
                type_7.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room8() {

        int valor = Integer.parseInt(huesp_8.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_8.setSelectedIndex(1);
                break;
            case 2:
                type_8.setSelectedIndex(2);
                break;
            case 3:
                type_8.setSelectedIndex(3);
                break;
            case 4:
                type_8.setSelectedIndex(4);
                break;
            case 5:
                type_8.setSelectedIndex(5);
                break;
            case 6:
                type_8.setSelectedIndex(6);
                break;
            case 7:
                type_8.setSelectedIndex(7);
                break;
            case 8:
                type_8.setSelectedIndex(8);
                break;
            case 9:
                type_8.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void sele_room9() {

        int valor = Integer.parseInt(huesp_9.getText());

        switch (valor) {
            case 0:
                break;
            case 1:
                type_9.setSelectedIndex(1);
                break;
            case 2:
                type_9.setSelectedIndex(2);
                break;
            case 3:
                type_9.setSelectedIndex(3);
                break;
            case 4:
                type_9.setSelectedIndex(4);
                break;
            case 5:
                type_9.setSelectedIndex(5);
                break;
            case 6:
                type_9.setSelectedIndex(6);
                break;
            case 7:
                type_9.setSelectedIndex(7);
                break;
            case 8:
                type_9.setSelectedIndex(8);
                break;
            case 9:
                type_9.setSelectedIndex(9);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void query_(String type) {

        try {
            
            ps = Con.prepareStatement("select * from categoria where categoria = '"+type+"'");
            rs = ps.executeQuery();
            
            if(rs.next()){
                costo = rs.getString("costo");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PackClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha_ing = new javax.swing.JLabel();
        fecha_sal = new javax.swing.JLabel();
        noches = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        huespedes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        type_1 = new javax.swing.JComboBox<>();
        type_2 = new javax.swing.JComboBox<>();
        type_3 = new javax.swing.JComboBox<>();
        type_4 = new javax.swing.JComboBox<>();
        type_5 = new javax.swing.JComboBox<>();
        type_6 = new javax.swing.JComboBox<>();
        type_7 = new javax.swing.JComboBox<>();
        type_8 = new javax.swing.JComboBox<>();
        type_9 = new javax.swing.JComboBox<>();
        huesp_1 = new javax.swing.JLabel();
        huesp_2 = new javax.swing.JLabel();
        huesp_3 = new javax.swing.JLabel();
        huesp_4 = new javax.swing.JLabel();
        huesp_5 = new javax.swing.JLabel();
        huesp_6 = new javax.swing.JLabel();
        huesp_7 = new javax.swing.JLabel();
        huesp_8 = new javax.swing.JLabel();
        huesp_9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        price_1 = new javax.swing.JLabel();
        price_2 = new javax.swing.JLabel();
        price_3 = new javax.swing.JLabel();
        price_4 = new javax.swing.JLabel();
        price_5 = new javax.swing.JLabel();
        price_6 = new javax.swing.JLabel();
        price_7 = new javax.swing.JLabel();
        price_8 = new javax.swing.JLabel();
        price_9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("FECHA DE INGRESO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("FECHA DE SALIDA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NOCHES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("HABITACIONES");

        fecha_ing.setText("jLabel5");

        fecha_sal.setText("jLabel6");

        noches.setText("jLabel7");

        room.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("HUESPEDES");

        huespedes.setText("jLabel10");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Paquete"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(type_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 100, -1));

        jPanel1.add(type_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 90, 100, -1));

        jPanel1.add(type_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 118, 100, -1));

        jPanel1.add(type_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 146, 100, -1));

        jPanel1.add(type_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 174, 100, -1));

        jPanel1.add(type_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 202, 100, -1));

        jPanel1.add(type_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, 100, -1));

        jPanel1.add(type_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 258, 100, -1));

        jPanel1.add(type_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 286, 100, -1));

        huesp_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_1.setText("jLabel5");
        jPanel1.add(huesp_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 66, 48, -1));

        huesp_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_2.setText("jLabel6");
        jPanel1.add(huesp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 94, 48, -1));

        huesp_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_3.setText("jLabel7");
        jPanel1.add(huesp_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 122, 48, -1));

        huesp_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_4.setText("jLabel8");
        jPanel1.add(huesp_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 150, 48, -1));

        huesp_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_5.setText("jLabel10");
        jPanel1.add(huesp_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 178, 48, -1));

        huesp_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_6.setText("jLabel11");
        jPanel1.add(huesp_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 206, 48, -1));

        huesp_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_7.setText("jLabel12");
        jPanel1.add(huesp_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 234, 48, -1));

        huesp_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_8.setText("jLabel13");
        jPanel1.add(huesp_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 262, 48, -1));

        huesp_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_9.setText("jLabel14");
        jPanel1.add(huesp_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 290, 48, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TIPO DE HABITACION");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel16.setText("HUESPEDES");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 27, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel17.setText("COSTO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 27, -1, -1));

        price_1.setText("jLabel18");
        jPanel1.add(price_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 66, -1, -1));

        price_2.setText("jLabel19");
        jPanel1.add(price_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 94, -1, -1));

        price_3.setText("jLabel20");
        jPanel1.add(price_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 122, -1, -1));

        price_4.setText("jLabel21");
        jPanel1.add(price_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 150, -1, -1));

        price_5.setText("jLabel22");
        jPanel1.add(price_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 178, -1, -1));

        price_6.setText("jLabel23");
        jPanel1.add(price_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 206, -1, -1));

        price_7.setText("jLabel24");
        jPanel1.add(price_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 234, -1, -1));

        price_8.setText("jLabel25");
        jPanel1.add(price_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 262, -1, -1));

        price_9.setText("jLabel26");
        jPanel1.add(price_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 290, -1, -1));

        jButton1.setText("REGRESAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(huespedes)
                            .addComponent(fecha_sal)
                            .addComponent(noches)
                            .addComponent(room)
                            .addComponent(fecha_ing)))
                    .addComponent(jButton1))
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fecha_ing))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fecha_sal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(noches))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(room))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(huespedes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(PackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PackClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha_ing;
    private javax.swing.JLabel fecha_sal;
    private javax.swing.JLabel huesp_1;
    private javax.swing.JLabel huesp_2;
    private javax.swing.JLabel huesp_3;
    private javax.swing.JLabel huesp_4;
    private javax.swing.JLabel huesp_5;
    private javax.swing.JLabel huesp_6;
    private javax.swing.JLabel huesp_7;
    private javax.swing.JLabel huesp_8;
    private javax.swing.JLabel huesp_9;
    private javax.swing.JLabel huespedes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel noches;
    private javax.swing.JLabel price_1;
    private javax.swing.JLabel price_2;
    private javax.swing.JLabel price_3;
    private javax.swing.JLabel price_4;
    private javax.swing.JLabel price_5;
    private javax.swing.JLabel price_6;
    private javax.swing.JLabel price_7;
    private javax.swing.JLabel price_8;
    private javax.swing.JLabel price_9;
    private javax.swing.JLabel room;
    private javax.swing.JComboBox<String> type_1;
    private javax.swing.JComboBox<String> type_2;
    private javax.swing.JComboBox<String> type_3;
    private javax.swing.JComboBox<String> type_4;
    private javax.swing.JComboBox<String> type_5;
    private javax.swing.JComboBox<String> type_6;
    private javax.swing.JComboBox<String> type_7;
    private javax.swing.JComboBox<String> type_8;
    private javax.swing.JComboBox<String> type_9;
    // End of variables declaration//GEN-END:variables
}
