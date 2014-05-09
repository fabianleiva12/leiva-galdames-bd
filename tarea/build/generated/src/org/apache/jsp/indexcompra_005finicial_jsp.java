package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.registro_compra;

public final class indexcompra_005finicial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>       \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function addRow(tableID) {\n");
      out.write("\n");
      out.write("            var table = document.getElementById(tableID);\n");
      out.write("\n");
      out.write("            var rowCount = table.rows.length;\n");
      out.write("            var row = table.insertRow(rowCount);\n");
      out.write("\n");
      out.write("            var cell1 = row.insertCell(0);\n");
      out.write("            cell1.innerHTML=document.getElementById(\"nombrep\").value;\n");
      out.write("            var element1 = document.createElement(\"input\");\n");
      out.write("            element1.type = \"hidden\";\n");
      out.write("            element1.name=\"nombre\"+(rowCount);\n");
      out.write("            element1.value= document.getElementById(\"nombrep\").value;\n");
      out.write("            cell1.appendChild(element1);\n");
      out.write("           \n");
      out.write("            var cell2 = row.insertCell(1);\n");
      out.write("            cell2.innerHTML=document.getElementById(\"cantidadp\").value;\n");
      out.write("            var element2 = document.createElement(\"input\");\n");
      out.write("            element2.type = \"hidden\";\n");
      out.write("            element2.name=\"cantidad\"+(rowCount);\n");
      out.write("            element2.value=document.getElementById(\"cantidadp\").value;\n");
      out.write("            cell2.appendChild(element2);\n");
      out.write("            \n");
      out.write("            var cell3 = row.insertCell(2);\n");
      out.write("            cell3.innerHTML=document.getElementById(\"preciop\").value;\n");
      out.write("            var element3 = document.createElement(\"input\");\n");
      out.write("            element3.type = \"hidden\";\n");
      out.write("            element3.name=\"precio\"+(rowCount);\n");
      out.write("            element3.value=document.getElementById(\"preciop\").value;\n");
      out.write("            cell3.appendChild(element3);\n");
      out.write("\n");
      out.write("            document.getElementById(\"nombrep\").value=\"\"\n");
      out.write("            document.getElementById(\"cantidadp\").value=\"\"\n");
      out.write("            document.getElementById(\"preciop\").value=\"\"\n");
      out.write("        }\n");
      out.write("        function doThis()\n");
      out.write("{\n");
      out.write("          //alert(\"testing\");\n");
      out.write("          var table = document.getElementById('tablacompras');\n");
      out.write("          var rowCount = table.rows.length;\n");
      out.write("          document.getElementById(\"cantidad_compras\").value=rowCount-1;\n");
      out.write("          alert(\"Compra Exitosa\");\n");
      out.write("         \n");
      out.write("}\n");
      out.write("       \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"compra\" action=\"ingreso_compra\" id=\"form_compra\" onSubmit=\"return doThis(this.finalizar)\">\n");
      out.write("\n");
      out.write("        <table border=\"0\" id=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Ingresar nueva Compra</th>                  \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nombre Producto</td>\n");
      out.write("                    <td><input size=\"50\" type=\"text\" value=\"\" id=\"nombrep\" name=\"nombre_producto\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Cantidad</td>\n");
      out.write("                    <td><input size=\"50\" type=\"text\" value=\"\" id=\"cantidadp\" name=\"cantidad\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Precio</td>\n");
      out.write("                    <td><input size=\"50\" type=\"text\" value=\"\" id=\"preciop\" name=\"precio\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input size=\"50\" type=\"hidden\" value=\"\" id=\"cantidad_compras\" name=\"cantidad_compras\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th><input type=\"submit\" id=\"finalizar\" name=\"finalizar\" value=\"Finalizar\" ></th>\n");
      out.write("                    <th><input type=\"button\" id=\"ingresar\" value=\"Ingresar\" onclick=\"addRow('tablacompras');\"> </th>\n");
      out.write("                </tr>\n");
      out.write("                <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexadm.jsp'\" />\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            <table border=\"1\" width=\"350\" id=\"tablacompras\">\n");
      out.write("                <thead>        \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>Precio</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("    </form>\n");
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
