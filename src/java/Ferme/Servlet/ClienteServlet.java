/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferme.Servlet;

import Ferme.com.dao.ClienteDao;
import Ferme.com.dto.Cliente;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wwwvi
 */
@WebServlet("/api")
public class ClienteServlet extends HttpServlet {

    ClienteDao cli = new ClienteDao();
    Properties prop=new Properties();
             
     
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        try {         
            FileReader read= new FileReader("C:\\Users\\wwwvi\\OneDrive\\Documentos\\NetBeansProjects\\FermeService\\Data.properties");
            prop.load(read);
        } catch (IOException e) {
             System.out.println(""+e.getMessage());
        }  
        String rut = request.getParameter("rut");
        String dv = request.getParameter("dv");
        String opcion = request.getParameter("opc");
        String token = request.getParameter("token");
        String tokenProd = prop.getProperty("token.prop");
        String mensaje;
        boolean respu;
            List<Cliente> datos;
        if (tokenProd.equals(token)) {
            
            switch (opcion) {

                case "1":
                    datos = cli.Listar();
                    for (Cliente dato : datos) {
                    response.getWriter().print(dato);
                    }
                    break;
                case "2":
                   datos = cli.BuscarCliente(rut, dv);
                    for (Cliente clientes : datos) {
                        response.getWriter().print(clientes);
                    };
                    break;
                case "3":
                    respu=cli.desabilitar(rut,dv);  
                    mensaje = (respu == false) ?  "Error" : "exito";                    
                    response.getWriter().print(mensaje);
//                    break;
                case "4":
                    String direccion = request.getParameter("direccion"),
                    correo = request.getParameter("correo"),
                    contrasena = request.getParameter("contrasena"),
                    nombre = request.getParameter("nombre"),
                    apellido = request.getParameter("apellido");
                    respu=cli.actualizar(rut,dv,direccion,correo,contrasena,nombre,apellido);
                    mensaje=(respu == false)?"Error":"exito";
                    response.getWriter().print(mensaje);
                    break;
            }
        }else
        {
            mensaje="Error  no se pudo entrar al if";
            response.getWriter().print(mensaje);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
