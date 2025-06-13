package org.example.graficos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*vamos a crear un area de texto y asu derecha que implemente un boton
y modificamos su comportamiento por defecto
 */
public class CampoArea {
    public static void main(String[] args) {
        MarcoArea miMarco=new MarcoArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoArea extends JFrame{
    public MarcoArea(){
        setTitle("P. Area");
        setBounds(600,350,400,400);

        PanelArea miPanel=new PanelArea();
        add(miPanel);
        setVisible(true);
    }
}
class PanelArea extends JPanel{
    public PanelArea(){
    Area=new JTextArea(8,20);
    Area.setLineWrap(true);//metodo que nos permite modificar, el compormiento del JTextArea
    JScrollPane scrool=new JScrollPane(Area);//clase para darle un escroll a nuestro OJ JTextArea
    add(scrool);//añadimos tanto el el scrool tanto la var Area

    JButton boton=new JButton("Dale");
    boton.addActionListener(new GestionArea());
    add(boton);
    }
    private class GestionArea implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(Area.getText());
        }
    }
    private JTextArea Area;
}