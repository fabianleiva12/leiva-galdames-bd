package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Furious
 */
public class registro_compra {
    private int id_compra;
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

    public void insertar_compra(int id_compra,int monto_total,String fecha,String hora)
    {
        String sql="Insert into COMPRAS values(?,?,?,?)";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setInt(1, id_compra);
            pr.setInt(2, monto_total);
            pr.setString(3, fecha);
            pr.setString(4,hora);

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

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }


}
