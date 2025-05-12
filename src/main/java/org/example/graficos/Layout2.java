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
        JPanel miLamina2=new JPanel();
        miLamina2.setLayout(new GridLayout(4,4));//PASO5:creamos instancia de JPanel, y le asignamos el GridLayout
        JButton boton1=new JButton("1");
        miLamina2.add(boton1);//PASO6;creamos los botones y lo añadimos a la lamina 2
        JButton boton2=new JButton("2");
        miLamina2.add(boton2);
        JButton boton3=new JButton("3");
        miLamina2.add(boton3);
        JButton boton4=new JButton("4");
        miLamina2.add(boton4);
        JButton boton5=new JButton("5");
        miLamina2.add(boton5);
        add(miLamina2,BorderLayout.CENTER);//PASO7:añadimos la nueva lamina al marco*/
    }
    private void ponerBotones(String rotulo){
        JButton boton=new JButton(rotulo);
       this.MiLamina2.add(boton);
    }
    private  JPanel MiLamina2;
}