
package Ferme.com.dto;

import java.io.Serializable;

public class Documentos implements Serializable{
     public String fecha;
     public int tipoDoc;
     public int numFolio;

    public Documentos() {
    }

    public Documentos(String fecha, int tipoDoc, int numFolio) {
        this.fecha = fecha;
        this.tipoDoc = tipoDoc;
        this.numFolio = numFolio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(int tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumFolio() {
        return numFolio;
    }

    public void setNumFolio(int numFolio) {
        this.numFolio = numFolio;
    }

    @Override
    public String toString() {
        return "Documentos{" + "fecha=" + fecha + ", tipoDoc=" + tipoDoc + ", numFolio=" + numFolio + '}';
    }
     
     
}
