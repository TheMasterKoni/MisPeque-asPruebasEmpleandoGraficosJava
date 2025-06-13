package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
=======
//version 1
//NOTA: ESTA ES LA SEGUNDA VERSION MAS SIMPLIFICADA DEL PROJECTO, LA VERSION INICIAL ESTA EN OTRA RAMA LLAMADA
//"versiones_antes_de_la_practiva"
>>>>>>> main

/*vamos a crear un MArcco con un texto, en a zona superior, y que contenga a los botones del radio justo debajo de este
,para que cuando se le di click a uno de estos botones el componente de la zona superior cambie sus propiedades
 */
public class UsoPracticoRadio {
    public static void main(String[] args) {
<<<<<<< HEAD
        MarcoRadio miMarco=new MarcoRadio();
=======
        MarcoRadio2 miMarco=new MarcoRadio2();
>>>>>>> main
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoRadio2 extends JFrame{
    public MarcoRadio2(){
        setTitle("Uso Radio");
        setBounds(300,250,500,400);
        PanelRadio2 miPanel=new PanelRadio2();
        add(miPanel);
        setVisible(true);
    }
}
class PanelRadio2 extends JPanel {
    public PanelRadio2() {
        setLayout(new BorderLayout());
        txt = new JLabel("En un lugar de la mancha de cuyo nombre no quiero acordar");
<<<<<<< HEAD
        add(txt, BorderLayout.CENTER);

        ButtonGroup miGrupo = new ButtonGroup();
        boton = new JRadioButton("pequeños", false);
        boton1 = new JRadioButton("Mediano", true);
        boton2 = new JRadioButton("grande", false);
        boton3 = new JRadioButton("Muy Grande", false);

        JPanel panelRadio2 = new JPanel();
        OyenteRadio miOyente = new OyenteRadio();
        boton.addActionListener(miOyente);
        boton1.addActionListener(miOyente);
        boton2.addActionListener(miOyente);
        boton3.addActionListener(miOyente);

        miGrupo.add(boton);
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);

        panelRadio2.add(boton);
        panelRadio2.add(boton1);
        panelRadio2.add(boton2);
        panelRadio2.add(boton3);
        add(panelRadio2, BorderLayout.SOUTH);


    }

    private class OyenteRadio implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton) {
                txt.setFont(new Font("serif", Font.PLAIN, 10));

            } else if (e.getSource() == boton1) {
                txt.setFont(new Font("serif", Font.PLAIN, 12));

            }else if (e.getSource()==boton2){
                txt.setFont(new Font("serif", Font.PLAIN, 18));

            }else if (e.getSource()==boton3){
                txt.setFont(new Font("serif", Font.PLAIN, 24));
            }

        }
    }

    private JLabel txt;
    private JRadioButton boton,boton1,boton2,boton3;
}
=======
        txt.setFont(new Font("serif",Font.PLAIN,12));
        add(txt, BorderLayout.CENTER);
        grupo=new ButtonGroup();
        panelBotones=new JPanel();

        colocarBotones("pequeño",false,10);
        colocarBotones("mediano",true,12);
        colocarBotones("grande",false,18);
        colocarBotones("muy grande",false,24);

        add(panelBotones,BorderLayout.SOUTH);
    }
    public void colocarBotones(String nombre,boolean seleccionado,final int tamano) {
        JRadioButton miboton = new JRadioButton(nombre, seleccionado);
        grupo.add(miboton);
        panelBotones.add(miboton);
        ActionListener mievento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setFont(new Font("serif",Font.PLAIN,tamano));

            }
        };
        miboton.addActionListener(mievento);

    }
    private JLabel txt;
    private JRadioButton boton,boton1,boton2,boton3;
    private ButtonGroup grupo;
    private JPanel panelBotones;
}
>>>>>>> main
