
package Ferme.com.dto;

import java.io.Serializable;

public class DetalleVentas implements Serializable {
    public String fechaCompra;
    public int cantidad ;
    public int total ;

    public DetalleVentas() {
    }

    public DetalleVentas(String fechaCompra, int cantidad, int total) {
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleVentas{" + "fechaCompra=" + fechaCompra + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
}
