<%--
    Document   : login
    Created on : 24-abr-2014, 17:54:29
    Author     : Furious
--%>

<%@page import="modelo.registro_usuario"%>
<%@page import="modelo.registro_cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PEPEWORKS</title>
    </head>
    <body>
      
        <form action="validar.jsp" method="POST">
            
                <tr  style=" ; font-weight:bolder;">
                    <td colspan="2" align="center"><h1>PEPEWORKS</h1></td>
                </tr>

                <tr align="center"><td>Rut</td>
                <td><input size="50" type="text" value="" name="rut"></td></tr>

                <tr align="center"><td>Contraseña</td>
                    <td><input size="50" type="password" name="contrasena" value="" /></td></tr>

                <br><br>
                
                <input type="submit" value="Ingreso">

            
            
            

            <font color="red">
                <%if(!(request.getParameter("mensaje")==null)){
                 out.println(request.getParameter("mensaje"));

                }%>

            </font>
        </form>

    </body>
</html>