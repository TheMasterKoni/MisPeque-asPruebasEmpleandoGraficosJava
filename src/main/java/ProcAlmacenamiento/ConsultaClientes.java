package ProcAlmacenamiento;
import java.sql.*;
public class ConsultaClientes {
    public static void main(String[] args) {
        try{
            Connection coneccion= DriverManager.getConnection("jdbc:mysql://localhost:3306/academias","root","");
            CallableStatement misentencia=coneccion.prepareCall("{call muestra clientes");

            ResultSet rs=misentencia.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));


            }
            rs.close();
        }catch (Exception e){

        }
    }
}
