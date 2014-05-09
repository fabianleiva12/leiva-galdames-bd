package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilofabian.css\" media=\"screen\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function checkPass()\n");
      out.write("{\n");
      out.write("    //Store the password field objects into variables ...\n");
      out.write("    var pass1 = document.getElementById('contrasena');\n");
      out.write("    var pass2 = document.getElementById('contrasenaR');\n");
      out.write("    //Store the Confimation Message Object ...\n");
      out.write("    var message = document.getElementById('confirmMessage');\n");
      out.write("    //Set the colors we will be using ...\n");
      out.write("    var goodColor = \"#66cc66\";\n");
      out.write("    var badColor = \"#ff6666\";\n");
      out.write("    //Compare the values in the password field\n");
      out.write("    //and the confirmation field\n");
      out.write("    if(pass1.value == pass2.value){\n");
      out.write("        //The passwords match.\n");
      out.write("        //Set the color to the good color and inform\n");
      out.write("        //the user that they have entered the correct password\n");
      out.write("        pass2.style.backgroundColor = goodColor;\n");
      out.write("        message.style.color = goodColor;\n");
      out.write("        message.innerHTML = \"Contraseñas coinciden!\"\n");
      out.write("        document.getElementById(\"finalizar\").disabled=false;\n");
      out.write("        \n");
      out.write("        //response.sendRedirect(\"indexadm.jsp\");\n");
      out.write("    }if (pass1.value != pass2.value || pass1.value==\"\" || pass2.value==\"\"){\n");
      out.write("        //The passwords do not match.\n");
      out.write("        //Set the color to the bad color and\n");
      out.write("        //notify the user.\n");
      out.write("        pass2.style.backgroundColor = badColor;\n");
      out.write("        message.style.color = badColor;\n");
      out.write("        message.innerHTML = \"Contraseñas no coinciden!\"\n");
      out.write("        //response.sendRedirect(\"indexUsuario.jsp\");\n");
      out.write("        document.getElementById(\"finalizar\").disabled=true;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function allLetter(inputtxt)\n");
      out.write("  {\n");
      out.write("   var letters = /^[A-Za-z]+$/;\n");
      out.write("   if(inputtxt.value.match(letters))\n");
      out.write("     {\n");
      out.write("      document.getElementById(\"finalizar\").disabled=false;\n");
      out.write("      return true;\n");
      out.write("     }\n");
      out.write("   else\n");
      out.write("     {\n");
      out.write("     alert('Por favor inserta solo letras');\n");
      out.write("     document.getElementById(\"finalizar\").disabled=true;\n");
      out.write("     inputtxt.value=\"\";\n");
      out.write("     return false;\n");
      out.write("     }\n");
      out.write("  }\n");
      out.write("function Valida_Rut()\n");
      out.write("{       Objeto=document.getElementById(\"rut1\");\n");
      out.write("        var message = document.getElementById('confirmRut');\n");
      out.write("\tvar tmpstr = \"\";\n");
      out.write("\tvar intlargo = Objeto.value\n");
      out.write("        var badColor = \"#ff6666\";\n");
      out.write("        var goodColor = \"#66cc66\";\n");
      out.write("\tif (intlargo.length> 0)\n");
      out.write("\t{\n");
      out.write("\t\tcrut = Objeto.value\n");
      out.write("\t\tlargo = crut.length;\n");
      out.write("\t\tif ( largo <2 )\n");
      out.write("\t\t{\n");
      out.write("\t\t\t//alert('rut inválido')\n");
      out.write("\t\t\t//Objeto.focus()\n");
      out.write("\t\t\t//return false;\n");
      out.write("\t\t}\n");
      out.write("\t\tfor ( i=0; i <crut.length ; i++ )\n");
      out.write("\t\tif ( crut.charAt(i) != ' ' && crut.charAt(i) != '.' && crut.charAt(i) != '-' )\n");
      out.write("\t\t{\n");
      out.write("\t\t\ttmpstr = tmpstr + crut.charAt(i);\n");
      out.write("\t\t}\n");
      out.write("\t\trut = tmpstr;\n");
      out.write("\t\tcrut=tmpstr;\n");
      out.write("\t\tlargo = crut.length;\n");
      out.write("\n");
      out.write("\t\tif ( largo> 2 )\n");
      out.write("\t\t\trut = crut.substring(0, largo - 1);\n");
      out.write("\t\telse\n");
      out.write("\t\t\trut = crut.charAt(0);\n");
      out.write("\n");
      out.write("\t\tdv = crut.charAt(largo-1);\n");
      out.write("\n");
      out.write("\t\tif ( rut == null || dv == null )\n");
      out.write("\t\treturn 0;\n");
      out.write("\n");
      out.write("\t\tvar dvr = '0';\n");
      out.write("\t\tsuma = 0;\n");
      out.write("\t\tmul  = 2;\n");
      out.write("\n");
      out.write("\t\tfor (i= rut.length-1 ; i>= 0; i--)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tsuma = suma + rut.charAt(i) * mul;\n");
      out.write("\t\t\tif (mul == 7)\n");
      out.write("\t\t\t\tmul = 2;\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\tmul++;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tres = suma % 11;\n");
      out.write("\t\tif (res==1)\n");
      out.write("\t\t\tdvr = 'k';\n");
      out.write("\t\telse if (res==0)\n");
      out.write("\t\t\tdvr = '0';\n");
      out.write("\t\telse\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdvi = 11-res;\n");
      out.write("\t\t\tdvr = dvi + \"\";\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif ( dvr != dv.toLowerCase() )\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById(\"finalizar\").disabled=true;\n");
      out.write("                        //alert('El Rut Ingreso es Invalido')\n");
      out.write("                         message.style.color = badColor;\n");
      out.write("                         message.innerHTML = \"Rut Invalido!\";\n");
      out.write("\t\t\tObjeto.focus()\n");
      out.write("\t\t\treturn false; \n");
      out.write("\t\t}\n");
      out.write("\t\tdocument.getElementById(\"finalizar\").disabled=false;\n");
      out.write("                //alert('El Rut Ingresado es Correcto!')\n");
      out.write("                message.style.color = goodColor;\n");
      out.write("                message.innerHTML = \"Rut Válido\";\n");
      out.write("\t\tObjeto.focus()\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <form action=\"ingreso_usuario\" method=\"post\" name=\"usuario_index\">\n");
      out.write("            <table border=\"1\" id=\"table\">\n");
      out.write("                <tr bgcolor=\"#HF2355\" style=\" color: #HH0023; font-weight:bold;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>Ingresar Vendedor</h1></td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                <tr align=\"left\"><td>Rut</td>\n");
      out.write("                <td><input type=\"text\" id=\"rut1\" value=\"\" name=\"rut1\" onkeyup=\"Valida_Rut();\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Contrasena</td>\n");
      out.write("                <td><input type=\"password\" value=\"\" name=\"contrasena\" id=\"contrasena\" onkeyup=\"checkPass(); return false;\"></td></tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"left\"><td>Repetir Contrasena</td>\n");
      out.write("                <td><input type=\"password\" value=\"\" name=\"contrasenaR\" id=\"contrasenaR\"  onkeyup=\"checkPass(); return false;\" ></td></tr>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Nombre</td>\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"nombre1\" id=\"nombre1_id\"  onkeyup=\"allLetter(document.usuario_index.nombre1_id);\"    ></td></tr>\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"tipo\" value=\"vendedor\" />\n");
      out.write("                <input type=\"hidden\"  value=\"0\" name=\"comision\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td><input  type=\"submit\" value=\"Finalizar\" id=\"finalizar\" > </td> <td><span id=\"confirmMessage\" class=\"confirmMessage\"></span> </td>\n");
      out.write("                 </tr>\n");
      out.write("                <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexadm.jsp'\" />\n");
      out.write("                <span id=\"confirmRut\" class=\"confirmRut\"></span>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("             \n");
      out.write("           \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
