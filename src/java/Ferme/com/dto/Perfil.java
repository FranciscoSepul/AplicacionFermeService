
package Ferme.com.dto;
import java.io.Serializable;

public class Perfil implements Serializable {
    
    public String nombreCarga;

    public Perfil() {
    }

    public Perfil(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    
    public String getNombreCarga() {
        return nombreCarga;
    }

    public void setNombreCarga(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    @Override
    public String toString() {
        return "Perfil{" + "nombreCarga=" + nombreCarga + '}';
    }
    
}
