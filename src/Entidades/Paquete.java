package Entidades;
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

    public Paquete(String personas, String entrda, String salida, String costo, String id_room) {
        this.personas = personas;
        this.entrda = entrda;
        this.salida = salida;
        this.costo = costo;
        this.id_room = id_room;
    }

}
