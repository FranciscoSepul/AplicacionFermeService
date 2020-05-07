
package Ferme.com.dto;

import java.io.Serializable;

public class Producto implements Serializable{
    public String nombre;
    public int stock;
    public int precioUni;

    public Producto() {
    }

    public Producto(String nombre, int stock, int precioUni) {
        this.nombre = nombre;
        this.stock = stock;
        this.precioUni = precioUni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(int precioUni) {
        this.precioUni = precioUni;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", stock=" + stock + ", precioUni=" + precioUni + '}';
    }
    
    
}
