<%-- 
    Document   : indexUsuario
    Created on : 25-abr-2014, 21:58:01
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
        
       <form action="ingreso_usuario" method="post">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar Vendedor</h1></td>
                </tr>

                <tr align="left"><td>Rut</td>
                <td><input type="text" value="" name="rut1"></td></tr>

                <tr align="left"><td>Contrasena</td>
                <td><input type="password" value="" name="contrasena"></td></tr>
                
                <tr align="left"><td>Repetir Contrasena</td>
                <td><input type="password" value="" name="contrasenaR"></td></tr>

                <tr align="left"><td>Nombre</td>
                <td><input type="text" value="" name="nombre1"></td></tr>

                <input type="hidden" name="tipo" value="vendedor" />
                

                <tr align="left"><td>Comision</td>
                <td><input type="text"  value="" onKeypress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;" name="comision" ></td></tr>

                <td><input  type="submit" value="Finalizar"></td>
                <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />
            </table>

           
           

        </form>
    </body>
</html>
