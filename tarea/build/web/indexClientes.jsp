<%-- 
    Document   : indexClientes
    Created on : 24-abr-2014, 20:36:07
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ingreso_cliente" method="post">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color:#HH0023 ; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar cliente a BD</h1></td>
                </tr>

                <tr align="left"><td>Rut</td>
                <td><input type="text" value="" name="rut"></td></tr>

                <tr align="left"><td>Nombre</td>
                <td><input type="text" value="" name="nombre"></td></tr>

                <tr align="left"><td>Ingresar</td>
                <td><input type="submit" value="ingreso_cliente"></td></tr>

                <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />

            </table>


        </form>
    </body>
</html>
