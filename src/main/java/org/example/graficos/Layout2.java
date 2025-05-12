package org.example.graficos;

import javax.swing.*;
import java.awt.*;

//1.)helaboramos una calcuradora mediante el marco.Implemntando la clase GridLayout
//2.)Utilizaremos un boton para dar el display(porque segun el curso aun no estoy listo)
//3.)y en la zona central tenga una segunda lamina la cual dividiremos para dar la forma a la calculadora (con GridLayout)
//4.)en la rejilla creada en la segunda lamina, unbicar los botones de la calculadora
public class Layout2 {
    public static void main(String[] args) {
        MarcoCalculadora miMarco=new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoCalculadora extends JFrame{
    public MarcoCalculadora(){
        setTitle("Calculadora");
        setBounds(500,300,450,300);

        PanelCalculadora miPanel=new PanelCalculadora();
        add(miPanel);
        setVisible(true);
    }
}
class PanelCalculadora extends JPanel{
    public PanelCalculadora(){//PASO1:creamos nuestra primera lamina con disposición BorderLayout():
        setLayout(new BorderLayout());
        JButton display=new JButton("0");//PASO2:creamos boton que nos servira de display
        display.setEnabled(false);//PASO4:inhabilitamos el la accion de poder hacer click en el boton con este metodo nuevo
        add(display,BorderLayout.NORTH);//PASO3:añadimos display al panel y le asignamos us ubicacion
        //NOVEDAD ⬇️
       miLamina2=new JPanel();
       miLamina2.setLayout(new GridLayout(4,4));
       add(miLamina2,BorderLayout.CENTER);

       ponerBotones("7");
        ponerBotones("6");
        ponerBotones("5");
        ponerBotones("4");
        ponerBotones("3");
        ponerBotones("2");
        ponerBotones("1");
        ponerBotones("0");

        ponerBotones("-");
        ponerBotones("+");
        ponerBotones("*");
        ponerBotones("%");

    }
    private void ponerBotones(String rotulo){
        JButton boton=new JButton(rotulo);
       this.miLamina2.add(boton);
    }
    private  JPanel miLamina2;
}