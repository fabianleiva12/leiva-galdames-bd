/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Furious
 */
public class registro_venta {
    private int id_venta;
    private int id_cliente;
    private int id_usuario;
    private int monto_total;
    private String fecha;
    private String hora;

    private String classfor="oracle.jdbc.driver.OracleDriver";
    private String url="jdbc:oracle:thin:@localhost:1521:sysdba";
    private String usuario="pepeworks";
    private String clave="pyme";

    private Connection con=null;
    private PreparedStatement pr=null;
    private ResultSet rs=null;

    public void insertar_venta(int id_venta,int id_cliente,int id_usuario,int monto_total,String fecha,String hora)
    {
        String sql="Insert into VENTAS values(?,?,?,?,?,?)";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setInt(1, id_venta);
            pr.setInt(2, id_cliente);
            pr.setInt(3, id_usuario);
            pr.setInt(4,monto_total);
            pr.setString(5, fecha);
            pr.setString(6,hora);

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

}
