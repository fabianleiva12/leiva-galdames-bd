<%-- 
    Document   : indexUsuario
    Created on : 25-abr-2014, 21:58:01
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
        function checkPass()
{
    //Store the password field objects into variables ...
    var pass1 = document.getElementById('contrasena');
    var pass2 = document.getElementById('contrasenaR');
    //Store the Confimation Message Object ...
    var message = document.getElementById('confirmMessage');
    //Set the colors we will be using ...
    var goodColor = "#66cc66";
    var badColor = "#ff6666";
    //Compare the values in the password field
    //and the confirmation field
    if(pass1.value == pass2.value){
        //The passwords match.
        //Set the color to the good color and inform
        //the user that they have entered the correct password
        pass2.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "Contraseñas coinciden!"
        document.getElementById("finalizar").disabled=false;
        
        //response.sendRedirect("indexadm.jsp");
    }if (pass1.value != pass2.value || pass1.value=="" || pass2.value==""){
        //The passwords do not match.
        //Set the color to the bad color and
        //notify the user.
        pass2.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = "Contraseñas no coinciden!"
        //response.sendRedirect("indexUsuario.jsp");
        document.getElementById("finalizar").disabled=true;
        
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
    </script>
    </head>
    <body>
        <h2>ADMINISTRADOR</h2>
        <h2><%= session.getAttribute("user_name") %></h2>
       <form action="ingreso_usuario" method="post" name="usuario_index">
            <table border="1" id="table">
                <tr bgcolor="#HF2355" style=" color: #HH0023; font-weight:bold;">
                    <td colspan="2" align="center"><h1>Ingresar Vendedor</h1></td>
                </tr>
                 
                <tr align="left"><td>Rut</td>
                <td><input type="text" id="rut1" value="" name="rut1" onkeyup="Valida_Rut();"></td></tr>

                <tr align="left"><td>Contrasena</td>
                <td><input type="password" value="" name="contrasena" id="contrasena" onkeyup="checkPass(); return false;"></td></tr>
                
                <tr align="left"><td>Repetir Contrasena</td>
                <td><input type="password" value="" name="contrasenaR" id="contrasenaR"  onkeyup="checkPass(); return false;" ></td></tr>
                

                <tr align="left"><td>Nombre</td>
                <td><input type="text" value="" name="nombre1" id="nombre1_id"  onkeyup="allLetter(document.usuario_index.nombre1_id);"    ></td></tr>

                <input type="hidden" name="tipo" value="vendedor" />
                <input type="hidden"  value="0" name="comision" >
                <tr>
                    <td><input  type="submit" value="Finalizar" id="finalizar" > </td> <td><span id="confirmMessage" class="confirmMessage"></span> </td>
                 </tr>
                <input type="button" value="Volver" onclick="location.href='indexadm.jsp'" />
                <span id="confirmRut" class="confirmRut"></span>
            </table>

             
           

        </form>
    </body>
</html>
