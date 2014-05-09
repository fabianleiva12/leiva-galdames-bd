<%-- 
    Document   : indexEncontrado
    Created on : 29-abr-2014, 21:49:02
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%!
        String codi;
        String stock_;
        String precio_;
        String categoria_;
        String descripcion_;
        %>
    </head>
    <body>
        <%codi=request.getParameter("id");
          stock_=request.getParameter("stock");
          precio_=request.getParameter("precio");
          categoria_=request.getParameter("categoria");
          descripcion_=request.getParameter("descripcion");
          %>

          <form action="update_producto" method="post">
            <table border="1">
               
                <tr align="left"><td>Id producto</td>
                    <td><input type="text" value=<%=codi %> name="id_producto" readonly="readonly"></td></tr>


                <tr align="left"><td>Stock</td>
                    <td><input type="text" value=<%=stock_ %> name="stock" readonly="readonly"></td></tr>

                <tr align="left"><td>Descripcion</td>
                <td><input type="text" value=<%=descripcion_ %> name="description" readonly="readonly"></td></tr>

                <tr align="left"><td>Categoria</td>
                <td><input type="text" value=<%=categoria_ %> name="categoria" readonly="readonly"></td></tr>

                <tr align="left"><td>Precio</td>
                <td><input type="text" value=<%= precio_ %> name="precio" readonly="readonly"></td></tr>


                <input type="button" value="Volver" onclick="location.href='indexBuscar.jsp'" />
            </table>

        </form>
    </body>
</html>
