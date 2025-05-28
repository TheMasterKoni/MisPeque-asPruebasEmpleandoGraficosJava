package org.example.graficos;

import javax.swing.*;
/* vamos a usar por primera ves el radio, un componente el cual solo se puede seleccionar una sola respuesta
junto con la clase ButtonGroup que nos permite agrupar los componentes
JRadioButton, clase para crear radios
 */
public class ComponenteRadio {
    public static void main(String[] args) {
        MarcoRadio miMarco=new MarcoRadio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoRadio extends JFrame{
    public MarcoRadio(){
        setBounds(500,250,500,400);
        setTitle("Prueba con el componete Radio");

        PanelRadio miPanel=new PanelRadio();
        add(miPanel);
        setVisible(true);
    }
}
class PanelRadio extends JPanel{
    public PanelRadio(){
        ButtonGroup miGrupo=new ButtonGroup();//clase que nos permite agrupar OBJ
        ButtonGroup miGrupo2=new ButtonGroup();
        JRadioButton boton=new JRadioButton("Azul",false);//constructor que nos permite agregar un texto y un boolean
        JRadioButton boton1=new JRadioButton("verde",true);//que nos evalua si esta seleccionado o no
        JRadioButton boton2=new JRadioButton("Rojo",false);

        JRadioButton boton3=new JRadioButton("Maculino",false);
        JRadioButton boton4=new JRadioButton("Femenino",false);

        //AHORA AÑADIMOS LOS BOTONES A NUESTRA INSTANCIA BUTTONGROUD
        miGrupo.add(boton);
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo2.add(boton3);
        miGrupo2.add(boton4);

        //SEGUIDO AGREGAMOS LOS BOTONES NUESTRO PANEL
        add(boton);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    }
}