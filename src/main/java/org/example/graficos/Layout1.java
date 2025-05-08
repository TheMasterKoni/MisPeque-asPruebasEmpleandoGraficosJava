package org.example.graficos;
import javax.swing.*;
import java.awt.*;

//Lograr crear un un panel con botones que no esten alineados por defecto
//empleando la clase no vista FlowLayout
public class Layout1 {
    public static void main(String[] args) {
        MarcoLayout miMarco=new MarcoLayout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoLayout extends JFrame{
    public MarcoLayout(){
        setBounds(600,350,600,400);
        PanelLayout miLamina=new PanelLayout();
        FlowLayout disposicion=new FlowLayout(FlowLayout.LEADING);//PASO2: crear instacia y asignar una constante estatica de clase para indicar que se alinie a la izquierda
        miLamina.setLayout(disposicion);//PASO3:Asimilar la lamina con el layout atraves del metodo setLayout,
        add(miLamina);
        setVisible(true);

    }
}
class  PanelLayout extends JPanel{//PASO1:Crear botones
     public PanelLayout(){
         add(new JButton("Amarillo"));
         add(new JButton("Rojo"));
         add(new JButton("Azúl"));
     }
}