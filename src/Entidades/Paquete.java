package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Diego C
 */
public class Paquete {
    
    private String personas, entrda, salida, costo, id_room;

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    public String getEntrda() {
        return entrda;
    }

    public void setEntrda(String entrda) {
        this.entrda = entrda;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getId_room() {
        return id_room;
    }

    public void setId_room(String id_room) {
        this.id_room = id_room;
    }

    public Paquete(String entrda, String salida, String costo) {        
        this.entrda = entrda;
        this.salida = salida;
        this.costo = costo;
    }
    public Paquete(String personas, String entrda, String salida, String costo) {        
        this.personas = personas;
        this.entrda = entrda;
        this.salida = salida;
        this.costo = costo;
    }
    
    private ArrayList<HabitacionesArray> arrIdHabitaciones = new ArrayList<>();

    public ArrayList<HabitacionesArray> getArrIdHabitaciones() {
        return arrIdHabitaciones;
    }

    public void addArrIdHabitaciones(int idHabitaciones, String numPersonas, double costo, String categoria) {
        arrIdHabitaciones.add(new HabitacionesArray(idHabitaciones, numPersonas, costo, categoria));
    }        
    public void addArrIdHabitaciones(int idHabitaciones, String numPersonas) {
        arrIdHabitaciones.add(new HabitacionesArray(idHabitaciones, numPersonas));
    }        
    
    public static class HabitacionesArray{
        
        private int idHabitacion;
        private double costo;
        private String categoria, personas;

        public HabitacionesArray(int idHabitacion, String personas){
            this.idHabitacion = idHabitacion;
        } //Constructor
        
        public HabitacionesArray(int idHabitacion, String personas, double costo, String categoria){
            this.idHabitacion = idHabitacion;
            this.personas = personas;
            this.costo = costo;
            this.categoria = categoria;
        }

        public String getPersonas() {
            return personas;
        }

        public void setPersonas(String personas) {
            this.personas = personas;
        }
        
        
        public int getIdHabitacion(){
            return idHabitacion;
        }
        
        public void setIdHabitacion(int idHabitacion){
            this.idHabitacion = idHabitacion;
        }
        
        @Override
        public String toString(){
            return ""+idHabitacion;
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
        
    }

}
