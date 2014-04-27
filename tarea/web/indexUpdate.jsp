<%-- 
    Document   : indexUpdate
    Created on : 27-abr-2014, 3:32:42
    Author     : Furious
--%>

<%@page import="modelo.registro_producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%!
        String codi;
        String x;
        %>
    </head>
    <body>
        <%codi=request.getParameter("id");
          x=request.getParameter("stoc");
          %>

          <form action="update_producto" method="post">
            <table border="1">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Editar producto</h1></td>
                </tr>

                <tr align="left"><td>Id producto a editar</td>
                    <td><input type="text" value=<%=codi %> name="id_producto" readonly="readonly"></td></tr>


                <tr align="left"><td>Stock</td>
                    <td><input type="text" value=<%=x %> name="stock" readonly="readonly"></td></tr>

                <tr align="left"><td>Descripcion</td>
                <td><input type="text" value="" name="description"></td></tr>

                <tr align="left"><td>Categoria</td>
                <td><input type="text" value="" name="categoria"></td></tr>

                <tr align="left"><td>Nuevo Precio</td>
                <td><input type="text" value="" onKeypress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;" name="precio"></td></tr>


                <td><input type="submit" value="Guardar Cambios"></td>

                <input type="button" value="Volver" onclick="location.href='indexBuscarU.jsp'" />
            </table>

        </form>
    </body>
</html>
