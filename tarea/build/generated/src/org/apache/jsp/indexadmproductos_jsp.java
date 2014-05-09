package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.registro_producto;

public final class indexadmproductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilofabian.css\" media=\"screen\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <input type=\"button\" value=\"Buscar Producto\" onclick=\"location.href='indexBuscar.jsp'\" />\n");
      out.write("        <input type=\"button\" value=\"Editar Producto\" onclick=\"location.href='indexBuscarU.jsp'\" />\n");
      out.write("        <input type=\"button\" value=\"Agregar Producto\" onclick=\"location.href='indexProductos.jsp'\" />\n");
      out.write("        <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexadm.jsp'\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID PRODUCTO</td>\n");
      out.write("                    <td>STOCK</td>\n");
      out.write("                    <td>DESCRIPCION</td>\n");
      out.write("                    <td>CATEGORIA</td>\n");
      out.write("                    <td>PRECIO</td>\n");
      out.write("                </tr>\n");
      out.write("        ");
registro_producto pro=new registro_producto();
                  for (registro_producto temp1: pro.buscar_producto()){
          
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("          \n");
      out.write("               <tr >\n");
      out.write("                   <td align=\"left\">");
      out.print(temp1.getId_producto() );
      out.write("</td>\n");
      out.write("                   <td align=\"left\">");
      out.print(temp1.getStock() );
      out.write("</td>\n");
      out.write("                   <td align=\"left\">");
      out.print(temp1.getDescription() );
      out.write("</td>\n");
      out.write("                   <td align=\"left\">");
      out.print(temp1.getCategoria() );
      out.write("</td>\n");
      out.write("                   <td align=\"left\">");
      out.print(temp1.getPrecio() );
      out.write("</td>\n");
      out.write("               </tr>\n");
      out.write("           \n");
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            </table>\n");
      out.write("           </table>\n");
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
