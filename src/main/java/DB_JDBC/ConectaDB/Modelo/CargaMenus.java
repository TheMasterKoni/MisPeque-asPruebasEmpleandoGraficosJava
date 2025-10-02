package DB_JDBC.ConectaDB.Modelo;
import java.sql.*;
import DB_JDBC.ConectaDB.controlador.*;
public class CargaMenus {
    public CargaMenus(){
        miConexion=new Coneccion();

    }
    public String ejecutaConsultas(){
        Productos productos=null;
        Connection accesoBaseDatos= (Connection) miConexion.getConeccion();

        try {
            Statement secciones=accesoBaseDatos.createStatement();
            Statement paises=accesoBaseDatos.createStatement();

            rs=secciones.executeQuery("SELECT DISTINCTROW nombreProducto FROM articulos");
            rs2=secciones.executeQuery("SELECT DISTINCTROW CC FROM articulos");


            while (rs.next()){
                productos=new Productos();
                productos.setSeccion(rs.getString(1));

                productos.setPaisOrigen(rs2.getString(1));


                return productos.getSeccion();
            }
            rs.close();
            rs2.close();
        }catch (Exception e){

        }
        return productos.getSeccion();
    }
    public Coneccion miConexion;
    public ResultSet rs;

    public ResultSet rs2;
}
