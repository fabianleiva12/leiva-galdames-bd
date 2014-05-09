<%-- 
    Document   : indexUpdate
    Created on : 27-abr-2014, 3:32:42
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
        <%!
        String codi;
        String x;
        %>
        <script type="text/javascript" >
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
        </script>
    </head>
    <body>
        <%codi=request.getParameter("id");
          x=request.getParameter("stock");
          %>

          <form action="update_producto" method="post" name="upproductos">
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Editar producto</h1></td>
                </tr>

                <tr align="left"><td>Id producto a editar</td>
                    <td><input size="50" type="text" value=<%=codi %> name="id_producto" readonly="readonly"></td></tr>
 

                <tr align="left"><td>Stock</td>
                    <td><input size="50" type="text" value=<%=x %> name="stock" readonly="readonly" ></td></tr>

                <tr align="left"><td>Descripcion</td>
                <td><input size="50" type="text" value="" id="description" name="description" onkeyup=" allLetter(document.upproductos.description);"></td></tr>

                <tr align="left"><td>Categoria</td>
                <td><input size="50" type="text" value="" id="categoria" name="categoria" onkeyup=" allLetter(document.upproductos.categoria);"></td></tr>

                <tr align="left"><td>Nuevo Precio</td>
                <td><input size="50" type="text" value="" onKeypress="if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;" name="precio"></td></tr>


                <td><input type="submit" id="finalizar" value="Guardar Cambios"></td>

                <input type="button" value="Volver" onclick="location.href='indexBuscarU.jsp'" />
            </table>

        </form>
    </body>
</html>
