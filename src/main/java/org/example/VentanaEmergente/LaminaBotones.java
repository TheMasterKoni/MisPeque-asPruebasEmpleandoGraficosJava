package org.example.VentanaEmergente;
import javax.swing.*;
public class LaminaBotones extends JPanel{
    public LaminaBotones(String titulo,String[] opciones){
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));//createEtchedBorder se utiliza para crear un borde con efecto de grabado en componentes de la interfaz gráfica de usuario (GUI
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        ButtonGroup agrupador=new ButtonGroup();
        for (int i=0;i<opciones.length;i++){
            JRadioButton btn=new JRadioButton(opciones[i]);
            add(btn);
            agrupador.add(btn);
            btn.setSelected(i==0);
        }
    }
}
