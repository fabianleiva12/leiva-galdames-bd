/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Furious
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author Furious
 */
public class registro_cliente {
    private String rut;
    private String nombre;

    private String classfor="oracle.jdbc.driver.OracleDriver";
    private String url="jdbc:oracle:thin:@localhost:1521:sysdba";
    private String usuario="pepeworks";
    private String clave="pyme";

    private Connection con=null;
    private PreparedStatement pr=null;
    private ResultSet rs=null;

    public void insertar_cliente(String rut,String nombre)
    {
        String sql="Insert into CLIENTES values(?,?)";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setString(1, rut);
            pr.setString(2, nombre);

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
    }

        public Vector<registro_cliente> buscar_cliente()
    {
        Vector<registro_cliente> vecPro=new Vector<registro_cliente>();
        String sql="SELECT * FROM CLIENTES";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next())
            {
            registro_cliente pro=new registro_cliente();
            pro.setRut(rs.getString("rut"));
            pro.setNombre(rs.getString("nombre"));
            vecPro.add(pro);
            }

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }finally{
            try{
            rs.close();
            pr.close();
            con.close();
            }catch(Exception ex){}
        }

        return vecPro;

    }

    public  Vector<String> ver_clientes(String id_cliente)
    {
        Vector<String> list = new Vector<String>();

        String sql="create or replace view VIEW_VENTASCLIENTE as select PRODUCTOS.NOMBRE as NOMBRE from PRODUCTOS  PRODUCTO, DETALLE_VENTA DETALLE_VENTA, VENTA VENTA, CLIENTE CLIENTE where CLIENTES.RUT=VENTAS.ID_CLIENTE and VENTAS.ID_VENTA=DETALLE_VENTAS.ID_VENTA and DETALLE_VENTAS.ID_PRODUCTO=PRODUCTOS.ID_PRODUCTO and CLIENTES.RUT = '"+id_cliente+"' group by PRODUCTOS.NOMBRE";

        try {
            Class.forName(classfor);
            con=DriverManager.getConnection(url, usuario, clave);

            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();

            sql="select * from VIEW_VENTASCLIENTE";
            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();

            while(rs.next())
            {
                list.add(rs.getString(1));

            }

            con.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }finally{
            try{
                if(!con.isClosed()){
                con.close();
                }
       }catch(Exception ex){}}


        return list;
    }








    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }




}
