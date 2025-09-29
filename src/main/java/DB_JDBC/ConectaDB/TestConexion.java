package DB_JDBC.ConectaDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConexion {
    public static void main(String[] args) {
        try {
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Pruebas", // 👈 usa mysql porque tu jar es MySQL
                    "root",
                    ""
            );
            System.out.println("✅ Conexión exitosa");
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
