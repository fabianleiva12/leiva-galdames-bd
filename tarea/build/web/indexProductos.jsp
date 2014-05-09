<%-- 
    Document   : indexProductos
    Created on : 24-abr-2014, 20:45:16
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
    </head>
    <body>
        <form action="ingreso_producto" method="post" name="inproductos">
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar producto a BD</h1></td>
                </tr>

                <tr align="left"><td>Nombre</td>
                <td><input size="50" type="text" value="" name="nombre"></td></tr>

                <tr align="left"><td>Id_producto</td>
                <td><input size="50" type="text" value="" name="id_producto"></td></tr>

                <tr align="left"><td>Cantidad</td>
                <td><input size="50" type="text" value="" id="cantidad_id" name="stock" onkeyup="allnumeric(document.inproductos.stock);" ></td></tr>

                <tr align="left"><td>Descripcion</td>
                <td><input size="50" type="text" value="" id="description" name="description" onkeyup="allLetter(document.inproductos.description);"></td></tr>

                <tr align="left"><td>Categoria</td>
                <td><input size="50" type="text" value="" id="categoria" name="categoria" onkeyup=" allLetter(document.inproductos.categoria);" ></td></tr>

                <tr align="left"><td>Precio</td>
                <td><input size="50" type="text" value="" name="precio" id="precio_id" onkeyup="allnumeric(document.inproductos.precio);"></td></tr>

                
                <td><input type="submit" id="finalizar" value="Finalizar"></td>

                 <input type="button" value="Volver" onclick="location.href='indexadmproductos.jsp'" />
            </table>

        </form>
    </body>
</html>
