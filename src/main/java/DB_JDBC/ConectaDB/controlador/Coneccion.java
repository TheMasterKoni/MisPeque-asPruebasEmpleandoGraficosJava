package DB_JDBC.ConectaDB.controlador;
import java.sql.*;

public class Coneccion {
    Connection conexion=null;
    public Coneccion() {

    }

    public Coneccion getConeccion() {
        try {
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Pruebas", // 👈 usa mysql porque tu jar es MySQL
                    "root",
                    ""
            );
            System.out.println("✅ Conexión exitosa");
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (Coneccion) conexion;
    }
}
