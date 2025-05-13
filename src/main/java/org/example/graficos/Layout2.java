package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
       // pack();//metodo desconocido nos cirve para decirle al contenedor, que tendra el mismo tamaña que los componentes
        setVisible(true);
    }
}
class PanelCalculadora extends JPanel{
    public PanelCalculadora(){//PASO1:creamos nuestra primera lamina con disposición BorderLayout():
        setLayout(new BorderLayout());
        display=new JButton("0");//PASO2:creamos boton que nos servira de display
        display.setEnabled(false);//PASO4:inhabilitamos el la accion de poder hacer click en el boton con este metodo nuevo
        add(display,BorderLayout.NORTH);//PASO3:añadimos display al panel y le asignamos us ubicacion
        //NOVEDAD ⬇️
       miLamina2=new JPanel();
       miLamina2.setLayout(new GridLayout(4,4));
       add(miLamina2,BorderLayout.CENTER);

       ActionListener insertar=new InsertarNumero();

       ponerBotones("7",insertar);
        ponerBotones("6",insertar);
        ponerBotones("5",insertar);
        ponerBotones("4",insertar);
        ponerBotones("3",insertar);
        ponerBotones("2",insertar);
        ponerBotones("1",insertar);
        ponerBotones("0",insertar);
        ponerBotones(".",insertar);

      /*  ponerBotones("-");
        ponerBotones("+");
        ponerBotones("*");
        ponerBotones("%");
        ponerBotones("Cl");*/

    }
    private void ponerBotones(String rotulo,ActionListener oyente){
        JButton boton=new JButton(rotulo);
        boton.addActionListener(oyente);//para poner los botones a la escucha
       this.miLamina2.add(boton);
    }
    private class InsertarNumero implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada =e.getActionCommand();//optiene el valor de la acción

            if (principio){
                display.setText("");//las comilas puestas de este modo son para borrar la pantalla
                principio=false;
            }
            display.setText(display.getText() + entrada);//getText nos permite optener el texto anterior y setText modificarlo
        }
    }
    private  JPanel miLamina2;
    private JButton display;
    private boolean principio=true;
}