<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : login
    Created on : 24-abr-2014, 17:54:29
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PEPEWORKS</title>
    </head>
    <body>
      
        <form action="validar.jsp" method="POST">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color:#HH0023 ; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar aa PEPEWORKS</h1></td>
                </tr>

                <tr align="left"><td>Rut</td>
                <td><input type="text" value="" name="rut"></td></tr>

                <tr align="left"><td>Contraseña</td>
                    <td><input type="password" name="contrasena" value="" /></td></tr>

                <tr align="left"><td>Tipo</td>
                    <td><input type="text" name="tipo" value="" /></td></tr>

                <tr align="left"><td>Ingresar</td>
                <td><input type="submit" value="Ingreso"></td></tr>

            </table>
        </form>

    </body>
</html>