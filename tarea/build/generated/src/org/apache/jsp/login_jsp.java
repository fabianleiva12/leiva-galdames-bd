package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.registro_usuario;
import modelo.registro_cliente;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilofabian.css\" media=\"screen\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PEPEWORKS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        <form action=\"validar.jsp\" method=\"POST\">\n");
      out.write("            \n");
      out.write("                <tr  style=\" ; font-weight:bolder;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>PEPEWORKS</h1></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr align=\"center\"><td>Rut</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"\" name=\"rut\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"center\"><td>Contraseña</td>\n");
      out.write("                    <td><input size=\"50\" type=\"password\" name=\"contrasena\" value=\"\" /></td></tr>\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Ingreso\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <font color=\"red\">\n");
      out.write("                ");
if(!(request.getParameter("mensaje")==null)){
                 out.println(request.getParameter("mensaje"));

                }
      out.write("\n");
      out.write("\n");
      out.write("            </font>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
