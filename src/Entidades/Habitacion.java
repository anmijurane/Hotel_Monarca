package Entidades;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Habitacion {

    private String id_habitacio;
    private String categoria;
    private String capacidad;
    private int camas;
    private String estado;

    public Habitacion(String id_habitacio, String categoria, String capacidad, int camas, String Estado) {
        this.id_habitacio = id_habitacio;
        this.categoria = categoria;
        this.capacidad = capacidad;
        this.camas = camas;
        this.estado = Estado;
    }

    public String getId_habitacio() {
        return id_habitacio;
    }

    public void setId_habitacio(String id_habitacio) {
        this.id_habitacio = id_habitacio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCapacidad() {
        return capacidad;
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
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    public String toString() {
        return "";
    }

}
