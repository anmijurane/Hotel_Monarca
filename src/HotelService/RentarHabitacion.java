/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelService;

import Entidades.Cliente;
import Entidades.Habitacion;
import Entidades.Paquete;
import static SQLConex.Conection.getConeccion;
import Service.FormAddClient;
import Service.PackClientFinal;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class RentarHabitacion extends javax.swing.JFrame {

    ArrayList<Cliente> cliente = new ArrayList<>();
    Connection Con = getConeccion();
    PreparedStatement ps;
    ResultSet rs;
    int idCliente;
    int idPersona;
    String name;    
    Paquete pqt;
    Cliente cltn;
    int indice;

    /**
     * Creates new form RentarHabitacion
     *
     * @param name
     * @param idPersonal
     */
    public RentarHabitacion(String name, int idPersonal) {
        initComponents();
        getNameClient();
        setModelSpinner();
        this.idPersona = idPersonal;
        this.name = name;
        cleanPanel(false);
        jT_total.setEditable(false);
        //btn_back.setVisible(true);
    }

    public final void getNameClient() {
        try {

            cbxClient.addItem("ELIGE UN CLIENTE");

            ps = Con.prepareStatement("SELECT * FROM cliente ORDER BY apellido_p ASC");
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente.add(new Cliente(rs.getInt("id_cliente"), rs.getString("nombre"), rs.getString("apellido_p"),
                        rs.getString("apellido_m"), rs.getString("calle"),
                        rs.getString("numero_ext"), rs.getString("numero_int"),
                        rs.getString("colonia"), rs.getString("delegacion"),
                        rs.getString("cp"), rs.getString("tel_local"),
                        rs.getString("tel_movil"), rs.getString("email")));
            }

            cliente.forEach((cliente1) -> {
                cbxClient.addItem(cliente1.getApellidoPat()
                        + " " + cliente1.getApellidoMat()
                        + " " + cliente1.getName());
            });

        } catch (SQLException e) {
            System.out.println("ERROR EN " + e);
        }

    }    
    public void getCliente(int indice) {
        //indice = cbxClient.getSelectedIndex() - 1;
        //System.out.println(indice);
        //cliente.get(indice).getName();
        System.out.println("ID: " + cliente.get(indice).getId());
        //System.out.println(cliente.get(indice).getName());

        String NombreC = cliente.get(indice).getName()
                + " " + cliente.get(indice).getApellidoPat()
                + " " + cliente.get(indice).getApellidoMat();
        System.out.println(NombreC);
        String Direccion = "Calle: " + cliente.get(indice).getCalle()
                + "  #" + cliente.get(indice).getNumExt()
                + "\nColonia: " + cliente.get(indice).getColonia()
                + "\nDelegacion: " + cliente.get(indice).getDelegacion()
                + "CP. " + cliente.get(indice).getCp();
        System.out.println("Dirección: " + Direccion);
        System.out.println("Email: " + cliente.get(indice).getEmail());        
    }

    public void getDHabitacion() {
        System.out.println("NUM HAB: "+pqt.getArrIdHabitaciones().get(0).getIdHabitacion());
        System.out.println("NUM PER: "+pqt.getArrIdHabitaciones().get(0).getPersonas());
        System.out.println("CATEGORIA: "+pqt.getArrIdHabitaciones().get(0).getCategoria());
    }

    public int getDisponibilidad(String categoria) {
        int idHabitacion = 0;
        try {
            String squery = "select min(habitacion.id_habitacion) as idHabitacion, "
                    + "categoria.categoria, categoria.costo from habitacion, categoria "
                    + "WHERE id_estado = 1 & 3 and categoria.categoria = \"" + categoria + "\" and "
                    + "habitacion.id_categoria = categoria.id_categoria";
            System.out.println("QUERY: " + squery);
            ps = Con.prepareStatement(squery);
            rs = ps.executeQuery();

            if (rs.next()) {
                idHabitacion = rs.getInt("idHabitacion");
            } else {
                JOptionPane.showMessageDialog(this, "En la categoria\n**" + categoria + " **No hay habitaciones disponibles");
            }

        } catch (SQLException e) {
            System.out.println("Error en getDisponibilidad: " + e);
        }
        return idHabitacion;
    }
    SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
    
    public String CheckIn(){        
        return f.format(check_in.getDate());
    }
    
    public String CheckOut(){
        return f.format(check_out.getDate());
    }

    public void getDatosHabitacion() {
        int index = jCbx_NumHab.getSelectedIndex();
        int idHab1,idHab2,idHab3,idHab4,idHab5,idHab6,idHab7,idHab8,idHab9,idHab10;
        this.pqt = new Paquete(CheckIn(), CheckOut(), "$" + total);
        switch (index) {
            case 1:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                jLhab1.setText("" + idHab1);                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                break;
            case 2:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                break;
            case 3:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());                                
                break;
            case 4:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                
                break;
            case 5:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                idHab5 = getDisponibilidad(jCbx_05.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                jLhab5.setText("" + idHab5);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab5, jP_Hab_05.getValue().toString(), new Double(jTextField5.getText()), jCbx_05.getSelectedItem().toString());
                
                break;
            case 6:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                idHab5 = getDisponibilidad(jCbx_05.getSelectedItem().toString());
                idHab6 = getDisponibilidad(jCbx_06.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                jLhab5.setText("" + idHab5);
                jLhab6.setText("" + idHab6);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab5, jP_Hab_05.getValue().toString(), new Double(jTextField5.getText()), jCbx_05.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab6, jP_Hab_06.getValue().toString(), new Double(jTextField6.getText()), jCbx_06.getSelectedItem().toString());
                break;
            case 7:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                idHab5 = getDisponibilidad(jCbx_05.getSelectedItem().toString());
                idHab6 = getDisponibilidad(jCbx_06.getSelectedItem().toString());
                idHab7 = getDisponibilidad(jCbx_07.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                jLhab5.setText("" + idHab5);
                jLhab6.setText("" + idHab6);
                jLhab7.setText("" + idHab7);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab5, jP_Hab_05.getValue().toString(), new Double(jTextField5.getText()), jCbx_05.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab6, jP_Hab_06.getValue().toString(), new Double(jTextField6.getText()), jCbx_06.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab7, jP_Hab_07.getValue().toString(), new Double(jTextField7.getText()), jCbx_07.getSelectedItem().toString());
                
                break;
            case 8:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                idHab5 = getDisponibilidad(jCbx_05.getSelectedItem().toString());
                idHab6 = getDisponibilidad(jCbx_06.getSelectedItem().toString());
                idHab7 = getDisponibilidad(jCbx_07.getSelectedItem().toString());
                idHab8 = getDisponibilidad(jCbx_08.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                jLhab5.setText("" + idHab5);
                jLhab6.setText("" + idHab6);
                jLhab7.setText("" + idHab7);
                jLhab8.setText("" + idHab8);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab5, jP_Hab_05.getValue().toString(), new Double(jTextField5.getText()), jCbx_05.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab6, jP_Hab_06.getValue().toString(), new Double(jTextField6.getText()), jCbx_06.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab7, jP_Hab_07.getValue().toString(), new Double(jTextField7.getText()), jCbx_07.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab8, jP_Hab_08.getValue().toString(), new Double(jTextField8.getText()), jCbx_08.getSelectedItem().toString());
                
                break;
            case 9:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                idHab5 = getDisponibilidad(jCbx_05.getSelectedItem().toString());
                idHab6 = getDisponibilidad(jCbx_06.getSelectedItem().toString());
                idHab7 = getDisponibilidad(jCbx_07.getSelectedItem().toString());
                idHab8 = getDisponibilidad(jCbx_08.getSelectedItem().toString());
                idHab9 = getDisponibilidad(jCbx_09.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                jLhab5.setText("" + idHab5);
                jLhab6.setText("" + idHab6);
                jLhab7.setText("" + idHab7);
                jLhab8.setText("" + idHab8);
                jLhab9.setText("" + idHab9);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab5, jP_Hab_05.getValue().toString(), new Double(jTextField5.getText()), jCbx_05.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab6, jP_Hab_06.getValue().toString(), new Double(jTextField6.getText()), jCbx_06.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab7, jP_Hab_07.getValue().toString(), new Double(jTextField7.getText()), jCbx_07.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab8, jP_Hab_08.getValue().toString(), new Double(jTextField8.getText()), jCbx_08.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab9, jP_Hab_09.getValue().toString(), new Double(jTextField9.getText()), jCbx_09.getSelectedItem().toString());
                
                break;
            case 10:
                idHab1 = getDisponibilidad(jCbx_01.getSelectedItem().toString());
                idHab2 = getDisponibilidad(jCbx_02.getSelectedItem().toString());
                idHab3 = getDisponibilidad(jCbx_03.getSelectedItem().toString());
                idHab4 = getDisponibilidad(jCbx_04.getSelectedItem().toString());
                idHab5 = getDisponibilidad(jCbx_05.getSelectedItem().toString());
                idHab6 = getDisponibilidad(jCbx_06.getSelectedItem().toString());
                idHab7 = getDisponibilidad(jCbx_07.getSelectedItem().toString());
                idHab8 = getDisponibilidad(jCbx_08.getSelectedItem().toString());
                idHab9 = getDisponibilidad(jCbx_09.getSelectedItem().toString());
                idHab10 = getDisponibilidad(jCbx_010.getSelectedItem().toString());
                
                jLhab1.setText("" + idHab1);
                jLhab2.setText("" + idHab2);
                jLhab3.setText("" + idHab3);
                jLhab4.setText("" + idHab4);
                jLhab5.setText("" + idHab5);
                jLhab6.setText("" + idHab6);
                jLhab7.setText("" + idHab7);
                jLhab8.setText("" + idHab8);
                jLhab9.setText("" + idHab9);
                jLhab10.setText("" + idHab10);
                
                pqt.addArrIdHabitaciones(idHab1, jP_Hab_01.getValue().toString(), new Double(jTextField1.getText()), jCbx_01.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab2, jP_Hab_02.getValue().toString(), new Double(jTextField2.getText()), jCbx_02.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab3, jP_Hab_03.getValue().toString(), new Double(jTextField3.getText()), jCbx_03.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab4, jP_Hab_04.getValue().toString(), new Double(jTextField4.getText()), jCbx_04.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab5, jP_Hab_05.getValue().toString(), new Double(jTextField5.getText()), jCbx_05.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab6, jP_Hab_06.getValue().toString(), new Double(jTextField6.getText()), jCbx_06.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab7, jP_Hab_07.getValue().toString(), new Double(jTextField7.getText()), jCbx_07.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab8, jP_Hab_08.getValue().toString(), new Double(jTextField8.getText()), jCbx_08.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab9, jP_Hab_09.getValue().toString(), new Double(jTextField9.getText()), jCbx_09.getSelectedItem().toString());
                pqt.addArrIdHabitaciones(idHab10, jP_Hab_010.getValue().toString(), new Double(jTextField10.getText()), jCbx_09.getSelectedItem().toString());
                
                break;

            default:
                throw new AssertionError();
        }
    }

    double total = 0;

    public double CalcTotal() {
        double hab1 = new Double(jTextField1.getText());
        double hab2 = new Double(jTextField2.getText());
        double hab3 = new Double(jTextField3.getText());
        double hab4 = new Double(jTextField4.getText());
        double hab5 = new Double(jTextField5.getText());
        double hab6 = new Double(jTextField6.getText());
        double hab7 = new Double(jTextField7.getText());
        double hab8 = new Double(jTextField8.getText());
        double hab9 = new Double(jTextField9.getText());
        double hab10 = new Double(jTextField10.getText());

        total = hab1 + hab2 + hab3 + hab4 + hab5 + hab6 + hab7 + hab8 + hab9 + hab10;

        return total;
    }

    public double PrecioHab(String categoriaHab) {
        double costoHab = 0;
        switch (categoriaHab.toLowerCase()) {
            case "SELECCIONA UNA HABITACION":
                costoHab = 0.0;
                break;
            case "individual":
                costoHab = 839.00;
                break;
            case "doble":
                costoHab = 1256.00;
                break;
            case "familiar":
                costoHab = 1650.00;
                break;
            case "triple":
                costoHab = 1560.00;
                break;
            case "cuadruple":
                costoHab = 1753.00;
                break;
            case "grupal":
                costoHab = 1950.00;
                break;
            case "matrimonial":
                costoHab = 960.00;
                break;
            case "suite double":
                costoHab = 1150.00;
                break;
            case "junior suite":
                costoHab = 999.00;
                break;
            default:
                costoHab = 0.0;
        }
        return costoHab;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegCliente = new javax.swing.JButton();
        cbxClient = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        check_in = new com.toedter.calendar.JDateChooser();
        check_out = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jCbx_NumHab = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCbx_01 = new javax.swing.JComboBox<>();
        jP_Hab_01 = new javax.swing.JSpinner();
        jP_Hab_02 = new javax.swing.JSpinner();
        jP_Hab_03 = new javax.swing.JSpinner();
        jP_Hab_04 = new javax.swing.JSpinner();
        jP_Hab_05 = new javax.swing.JSpinner();
        jP_Hab_06 = new javax.swing.JSpinner();
        jP_Hab_07 = new javax.swing.JSpinner();
        jP_Hab_08 = new javax.swing.JSpinner();
        jP_Hab_09 = new javax.swing.JSpinner();
        jP_Hab_010 = new javax.swing.JSpinner();
        jCbx_02 = new javax.swing.JComboBox<>();
        jCbx_03 = new javax.swing.JComboBox<>();
        jCbx_04 = new javax.swing.JComboBox<>();
        jCbx_05 = new javax.swing.JComboBox<>();
        jCbx_06 = new javax.swing.JComboBox<>();
        jCbx_07 = new javax.swing.JComboBox<>();
        jCbx_08 = new javax.swing.JComboBox<>();
        jCbx_09 = new javax.swing.JComboBox<>();
        jCbx_010 = new javax.swing.JComboBox<>();
        jLHab1 = new javax.swing.JLabel();
        jLHab4 = new javax.swing.JLabel();
        jLHab3 = new javax.swing.JLabel();
        jLHab2 = new javax.swing.JLabel();
        jLHab5 = new javax.swing.JLabel();
        jLHab9 = new javax.swing.JLabel();
        jLHab8 = new javax.swing.JLabel();
        jLHab7 = new javax.swing.JLabel();
        jLHab6 = new javax.swing.JLabel();
        jLHab10 = new javax.swing.JLabel();
        Precio1 = new javax.swing.JLabel();
        Precio2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jT_total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLhab1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLhab2 = new javax.swing.JLabel();
        jLhab3 = new javax.swing.JLabel();
        jLhab4 = new javax.swing.JLabel();
        jLhab5 = new javax.swing.JLabel();
        disp = new javax.swing.JButton();
        jLhab6 = new javax.swing.JLabel();
        jLhab7 = new javax.swing.JLabel();
        jLhab8 = new javax.swing.JLabel();
        jLhab9 = new javax.swing.JLabel();
        jLhab10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegCliente.setText("REGISTRAR CLIENTE");
        btnRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        cbxClient.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(cbxClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 38, 257, -1));

        jLabel1.setText("CLIENTE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 16, -1, -1));

        check_in.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(check_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 38, 147, -1));

        check_out.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(check_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 147, -1));

        jLabel2.setText("CHECK-IN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 16, -1, -1));

        jLabel3.setText("CHECK-OUT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        btn_back.setText("REGRESAR");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        jCbx_NumHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Núm Habitaciones", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jCbx_NumHab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCbx_NumHab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_NumHabItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_NumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 40, -1, -1));

        jLabel4.setText("HABITACIONES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 16, -1, -1));

        jCbx_01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCbx_01.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_01ItemStateChanged(evt);
            }
        });
        jCbx_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbx_01ActionPerformed(evt);
            }
        });
        getContentPane().add(jCbx_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 121, -1, -1));

        jP_Hab_01.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_01StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 121, 60, -1));

        jP_Hab_02.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_02StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 187, 59, -1));

        jP_Hab_03.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_03StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 253, 60, -1));

        jP_Hab_04.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_04StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 319, 60, -1));

        jP_Hab_05.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_05StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 385, 60, -1));

        jP_Hab_06.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_06StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 60, -1));

        jP_Hab_07.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_07StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 60, -1));

        jP_Hab_08.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_08StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 60, -1));

        jP_Hab_09.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_09StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 60, -1));

        jP_Hab_010.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jP_Hab_010StateChanged(evt);
            }
        });
        getContentPane().add(jP_Hab_010, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 60, -1));

        jCbx_02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_02.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_02ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 187, -1, -1));

        jCbx_03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_03.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_03ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 253, -1, -1));

        jCbx_04.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_04.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_04ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 319, -1, -1));

        jCbx_05.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_05.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_05ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 385, -1, -1));

        jCbx_06.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_06.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_06ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jCbx_07.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_07.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_07ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        jCbx_08.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_08.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_08ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_08, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        jCbx_09.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_09.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_09ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_09, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jCbx_010.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA HABITACION", "INDIVIDUAL", "JUNIOR SUITE" }));
        jCbx_010.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbx_010ItemStateChanged(evt);
            }
        });
        getContentPane().add(jCbx_010, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        jLHab1.setText("Habitacion 1:");
        getContentPane().add(jLHab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 99, -1, -1));

        jLHab4.setText("Habitacion 4:");
        getContentPane().add(jLHab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 297, -1, -1));

        jLHab3.setText("Habitacion 3:");
        getContentPane().add(jLHab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 231, -1, -1));

        jLHab2.setText("Habitacion 2:");
        getContentPane().add(jLHab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 165, -1, -1));

        jLHab5.setText("Habitacion 5:");
        getContentPane().add(jLHab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 363, -1, -1));

        jLHab9.setText("Habitacion 9:");
        getContentPane().add(jLHab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        jLHab8.setText("Habitacion 8:");
        getContentPane().add(jLHab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        jLHab7.setText("Habitacion 7:");
        getContentPane().add(jLHab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLHab6.setText("Habitacion 6:");
        getContentPane().add(jLHab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jLHab10.setText("Habitacion 10:");
        getContentPane().add(jLHab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        Precio1.setText("Precio $");
        getContentPane().add(Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 85, -1, -1));

        Precio2.setText("Precio $");
        getContentPane().add(Precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0.0");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 121, 99, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0.0");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 187, 99, -1));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0.0");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 254, 99, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0.0");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 320, 99, -1));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0.0");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 386, 99, -1));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0.0");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 100, -1));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0.0");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 100, -1));

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0.0");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 100, -1));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0.0");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 100, -1));

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0.0");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 100, -1));

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 86, -1));

        jT_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jT_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 150, -1));

        jLabel5.setText("TOTAL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 456, -1, 30));

        jLhab1.setText("-");
        getContentPane().add(jLhab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 60, -1));

        jLabel7.setText("# Habitación");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, -1, -1));

        jLhab2.setText("-");
        getContentPane().add(jLhab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 70, 20));

        jLhab3.setText("-");
        getContentPane().add(jLhab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 70, -1));

        jLhab4.setText("-");
        getContentPane().add(jLhab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 60, -1));

        jLhab5.setText("-");
        getContentPane().add(jLhab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 60, -1));

        disp.setText("disponibilidad");
        disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispActionPerformed(evt);
            }
        });
        getContentPane().add(disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jLhab6.setText("-");
        getContentPane().add(jLhab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 50, -1));

        jLhab7.setText("-");
        getContentPane().add(jLhab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 50, -1));

        jLhab8.setText("-");
        getContentPane().add(jLhab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 50, -1));

        jLhab9.setText("-");
        getContentPane().add(jLhab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 60, -1));

        jLhab10.setText("-");
        getContentPane().add(jLhab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 60, -1));

        jLabel8.setText("# Habitación");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegClienteActionPerformed
        new FormAddClient(name, idPersona, 5).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegClienteActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new MenuRecepcionista(name, idPersona).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void jCbx_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbx_01ActionPerformed

    }//GEN-LAST:event_jCbx_01ActionPerformed

    private void jP_Hab_01StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_01StateChanged
        jCbx_01.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_01.getValue())));
        jTextField1.setText("");
    }//GEN-LAST:event_jP_Hab_01StateChanged

    private void jP_Hab_02StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_02StateChanged
        jCbx_02.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_02.getValue())));
        jTextField2.setText("");
    }//GEN-LAST:event_jP_Hab_02StateChanged

    private void jP_Hab_03StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_03StateChanged
        jCbx_03.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_03.getValue())));
        jTextField3.setText("");
    }//GEN-LAST:event_jP_Hab_03StateChanged

    private void jP_Hab_04StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_04StateChanged
        jCbx_04.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_04.getValue())));
        jTextField4.setText("");
    }//GEN-LAST:event_jP_Hab_04StateChanged

    private void jP_Hab_05StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_05StateChanged
        jCbx_05.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_05.getValue())));
        jTextField5.setText("");
    }//GEN-LAST:event_jP_Hab_05StateChanged

    private void jP_Hab_06StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_06StateChanged
        jCbx_06.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_06.getValue())));
        jTextField6.setText("");
    }//GEN-LAST:event_jP_Hab_06StateChanged

    private void jP_Hab_07StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_07StateChanged
        jCbx_07.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_07.getValue())));
        jTextField7.setText("");
    }//GEN-LAST:event_jP_Hab_07StateChanged

    private void jP_Hab_08StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_08StateChanged
        jCbx_08.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_08.getValue())));
        jTextField8.setText("");
    }//GEN-LAST:event_jP_Hab_08StateChanged

    private void jP_Hab_09StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_09StateChanged
        jCbx_09.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_09.getValue())));
        jTextField9.setText("");
    }//GEN-LAST:event_jP_Hab_09StateChanged

    private void jP_Hab_010StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jP_Hab_010StateChanged
        jCbx_010.setModel(new DefaultComboBoxModel<>(new Habitacion().getCategoria(jP_Hab_010.getValue())));
        jTextField10.setText("");
    }//GEN-LAST:event_jP_Hab_010StateChanged

    public final void cleanPanel(boolean value) {
        jP_Hab_01.setVisible(value);
        jP_Hab_02.setVisible(value);
        jP_Hab_03.setVisible(value);
        jP_Hab_04.setVisible(value);
        jP_Hab_05.setVisible(value);
        jP_Hab_06.setVisible(value);
        jP_Hab_07.setVisible(value);
        jP_Hab_08.setVisible(value);
        jP_Hab_09.setVisible(value);
        jP_Hab_010.setVisible(value);
        jCbx_01.setVisible(value);
        jCbx_02.setVisible(value);
        jCbx_03.setVisible(value);
        jCbx_04.setVisible(value);
        jCbx_05.setVisible(value);
        jCbx_06.setVisible(value);
        jCbx_07.setVisible(value);
        jCbx_08.setVisible(value);
        jCbx_09.setVisible(value);
        jCbx_010.setVisible(value);
        jLHab1.setVisible(value);
        jLHab2.setVisible(value);
        jLHab3.setVisible(value);
        jLHab4.setVisible(value);
        jLHab5.setVisible(value);
        jLHab6.setVisible(value);
        jLHab7.setVisible(value);
        jLHab8.setVisible(value);
        jLHab9.setVisible(value);
        jLHab10.setVisible(value);
        jTextField1.setVisible(value);
        jTextField2.setVisible(value);
        jTextField3.setVisible(value);
        jTextField4.setVisible(value);
        jTextField5.setVisible(value);
        jTextField6.setVisible(value);
        jTextField7.setVisible(value);
        jTextField8.setVisible(value);
        jTextField9.setVisible(value);
        jTextField10.setVisible(value);
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        Precio1.setVisible(value);
        Precio2.setVisible(value);
        jLhab1.setText("");
        jLhab2.setText("");
        jLhab3.setText("");
        jLhab4.setText("");
        jLhab5.setText("");
        jLhab6.setText("");
        jLhab7.setText("");
        jLhab8.setText("");
        jLhab9.setText("");
        jLhab10.setText("");
    }

    private void jCbx_NumHabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_NumHabItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jT_total.setText("0.0");
            jTextField1.setText("0.0");
            jTextField2.setText("0.0");
            jTextField3.setText("0.0");
            jTextField4.setText("0.0");
            jTextField5.setText("0.0");
            jTextField6.setText("0.0");
            jTextField7.setText("0.0");
            jTextField8.setText("0.0");
            jTextField9.setText("0.0");
            jTextField10.setText("0.0");
            cleanPanel(false);
            int valor = jCbx_NumHab.getSelectedIndex();
            switch (valor) {
                case 0:
                    JOptionPane.showMessageDialog(this, "AL MENOS DEBE EXISTIR UNA HABITACIÓN");
                    jCbx_NumHab.setSelectedIndex(1);
                    jP_Hab_01.setVisible(true);
                    jCbx_01.setVisible(true);
                    jLHab1.setVisible(true);
                    Precio1.setVisible(true);
                    break;
                case 1:
                    Precio1.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jCbx_01.setVisible(true);
                    jLHab1.setVisible(true);
                    jTextField1.setVisible(true);
                    break;
                case 2:
                    Precio1.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);

                    break;
                case 3:
                    Precio1.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);

                    break;
                case 4:
                    Precio1.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);
                    jP_Hab_04.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);
                    jCbx_04.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);
                    jLHab4.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);

                    break;
                case 5:
                    Precio1.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);
                    jP_Hab_04.setVisible(true);
                    jP_Hab_05.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);
                    jCbx_04.setVisible(true);
                    jCbx_05.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);
                    jLHab4.setVisible(true);
                    jLHab5.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);

                    break;
                case 6:
                    Precio2.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);
                    jP_Hab_04.setVisible(true);
                    jP_Hab_05.setVisible(true);
                    jP_Hab_06.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);
                    jCbx_04.setVisible(true);
                    jCbx_05.setVisible(true);
                    jCbx_06.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);
                    jLHab4.setVisible(true);
                    jLHab5.setVisible(true);
                    jLHab6.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);

                    break;
                case 7:
                    Precio2.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);
                    jP_Hab_04.setVisible(true);
                    jP_Hab_05.setVisible(true);
                    jP_Hab_06.setVisible(true);
                    jP_Hab_07.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);
                    jCbx_04.setVisible(true);
                    jCbx_05.setVisible(true);
                    jCbx_06.setVisible(true);
                    jCbx_07.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);
                    jLHab4.setVisible(true);
                    jLHab5.setVisible(true);
                    jLHab6.setVisible(true);
                    jLHab7.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);

                    break;
                case 8:
                    Precio2.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);
                    jP_Hab_04.setVisible(true);
                    jP_Hab_05.setVisible(true);
                    jP_Hab_06.setVisible(true);
                    jP_Hab_07.setVisible(true);
                    jP_Hab_08.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);
                    jCbx_04.setVisible(true);
                    jCbx_05.setVisible(true);
                    jCbx_06.setVisible(true);
                    jCbx_07.setVisible(true);
                    jCbx_08.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);
                    jLHab4.setVisible(true);
                    jLHab5.setVisible(true);
                    jLHab6.setVisible(true);
                    jLHab7.setVisible(true);
                    jLHab8.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);

                    break;
                case 9:
                    Precio2.setVisible(true);
                    jP_Hab_01.setVisible(true);
                    jP_Hab_02.setVisible(true);
                    jP_Hab_03.setVisible(true);
                    jP_Hab_04.setVisible(true);
                    jP_Hab_05.setVisible(true);
                    jP_Hab_06.setVisible(true);
                    jP_Hab_07.setVisible(true);
                    jP_Hab_08.setVisible(true);
                    jP_Hab_09.setVisible(true);

                    jCbx_01.setVisible(true);
                    jCbx_02.setVisible(true);
                    jCbx_03.setVisible(true);
                    jCbx_04.setVisible(true);
                    jCbx_05.setVisible(true);
                    jCbx_06.setVisible(true);
                    jCbx_07.setVisible(true);
                    jCbx_08.setVisible(true);
                    jCbx_09.setVisible(true);

                    jLHab1.setVisible(true);
                    jLHab2.setVisible(true);
                    jLHab3.setVisible(true);
                    jLHab4.setVisible(true);
                    jLHab5.setVisible(true);
                    jLHab6.setVisible(true);
                    jLHab7.setVisible(true);
                    jLHab8.setVisible(true);
                    jLHab9.setVisible(true);

                    jTextField1.setVisible(true);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(true);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);

                    break;
                case 10:
                    cleanPanel(true);
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }//GEN-LAST:event_jCbx_NumHabItemStateChanged

    private void jCbx_01ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_01ItemStateChanged
        double hab1 = PrecioHab(jCbx_01.getSelectedItem().toString());
        jTextField1.setText("" + hab1);
        CalcTotal();
        System.out.println("total: $" + total);
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_01ItemStateChanged

    private void jCbx_02ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_02ItemStateChanged
        double hab2 = PrecioHab(jCbx_02.getSelectedItem().toString());
        jTextField2.setText("" + hab2);
        CalcTotal();
        System.out.println("total:" + total);
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_02ItemStateChanged

    private void jCbx_03ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_03ItemStateChanged
        double hab3 = PrecioHab(jCbx_03.getSelectedItem().toString());
        jTextField3.setText("" + hab3);
        CalcTotal();
        System.out.println("total:" + total);
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_03ItemStateChanged

    private void jCbx_04ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_04ItemStateChanged
        jTextField4.setText("" + PrecioHab(jCbx_04.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_04ItemStateChanged

    private void jCbx_05ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_05ItemStateChanged
        jTextField5.setText("" + PrecioHab(jCbx_05.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_05ItemStateChanged

    private void jCbx_06ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_06ItemStateChanged
        jTextField6.setText("" + PrecioHab(jCbx_06.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_06ItemStateChanged

    private void jCbx_07ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_07ItemStateChanged
        jTextField7.setText("" + PrecioHab(jCbx_07.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_07ItemStateChanged

    private void jCbx_08ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_08ItemStateChanged
        jTextField8.setText("" + PrecioHab(jCbx_08.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_08ItemStateChanged

    private void jCbx_09ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_09ItemStateChanged
        jTextField9.setText("" + PrecioHab(jCbx_09.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_09ItemStateChanged

    private void jCbx_010ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbx_010ItemStateChanged
        jTextField10.setText("" + PrecioHab(jCbx_010.getSelectedItem().toString()));
        CalcTotal();
        jT_total.setText("$" + total);
    }//GEN-LAST:event_jCbx_010ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("RENTA HABITACIÓN");
        indice = cbxClient.getSelectedIndex()-1;
        System.out.println("INDICE RENTA HABITACION: " +indice);
        getCliente(indice);
        getDHabitacion();
        new PackClientFinal(pqt, cliente, cbxClient.getSelectedIndex()-1).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispActionPerformed
        getDatosHabitacion();
    }//GEN-LAST:event_dispActionPerformed

    public final void setModelSpinner() {
        jP_Hab_01.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_010.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_02.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_03.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_04.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_05.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_06.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_07.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_08.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        jP_Hab_09.setModel(new SpinnerNumberModel(1, 1, 4, 1));
    }

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
            java.util.logging.Logger.getLogger(RentarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Precio1;
    private javax.swing.JLabel Precio2;
    private javax.swing.JButton btnRegCliente;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> cbxClient;
    private com.toedter.calendar.JDateChooser check_in;
    private com.toedter.calendar.JDateChooser check_out;
    private javax.swing.JButton disp;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCbx_01;
    private javax.swing.JComboBox<String> jCbx_010;
    private javax.swing.JComboBox<String> jCbx_02;
    private javax.swing.JComboBox<String> jCbx_03;
    private javax.swing.JComboBox<String> jCbx_04;
    private javax.swing.JComboBox<String> jCbx_05;
    private javax.swing.JComboBox<String> jCbx_06;
    private javax.swing.JComboBox<String> jCbx_07;
    private javax.swing.JComboBox<String> jCbx_08;
    private javax.swing.JComboBox<String> jCbx_09;
    private javax.swing.JComboBox<String> jCbx_NumHab;
    private javax.swing.JLabel jLHab1;
    private javax.swing.JLabel jLHab10;
    private javax.swing.JLabel jLHab2;
    private javax.swing.JLabel jLHab3;
    private javax.swing.JLabel jLHab4;
    private javax.swing.JLabel jLHab5;
    private javax.swing.JLabel jLHab6;
    private javax.swing.JLabel jLHab7;
    private javax.swing.JLabel jLHab8;
    private javax.swing.JLabel jLHab9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLhab1;
    private javax.swing.JLabel jLhab10;
    private javax.swing.JLabel jLhab2;
    private javax.swing.JLabel jLhab3;
    private javax.swing.JLabel jLhab4;
    private javax.swing.JLabel jLhab5;
    private javax.swing.JLabel jLhab6;
    private javax.swing.JLabel jLhab7;
    private javax.swing.JLabel jLhab8;
    private javax.swing.JLabel jLhab9;
    private javax.swing.JSpinner jP_Hab_01;
    private javax.swing.JSpinner jP_Hab_010;
    private javax.swing.JSpinner jP_Hab_02;
    private javax.swing.JSpinner jP_Hab_03;
    private javax.swing.JSpinner jP_Hab_04;
    private javax.swing.JSpinner jP_Hab_05;
    private javax.swing.JSpinner jP_Hab_06;
    private javax.swing.JSpinner jP_Hab_07;
    private javax.swing.JSpinner jP_Hab_08;
    private javax.swing.JSpinner jP_Hab_09;
    private javax.swing.JTextField jT_total;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

//select habitacion.id_habitacion, categoria.capacidad, categoria.costo 
//FROM habitacion INNER JOIN categoria ON habitacion.id_categoria = categoria.id_categoria;
