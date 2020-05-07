
package Ferme.com.dto;

import java.io.Serializable;

public class Sucursal implements Serializable{
    public String nombre;
    public String numFono;

    public Sucursal() {
    }

    public Sucursal(String nombre, String numFono) {
        this.nombre = nombre;
        this.numFono = numFono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumFono() {
        return numFono;
    }

    public void setNumFono(String numFono) {
        this.numFono = numFono;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + ", numFono=" + numFono + '}';
    }
    
    
}
