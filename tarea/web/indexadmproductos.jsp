<%-- 
    Document   : indexadmproductos
    Created on : 27-abr-2014, 3:03:31
    Author     : Furious
--%>

<%@page import="modelo.registro_producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>ADMINISTRADOR</h2>
        <h2><%= session.getAttribute("user_name") %></h2>
         <input type="button" value="Buscar Producto" onclick="location.href='indexBuscar.jsp'" />
        <input type="button" value="Editar Producto" onclick="location.href='indexBuscarU.jsp'" />
        <input type="button" value="Agregar Producto" onclick="location.href='indexProductos.jsp'" />
        <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />


        <table>
            <table border="1">
                <tr>
                    <td>ID PRODUCTO</td>
                    <td>STOCK</td>
                    <td>DESCRIPCION</td>
                    <td>CATEGORIA</td>
                    <td>PRECIO</td>
                </tr>
        <%registro_producto pro=new registro_producto();

                  for (registro_producto temp1: pro.buscar_producto()){
          %>

            
          
               <tr >
                   <td align="left"><%=temp1.getId_producto() %></td>
                   <td align="left"><%=temp1.getStock() %></td>
                   <td align="left"><%=temp1.getDescription() %></td>
                   <td align="left"><%=temp1.getCategoria() %></td>
                   <td align="left"><%=temp1.getPrecio() %></td>
               </tr>
           

            <% } %>
            </table>
           </table>
    </body>
</html>
