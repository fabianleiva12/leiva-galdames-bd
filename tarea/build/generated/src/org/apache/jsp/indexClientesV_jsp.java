package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexClientesV_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        function Valida_Rut()\n");
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
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tdocument.getElementById(\"finalizar\").disabled=false;\n");
      out.write("                //alert('El Rut Ingresado es Correcto!')\n");
      out.write("                message.style.color = goodColor;\n");
      out.write("                message.innerHTML = \"Rut Válido\";\n");
      out.write("\t\tObjeto.focus()\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
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
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ingreso_cliente\" name=\"inclientesv\" method=\"post\">\n");
      out.write("            <table border=\"1\" id=\"table\">\n");
      out.write("                <tr bgcolor=\"#HF2355\" style=\" color:#HH0023 ; font-weight:bold;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>Ingresar cliente</h1></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Rut</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"\" id=\"rut1\" name=\"rut\" onkeyup=\"Valida_Rut();\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Nombre</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"\" id=\"nombre1_id\" name=\"nombre\" onkeyup=\"allLetter(document.inclientesv.nombre1_id);\" ></td></tr>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" id=\"finalizar\" value=\"Finalizar\"></td>\n");
      out.write("\n");
      out.write("                <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexVendedor.jsp'\" />\n");
      out.write("                <span id=\"confirmRut\" class=\"confirmRut\"></span>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
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
