<%-- 
    Document   : indexVendedor
    Created on : 24-abr-2014, 20:37:45
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%String nombre_usuario=request.getParameter("usuario");%>
        <h2>VENDEDOR</h2>
        <h1><%=nombre_usuario%></h1>
        <input type="button" value="Ingresar Cliente" onclick="location.href='indexClientesV.jsp'" />
        <input type="button" value="Ingresar Venta" onclick="location.href='indexVentasV.jsp'" />
        <input type="button" value="Ver Ventas(hacer view)"/>
        <input type="button" value="Mis Ventas(hacer view)"/>

    </body>
</html>
