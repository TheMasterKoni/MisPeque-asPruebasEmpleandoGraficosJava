package org.example;

import javax.swing.*;
import java.awt.*;
/*
Lo curioso de exto que no solo le podemos añadir paneles a un marco si no que tambien podemos agregarle cajas al marco
 */
public class DisposionesAvanzadasVideo115 {
    public static void main(String[] args) {
        MarcoDisposicion miMarco=new MarcoDisposicion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoDisposicion extends JFrame{
    public MarcoDisposicion(){
        setBounds(500,250,600,500);
        JLabel rotulo1=new JLabel("Nombre:");
        JTextField txt1=new JTextField(10);
        txt1.setMaximumSize(txt1.getPreferredSize());//se optiene el tamaño maximo prefierido
        Box cajaH1=Box.createHorizontalBox();//cajah1 se le asigna el valor horizonta
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10)); // crea espacio de 10 pixeles
        cajaH1.add(txt1);

        Box cajaH2=Box.createHorizontalBox();
        cajaH2.add(new JLabel("Contraseña"));
        JTextField txt2=new JTextField(10);
        txt2.setMaximumSize(txt2.getPreferredSize());
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(txt2);

        JButton btn=new JButton("OK");
        JButton btn2=new JButton("Cancelar");
        Box cajaH3=Box.createHorizontalBox();
        cajaH3.add(btn);
        cajaH3.add(Box.createGlue());//metodo que haces que los botones se peguen a los costados del marco
        cajaH3.add(btn2);

        Box cjV=Box.createVerticalBox();
        cjV.add(cajaH1);
        cjV.add(cajaH2);
        cjV.add(cajaH3);
        add(cjV,BorderLayout.CENTER);
        setVisible(true);
    }
}
