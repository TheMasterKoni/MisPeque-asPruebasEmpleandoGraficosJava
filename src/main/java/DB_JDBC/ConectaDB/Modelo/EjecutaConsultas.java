package DB_JDBC.ConectaDB.Modelo;

import DB_JDBC.ConectaDB.controlador.Coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EjecutaConsultas {
    public EjecutaConsultas(){
        miConexion=new Coneccion();

    }
    public ResultSet filtraBBDD(String seccion,String pais){
      //  pruebas="";

        Connection conecta= (Connection) miConexion.getConeccion();
        rs=null;

        try {


            if (!seccion.equals("Todos") && pais.equals("Todos")) {
                // pruebas="HAS ESCOGIDO SECCION";
                enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
                enviaConsultaSeccion.setString(1,seccion);

                rs=enviaConsultaSeccion.executeQuery();

            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {
                // pruebas="HAS ESCOGIDO PAIS";

                enviaConsultaPais=conecta.prepareStatement(consultaPais);
                enviaConsultaPais.setString(1,pais);

                rs=enviaConsultaPais.executeQuery();
            } else {

                enviaConsultaTodos=conecta.prepareStatement(consultaTodos);
                enviaConsultaTodos.setString(1,seccion);
                enviaConsultaTodos.setString(2,pais);

                rs=enviaConsultaTodos.executeQuery();
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return rs;
    }

    private String pruebas;
    private Coneccion miConexion;
    private ResultSet rs;
    private PreparedStatement enviaConsultaSeccion;
    private final String consultaSeccion="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS=?";
    private PreparedStatement enviaConsultaPais;
    private final String consultaPais="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE PAISORIGEN=?";
    private PreparedStatement enviaConsultaTodos;
    private final String consultaTodos="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE SECCION=? ADN PAISORIGEN=?";

}
