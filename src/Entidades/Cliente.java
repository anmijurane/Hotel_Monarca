package Entidades;

import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Cliente extends Persona{
    private String email;
    private int id;
    public Cliente(String name, String apellidoPat, String apellidoMat,
            String calle, String numExt, String numInt, String colonia, 
            String delegacion, String cp, String telLocal, String telMovil,
            String email) {
        
        super(name, apellidoPat, apellidoMat, calle, numExt, numInt, colonia, delegacion, cp, telLocal, telMovil, email);
        this.email = email;
    }
    
    public Cliente(int id, String name, String apellidoPat, String apellidoMat,
            String calle, String numExt, String numInt, String colonia, 
            String delegacion, String cp, String telLocal, String telMovil,
            String email) {
        
        super(name, apellidoPat, apellidoMat, calle, numExt, numInt, colonia, delegacion, cp, telLocal, telMovil, email);
        this.email = email;
        this.id = id;
    }
        
    public int getid_ClienteSQL() {
        int id = 0;
        Connection con = getConeccion();
        PreparedStatement ps;
        ResultSet res;

        try {
            ps = con.prepareStatement("SELECT max(id_cliente) FROM cliente");
            res = ps.executeQuery();

            if (res.next()) {
                id = res.getInt("max(id_cliente)");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        return id;
    }
    private int idCliente;

    @Override
    public String toString() {
        return super.toString();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente() {
        this.idCliente = getid_ClienteSQL();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    
    
    public static class metodoPago{
        
        /*
        imprementacion en futuro
        */
        
        
    }

}
