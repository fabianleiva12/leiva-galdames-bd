package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Furious
 */
public class registro_compra {
    private int monto_total;
    private int id_producto;
    private int id_compra;
    private int cantidad;
    private int precio;
    private String hora;
    private String fecha;
   

    private String classfor="oracle.jdbc.driver.OracleDriver";
    private String url="jdbc:oracle:thin:@localhost:1521:sysdba";
    private String usuario="pepeworks";
    private String clave="pyme";

    private Connection con=null;
    private PreparedStatement pr=null;
    private ResultSet rs=null;
    int val;

    public void insertar_compra_detalle(int id_producto,int id_compra,int cantidad,int precio)
    {
        String sql="Insert into DETALLE_COMPRAS values(id_compra_detalle.nextval,?,?,?,?)";
        try
        {  
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);
            pr=con.prepareStatement(sql);
            pr.setInt(1, id_compra);
            pr.setInt(2, id_producto);
            pr.setInt(3, cantidad);
            pr.setInt(4, precio);
         

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
    }



    public int insertar_compra(int monto_total)
    {
        String sql="BEGIN Insert into COMPRAS (MONTO_TOTAL,FECHA,HORA) values(?,?,?) returning ID_COMPRA INTO ?; END;";
        try
        {   String hora;
            String fecha;
            Date date = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            hora=hourFormat.format(date);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fecha=dateFormat.format(date);
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1,monto_total );
            cs.setString(2, fecha);
            cs.setString(3, hora);
            cs.registerOutParameter(4, java.sql.Types.NUMERIC);
            cs.executeQuery();
            val = cs.getInt(4);
            con.close();
            return val;
        }
        catch(Exception ev)
        {}
        return val;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   


    

}
