<%-- 
    Document   : validar
    Created on : 24-abr-2014, 19:04:13
    Author     : Furious
--%>

<%@page import="modelo.registro_usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <%!
        String rutV;
        String contrasenaV;
        String tipoV;
        boolean x=true;
        registro_usuario client=new registro_usuario();
        %>

    </head>
    <body>
    
        <%
        rutV=request.getParameter("rut");
        contrasenaV=request.getParameter("contrasena");
        tipoV=request.getParameter("tipo");
        if (rutV.equals("") || contrasenaV.equals("")){%>
        <jsp:forward page="login.jsp">
            <jsp:param name="mensaje" value="Usuario o contraseña en blanco <br> Intente Nuevamente."/>
        </jsp:forward>
        <%}

        for(registro_usuario temp:client.buscar_usuario())
        {

            if (rutV.equals(temp.getRut()) && contrasenaV.equals(temp.getContrasena()) )
            {   x=false;
                


                if(temp.getTipo().equals("ADMINISTRADOR"))
                {   
                    response.sendRedirect("indexadm.jsp?usuario="+temp.getNombre());
                }
                if(temp.getTipo().equals("VENDEDOR"))
                {
                    response.sendRedirect("indexVendedor.jsp?usuario="+temp.getNombre());
                }
 
            }
        }
        if (x){
        %>
        
            <jsp:forward page="login.jsp">
                <jsp:param name="mensaje" value="Usuario o contraseña invalido. <br> Intente Nuevamente."/>
            </jsp:forward>
            
       <% }%>
    

    </body>
</html>
