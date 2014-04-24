<%-- 
    Document   : indexcompra
    Created on : 24-abr-2014, 17:52:05
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>
    </head>
    <body>
         <form action="ingreso_compra" method="post">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar compra a BD</h1></td>
                </tr>

                <tr align="left"><td>id_compra</td>
                <td><input type="text" value="" name="id_compra"></td></tr>

                <tr align="left"><td>monto_total</td>
                <td><input type="text" value="" name="monto_total"></td></tr>

                <tr align="left"><td>fecha</td>
                <td><input type="text" value="" name="fecha"></td></tr>

                <tr align="left"><td>hora</td>
                <td><input type="text" value="" name="hora"></td></tr>


                <tr align="left"><td>Ingresar</td>
                <td><input type="submit" value="ingreso_compra"></td></tr>

                <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />
            </table>

        </form>
    </body>
</html>
