package org.example.graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {
    public static void main(String[] args) {
        MarcoConEvento  miMarco=new MarcoConEvento ();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoConEvento extends JFrame{
    public MarcoConEvento(){
        setTitle("Botones y eventos");
        setSize(400,400);
        PanelBotones  miPnael=new PanelBotones ();
        add(miPnael);

        miPnael.setBackground(Color.BLACK);//cambia el color del panel  s
    }
}
class PanelBotones extends JPanel implements ActionListener {
    JButton botonCyan=new JButton("Cyan");
    JButton botonAzul=new JButton("Azúl");
    JButton botonRojo=new JButton("Rojo");
    public PanelBotones(){
        add(botonCyan);
        add(botonAzul);
        add(botonRojo);

        //obj evento obj fuente    obj listener
        botonAzul.addActionListener(this);//obj fuentes
        botonCyan.addActionListener(this);
        botonRojo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado=e.getSource();

        if (botonPulsado==botonAzul){
        setBackground(Color.BLUE);
         } else if (botonPulsado == botonCyan){
            setBackground(Color.cyan);
               }
             else {
            setBackground(Color.RED);
                 }

        }
    }
