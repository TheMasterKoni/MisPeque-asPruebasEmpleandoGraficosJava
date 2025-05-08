package org.example.graficos;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MultiplesOyentes {
    public static void main(String[] args) {
        MarcoOyente miMarco = new MarcoOyente();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoOyente extends JFrame {//PASO 1:Crear Marco
    public MarcoOyente() {
        setBounds(600, 350, 600, 300);
        setTitle("Marco Oyente");

        PanelOyente lamina = new PanelOyente();
        add(lamina);
        setVisible(true);
    }
}

class PanelOyente extends JPanel {//PASO2:crear Botones
    public PanelOyente() {
        JButton botonNuevo = new JButton("Nuevo");
        botonCerrarTodo = new JButton("Cerrar Todo");

        add(botonNuevo);
        add(botonCerrarTodo);

        botonNuevo.addActionListener(new OyenteNuevo());
        botonCerrarTodo.addActionListener(new CerrarTodo());//PASO4:asimilar el boton cerrarTodo con la clase CerrarTodo
    }

    private class OyenteNuevo implements ActionListener {//PASO 3:crear clase interna oyente
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente nuevaVentana = new MarcoEmergente();
            MarcoEmergente.ventanasAbiertas.add(nuevaVentana);//PASO10:asimilar la clase MarcoEmergente con el boton nuevaVentana
            nuevaVentana.setVisible(true);
        }
    }

    private static class CerrarTodo implements ActionListener {//PASO5: crear clase cerrar todo
        public void actionPerformed(ActionEvent e) {
            for (MarcoEmergente ventana : MarcoEmergente.ventanasAbiertas) {
                ventana.dispose();//metodo nuevo dispose que se encarge de cerrar lo indicado
            }
            MarcoEmergente.ventanasAbiertas.clear(); //PASO9: Limpiar la lista
        }
    }

    static class MarcoEmergente extends JFrame {//PASO6:crear la clase donde se crearan los marcos emergentes

        public static ArrayList<MarcoEmergente> ventanasAbiertas = new ArrayList<>();//PASO7:crear matris de las ventanas emergentes
        private static int contador = 0;//PASO8:crear el contador para que por texto "vetana (x)"

        public MarcoEmergente() {
            contador++;
            setTitle("Ventana " + contador);
            setBounds(40 * contador, 40 * contador, 300, 150);
        }
    }

    private JButton botonCerrarTodo;
}
