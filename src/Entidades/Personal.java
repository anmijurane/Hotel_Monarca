package Entidades;

import static SQLConex.Conection.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Personal extends Persona {

    private int idArea;
    private int idDpto;
    private int idCargo;

    public Personal(String name,
            String apellidoPat, String apellidoMat, String calle,
            String numExt, String numInt, String colonia, String delegacion,
            String cp, String telLocal, String telMovil, int idArea, int idDpto, int idCargo) {

        super(name, apellidoPat, apellidoMat, calle, numExt, numInt, colonia,
                delegacion, cp, telLocal, telMovil);

        this.idArea = idArea;
        this.idDpto = idDpto;
        this.idCargo = idCargo;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdDpto() {

        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getid_Personal() {
        int id = 0;
        Connection con = getConeccion();
        PreparedStatement ps;
        ResultSet res;

        try {
            ps = con.prepareStatement("SELECT max(id_personal) FROM personal");
            res = ps.executeQuery();

            if (res.next()) {
                id = res.getInt("max(id_personal)");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return id + 1;
    }
    int idPersonal = getid_Personal();
    
    @Override
    public String toString() {

        return super.toString() + ", " + idArea + " , " + idDpto
                + ", " + idCargo + ", " + idPersonal;
    }

    public String getCredencial(){
        
        String password = idPersonal+"_"+super.getName()+idCargo;
        
        return idPersonal + ", \""+super.getName()+"\", " + idArea +", " + idDpto 
                + ", " +idCargo + ", \""+password+"\"";
    }
    

}
