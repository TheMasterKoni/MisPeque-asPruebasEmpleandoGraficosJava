package org.example.graficos;
import javax.swing.*;
import java.awt.*;

class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class miMarco extends JFrame{
    public miMarco(){
        setBounds(500,300,600,550);
        setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("TheMonsterKoni");
    }
}
