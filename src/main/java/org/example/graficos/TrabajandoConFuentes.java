package org.example.graficos;
import javax.swing.*;
import java.awt.*;
public class TrabajandoConFuentes {
    public static void main(String[] args) {
        MarcoConFuente  miMarco=new MarcoConFuente ();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoConFuente extends JFrame{
    public MarcoConFuente(){
        setTitle("prueba con color");
        setSize(400,400);
        panelConFuente miPnael=new panelConFuente();
        add(miPnael);

        miPnael.setBackground(Color.BLACK);//cambia el color del panel  s
    }
}
class panelConFuente extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;

        Font miFuente=new Font("Arial",Font.BOLD,26);
        g2.setFont(miFuente);
        g2.drawString("TheMonsterKoni",100,100);

        g2.setFont(new Font("Arial",Font.ITALIC,15));
        g2.setColor(new Color(128,90,50));
        g2.drawString("Curso de java",100,200);
    }
}