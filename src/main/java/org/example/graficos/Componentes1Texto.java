package org.example.graficos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* vamos a crear un marco, que contenga un boton y un cuadro de texto de la clase JTextField,y que cuando el
usuario excriba en el cuadro de testo y acontinuacion de click en el boton, este capture el String almacenado en
el cuadro de texto y lo imprima por consola
 */
public class Componentes1Texto {
    public static void main(String[] args) {
            MarcoComponete miMarco=new MarcoComponete();
            miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    class MarcoComponete extends JFrame{
    public MarcoComponete(){
        setBounds(600,300,600,350);
        PanelComponenteTexto miPanel=new PanelComponenteTexto();
        add(miPanel);


        setVisible(true);
        }
    }
    class PanelComponenteTexto extends JPanel{
    public PanelComponenteTexto(){//NOVEDAD ⬇️
            JLabel texto1=new JLabel("Gmail:");//Clase JLabel nos permite crear un texto que el ussario no puede modificar
            add(texto1);

            campo1=new JTextField(20);//tercer constructor
            add(campo1);//texto añadido
            //campo1.getText(campo1).trim(), / el metodo trim nos quita los espacios inutiles en el texto

            boton1=new JButton("clickea");
            DameTexto miE=new DameTexto();
            boton1.addActionListener(miE);//el metodo addActionListener, es para añadir a nuestro boton a la escucha de la accion
            add(boton1);
        }
        //implementa esta interfaz,porque es la encargada de gestionar el evento correspondiente ⬇️
        private class DameTexto implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(campo1.getText().trim());
            }
        }
        private JButton boton1;
        JTextField campo1;
    }
//codigo antes de hacerlo una verificación de Gmail