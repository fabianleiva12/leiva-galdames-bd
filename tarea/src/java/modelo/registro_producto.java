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
public class registro_producto {
    private String nombre;
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

    public void insertar_producto(String nombre,int id_producto,int stock,String description,String categoria,int precio)
    {
        String sql="Insert into productos values(?,?,?,?,?,?)";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setInt(1, id_producto);
            pr.setInt(2, stock);
            pr.setString(3, description);
            pr.setString(4, categoria);
            pr.setInt(5,precio);
            pr.setString(6, nombre);

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
    }


        public void update_producto(int id_producto,String description,String categoria,int precio)
    {
        String sql="update productos set descripcion=?,categoria=?,precio=? where id_producto=?";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setString(1,description );
            pr.setString(2, categoria);
            pr.setInt(3, precio);
            pr.setInt(4,id_producto);

            pr.executeUpdate();

        }
        catch(Exception ev)
        {}
    }

        public registro_producto buscar_prod(int id_producto)
    {
        
        String sql="SELECT * FROM PRODUCTOS WHERE ID_PRODUCTO=?";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);
            
            pr=con.prepareStatement(sql);
            pr.setInt(1,id_producto);
            rs=pr.executeQuery();
           
            if(rs.next())
            {
            registro_producto pro=new registro_producto();
            pro.setId_producto(rs.getInt("id_producto"));
            pro.setStock(rs.getInt("stock"));
            pro.setDescription(rs.getString("descripcion"));
            pro.setCategoria(rs.getString("categoria"));
            pro.setPrecio(rs.getInt("precio"));
            
            return pro;
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

        return null;
    }

        public registro_producto buscar_prod1(String nombre)
    {

        String sql="SELECT * FROM PRODUCTOS WHERE nombre=?";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setString(1,nombre);
            rs=pr.executeQuery();

            if(rs.next())
            {
            registro_producto pro=new registro_producto();
            pro.setId_producto(rs.getInt("id_producto"));
            pro.setStock(rs.getInt("stock"));
            pro.setDescription(rs.getString("descripcion"));
            pro.setCategoria(rs.getString("categoria"));
            pro.setPrecio(rs.getInt("precio"));

            return pro;
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

        return null;
    }

        public registro_producto buscar_precio(String producto)
    {

        String sql="SELECT * FROM PRODUCTOS WHERE NOMBRE=?";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            pr.setString(1,producto);
            rs=pr.executeQuery();

            if(rs.next())
            {
            registro_producto pro=new registro_producto();
            pro.setId_producto(rs.getInt("id_producto"));
            pro.setStock(rs.getInt("stock"));
            pro.setDescription(rs.getString("descripcion"));
            pro.setCategoria(rs.getString("categoria"));
            pro.setPrecio(rs.getInt("precio"));

            return pro;
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

        return null;
    }




       public Vector<registro_producto> buscar_producto()
    {
        Vector<registro_producto> vecPro=new Vector<registro_producto>();
        String sql="SELECT * FROM PRODUCTOS";
        try
        {
            Class.forName(classfor);
            con=DriverManager.getConnection(url,usuario,clave);

            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next())
            {
            registro_producto pro=new registro_producto();
            pro.setId_producto(rs.getInt("id_producto"));
            pro.setStock(rs.getInt("stock"));
            pro.setDescription(rs.getString("descripcion"));
            pro.setCategoria(rs.getString("categoria"));
            pro.setPrecio(rs.getInt("precio"));
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
