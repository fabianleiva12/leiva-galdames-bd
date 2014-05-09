package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.registro_compra;
import modelo.registro_producto;


/**
 *
 * @author Furious
 */
public class ingreso_compra extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();



        try {
            int monto_total=0;
            registro_compra compra=new registro_compra();
            String cantidad_compras=request.getParameter("cantidad_compras");
            for (int i=1;i<=Integer.parseInt(cantidad_compras);i++){
                    String precio=request.getParameter("precio"+i).toUpperCase();
                    monto_total+=Integer.parseInt(precio);
            }
            int x=compra.insertar_compra(monto_total);

           
          
           for (int i=1;i<=Integer.parseInt(cantidad_compras);i++){
                    registro_compra compra1=new registro_compra();
                    String nombre_producto=request.getParameter("nombre"+(i)).toUpperCase();
                    
                    String cantidad=request.getParameter("cantidad"+(i)).toUpperCase();
                    
                    String precio=request.getParameter("precio"+(i)).toUpperCase();
                    
                    registro_producto nuevo=new registro_producto();
                    registro_producto tmp1=nuevo.buscar_prod1(nombre_producto);
                   
                    compra1.insertar_compra_detalle(tmp1.getId_producto(),x, Integer.parseInt(cantidad), Integer.parseInt(precio));

            }
            //String hora;
            //String fecha;
            //Date date = new Date();
            //DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            //hora=hourFormat.format(date);
            //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            //fecha=dateFormat.format(date);
            
            response.sendRedirect("indexcompra_inicial.jsp");
            
            //response.sendRedirect("indexcompra.jsp?nombre_producto="+nombre_producto+"&cantidad="+cantidad+"&precio="+precio+"&hora="+hora+"&fecha="+fecha);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}