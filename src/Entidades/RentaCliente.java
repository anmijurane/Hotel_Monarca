package Entidades;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class RentaCliente {

    private int idHabitacion;
    private int idCliente;
    private String nombreCompleto;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int personas;
    private Date entrada;
    private String salida;
    private double costoTotal;
    private String metodoPago;    

    public RentaCliente(int idHabitacion, int idCliente) {
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
    }

    public RentaCliente(int idHabitacion, int idCliente, String nombre, String apellidoP, String apellidoM, int personas, Date entrada, double costoTotal) {
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;        
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.personas = personas;
        this.entrada = entrada;        
        this.costoTotal = costoTotal;        
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto = apellidoP +" "+ apellidoM +" "+ nombre;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getMetdPago() { 
        return metodoPago;
    }
    
    public void setMetdPago(int metPago){    
        switch (metPago) {
            case 1:
                this.metodoPago = "EFECTIVO";                
                break;
            case 2:
                this.metodoPago = "TARJETA DE CREDITO";                
                break;
            case 3:
                this.metodoPago = "TARJETA DE DEBITO";                
                break;
            default:
                System.out.println("NO SE ENCONTRO UN METODO VALIDO");
        }        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    
    public int getDias(){
        Timestamp dates = new Timestamp(new Date().getTime());
        int day = (int) (TimeUnit.DAYS.convert((dates.getTime() - entrada.getTime()),TimeUnit.MILLISECONDS ));
        return day;
    }
    
    public double CalcularCosto(){        
        return costoTotal * getDias();
    }
    
    @Override
    public String toString() {
        return getIdCliente() + ", " +getNombre() +", "
                + getApellidoP() + ", " +getApellidoM() + ", "
                + getNombreCompleto() + ", " + getMetdPago()+ ", "
                + getPersonas() + ", " + getEntrada() + ", " 
                + getSalida() + ", " + getCostoTotal() + ", "
                + getMetdPago();
    }
    
    

}
