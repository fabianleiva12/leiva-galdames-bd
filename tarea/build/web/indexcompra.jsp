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
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>

         <%!
        String tipoUsr;
        %>
        <script type="text/javascript" >
        function allnumeric(inputtxt)
   {
      var numbers = /^[0-9]+$/;
      if(inputtxt.value.match(numbers))
      {
      //alert('Your Registration number has accepted....');
      document.getElementById("finalizar").disabled=false;
      document.form1.text1.focus();
      return true;
      }
      else
      {
      alert('Por favor inserta sólo números');
      document.getElementById("finalizar").disabled=true;
      inputtxt.value="";
      document.form1.text1.focus();
      return false;
      }
   }
   function allLetter(inputtxt)
  {
   var letters = /^[A-Za-z]+$/;
   if(inputtxt.value.match(letters))
     {
      document.getElementById("finalizar").disabled=false;
      return true;
     }
   else
     {
     alert('Por favor inserta solo letras');
     document.getElementById("finalizar").disabled=true;
     inputtxt.value="";
     return false;
     }
  }
        </script>
<%!
    String nombre_producto;
    String cantidad;
    String precio;
    String fecha;
    String hora;
    int monto;
%>
    </head>
    <body>
 <%
    nombre_producto=request.getParameter("nombre_producto");
    cantidad=request.getParameter("cantidad");
    precio=request.getParameter("precio");
    fecha=request.getParameter("fecha");
    hora=request.getParameter("hora");
    monto=Integer.parseInt(cantidad) * Integer.parseInt( precio);

    %>
         
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar compra a BD</h1></td>
                </tr>
                <tr align="left"><td>Nombre Producto</td>
                <td><input size="50" type="text" value=<%=nombre_producto%> name="nombre_producto"></td></tr>
  

                <tr align="left"><td>Cantidad</td>
                <td><input size="50" type="text" value=<%=cantidad%> name="cantidad"></td></tr>

                <tr align="left"><td>monto_total</td>
                    <td><input size="50" type="text" value=<%=Integer.toString(monto)%> name="monto_total" onkeyup="allnumeric(document.compras.monto_total);"></td></tr>

                <tr align="left"><td>Id Compra</td>
                <td><input size="50" type="text" value=<%=precio%> name="precio"></td></tr>

                <tr align="left"><td>fecha</td>
                <td><input size="50" type="text" value=<%=fecha%> name="fecha"></td></tr>

                <tr align="left"><td>hora</td>
                <td><input size="50" type="text" value=<%=hora%> name="hora"></td></tr>


                <tr align="left"><td>Ingresar</td>
                <td><input type="submit" id="finalizar" value="ingreso_compra"></td></tr>

                <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />
            </table>

       
    </body>
</html>
