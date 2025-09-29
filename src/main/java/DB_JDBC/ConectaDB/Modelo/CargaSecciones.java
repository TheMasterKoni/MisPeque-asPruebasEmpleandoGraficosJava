package DB_JDBC.ConectaDB.Modelo;
import java.sql.*;
import DB_JDBC.ConectaDB.controlador.*;
public class CargaSecciones {
    public CargaSecciones(){
        miConexion=new Coneccion();

    }
    public String ejecutaConsultas(){
        Productos productos=null;
        Connection accesoBaseDatos= (Connection) miConexion.getConeccion();

        try {
            Statement secciones=accesoBaseDatos.createStatement();
            rs=secciones.executeQuery("SELECT DISTINCTROW nombreProducto FROM articulos");
            while (rs.next()){
                productos=new Productos();
                productos.setSeccion(rs.getString(1));

                return productos.getSeccion();
            }
            rs.close();
        }catch (Exception e){

        }
        return productos.getSeccion();
    }
    Coneccion miConexion;
    private ResultSet rs;
}
