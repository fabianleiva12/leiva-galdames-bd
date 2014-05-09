<%-- 
    Document   : indexadm
    Created on : 24-abr-2014, 20:18:05
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head>

    <body>
        <%String nombre_usuario=request.getParameter("usuario");%>
        <h2>BIENVENIDO ADMINISTRADOR</h2>
        <h2><%= session.getAttribute("user_name") %></h2>
        <input type="button" value="Ingresar Cliente" onclick="location.href='indexClientes.jsp'" />
        <input type="button" value="Ingresar Vendedor" onclick="location.href='indexUsuario.jsp'" />
        <input type="button" value="Administrar Productos" onclick="location.href='indexadmproductos.jsp'" />
        <input type="button" value="Ingresar Compra" onclick="location.href='indexcompra_inicial.jsp'" />
        <input type="button" value="Ingresar Venta" onclick="location.href='indexVentas.jsp'" />
        <input type="button" value="Ver Ventas(hacer view)"/>
    </body>
</html>
