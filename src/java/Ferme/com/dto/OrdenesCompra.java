
package Ferme.com.dto;

import java.io.Serializable;

public class OrdenesCompra implements Serializable{
    public String fecha;
    public int cantidad;

    public OrdenesCompra() {
    }

    public OrdenesCompra(String fecha, int cantidad) {
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "OrdenesCompra{" + "fecha=" + fecha + ", cantidad=" + cantidad + '}';
    }
    
}
