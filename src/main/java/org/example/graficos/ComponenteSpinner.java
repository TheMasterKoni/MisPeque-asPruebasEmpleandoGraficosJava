package org.example.graficos;

import javax.swing.*;
import java.awt.*;

public class ComponenteSpinner {
    public static void main(String[] args) {
        MarcoSpinner miMarco=new MarcoSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoSpinner extends JFrame{
    public MarcoSpinner(){
        setBounds(400,250,500,400);
        PanelSpinner miPanel=new PanelSpinner();
        add(miPanel);
        setVisible(true);
    }
}
class PanelSpinner extends JPanel{
    public PanelSpinner(){
        String[] tipoLetra=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //  JSpinner spinner=new JSpinner(new SpinnerDateModel());crear spinner de tipo fecha
        JSpinner spinner=new JSpinner(new SpinnerListModel(tipoLetra));
        JSpinner spinner2=new JSpinner(new SpinnerNumberModel(5,0,10,2));
        Dimension d=new Dimension(200,20);
        spinner.setPreferredSize(d); //metodo para modificar las dimensiones del campo de txt
        add(spinner);
        add(spinner2);
    }
}