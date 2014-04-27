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
