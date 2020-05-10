<%-- 
    Document   : Clliente
    Created on : 06-05-2020, 23:17:58
    Author     : wwwvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    </head>
    <body>
    <center>
        <div>
            <h3>datos</h3>
            <form action="ClienteServlet" method="POST">
                <input type="submit" name="opc" value="1" />
                <input type="submit" name="token" value="Mr.R0b0t4A11">
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>RUT</th>
                        <th>NOMBRE</th>
                        <th>CORREO</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="dato" items="${datos}">
                    <th>${dato.runCliente}</th> 
                    <th>${dato.nombre}</th> 
                    <th>${dato.correo}</th> 
                </c:forEach>
                </tbody>
            </table>
        </div>
    </center>
</body>
</html>
