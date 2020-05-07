
package Ferme.com.dao;

import Ferme.com.dto.Cliente;
import java.util.List;

public interface Crud {
    public List Listar();
    public Cliente ListarRut(String rut);    
}
