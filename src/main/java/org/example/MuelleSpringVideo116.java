package org.example;

import javax.swing.*;
import java.awt.*;

public class MuelleSpringVideo116 {
    public static void main(String[] args) {
        MarcoMuelle m=new MarcoMuelle();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoMuelle extends JFrame{
    public MarcoMuelle(){
        setBounds(400,250,1000,400);
        PanelMuelle a=new PanelMuelle();
        add(a);
        setVisible(true);
    }
}
class PanelMuelle extends JPanel{
    public PanelMuelle(){
        JButton btn=new JButton("Boton 1");
        JButton btn1=new JButton("Boton 2");
        JButton btn2=new JButton("Boton 3");
        SpringLayout layout=new SpringLayout();
        setLayout(layout);
        add(btn);
        add(btn1);
        add(btn2);
        Spring muelle=Spring.constant(0,10,100);
        Spring muelleRigido=Spring.constant(10);
           //oeste del boton    /btn refenciado /muelle colocar /donde ir muelle /sobre el componente
        layout.putConstraint(SpringLayout.WEST,btn,muelle,SpringLayout.WEST,this);
        layout.putConstraint(SpringLayout.WEST,btn1,muelleRigido,SpringLayout.EAST,btn);
        layout.putConstraint(SpringLayout.WEST,btn2,muelleRigido,SpringLayout.EAST,btn1);
        layout.putConstraint(SpringLayout.EAST,this,muelle,SpringLayout.EAST,btn2);
    }
}