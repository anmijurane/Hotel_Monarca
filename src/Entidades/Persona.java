package Entidades;

/**
 *
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Persona {

    public Persona(String name, String apellidoPat, String apellidoMat, String calle, String numExt, String numInt, String colonia, String delegacion, String cp, String telLocal, String telMovil, String email) {
        this.name = name;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.calle = calle;
        this.numExt = numExt;
        this.numInt = numInt;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.cp = cp;
        this.telLocal = telLocal;
        this.telMovil = telMovil;
        this.email = email;
    }


    private String name;
    private String apellidoPat;
    private String apellidoMat;
    private String calle;
    private String numExt;
    private String numInt;
    private String colonia;
    private String delegacion;
    private String cp;
    private String telLocal;
    private String telMovil;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelLocal() {
        return telLocal;
    }

    public void setTelLocal(String telLocal) {
        this.telLocal = telLocal;
    }

    public String getTelMovil() {
        return telMovil;
    }

    public void setTelMovil(String telMovil) {
        
        this.telMovil = telMovil;
    }
    
    @Override
    public String toString() {
        return "\"" +name + "\" , \"" + apellidoPat + 
               "\" , \"" + apellidoMat + "\" , \"" + calle + "\" , \"" + numExt + 
               "\" , \"" + numInt + "\" , \"" + colonia + "\" , \"" + delegacion +
               "\" , \"" + cp + "\" , \"" + telLocal + "\" , \"" + telMovil+"\", \""+email+"\"";
    }
        
}
