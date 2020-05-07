
package Ferme.com.dto;

import java.io.Serializable;

public class Empleado implements Serializable {
    
    public int estado;
    public String runEmpleado;
    public String digitoVerificador;
    public String nombre;
    public String apellido;
    public String correo;
    public String contrasena;

    public Empleado() {
    }

    public Empleado(int estado, String runEmpleado, String digitoVerificador, String nombre, String apellido, String correo, String contrasena) {
        this.estado = estado;
        this.runEmpleado = runEmpleado;
        this.digitoVerificador = digitoVerificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getRunEmpleado() {
        return runEmpleado;
    }

    public void setRunEmpleado(String runEmpleado) {
        this.runEmpleado = runEmpleado;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Empleado{" + "estado=" + estado + ", runEmpleado=" + runEmpleado + ", digitoVerificador=" + digitoVerificador + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    }
    
    
}
