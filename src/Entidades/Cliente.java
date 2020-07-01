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
    public Cliente(String name, String apellidoPat, String apellidoMat, String calle, 
            String numExt, String numInt, String colonia, String delegacion, String cp, 
            String telLocal, String telMovil, String email) {
        
        super(name, apellidoPat, apellidoMat, calle, numExt, numInt, colonia, delegacion, cp, telLocal, telMovil);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getid_Cliente() {
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
    int idCliente = getid_Cliente();

    @Override
    public String toString() {
        return super.toString() + ", \"" +email+ "\"";
    }
        
    
    
    public static class metodoPago{
        
        /*
        imprementacion en futuro
        */
        
        
    }

}
