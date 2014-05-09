package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.registro_producto;
import modelo.registro_cliente;

public final class indexVentas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String nombreV;
        String clienteV;
        boolean x=true;
        registro_cliente client=new registro_cliente();
        registro_producto tmp=new registro_producto();
        
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
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("         <script type=\"text/javascript\" >\n");
      out.write("\n");
      out.write("        function allnumeric(inputtxt)\n");
      out.write("   {\n");
      out.write("      var numbers = /^[0-9]+$/;\n");
      out.write("      if(inputtxt.value.match(numbers))\n");
      out.write("      {\n");
      out.write("      //alert('Your Registration number has accepted....');\n");
      out.write("      document.getElementById(\"finalizar\").disabled=false;\n");
      out.write("      return true;\n");
      out.write("      }\n");
      out.write("      else\n");
      out.write("      {\n");
      out.write("      alert('Por favor inserta sólo números');\n");
      out.write("      document.getElementById(\"finalizar\").disabled=true;\n");
      out.write("      inputtxt.value=\"\";\n");
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
      out.write("   function addRow(tableID) {\n");
      out.write("\n");
      out.write("            var table = document.getElementById(tableID);\n");
      out.write("\n");
      out.write("            var rowCount = table.rows.length;\n");
      out.write("            var row = table.insertRow(rowCount);\n");
      out.write("\n");
      out.write("            var cell1 = row.insertCell(0);\n");
      out.write("            cell1.innerHTML=document.getElementById(\"producto\").value;\n");
      out.write("            var element1 = document.createElement(\"input\");\n");
      out.write("            element1.type = \"hidden\";\n");
      out.write("            element1.name=\"nombre\"+(rowCount);\n");
      out.write("            element1.value= document.getElementById(\"producto\").value;\n");
      out.write("            cell1.appendChild(element1);\n");
      out.write("\n");
      out.write("            var cell2 = row.insertCell(1);\n");
      out.write("            cell2.innerHTML=document.getElementById(\"cantidad\").value;\n");
      out.write("            var element2 = document.createElement(\"input\");\n");
      out.write("            element2.type = \"hidden\";\n");
      out.write("            element2.name=\"cantidad\"+(rowCount);\n");
      out.write("            element2.value=document.getElementById(\"cantidad\").value;\n");
      out.write("            cell2.appendChild(element2);\n");
      out.write("\n");
      out.write("            var cell3 = row.insertCell(2);\n");
      out.write("            cell3.innerHTML=document.getElementById(\"precio\").value;\n");
      out.write("            var element3 = document.createElement(\"input\");\n");
      out.write("            element3.type = \"hidden\";\n");
      out.write("            element3.name=\"precio\"+(rowCount);\n");
      out.write("            element3.value=document.getElementById(\"precio\").value;\n");
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
      out.write("\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <h2>ADMINISTRADOR</h2>\n");
      out.write("        <h2>");
      out.print( session.getAttribute("user_name") );
      out.write("</h2>\n");
      out.write("          <form action=\"ingreso_ventas\" method=\"post\" name=\"ventasv\" onSubmit=\"return doThis(this.finalizar) \">\n");
      out.write("            <table border=\"1\" id=\"table\">\n");
      out.write("                <tr bgcolor=\"#HF2355\" style=\" color: #HH0023; font-weight:bold;\">\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><h1>Ingresar Venta</h1></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Id cliente</td>\n");
      out.write("                <td><select name=\"cliente\" id=\"id_cliente\">\n");
      out.write("   <option selected value=\"0\"> Elija un cliente </option>\n");
      out.write("   ");
for(registro_cliente temp:client.buscar_cliente())
        {
                    nombreV=temp.getNombre();
                    clienteV=temp.getRut();
                    out.println("<option>"+nombreV+"</option>");

        }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</select></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Producto</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"\" name=\"producto\" id=\"producto\"></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Id Usuario</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"");
      out.print( session.getAttribute("user_id") );
      out.write("\" name=\"id_usuario\" id=\"id_usuario\" disabled=\"disabled\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Cantidad</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"\" name=\"cantidad\" id=\"cantidad\" onkeyup=\"allnumeric(document.ventasv.monto_total);\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr align=\"left\"><td>Precio</td>\n");
      out.write("                <td><input size=\"50\" type=\"text\" value=\"\" name=\"precio\" id=\"precio\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th><input type=\"submit\" id=\"finalizar\" name=\"finalizar\" value=\"Finalizar\" ></th>\n");
      out.write("                    <th><input type=\"button\" id=\"ingresar\" value=\"Ingresar\" onclick=\"addRow('tablacompras');\"> </th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                 <input type=\"button\" value=\"Volver\" onclick=\"location.href='indexVendedor.jsp'\" />\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("                <table border=\"1\" width=\"350\" id=\"tablacompras\">\n");
      out.write("                <thead>\n");
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
