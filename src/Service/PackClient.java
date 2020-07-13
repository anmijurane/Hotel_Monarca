package Service;

import Entidades.Reserva;
import Entidades.Paquete;
import Entidades.Habitacion;
import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego C
 */
public class PackClient extends javax.swing.JFrame {

    Habitacion hab = new Habitacion();

    ArrayList<String> type_room = new ArrayList<>();
    Reserva rvs;
    Paquete pack;
    Connection Con = getConeccion();
    PreparedStatement ps;
    ResultSet rs;
    double total_reserva;
    String costo, id_room;
    String idHabitacionLocal;

    public PackClient() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        deshabilitar();
        room();
        type();
        costo();
    }

    public PackClient(Reserva rvs) {
        initComponents();
        this.rvs = rvs;
        fecha_ing.setText(rvs.getCheckIn());
        fecha_sal.setText(rvs.getCheckOut());
        noches.setText(rvs.getNoches());
        this.idHabitacionLocal = rvs.getHabitaciones();
        room.setText(idHabitacionLocal);
        huespedes.setText(rvs.getPersonas());
        setLocationRelativeTo(null);
        setResizable(false);
        deshabilitar();
        room();
        type();
        costo();
    }

    public void LlenarArreglo() {
        int room = new Integer(idHabitacionLocal);
        switch (room) {
            case 0:
                System.out.println("HO-HO");
                break;
            case 1:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                break;
            case 2:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                break;
            case 3:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                break;
            case 4:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                break;
            case 5:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                break;
            case 6:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                pack.addArrIdHabitaciones(query_idroom(type_6.getSelectedItem().toString()), huesp_6.getText());
                break;
            case 7:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                pack.addArrIdHabitaciones(query_idroom(type_6.getSelectedItem().toString()), huesp_6.getText());
                pack.addArrIdHabitaciones(query_idroom(type_7.getSelectedItem().toString()), huesp_7.getText());

                break;
            case 8:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                pack.addArrIdHabitaciones(query_idroom(type_6.getSelectedItem().toString()), huesp_6.getText());
                pack.addArrIdHabitaciones(query_idroom(type_7.getSelectedItem().toString()), huesp_7.getText());
                pack.addArrIdHabitaciones(query_idroom(type_8.getSelectedItem().toString()), huesp_8.getText());
                break;
            case 9:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                pack.addArrIdHabitaciones(query_idroom(type_6.getSelectedItem().toString()), huesp_6.getText());
                pack.addArrIdHabitaciones(query_idroom(type_7.getSelectedItem().toString()), huesp_7.getText());
                pack.addArrIdHabitaciones(query_idroom(type_8.getSelectedItem().toString()), huesp_8.getText());
                pack.addArrIdHabitaciones(query_idroom(type_9.getSelectedItem().toString()), huesp_9.getText());

                break;
            default:
                throw new AssertionError();
        }
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

        huesp_1.setText(addPackClient.sp1.getValue().toString());

    }

    public void habilitar_C2() {

        type_1.setVisible(true);
        huesp_1.setVisible(true);
        price_1.setVisible(true);
        type_2.setVisible(true);
        huesp_2.setVisible(true);
        price_2.setVisible(true);

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());
        huesp_4.setText(addPackClient.sp4.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());
        huesp_4.setText(addPackClient.sp4.getValue().toString());
        huesp_5.setText(addPackClient.sp5.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());
        huesp_4.setText(addPackClient.sp4.getValue().toString());
        huesp_5.setText(addPackClient.sp5.getValue().toString());
        huesp_6.setText(addPackClient.sp6.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());
        huesp_4.setText(addPackClient.sp4.getValue().toString());
        huesp_5.setText(addPackClient.sp5.getValue().toString());
        huesp_6.setText(addPackClient.sp6.getValue().toString());
        huesp_7.setText(addPackClient.sp7.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());
        huesp_4.setText(addPackClient.sp4.getValue().toString());
        huesp_5.setText(addPackClient.sp5.getValue().toString());
        huesp_6.setText(addPackClient.sp6.getValue().toString());
        huesp_7.setText(addPackClient.sp7.getValue().toString());
        huesp_8.setText(addPackClient.sp8.getValue().toString());

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

        huesp_1.setText(addPackClient.sp1.getValue().toString());
        huesp_2.setText(addPackClient.sp2.getValue().toString());
        huesp_3.setText(addPackClient.sp3.getValue().toString());
        huesp_4.setText(addPackClient.sp4.getValue().toString());
        huesp_5.setText(addPackClient.sp5.getValue().toString());
        huesp_6.setText(addPackClient.sp6.getValue().toString());
        huesp_7.setText(addPackClient.sp7.getValue().toString());
        huesp_8.setText(addPackClient.sp8.getValue().toString());
        huesp_9.setText(addPackClient.sp9.getValue().toString());

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

    public void query_(int person) {

        try {

            ps = Con.prepareStatement("select * from categoria where capacidad = " + person);
            rs = ps.executeQuery();

            while (rs.next()) {
                String resultado = rs.getString("categoria");
                type_room.add(resultado);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PackClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int query_idroom(String type) {
        int identificador = 0;
        try {

            ps = Con.prepareStatement("select min(habitacion.id_habitacion) as idHabitacion, categoria.categoria from habitacion, categoria WHERE id_estado = 1 & 3 and categoria.categoria = '" + type + "' and habitacion.id_categoria = categoria.id_categoria");
            rs = ps.executeQuery();

            if (rs.next()) {
                identificador = rs.getInt("idHabitacion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PackClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return identificador;
    }

    public void query_price(String type) {

        try {

            ps = Con.prepareStatement("select * from categoria where categoria = '" + type + "'");
            rs = ps.executeQuery();

            if (rs.next()) {
                costo = rs.getString("costo");
            }

        } catch (SQLException e) {
        }

    }

    public void type() {

        int valor = Integer.parseInt(room.getText());

        switch (valor) {
            case 1:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                price1();
                break;
            case 2:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                price2();
                break;
            case 3:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                price3();
                break;
            case 4:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_4.getText()));
                type_room.forEach(type -> {
                    type_4.addItem(type.toUpperCase());
                });
                price4();
                break;
            case 5:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_4.getText()));
                type_room.forEach(type -> {
                    type_4.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_5.getText()));
                type_room.forEach(type -> {
                    type_5.addItem(type.toUpperCase());
                });
                price5();
                break;
            case 6:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_4.getText()));
                type_room.forEach(type -> {
                    type_4.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_5.getText()));
                type_room.forEach(type -> {
                    type_5.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_6.getText()));
                type_room.forEach(type -> {
                    type_6.addItem(type.toUpperCase());
                });
                price6();
                break;
            case 7:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_4.getText()));
                type_room.forEach(type -> {
                    type_4.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_5.getText()));
                type_room.forEach(type -> {
                    type_5.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_6.getText()));
                type_room.forEach(type -> {
                    type_6.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_7.getText()));
                type_room.forEach(type -> {
                    type_7.addItem(type.toUpperCase());
                });
                price7();
                break;
            case 8:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_4.getText()));
                type_room.forEach(type -> {
                    type_4.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_5.getText()));
                type_room.forEach(type -> {
                    type_5.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_6.getText()));
                type_room.forEach(type -> {
                    type_6.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_7.getText()));
                type_room.forEach(type -> {
                    type_7.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_8.getText()));
                type_room.forEach(type -> {
                    type_8.addItem(type.toUpperCase());
                });
                price8();
                break;
            case 9:
                query_(Integer.parseInt(huesp_1.getText()));
                type_room.forEach(type -> {
                    type_1.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_2.getText()));
                type_room.forEach(type -> {
                    type_2.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_3.getText()));
                type_room.forEach(type -> {
                    type_3.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_4.getText()));
                type_room.forEach(type -> {
                    type_4.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_5.getText()));
                type_room.forEach(type -> {
                    type_5.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_6.getText()));
                type_room.forEach(type -> {
                    type_6.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_7.getText()));
                type_room.forEach(type -> {
                    type_7.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_8.getText()));
                type_room.forEach(type -> {
                    type_8.addItem(type.toUpperCase());
                });
                type_room.clear();
                query_(Integer.parseInt(huesp_9.getText()));
                type_room.forEach(type -> {
                    type_9.addItem(type.toUpperCase());
                });
                price9();
                break;
            default:
                throw new AssertionError();
        }

    }

    public void price1() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_idroom(type_1.getSelectedItem().toString());
    }

    public void price2() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
    }

    public void price3() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
    }

    public void price4() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
    }

    public void price5() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
        query_price(type_5.getSelectedItem().toString());
        price_5.setText(costo);
    }

    public void price6() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
        query_price(type_5.getSelectedItem().toString());
        price_5.setText(costo);
        query_price(type_6.getSelectedItem().toString());
        price_6.setText(costo);
    }

    public void price7() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
        query_price(type_5.getSelectedItem().toString());
        price_5.setText(costo);
        query_price(type_6.getSelectedItem().toString());
        price_6.setText(costo);
        query_price(type_7.getSelectedItem().toString());
        price_7.setText(costo);
    }

    public void price8() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
        query_price(type_5.getSelectedItem().toString());
        price_5.setText(costo);
        query_price(type_6.getSelectedItem().toString());
        price_6.setText(costo);
        query_price(type_7.getSelectedItem().toString());
        price_7.setText(costo);
        query_price(type_8.getSelectedItem().toString());
        price_8.setText(costo);
    }

    public void price9() {
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
        query_price(type_5.getSelectedItem().toString());
        price_5.setText(costo);
        query_price(type_6.getSelectedItem().toString());
        price_6.setText(costo);
        query_price(type_7.getSelectedItem().toString());
        price_7.setText(costo);
        query_price(type_8.getSelectedItem().toString());
        price_8.setText(costo);
        query_price(type_9.getSelectedItem().toString());
        price_9.setText(costo);
    }

    public void costo() {

        int valor = Integer.parseInt(room.getText());

        switch (valor) {
            case 1:
                total_reserva = Double.valueOf(price_1.getText()) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 2:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 3:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 4:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())
                        + Double.valueOf(price_4.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 5:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())
                        + Double.valueOf(price_4.getText()) + Double.valueOf(price_5.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 6:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())
                        + Double.valueOf(price_4.getText()) + Double.valueOf(price_5.getText()) + Double.valueOf(price_6.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 7:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())
                        + Double.valueOf(price_4.getText()) + Double.valueOf(price_5.getText()) + Double.valueOf(price_6.getText())
                        + Double.valueOf(price_7.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 8:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())
                        + Double.valueOf(price_4.getText()) + Double.valueOf(price_5.getText()) + Double.valueOf(price_6.getText())
                        + Double.valueOf(price_7.getText()) + Double.valueOf(price_8.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
                break;
            case 9:
                total_reserva = (Double.valueOf(price_1.getText()) + Double.valueOf(price_2.getText()) + Double.valueOf(price_3.getText())
                        + Double.valueOf(price_4.getText()) + Double.valueOf(price_5.getText()) + Double.valueOf(price_6.getText())
                        + Double.valueOf(price_7.getText()) + Double.valueOf(price_8.getText()) + Double.valueOf(price_9.getText())) * Double.valueOf(noches.getText());
                t_price.setText(String.valueOf(total_reserva));
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
        jLabel5 = new javax.swing.JLabel();
        t_price = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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

        type_1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                type_1ItemStateChanged(evt);
            }
        });
        type_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_1MouseClicked(evt);
            }
        });
        type_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_1ActionPerformed(evt);
            }
        });
        jPanel1.add(type_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 100, -1));

        type_2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                type_2ItemStateChanged(evt);
            }
        });
        type_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_2MouseClicked(evt);
            }
        });
        type_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_2ActionPerformed(evt);
            }
        });
        jPanel1.add(type_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 90, 100, -1));

        type_3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_3MouseClicked(evt);
            }
        });
        type_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_3ActionPerformed(evt);
            }
        });
        jPanel1.add(type_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 118, 100, -1));

        type_4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_4MouseClicked(evt);
            }
        });
        type_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_4ActionPerformed(evt);
            }
        });
        jPanel1.add(type_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 146, 100, -1));

        type_5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_5MouseClicked(evt);
            }
        });
        type_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_5ActionPerformed(evt);
            }
        });
        jPanel1.add(type_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 174, 100, -1));

        type_6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_6MouseClicked(evt);
            }
        });
        type_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_6ActionPerformed(evt);
            }
        });
        jPanel1.add(type_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 202, 100, -1));

        type_7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_7MouseClicked(evt);
            }
        });
        type_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_7ActionPerformed(evt);
            }
        });
        jPanel1.add(type_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, 100, -1));

        type_8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_8MouseClicked(evt);
            }
        });
        type_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_8ActionPerformed(evt);
            }
        });
        jPanel1.add(type_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 258, 100, -1));

        type_9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        type_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                type_9MouseClicked(evt);
            }
        });
        type_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_9ActionPerformed(evt);
            }
        });
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TOTAL");

        t_price.setText("jLabel6");

        jButton2.setText("CONFIRMAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(huespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha_sal)
                            .addComponent(noches)
                            .addComponent(room)
                            .addComponent(fecha_ing)
                            .addComponent(t_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton2))
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t_price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        costo();
        this.pack = new Paquete(huespedes.getText(), fecha_ing.getText(), fecha_sal.getText(), t_price.getText());
        new FormAddClient(pack).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void type_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_1ActionPerformed
        query_price(type_1.getSelectedItem().toString());
        price_1.setText(costo);
    }//GEN-LAST:event_type_1ActionPerformed

    private void type_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_2ActionPerformed
        query_price(type_2.getSelectedItem().toString());
        price_2.setText(costo);
    }//GEN-LAST:event_type_2ActionPerformed

    private void type_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_3ActionPerformed
        query_price(type_3.getSelectedItem().toString());
        price_3.setText(costo);
    }//GEN-LAST:event_type_3ActionPerformed

    private void type_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_4ActionPerformed
        query_price(type_4.getSelectedItem().toString());
        price_4.setText(costo);
    }//GEN-LAST:event_type_4ActionPerformed

    private void type_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_5ActionPerformed
        query_price(type_5.getSelectedItem().toString());
        price_5.setText(costo);
    }//GEN-LAST:event_type_5ActionPerformed

    private void type_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_6ActionPerformed
        query_price(type_6.getSelectedItem().toString());
        price_6.setText(costo);
    }//GEN-LAST:event_type_6ActionPerformed

    private void type_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_7ActionPerformed
        query_price(type_7.getSelectedItem().toString());
        price_7.setText(costo);
    }//GEN-LAST:event_type_7ActionPerformed

    private void type_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_8ActionPerformed
        query_price(type_8.getSelectedItem().toString());
        price_8.setText(costo);
    }//GEN-LAST:event_type_8ActionPerformed

    private void type_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_9ActionPerformed
        query_price(type_9.getSelectedItem().toString());
        price_9.setText(costo);
    }//GEN-LAST:event_type_9ActionPerformed

    private void type_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_1MouseClicked

    }//GEN-LAST:event_type_1MouseClicked

    private void type_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_2MouseClicked

    }//GEN-LAST:event_type_2MouseClicked

    private void type_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_3MouseClicked

    }//GEN-LAST:event_type_3MouseClicked

    private void type_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_4MouseClicked

    }//GEN-LAST:event_type_4MouseClicked

    private void type_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_5MouseClicked

    }//GEN-LAST:event_type_5MouseClicked

    private void type_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_6MouseClicked

    }//GEN-LAST:event_type_6MouseClicked

    private void type_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_7MouseClicked

    }//GEN-LAST:event_type_7MouseClicked

    private void type_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_8MouseClicked

    }//GEN-LAST:event_type_8MouseClicked

    private void type_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_type_9MouseClicked

    }//GEN-LAST:event_type_9MouseClicked

    private void type_1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type_1ItemStateChanged
    }//GEN-LAST:event_type_1ItemStateChanged

    private void type_2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type_2ItemStateChanged
    }//GEN-LAST:event_type_2ItemStateChanged
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel t_price;
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
