package Entidades;

/**
 * 
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Personal extends Persona{

    private int idArea;
    private int idDpto;
    private int idCargo;
    
    public Personal(String name, String apellidoPat, String apellidoMat, int idArea, int idDpto, int idCargo) {
        super(name, apellidoPat, apellidoMat);
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

    
    
    
    
}
