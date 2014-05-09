<%-- 
    Document   : indexVentas
    Created on : 24-abr-2014, 21:31:24
    Author     : Furious
--%>

<%@page import="modelo.registro_usuario"%>
<%@page import="modelo.registro_cliente"%>
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
   function addRow(tableID) {

            var table = document.getElementById(tableID);

            var rowCount = table.rows.length;
            var row = table.insertRow(rowCount);

            var cell1 = row.insertCell(0);
            cell1.innerHTML=document.getElementById("nombrep").value;
            var element1 = document.createElement("input");
            element1.type = "hidden";
            element1.name="nombre"+(rowCount);
            element1.value= document.getElementById("nombrep").value;
            cell1.appendChild(element1);

            var cell2 = row.insertCell(1);
            cell2.innerHTML=document.getElementById("cantidadp").value;
            var element2 = document.createElement("input");
            element2.type = "hidden";
            element2.name="cantidad"+(rowCount);
            element2.value=document.getElementById("cantidadp").value;
            cell2.appendChild(element2);

            var cell3 = row.insertCell(2);
            cell3.innerHTML=document.getElementById("preciop").value;
            var element3 = document.createElement("input");
            element3.type = "hidden";
            element3.name="precio"+(rowCount);
            element3.value=document.getElementById("preciop").value;
            cell3.appendChild(element3);

            document.getElementById("nombrep").value=""
            document.getElementById("cantidadp").value=""
            document.getElementById("preciop").value=""
        }
        </script>
    </head>
    <body>
        <%!
        String nombreV;
        boolean x=true;
        registro_cliente client=new registro_cliente();
        %>
        <h2>VENDEDOR</h2>
        <h2><%= session.getAttribute("nombre").toString() %></h2>
          <form action="ingreso_venta" method="post" name="ventasv">
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar Venta</h1></td>
                </tr>

                <tr align="left"><td>Id Venta</td>
                <td><input size="50" type="text" value="" name="id_venta"></td></tr>

                <tr align="left"><td>Id cliente</td>
                <td><select name="cliente">
   <option selected value="0"> Elija un cliente </option>
   <%for(registro_cliente temp:client.buscar_cliente())
        {
                    nombreV=temp.getNombre();
                    out.println("<option>"+nombreV+"</option>"); 

        }%>

       
</select></td></tr>

                <tr align="left"><td>Id Usuario</td>
                <td><input size="50" type="text" value="" name="id_usuario"></td></tr>

                <tr align="left"><td>Monto total</td>
                <td><input size="50" type="text" value="" name="monto_total" onkeyup="allnumeric(document.ventasv.monto_total);"></td></tr>

                <tr align="left"><td>Fecha</td>
                <td><input size="50" type="text" value="" name="fecha"></td></tr>

                <tr align="left"><td>Hora</td>
                <td></td></tr>

                 <input type="button" value="Volver" onclick="location.href='indexVendedor.jsp'" />
            </table>

                <table border="1" width="350" id="tablacompras">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>

        </form>
    </body>
</html>
