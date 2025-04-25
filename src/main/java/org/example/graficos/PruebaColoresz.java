package org.example.graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PruebaColoresz {
    public static void main(String[] args) {
        MArcoConColor miMarco=new MArcoConColor();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MArcoConColor extends JFrame{
    public MArcoConColor(){
        setTitle("prueba con color");
        setSize(400,400);
        panelConColor miPnael=new panelConColor();
        add(miPnael);

        miPnael.setBackground(Color.BLACK);//cambia el color del panel  s
    }
}
class panelConColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;

        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.GREEN);
        g2.fill(rectangulo);//remplazamos el dra por el fill para que no solo nos modifique e trazo

        Ellipse2D elipse=new Ellipse2D.Double();
        g2.setPaint(Color.BLUE);

        //g2.setPaint(new Color(2,55,321).brighter()); si utilisamos el constructor(de los muchos que tine) podemos personalisar
        //nuesto color segun el RGB, el brighther es un metodo que le da brillo tambien esta el darker que es su opuesto

        elipse.setFrame(rectangulo);
        g2.fill(elipse);

    }
}