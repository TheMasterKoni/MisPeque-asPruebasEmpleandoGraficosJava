package DB_JDBC.ConectaDB;
import java.sql.*;
public class ConsultaPreparada {
    public static void main(String[] args) {

        try{
            //1 crear interfaz
            Connection conecion=DriverManager.getConnection("jdbc:mysql://localhost:3306/academias","root","");

            //2 PREPARAR CONSULTA
            PreparedStatement miSentencia=conecion.prepareStatement("SELECT NOMBREARTICULO,SECCION,PAISDEORIGEN FROM PRODUCTOS" +
                    " WHERE SECCION=? AND PAISORIGEN=?");

            //3 establecer parametros de consulta
            miSentencia.setString(1,"deportes");
            miSentencia.setString(2,"USA");

            //4 EJECUTAR Y RECORRER CONSULTA
            ResultSet rS=miSentencia.executeQuery();
            while (rS.next()){
                System.out.println(rS.getString(1)+" "+rS.getString(2)+" "+rS.getString(3));
            }
            rS.close();

            //REUTILIZACION DE CONSULTA

            System.out.println("EJECUCION SEGUNDA CONSULTA");
            System.out.println(" ");
        }catch (Exception e){
            System.out.println(e.getMessage()+" aver");
        }

    }
}
