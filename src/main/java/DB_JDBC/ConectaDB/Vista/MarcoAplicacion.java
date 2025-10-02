package DB_JDBC.ConectaDB.Vista;

import DB_JDBC.ConectaDB.controlador.ControladorBotonEjecuta;
import DB_JDBC.ConectaDB.controlador.ControladorCargaSecciones;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class MarcoAplicacion extends JFrame {

    public MarcoAplicacion() {

        setTitle("Consulta BBDD");

        setBounds(500, 300, 400, 400);

        setLayout(new BorderLayout());

        JPanel menus = new JPanel();

        menus.setLayout(new FlowLayout());

        secciones = new JComboBox();

        secciones.setEditable(false);

        secciones.addItem("Todos");

        paises = new JComboBox();

        paises.setEditable(false);

        paises.addItem("Todos");

        resultado = new JTextArea(4, 50);

        resultado.setEditable(false);

        add(resultado);

        menus.add(secciones);

        menus.add(paises);

        add(menus, BorderLayout.NORTH);

        add(resultado, BorderLayout.CENTER);

        //BOTON CONSULTA

        JButton botonConsulta = new JButton("Consulta");

        add(botonConsulta,BorderLayout.SOUTH);

      //  botonConsulta.addActionListener(new ControladorBotonEjecuta(this));

       addWindowListener(new ControladorCargaSecciones(this));


    }
    public JComboBox secciones;

    private JComboBox paises;

    private JTextArea resultado;
}
