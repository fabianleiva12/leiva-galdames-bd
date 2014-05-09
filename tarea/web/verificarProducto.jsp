<%-- 
    Document   : verificarProducto
    Created on : 27-abr-2014, 23:04:41
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
        String codig;
        String page="null";
        %>
    </head>
    <body>
        <%
          codig=request.getParameter("codigo");
          page=request.getParameter("page");
          registro_producto nuevo=new registro_producto();
          registro_producto tmp1=nuevo.buscar_prod(Integer.parseInt(codig));

          if (tmp1==null && !page.equals("b")){
              
              %>
        <jsp:forward page="indexBuscarU.jsp">
            <jsp:param name="mensaje" value="Producto no encontrado."/>
        </jsp:forward>

          <%
          }
          if (tmp1==null && page.equals("b")){

              %>
          <jsp:forward page="indexBuscar.jsp">
            <jsp:param name="mensaje" value="Producto no encontrado."/>
        </jsp:forward>
          <%
          }
          if (page.equals("b")==true){
              response.sendRedirect("indexEncontrado.jsp?id="+Integer.toString(tmp1.getId_producto())+"&stock="+Integer.toString(tmp1.getStock())+"&precio="+Integer.toString(tmp1.getPrecio())+"&categoria="+tmp1.getCategoria()+"&descripcion="+tmp1.getDescription());
          }

          else{
                response.sendRedirect("indexUpdate.jsp?id="+Integer.toString(tmp1.getId_producto())+ "&stock="+Integer.toString(tmp1.getStock()));
          } %>
    </body>
</html>
