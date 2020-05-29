package SQLConex;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * 
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Conection {
    /*
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "rootroot";*/
    
    
    public static final String URL = "jdbc:mysql://hotelmonarca.cutnsruxkj7l.us-east-2.rds.amazonaws.com:3306/hotelmonarca";
    public static final String USERNAME = "team_requirement";
    public static final String PASSWORD = "team_monarca";
    
    //
    public static final String NAMEBD = "hotelmonarca";

    
    public static void coneccion(){
        try {
            Connection con = null;
            con = getConeccion();
            
            PreparedStatement ps;
            ResultSet res;
            
            ps = con.prepareStatement("SELECT * FROM cliente");
            
            res = ps.executeQuery();
            
            if (res.next()) {
                JOptionPane.showMessageDialog(null,res.getInt("id_cliente"+res.getString("nombre")));
            }else{
                JOptionPane.showMessageDialog(null, "No existen datos");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error:"+e);
        }
    }
    
    
    
    public static Connection getConeccion(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD); 
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " +e);
        }
        return con;
    }
    
    
}
