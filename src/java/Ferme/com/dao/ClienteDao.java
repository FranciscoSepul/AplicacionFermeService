
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
        try(PreparedStatement busc=Conexion.getConexion().prepareStatement(query)) {
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
    public List BuscarCliente(String rut, String dv){
        ArrayList clie=new ArrayList();
        try{
        Connection conect = Conexion.getConexion();
        String query = "Select * from Cliente where runCliente=? and digitoVerif=?" ;
        PreparedStatement busc=conect.prepareStatement(query);
        busc.setString(1, rut);  
        busc.setString(2,dv);
        ResultSet rs = busc.executeQuery();
            while (rs.next()) {
               Cliente cli = new Cliente();
               cli.setEstado(rs.getInt("estado"));
               cli.setNombre(rs.getString("nombre"));
               cli.setApellido(rs.getString("apellido"));
               cli.setCorreo(rs.getString("correo"));
               cli.setContrasena(rs.getString("contrasena"));
               cli.setRunCliente(rs.getString("runCliente"));
               cli.setDigitoVerif(rs.getString("digitoVerif"));
               clie.add(cli); 
            }         
        } catch (SQLException e) {
            System.out.println("Error al buscar"+e.getMessage());
        }
        return clie;
    }

    @Override
    public boolean desabilitar(String rut,String dv) {
        try {
        Connection conect = Conexion.getConexion();
        String query = "Update cliente set estado =0 where runcliente =?" ;
        PreparedStatement busc=conect.prepareStatement(query);
        busc.setString(1, rut); 
        
        if(busc.executeUpdate()>0)
            return true;        
        
        } catch (SQLException e) {
            System.out.println("error al eliminar"+e.getMessage());
        }        
        return false;
    }

    
    public boolean actualizar(String rut, String dv,String direccion,String correo,String contrasena,String nombre,String apellido) {
        
        try {
        Connection conect = Conexion.getConexion();
        String query = "Update cliente set direccion = ? where runcliente =? and digitoVerif=?" ;
        PreparedStatement busc=conect.prepareStatement(query);
        
        busc.setString(1,direccion);
        busc.setString(2,correo); 
        busc.setString(3,contrasena);
        busc.setString(4,nombre);
        busc.setString(5,apellido);
        busc.setString(6,rut);
        busc.setString(7,dv);        
        
        if(busc.executeUpdate()>0) 
            return false;  
        
        } catch (SQLException e) {
            System.out.println("error al eliminar"+e.getMessage());
        }        
        return true;
    }
    
}
