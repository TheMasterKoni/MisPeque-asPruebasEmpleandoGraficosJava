package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebasEventos {
    public static void main(String[] args) {
        MarcoP miMarco=new MarcoP();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoP extends JFrame{
    public MarcoP(){
        setVisible(true);
        setBounds(300,450,600,500);

        lamina milamina = new lamina();
        add(milamina);
        milamina.setBackground(Color.BLACK);
    }
}
class lamina extends JPanel implements ActionListener {
    JButton botonAzul=new JButton("Azul");
    JButton botonMeque = new JButton("blanco");

    public lamina(){
        add(botonMeque);
        add(botonAzul);

        botonMeque.addActionListener(this);
        botonAzul.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado=e.getSource();

        if(botonPulsado==botonMeque){
            setBackground(Color.WHITE);
        }else {
            setBackground(Color.BLUE);
        }

    }
}