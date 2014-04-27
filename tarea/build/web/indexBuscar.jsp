<%-- 
    Document   : indexBuscar
    Created on : 27-abr-2014, 4:19:34
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
            <form action="verificarProducto.jsp?page=b" method="post">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Buscar Producto</h1></td>
                </tr>

                <tr align="left"><td>Codigo de Producto a editar</td>
                <td><input type="text" value="" name="codigo"></td></tr>



                <td><input  type="submit" value="Finalizar"></td>

            </table>




        </form>
    </body>
</html>
