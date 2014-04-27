package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Furious
 */
public class registro_usuario {
    private String rut;
    private String contrasena;
    private String nombre;
    private String tipo;
    private int comision;

    private String classfor="oracle.jdbc.driver.OracleDriver";
    private String url="jdbc:oracle:thin:@localhost:1521:sysdba";
    private String usuario="pepeworks";
    private String clave="pyme";

    private Connection con=null;
    private PreparedStatement pr=null;
    private ResultSet rs=null;

    public void insertar_usuario(String rut,String contrasena,String nombre,String tipo,int comision)
    {
        String sql="Insert into USUARIOS values(?,?,?,?,?)";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setString(1, rut);
            pr.setString(2, contrasena);
            pr.setString(3, nombre);
            pr.setString(4,tipo);
            pr.setInt(5, comision);

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
    }

   public Vector<registro_usuario> buscar_usuario()
    {
        Vector<registro_usuario> vecPro=new Vector<registro_usuario>();
        String sql="SELECT * FROM USUARIOS";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next())
            {
            registro_usuario pro=new registro_usuario();
            pro.setNombre(rs.getString("nombre"));
            pro.setContrasena(rs.getString("contrasena"));
            pro.setRut(rs.getString("rut"));
            pro.setTipo(rs.getString("tipo"));
            pro.setComision(rs.getInt("comision"));
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

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
