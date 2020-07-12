package Entidades;

/**
 *
 * @author Diego C
 */
public class Reserva {

    private String checkIn, checkOut, habitaciones, noches, personas;

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getNoches() {
        return noches;
    }

    public void setNoches(String noches) {
        this.noches = noches;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    public Reserva(String checkIn, String checkOut, String habitaciones, String noches, String personas) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.habitaciones = habitaciones;
        this.noches = noches;
        this.personas = personas;
        
    }
   
}
