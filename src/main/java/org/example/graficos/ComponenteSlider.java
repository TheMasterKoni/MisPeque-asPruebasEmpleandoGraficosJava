package org.example.graficos;

import javax.swing.*;
import java.awt.*;

public class ComponenteSlider {
    public static void main(String[] args) {
        MarcoSlider miMarco =new MarcoSlider();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoSlider extends JFrame{
    public MarcoSlider(){
        setBounds(400,250,500,400);
        PanelMarcoSlider miCombo=new PanelMarcoSlider();
        add(miCombo);
        setVisible(true);
    }
}
class PanelMarcoSlider extends JPanel{
    public PanelMarcoSlider(){
        JSlider slider=new JSlider();
        slider.setMajorTickSpacing(50);//marcas mayores
        slider.setMinorTickSpacing(25);//marcas menores
        slider.setFont(new Font("serif",Font.ITALIC,12));
        slider.setPaintTicks(true);//mostrar marcas mayores
        slider.setPaintLabels(true);//mostrar marcas menores
        slider.setSnapToTicks(true);//metodo, para que las marcas, tengan un comportamiento de iman
        add(slider);
    }
}
