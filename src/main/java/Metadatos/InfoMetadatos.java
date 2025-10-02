package Metadatos;
import java.sql.*;
public class InfoMetadatos {
    public static void main(String[] args) {
        mostraInfoTablas();
        mostrarInfoBBDD();
    }


    static void mostrarInfoBBDD() {
        Connection miconexion=null;
        try {
            miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/academias", "root", "");

            //OBTECCION DE METADATOS

            DatabaseMetaData datosBBDD = miconexion.getMetaData();

            //MOSTRA INFORMACION

            System.out.println("GESTOR DE BASE DE DATOS " + datosBBDD.getDatabaseProductName());

            System.out.println("VERSION DEL GESTOR " + datosBBDD.getDatabaseProductVersion());

            System.out.println("NOMBRE DE DRIVER " + datosBBDD.getDriverName());

            System.out.println("VERSION DEL DRIVER " + datosBBDD.getDriverVersion());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                miconexion.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void mostraInfoTablas() {
        Connection miconexion = null;
        ResultSet rs=null;
        try {
            miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/academias", "root", "");

            //OBTECCION DE METADATOS

            DatabaseMetaData datosBBDD = miconexion.getMetaData();

            //LISTA DE TABLAS
            System.out.println("Lista de tablas ");

           // rs=datosBBDD.getTables(null,null,"p%",null);p%: buscar todas tablas inician con p

            rs=datosBBDD.getTables(null,null,null,null);


            while (rs.next()){
                System.out.println(rs.getString("TABLE_NAME"));
            }

            System.out.println(" ");
            //LISTA COLUMNAS DE PRODUCTOS

            System.out.println("CAMPOS DE PRODUCTOS");

            rs=datosBBDD.getColumns(null,null,"productos",null);

            while (rs.next()){
                System.out.println(rs.getString("COLUMNA_NAME"));

            }
        } catch (Exception e) {

        } finally {
            try {
                miconexion.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}