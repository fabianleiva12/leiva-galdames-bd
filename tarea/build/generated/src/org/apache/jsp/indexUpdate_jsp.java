package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.registro_producto;

public final class indexUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String codi;

        
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
codi=request.getParameter("codigo");
      out.write("\n");
      out.write("          <form action=\"update_producto\" method=\"post\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr bgcolor=\"#HF2355\" style=\" color: #HH0023; font-weight:bold;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>Editar producto</h1></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Id producto a editar</td>\n");
      out.write("                <td><input type=\"text\" value=");
      out.print(codi );
      out.write(" name=\"id_producto\" disabled=\"disabled\"></td></tr>\n");
      out.write("\n");
      out.write("                ");
registro_producto pro=new registro_producto();
                  for (registro_producto temp1: pro.buscar_producto()){
                      if (Integer.toString(temp1.getId_producto()).equals(codi)){

                
      out.write("\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Stock</td>\n");
      out.write("                    <td><input type=\"text\" value=");
      out.print(Integer.toString(temp1.getStock()) );
      out.write(" name=\"stock\"></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      }

                } 
      out.write("\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Descripcion</td>\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"description\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Categoria</td>\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"categoria\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Nuevo Precio</td>\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"precio\"></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <td><input type=\"submit\" value=\"Finalizar\"></td>\n");
      out.write("\n");
      out.write("                 <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexadmproductos.jsp'\" />\n");
      out.write("            </table>\n");
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
