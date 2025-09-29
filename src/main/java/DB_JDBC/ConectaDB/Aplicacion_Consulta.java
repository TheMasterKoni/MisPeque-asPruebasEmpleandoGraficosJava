package DB_JDBC.ConectaDB;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Aplicacion_Consulta {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JFrame mimarco=new Marco_Aplicacion();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class Marco_Aplicacion extends JFrame{

    public Marco_Aplicacion(){

        setTitle ("Consulta BBDD");

        setBounds(500,300,400,400);

        setLayout(new BorderLayout());

        JPanel menus=new JPanel();

        menus.setLayout(new FlowLayout());

        secciones=new JComboBox();

        secciones.setEditable(false);

        secciones.addItem("Todos");

        paises=new JComboBox();

        paises.setEditable(false);

        paises.addItem("Todos");

        resultado= new JTextArea(4,50);

        resultado.setEditable(false);

        add(resultado);

        menus.add(secciones);

        menus.add(paises);

        add(menus, BorderLayout.NORTH);

        add(resultado, BorderLayout.CENTER);

        //BOTON CONSULTA

        JButton botonConsulta=new JButton("Consulta");
        botonConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              ejecutaConsulta();
            }
        });


        add(botonConsulta, BorderLayout.SOUTH);

        //Conexion dtbase
        try{
            conecion= DriverManager.getConnection("jdbc:mysql://localhost:3306/productos","root","");

            Statement statement=conecion.createStatement();

            String consulta="SELECT DISTINCTROW nombreProducto FROM articulos";

            ResultSet resultSet=statement.executeQuery(consulta);

            while (resultSet.next()){

                secciones.addItem(resultSet.getString("nombreProducto"));
            }
            resultSet.close();

            //SEGUNDA CARGA JCOMBOM BOX
            consulta="SELECT DISTINCTROW comprador FROM articulos";

            resultSet=statement.executeQuery(consulta);

            while (resultSet.next()){

                paises.addItem(resultSet.getString("comprador"));
            }
            resultSet.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private void ejecutaConsulta(){
        ResultSet rs=null;
        try{
            resultado.setText("");
            String seccion= (String) secciones.getSelectedItem();
            String pais=(String)paises.getSelectedItem();

            if (!seccion.equals("Todos") && pais.equals("Todos")){
            enviaConsultaSeccion=conecion.prepareStatement(consultaSelccion);
            enviaConsultaSeccion.setString(1,seccion);
            rs=enviaConsultaSeccion.executeQuery();
            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {
                enviaConsultaPais=conecion.prepareStatement(consultaPais);
                enviaConsultaSeccion.setString(1,pais);
                rs=enviaConsultaPais.executeQuery();
            } else if (!seccion.equals("Todos") && !pais.equals("Todos")){
                enviaConsultaTodo=conecion.prepareStatement(consultaTodos);
                enviaConsultaSeccion.setString(1,seccion);
                enviaConsultaTodo.setString(2,pais);
                rs=enviaConsultaTodo.executeQuery();
            }

            while (rs.next()){
                resultado.append(rs.getString(1));
                resultado.append(", ");
                resultado.append(rs.getString(2));
                resultado.append(", ");
                resultado.append(rs.getString(3));
                resultado.append(", ");
                resultado.append(rs.getString(4));
                resultado.append("\n");
            }

        }catch (Exception e){
            System.out.println(e.getMessage()+" error 1");
        }

    }

    private JComboBox secciones;

    private JComboBox paises;

    private JTextArea resultado;

    private PreparedStatement enviaConsultaSeccion , enviaConsultaPais, enviaConsultaTodo;
    private final String consultaSelccion="SELECT nombreProducto, comprador, telefono, CC FROM Productos WHERE articulos=?";
    private final String consultaPais="SELECT nombreProducto, comprador, telefono, CC FROM Productos WHERE comprador=?";

    private final String consultaTodos="SELECT nombreProducto, comprador, telefono, CC FROM Productos WHERE articulos=? AND " +
            "comprador=?";
    private  Connection conecion;

}
