
package Ferme.com.dao;

import Ferme.com.db.Conexion;
import Ferme.com.dto.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements Crud {

       
    @Override
    public List Listar() {
        
        ArrayList list = new ArrayList();
        String query="Select * from Cliente";
        try(PreparedStatement busc=Conexion.getConexion().prepareStatement("Select * from Cliente")) {
            ResultSet rs=busc.executeQuery();           
            while(rs.next()){
            Cliente cli = new Cliente();
            cli.setEstado(rs.getInt("estado"));
            cli.setNombre(rs.getString("nombre"));
            cli.setApellido(rs.getString("apellido"));
            cli.setCorreo(rs.getString("correo"));
            cli.setContrasena(rs.getString("contrasena"));
            cli.setRunCliente(rs.getString("runCliente"));
            cli.setDigitoVerif(rs.getString("digitoVerif"));
            list.add(cli);
            }
        } catch (Exception e) {
            System.out.println("error al listar" + e.getMessage());
        }
        return list;
    }

    @Override
    public Cliente ListarRut(String rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
