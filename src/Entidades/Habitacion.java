package Entidades;

import java.util.Vector;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Habitacion {

    private int id_habitacion;
    private String categoria;
    private String capacidad;
    private int camas;
    private String estado;

    public Habitacion(int id_habitacio, String categoria, String capacidad, int camas, String Estado) {
        this.id_habitacion = id_habitacio;
        this.categoria = categoria;
        this.capacidad = capacidad;
        this.camas = camas;
        this.estado = Estado;
    }
    
    public Habitacion(){
        
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacio) {
        this.id_habitacion = id_habitacio;
    }

    public String getCategoria() {
        return categoria.toUpperCase();
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCapacidad() {
        return capacidad.toUpperCase();
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public String getEstado() {
        return estado.toUpperCase();
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }
                               
    public String[] getFlatOne(){
        String []Array = {"SELECIONA UNA HABITACION", "101", "102", "103", "104", "105", "106", "107", "108",
                "109", "110"};
        return Array;
    }
    
    public String[] getFlatTwo(){
         String[] Array = {"SELECIONA UNA HABITACION", "201", "202", "203", "204", "205", "206", "207", "208",
                "209", "210"};
         return Array;        
    }
    
    public String[] getFlatTree(){
        String[] Array = {"SELECIONA UNA HABITACION", "301", "302", "303", "304", "305", "306", "307", "308",
                "309", "310"};
        return Array;
    }
    
    public String[] getFlatFour(){
        String[] Array = {"SELECIONA UNA HABITACION", "401", "402", "403", "404", "405", "406", "407", "408",
                "409", "410"};
        return Array;
    }
    
    public String[] getFlatFive(){
        String[] Array = {"SELECIONA UNA HABITACION", "501", "502", "503", "504", "505", "506", "507", "508",
                "509", "510"};
        return Array;
    }
            
    public String[] getFlatSix(){
        String[] Array = {"SELECIONA UNA HABITACION", "601", "602", "603", "604", "605", "606", "607", "608",
                "609", "610"};
        return Array;
    }
    
    public String[] getFlatSeven(){
        String[] Array = {"SELECIONA UNA HABITACION", "701", "702", "703", "704", "705", "706", "707", "708",
                "709", "710"};
        return Array;
    }
    
    public String[] getFlatEight(){
        String[] Array = {"SELECIONA UNA HABITACION", "801", "802", "803", "804", "805", "806", "807", "808",
                "809", "810"};
        return Array;
    }

    public String [] getFlatNine(){
        String[] Array = {"SELECIONA UNA HABITACION", "901", "902", "903", "904", "905", "906", "907", "908",
                "909", "910"};
        return Array;
    }
    
    public String[] getFlatTen(){
         String[] Array = {"SELECIONA UNA HABITACION", "1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008",
                "1009", "1010"};   
        return Array;
    }
    
    public String toQuerySQL(){        
        return getId_habitacion() + ", "+getCategoria()+", "+getCapacidad()
                +", "+getCamas()+", "+getEstado();
    }
        
    public String toString() {
        return getId_habitacion() + ", "+getCategoria()+", "+getCapacidad()
                +", "+getCamas()+", "+getEstado();
    }

}
