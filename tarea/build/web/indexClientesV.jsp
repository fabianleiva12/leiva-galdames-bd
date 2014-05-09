<%-- 
    Document   : indexClientes
    Created on : 24-abr-2014, 20:36:07
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
        <script type="text/javascript">
        function Valida_Rut()
{       Objeto=document.getElementById("rut1");
        var message = document.getElementById('confirmRut');
	var tmpstr = "";
	var intlargo = Objeto.value
        var badColor = "#ff6666";
        var goodColor = "#66cc66";
	if (intlargo.length> 0)
	{
		crut = Objeto.value
		largo = crut.length;
		if ( largo <2 )
		{
			//alert('rut inválido')
			//Objeto.focus()
			//return false;
		}
		for ( i=0; i <crut.length ; i++ )
		if ( crut.charAt(i) != ' ' && crut.charAt(i) != '.' && crut.charAt(i) != '-' )
		{
			tmpstr = tmpstr + crut.charAt(i);
		}
		rut = tmpstr;
		crut=tmpstr;
		largo = crut.length;

		if ( largo> 2 )
			rut = crut.substring(0, largo - 1);
		else
			rut = crut.charAt(0);

		dv = crut.charAt(largo-1);

		if ( rut == null || dv == null )
		return 0;

		var dvr = '0';
		suma = 0;
		mul  = 2;

		for (i= rut.length-1 ; i>= 0; i--)
		{
			suma = suma + rut.charAt(i) * mul;
			if (mul == 7)
				mul = 2;
			else
				mul++;
		}

		res = suma % 11;
		if (res==1)
			dvr = 'k';
		else if (res==0)
			dvr = '0';
		else
		{
			dvi = 11-res;
			dvr = dvi + "";
		}

		if ( dvr != dv.toLowerCase() )
		{
			document.getElementById("finalizar").disabled=true;
                        //alert('El Rut Ingreso es Invalido')
                         message.style.color = badColor;
                         message.innerHTML = "Rut Invalido!";
			Objeto.focus()
			return false;
		}
		document.getElementById("finalizar").disabled=false;
                //alert('El Rut Ingresado es Correcto!')
                message.style.color = goodColor;
                message.innerHTML = "Rut Válido";
		Objeto.focus()
		return true;
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
        
        <h2>VENDEDOR</h2>
        
        <form action="ingreso_cliente" name="inclientesv" method="post">
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color:#HH0023 ; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar cliente</h1></td>
                </tr>

                <tr align="left"><td>Rut</td>
                <td><input size="50" type="text" value="" id="rut1" name="rut" onkeyup="Valida_Rut();"></td></tr>

                <tr align="left"><td>Nombre</td>
                <td><input size="50" type="text" value="" id="nombre1_id" name="nombre" onkeyup="allLetter(document.inclientesv.nombre1_id);" ></td></tr>

                
                <td><input type="submit" id="finalizar" value="Finalizar"></td>

                <input type="button" value="Volver" onclick="location.href='indexVendedor.jsp'" />
                <span id="confirmRut" class="confirmRut"></span>

            </table>


        </form>
    </body>
</html>
