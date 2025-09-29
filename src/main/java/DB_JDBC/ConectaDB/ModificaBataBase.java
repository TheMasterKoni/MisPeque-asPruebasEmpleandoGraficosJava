package DB_JDBC.ConectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBataBase {
    public static void main(String[] args) {
        try{
            //1. crear Coneccion
            Connection coneccion= DriverManager.getConnection("jdbc:mysql://localhost:3306/academias","root","");

            //2.crear objeto statement
            Statement miStatement=coneccion.createStatement();

           String intrucionSql="INSERT INTO PROFESORES (id,nombre,apellido,telefono) VALUES ('AR77','PANTALON','25');";//insertar

            String intrucionSqlUpdata="UPDATE PRODUCTOS SET PRECIO=PRESIO*2 WHERE CODIGOARTICULO='AR77'";//modificar

            String intrucionSqlDelete="DELETE FROM ARTICULOS WHERE PRECIO=PRESIO*2 WHERE CODIGOARTICULO='AR77'";//eliminar

           miStatement.executeUpdate(intrucionSql);
            System.out.println("Datos insertados corectamente");
        }catch (Exception e){
            System.out.println("NO se hallo la coneccion ");
        }
    }
}
