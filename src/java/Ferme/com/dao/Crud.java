
package Ferme.com.dao;

import Ferme.com.dto.Cliente;
import java.util.List;

public interface Crud {
    public List Listar();
    public String  Eliminar(String rut, String dv);
}
