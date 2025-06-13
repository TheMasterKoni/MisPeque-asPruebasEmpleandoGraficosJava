package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*vamos a agregar un texto, en el centro del marco y en la parte superior, un combo con opciones para cambiar el tipo
de letra del txto que esta en el centro
 */
public class ComboBox {
    public static void main(String[] args) {
        MarcoCombo miMarco =new MarcoCombo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoCombo extends JFrame{
    public MarcoCombo(){
        setBounds(400,250,500,400);
        setTitle("primer dezplegable");
        PanelCombo miCombo=new PanelCombo();
        add(miCombo);
        setVisible(true);
    }
}
class PanelCombo extends JPanel{
    public PanelCombo(){
        setLayout(new BorderLayout());
        txt=new JLabel("En agun lugar de la macha de cuyo nombre nombre no quiero acordar");
        txt.setFont(new Font("serif",Font.PLAIN,18));
        add(txt,BorderLayout.CENTER);
        panel2=new JPanel();
        combo=new JComboBox();
        combo.setEditable(true);//con este metodo tenemos la opcion de que el combo sea editable, (se pueda escribir en el)

        añadeDeplegable("Serif");//familias de tipo de letra compatibles con cualquier S.Operativo
        añadeDeplegable("SansSerif");
        añadeDeplegable("MonosPaced");
        añadeDeplegable("Dialog");

        combo.addActionListener(new EventoCombo());

        panel2.add(combo);
        add(panel2,BorderLayout.NORTH);

    }
    private void añadeDeplegable(String tipoLetra){
        combo.addItem(tipoLetra);
    }
    private class EventoCombo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,18));//cambiamos un parametro a tipo de dato Str
        }
    }
    private JPanel panel2;
    private JLabel txt;
    private JComboBox combo;
}