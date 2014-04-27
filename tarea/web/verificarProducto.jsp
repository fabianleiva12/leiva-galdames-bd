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
        
        %>
    </head>
    <body>
        <%codig=request.getParameter("codigo");
          registro_producto nuevo=new registro_producto();
          registro_producto tmp1=nuevo.buscar_prod(Integer.parseInt(codig));

          if (tmp1==null){
              response.sendRedirect("indexBuscarU.jsp");
          }
          else{
                response.sendRedirect("indexUpdate.jsp?id="+Integer.toString(tmp1.getId_producto())+ "&stoc="+Integer.toString(tmp1.getStock()));
          } %>
    </body>
</html>
