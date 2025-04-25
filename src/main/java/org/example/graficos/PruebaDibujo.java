package org.example.graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujo miMarco=new MarcoConDibujo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoConDibujo extends JFrame{
    public MarcoConDibujo(){
        setVisible(true);
        setTitle("prueba de dibujo");
        setSize(400,400);

        PanelConFiguras miPanel=new PanelConFiguras();
        add(miPanel);
    }
}
class PanelConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

       /* g.drawRect(50,50,200,200);
        g.drawLine(100,100,300,200);
        g.drawArc(100,100,100,200,120,150);*/

        Graphics2D g2=(Graphics2D) g;
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);//rectangulo
        g2.draw(rectangulo);//instacia de tipo shape (forma)

        Ellipse2D elipse=new Ellipse2D.Double();//elipse
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100,100,300,250));//instancia directa de una linea

        double centroEnX=rectangulo.getCenterX();
        double centroEnY=rectangulo.getCenterY();
        double radio=150;

        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX,centroEnY,centroEnX+radio,centroEnY+radio);
        g2.draw(circulo);

    }
}
