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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <form action=\"ingreso_usuario\" method=\"post\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr bgcolor=\"#HF2355\" style=\" color: #HH0023; font-weight:bold;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>Ingresar Vendedor</h1></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Rut</td>\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"rut1\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Contrasena</td>\n");
      out.write("                <td><input type=\"password\" value=\"\" name=\"contrasena\"></td></tr>\n");
      out.write("                \n");
      out.write("                <tr align=\"left\"><td>Repetir Contrasena</td>\n");
      out.write("                <td><input type=\"password\" value=\"\" name=\"contrasenaR\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Nombre</td>\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"nombre1\"></td></tr>\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"tipo\" value=\"vendedor\" />\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Comision</td>\n");
      out.write("                <td><input type=\"text\"  value=\"\" onKeypress=\"if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;\" name=\"comision\" ></td></tr>\n");
      out.write("\n");
      out.write("                <td><input  type=\"submit\" value=\"Finalizar\"></td>\n");
      out.write("                <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexadm.jsp'\" />\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("           \n");
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
