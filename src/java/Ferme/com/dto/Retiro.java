
package Ferme.com.dto;

import java.io.Serializable;

public class Retiro implements Serializable{
    public String nombreRetiro;

    public Retiro() {
    }

    public Retiro(String nombreRetiro) {
        this.nombreRetiro = nombreRetiro;
    }

    public String getNombreRetiro() {
        return nombreRetiro;
    }

    public void setNombreRetiro(String nombreRetiro) {
        this.nombreRetiro = nombreRetiro;
    }

    @Override
    public String toString() {
        return "Retiro{" + "nombreRetiro=" + nombreRetiro + '}';
    }
    
    
}
