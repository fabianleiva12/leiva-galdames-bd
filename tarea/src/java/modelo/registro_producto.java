package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Furious
 */
public class registro_producto {

    private int id_producto;
    private int stock;
    private String description;
    private String categoria;
    private int precio;

    private String classfor="oracle.jdbc.driver.OracleDriver";
    private String url="jdbc:oracle:thin:@localhost:1521:sysdba";
    private String usuario="pepeworks";
    private String clave="pyme";

    private Connection con=null;
    private PreparedStatement pr=null;
    private ResultSet rs=null;

    public void insertar_producto(int id_producto,int stock,String description,String categoria,int precio)
    {
        String sql="Insert into productos values(?,?,?,?,?)";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setInt(1, id_producto);
            pr.setInt(2, stock);
            pr.setString(3, description);
            pr.setString(4,categoria);
            pr.setInt(5, precio);

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
