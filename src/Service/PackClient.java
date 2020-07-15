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
public final class PackClient extends javax.swing.JFrame {

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
        setTitle("PAQUETE CLIENTE");
        setResizable(false);
        deshabilitar();
        room();
        type();
        costo();
        LlenarArreglo();
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
        type();
        costo();
        LlenarArreglo();
    }

    public void LlenarArreglo() {
        int room_ = Integer.parseInt(room.getText());
        this.pack = new Paquete("", "", "$"+total_reserva);
        switch (room_) {
            case 0:
                System.out.println("HO-HO");
                break;
            case 1:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
                break;
            case 2:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
                break;
            case 3:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
                break;
            case 4:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
                break;
            case 5:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
                break;
            case 6:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                pack.addArrIdHabitaciones(query_idroom(type_6.getSelectedItem().toString()), huesp_6.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
                break;
            case 7:
                pack.addArrIdHabitaciones(query_idroom(type_1.getSelectedItem().toString()), huesp_1.getText());
                pack.addArrIdHabitaciones(query_idroom(type_2.getSelectedItem().toString()), huesp_2.getText());
                pack.addArrIdHabitaciones(query_idroom(type_3.getSelectedItem().toString()), huesp_3.getText());
                pack.addArrIdHabitaciones(query_idroom(type_4.getSelectedItem().toString()), huesp_4.getText());
                pack.addArrIdHabitaciones(query_idroom(type_5.getSelectedItem().toString()), huesp_5.getText());
                pack.addArrIdHabitaciones(query_idroom(type_6.getSelectedItem().toString()), huesp_6.getText());
                pack.addArrIdHabitaciones(query_idroom(type_7.getSelectedItem().toString()), huesp_7.getText());
                id_hab.setText(pack.getArrIdHabitaciones().toString());
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
                id_hab.setText(pack.getArrIdHabitaciones().toString());
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
                id_hab.setText(pack.getArrIdHabitaciones().toString());
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
        jLabel6 = new javax.swing.JLabel();
        id_hab = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FECHA DE INGRESO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, -1));

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FECHA DE SALIDA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, -1));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOCHES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 250, 150, -1));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HABITACIONES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 104, -1));

        fecha_ing.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        fecha_ing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_ing.setText("jLabel5");
        getContentPane().add(fecha_ing, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, -1));

        fecha_sal.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        fecha_sal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_sal.setText("jLabel6");
        getContentPane().add(fecha_sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, -1));

        noches.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        noches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noches.setText("jLabel7");
        getContentPane().add(noches, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 60, -1));

        room.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        room.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room.setText("jLabel8");
        getContentPane().add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 60, -1));

        jLabel9.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HUESPEDES");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 104, -1));

        huespedes.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        huespedes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huespedes.setText("jLabel10");
        getContentPane().add(huespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 60, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Paquete"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type_1.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_2.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_3.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_4.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_5.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_6.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_7.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_8.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        type_9.setFont(new java.awt.Font("Candara Light", 0, 10)); // NOI18N
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

        huesp_1.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_1.setText("jLabel5");
        jPanel1.add(huesp_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 48, 20));

        huesp_2.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_2.setText("jLabel6");
        jPanel1.add(huesp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 48, -1));

        huesp_3.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_3.setText("jLabel7");
        jPanel1.add(huesp_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 48, -1));

        huesp_4.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_4.setText("jLabel8");
        jPanel1.add(huesp_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 48, -1));

        huesp_5.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_5.setText("jLabel10");
        jPanel1.add(huesp_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 48, -1));

        huesp_6.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_6.setText("jLabel11");
        jPanel1.add(huesp_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 205, 48, 20));

        huesp_7.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_7.setText("jLabel12");
        jPanel1.add(huesp_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 48, 20));

        huesp_8.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_8.setText("jLabel13");
        jPanel1.add(huesp_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 48, -1));

        huesp_9.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        huesp_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        huesp_9.setText("jLabel14");
        jPanel1.add(huesp_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 48, -1));

        jLabel15.setFont(new java.awt.Font("Candara Light", 1, 10)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TIPO DE HABITACION");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        jLabel16.setFont(new java.awt.Font("Candara Light", 1, 10)); // NOI18N
        jLabel16.setText("HUESPEDES");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Candara Light", 1, 10)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("COSTO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, -1));

        price_1.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_1.setText("jLabel18");
        jPanel1.add(price_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 65, -1, 20));

        price_2.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_2.setText("jLabel19");
        jPanel1.add(price_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 20));

        price_3.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_3.setText("jLabel20");
        jPanel1.add(price_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 20));

        price_4.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_4.setText("jLabel21");
        jPanel1.add(price_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        price_5.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_5.setText("jLabel22");
        jPanel1.add(price_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, -1, 20));

        price_6.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_6.setText("jLabel23");
        jPanel1.add(price_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 205, -1, 20));

        price_7.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_7.setText("jLabel24");
        jPanel1.add(price_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, 20));

        price_8.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_8.setText("jLabel25");
        jPanel1.add(price_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        price_9.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        price_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_9.setText("jLabel26");
        jPanel1.add(price_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 268, 340));

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 104, -1));

        t_price.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        t_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t_price.setText("jLabel6");
        getContentPane().add(t_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 60, -1));

        jButton2.setBackground(new java.awt.Color(222, 74, 16));
        jButton2.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jButton2.setText("CONFIRMAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("# HABITACIONES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, -1));

        id_hab.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        id_hab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_hab.setText("jLabel7");
        getContentPane().add(id_hab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 220, -1));

        jLabel8.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(28, 27, 26));
        jLabel8.setText("PAQUETE DEL CLIENTE PREVIÓ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GENERIC.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        costo();
        pack.setPersonas(huespedes.getText());
        pack.setEntrda(fecha_ing.getText());
        pack.setSalida(fecha_sal.getText());
        pack.setCosto(t_price.getText());
        new FormAddClient(pack, 8).setVisible(true);
        dispose();
        System.out.println(pack.getArrIdHabitaciones());

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
    private javax.swing.JLabel id_hab;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
