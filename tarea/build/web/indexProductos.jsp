<%-- 
    Document   : indexProductos
    Created on : 24-abr-2014, 20:45:16
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
        <form action="ingreso_producto" method="post">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar producto a BD</h1></td>
                </tr>

                <tr align="left"><td>Id_producto</td>
                <td><input type="text" value="" name="id_producto"></td></tr>

                <tr align="left"><td>Cantidad</td>
                <td><input type="text" value="" name="stock"></td></tr>

                <tr align="left"><td>Descripcion</td>
                <td><input type="text" value="" name="description"></td></tr>

                <tr align="left"><td>Categoria</td>
                <td><input type="text" value="" name="categoria"></td></tr>

                <tr align="left"><td>Precio</td>
                <td><input type="text" value="" name="precio"></td></tr>

                
                <td><input type="submit" value="Finalizar"></td>

                 <input type="button" value="Volver" onclick="location.href='indexadmproductos.jsp'" />
            </table>

        </form>
    </body>
</html>
