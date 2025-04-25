package org.example;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class PruebaAcciones {
    public static void main(String[] args) {
        MarcoAccion miMarco=new MarcoAccion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setVisible(true);
        setBounds(600,350,600,300);
        setTitle("prueba acciones");

        PanelAccion lamina=new PanelAccion();
        add(lamina);
    }
}
class PanelAccion extends JPanel{
    public PanelAccion(){
        JButton boton1=new JButton("Amarillo");
        JButton boton2=new JButton("Azul");
        JButton boton3=new JButton("Rojo");

        add(boton1);add(boton2);add(boton3);//añadicion de botones a la lamina
    }
}
class AccionColor extends AbstractAction{
    public AccionColor(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}