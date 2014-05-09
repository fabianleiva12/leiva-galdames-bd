<%-- 
    Document   : indexcompra_inicial
    Created on : 30-04-2014, 02:36:27 PM
    Author     : Fabian
--%>

<%@page import="modelo.registro_compra"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilofabian.css" media="screen" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>       
        <script type="text/javascript">
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
        function doThis()
{
          //alert("testing");
          var table = document.getElementById('tablacompras');
          var rowCount = table.rows.length;
          document.getElementById("cantidad_compras").value=rowCount-1;
          alert("Compra Exitosa");
          /*
          var row = table.insertRow(rowCount);
          var cell1 = row.insertCell(0);*/
          //alert("testing1");
          //var element1 = document.createElement("input");
          //alert("testing2");
          //element1.type = "hidden";
          //alert("testing3");
          //element1.name="cantidad_compras";
          //alert("testing4");
          //element1.value= rowCount;
          //alert("testing5");
          //cell1.appendChild(element1);
          //alert("testing6");
}
       
        </script>
    </head>
    <body>
        <form name="compra" action="ingreso_compra" id="form_compra" onSubmit="return doThis(this.finalizar) ">

        <table border="0" id="table">
            <thead>
                <tr>
                    <th>Ingresar nueva Compra</th>                  
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Nombre Producto</td>
                    <td><input size="50" type="text" value="" id="nombrep" name="nombre_producto"></td>
                </tr>
                <tr>
                    <td>Cantidad</td>
                    <td><input size="50" type="text" value="" id="cantidadp" name="cantidad"></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><input size="50" type="text" value="" id="preciop" name="precio"></td>
                </tr>

                <tr>
                    <td></td>
                    <td><input size="50" type="hidden" value="" id="cantidad_compras" name="cantidad_compras"></td>
                </tr>

                <tr>
                    <th><input type="submit" id="finalizar" name="finalizar" value="Finalizar" ></th>
                    <th><input type="button" id="ingresar" value="Ingresar" onclick="addRow('tablacompras');"> </th>
                </tr>
                <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />
            </tbody>
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
