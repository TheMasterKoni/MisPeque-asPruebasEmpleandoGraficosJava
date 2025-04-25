package org.example.graficos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

public class EventosRaton {
    public static void main(String[] args) {
        MarcoRaton miMarco= new MarcoRaton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setBounds(700,300,600,450);

        EventosDeRaton eventosRaton=new EventosDeRaton();
        addMouseListener(eventosRaton);
        addMouseMotionListener(eventosRaton);
    }
}
class EventosDeRaton extends MouseAdapter implements MouseMotionListener{
    @Override
    public void mouseClicked(MouseEvent e) {
      //  System.out.println("Coordenada en el eje X: " + e.getX() + " Coordenada en el eje Y: " + e.getY());
       // System.out.println(e.getClickCount());
    }
    public void mousePressed(MouseEvent e){
      if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){//esta constante de clase son estaticas
          System.out.println("has hecho click izquierdo");
      } else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
          System.out.println("has hecho click derecho");
      } else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
          System.out.println("has hecho click sobre la reuda del mouse");
      }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("estas arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        System.out.println("estas moviendo");
    }
}
