package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexcompra_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String tipoUsr;
        

    String nombre_producto;
    String producto;
    String cantidad;
    String precio;
    String fecha;
    String hora;
    int monto;

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
      out.write("        <title>Compras</title>\n");
      out.write("\n");
      out.write("         ");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" >\n");
      out.write("        function allnumeric(inputtxt)\n");
      out.write("   {\n");
      out.write("      var numbers = /^[0-9]+$/;\n");
      out.write("      if(inputtxt.value.match(numbers))\n");
      out.write("      {\n");
      out.write("      //alert('Your Registration number has accepted....');\n");
      out.write("      document.getElementById(\"finalizar\").disabled=false;\n");
      out.write("      document.form1.text1.focus();\n");
      out.write("      return true;\n");
      out.write("      }\n");
      out.write("      else\n");
      out.write("      {\n");
      out.write("      alert('Por favor inserta sólo números');\n");
      out.write("      document.getElementById(\"finalizar\").disabled=true;\n");
      out.write("      inputtxt.value=\"\";\n");
      out.write("      document.form1.text1.focus();\n");
      out.write("      return false;\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write("   function allLetter(inputtxt)\n");
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
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" ");

    nombre_producto=request.getParameter("nombre_producto");
    producto=request.getParameter("producto");
    cantidad=request.getParameter("cantidad");
    precio=request.getParameter("precio");
    fecha=request.getParameter("fecha");
    hora=request.getParameter("hora");
    monto=Integer.parseInt(cantidad) * Integer.parseInt( precio);
    
    
      out.write("\n");
      out.write("         \n");
      out.write("            <table border=\"1\" id=\"table\">\n");
      out.write("                <tr bgcolor=\"#HF2355\" style=\" color: #HH0023; font-weight:bold;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>Ingresar compra a BD</h1></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"left\"><td>Nombre Producto</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=");
      out.print(nombre_producto);
      out.write(" name=\"nombre_producto\"></td></tr>\n");
      out.write("  \n");
      out.write("                <tr align=\"left\"><td>Cantidad</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=");
      out.print(producto);
      out.write(" name=\"producto\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Id Compra</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=");
      out.print(cantidad);
      out.write(" name=\"cantidad\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>monto_total</td>\n");
      out.write("                    <td><input size=\"50\" type=\"text\" value=");
      out.print(Integer.toString(monto));
      out.write(" name=\"monto_total\" onkeyup=\"allnumeric(document.compras.monto_total);\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Id Compra</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=");
      out.print(precio);
      out.write(" name=\"precio\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>fecha</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=");
      out.print(fecha);
      out.write(" name=\"fecha\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>hora</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=");
      out.print(hora);
      out.write(" name=\"hora\"></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Ingresar</td>\n");
      out.write("                <td><input type=\"submit\" id=\"finalizar\" value=\"ingreso_compra\"></td></tr>\n");
      out.write("\n");
      out.write("                <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexadm.jsp'\" />\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("       \n");
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
