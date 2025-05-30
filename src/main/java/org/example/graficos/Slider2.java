package org.example.graficos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
/*hacemos un slider, que modifique el tamaño del texto
metodos e interfaces: (metodo) addCangedListener(changedListerner e);(interfaz) ChangedListener
(interfaz metodo) stateChanged(ChangedEvent e){} (metodo de instancia) getValue()
 */
public class Slider2 {
    public static void main(String[] args) {
        MarcoSlider2 miMarco=new MarcoSlider2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoSlider2 extends JFrame{
    public MarcoSlider2(){
        setBounds(300,250,500,400);
        PanelSlider2 miPanel=new PanelSlider2();
        add(miPanel);
        setVisible(true);
    }
}
class PanelSlider2 extends JPanel{
    public  PanelSlider2(){
        setLayout(new BorderLayout());
        rotulo=new JLabel("en algun lugar de la mancha de cuyo nombre no quiero acordar");
        control=new JSlider(8,50,12);
        add(rotulo,BorderLayout.CENTER);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("serif",Font.ITALIC,10));
        control.addChangeListener(new EventoSlider());
        JPanel subPanel=new JPanel();
        subPanel.add(control);
        add(subPanel,BorderLayout.NORTH);
    }
    private class EventoSlider implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("serif",Font.PLAIN,control.getValue()));//getValue() metodo que retorna el valor
                                                                                    // de la ubicacion del slider
        }
    }
    private JLabel rotulo;
    private JSlider control;
}