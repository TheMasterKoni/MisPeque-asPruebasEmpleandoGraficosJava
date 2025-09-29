package DB_JDBC.ConectaDB;
import java.sql.*;
/*
insertar borrar informacion en base de datos sql
 */
public class ConectaProductos {
    public static void main(String[] args) {
        try{
            //1. crear Coneccion
            Connection coneccion=DriverManager.getConnection("jdbc:mysql://localhost:3306/academias","root","");

            //2.crear objeto statement
            Statement miStatement=coneccion.createStatement();

            //3.Ejectutar SQL
            ResultSet miResulset=miStatement.executeQuery("SELECT * FROM ALUMNOS");

            //4. Leer el ResultSet
            while (miResulset.next()){
                System.out.println(miResulset.getInt("id") + " " +
                                miResulset.getString("nombre") + " " +
                                miResulset.getString("apellido")+" " +
                                miResulset.getString("Telefono")
                );

            }
        }catch (Exception e){
            System.out.println("NO se hallo la coneccion ");
        }
    }
}



