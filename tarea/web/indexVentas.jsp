<%-- 
    Document   : indexVentas
    Created on : 24-abr-2014, 21:31:24
    Author     : Furious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script type="text/javascript" >
        function allnumeric(inputtxt)
   {
      var numbers = /^[0-9]+$/;
      if(inputtxt.value.match(numbers))
      {
      //alert('Your Registration number has accepted....');
      document.getElementById("finalizar").disabled=false;
      return true;
      }
      else
      {
      alert('Por favor inserta sólo números');
      document.getElementById("finalizar").disabled=true;
      inputtxt.value="";
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
    </head>
    <body>
          <form action="ingreso_venta" method="post" name="ventas">
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar Venta</h1></td>
                </tr>

                <tr align="left"><td>Id Venta</td>
                <td><input size="50" type="text" value="" name="id_venta"></td></tr>

                <tr align="left"><td>Id cliente</td>
                <td><input size="50" type="text" value="" name="id_cliente"></td></tr>

                <tr align="left"><td>Id Usuario</td>
                <td><input size="50" type="text" value="" name="id_usuario"></td></tr>

                <tr align="left"><td>Monto total</td>
                <td><input size="50" type="text" value="" name="monto_total" onkeyup="allnumeric(document.ventas.monto_total);"></td></tr>

                <tr align="left"><td>Fecha</td>
                <td><input size="50" type="text" value="" name="fecha"></td></tr>

                <tr align="left"><td>Hora</td>
                <td><input type="submit" value="hora"></td></tr>

                 <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />
            </table>

        </form>
    </body>
</html>
