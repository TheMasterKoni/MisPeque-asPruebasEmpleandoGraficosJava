package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* vamos a crear un marco, que contenga un boton y un cuadro de texto de la clase JTextField,y que cuando el
usuario excriba en el cuadro de testo y acontinuacion de click en el boton, este capture el String almacenado en
el cuadro de texto y lo imprima por consola

2: hacer que el programa evalue un gmail
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

            setLayout(new BorderLayout());
            JPanel panel2=new JPanel();
            panel2.setLayout(new FlowLayout());

            resultado=new JLabel("",JLabel.CENTER);
            JLabel texto1=new JLabel("Gmail:");//Clase JLabel nos permite crear un texto que el ussario no puede modificar
            panel2.add(texto1);

            campo1=new JTextField(20);//tercer constructor
            panel2.add(campo1);//texto añadido
            add(resultado,BorderLayout.CENTER); //campo1.getText(campo1).trim(), / el metodo trim nos quita los espacios inutiles en el texto

            boton1=new JButton("clickea");
            DameTexto miE=new DameTexto();
            boton1.addActionListener(miE);//el metodo addActionListener, es para añadir a nuestro boton a la escucha de la accion
            panel2.add(boton1);

            add(panel2,BorderLayout.NORTH);
        }
        //implementa esta interfaz,porque es la encargada de gestionar el evento correspondiente ⬇️
        private class DameTexto implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                int correcto=0;//2.1:crear variable que evalue el @
                String txt=campo1.getText().trim();//2.2: crear var que optenga el texto

                for (int i=0;i<txt.length();i++){
                    if (txt.charAt(i)=='@'){//el metodo charAt() nos optine la letra de un String según su ubicación ,OJO ('')
                        correcto++;
                    }
                }

                int punto=0;
                String txtP=campo1.getText().trim();

                for(int i=0;i<txtP.length();i++){
                    if (txtP.charAt(i)=='.'){
                        punto++;
                    }
                }

                if (correcto!=1 && punto!=1){
                   resultado.setText("El correo es invalido");//esto que hace sido iniciado en PanelComponente,(cuyo valor esta vacio)
                } else if (correcto == 1 && punto==1) {//Al ejecutarse estos condicionales, aparece como por arte de magia,
                    resultado.setText("El correo es valido");//porque deja de ser una cadena vacia
                }
            }
        }
        private JButton boton1;
        private JTextField campo1;
        private JLabel resultado;
    }
