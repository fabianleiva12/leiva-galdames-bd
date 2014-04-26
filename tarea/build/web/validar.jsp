<%-- 
    Document   : validar
    Created on : 24-abr-2014, 19:04:13
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <%!
        String rutV;
        String contrasenaV;
        String tipoV;
        %>

    </head>
    <body>
        <%
        rutV=request.getParameter("rut");
        contrasenaV=request.getParameter("contrasena");
        tipoV=request.getParameter("tipo");

        if (rutV.equals("asd") && contrasenaV.equals("2") && tipoV.equals("administrador"))
        {
            response.sendRedirect("indexadm.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
       %>


    </body>
</html>
