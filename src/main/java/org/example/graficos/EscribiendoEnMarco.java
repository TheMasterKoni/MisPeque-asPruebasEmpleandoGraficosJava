package org.example.graficos;
import javax.swing.*;
import java.awt.*;
public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoConTexto miMArco=new MarcoConTexto();
        miMArco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        setBounds(600,450,400,200);
        setTitle("primer texto");

        Panel miPanel=new Panel();
        add(miPanel);
    }
}
class Panel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);//metodo de la clase padre
        g.drawString("aprendiendp swing",100,100);
    }

}