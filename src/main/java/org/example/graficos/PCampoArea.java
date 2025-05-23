package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*vamos a crear un gran area de texto en la parte superior del marco, y que en la parte de abajo tenga 2 botones
uno que dice insertar texto y el otro para insertar o quitar saltos de linea, ademas el segundo tendra la pecurialidad,
de que al ser pulsado una ves, quite los saltos de linea y que al ser pulsado otra ves,los saltos de linea retornen

PRIMERA VES EXAMINANDO EL COMPORTAMIENTO ON OFF
 */
public class PCampoArea {
    public static void main(String[] args) {
        MarcoPArea miMarco=new MarcoPArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoPArea extends JFrame{
    public MarcoPArea(){
        setTitle("Pruebas con el JTextArea");
        setBounds(600,350,400,300);

        setLayout(new BorderLayout());
        panel=new JPanel();
        botonSaltoL=new JButton("Salto de Linea"); insertar=new JButton("Insertar");
        insertar.addActionListener(new ActionListener() {//podemos implementar una interfaz directamente en los parametros
            @Override
            public void actionPerformed(ActionEvent e) {
                areatexto.append("en un lugar de la mancha al cual no quiero acordar");//metodo para añadir parrafo
            }
        });

        panel.add(insertar);
        botonSaltoL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltoL=!areatexto.getLineWrap();//! la exclamasion en java significa negar, y el metodo nos devuelve un boolean, de si hay o no hay saltos de L...
                areatexto.setLineWrap(saltoL);//metodo que nos hace un salto de linea segun su param boolean

                if (saltoL){
                    botonSaltoL.setText("quitar salto");
                }else{
                    botonSaltoL.setText("salto linea");
                }
            }
        });
        panel.add(botonSaltoL);
        add(panel,BorderLayout.SOUTH);

        areatexto=new JTextArea(8,20);
        scroll=new JScrollPane(areatexto);
        add(scroll,BorderLayout.CENTER);
        setVisible(true);
    }
    private JPanel panel;
    private JButton insertar,botonSaltoL;
    private JTextArea areatexto;
    private JScrollPane scroll;
}
