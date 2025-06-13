package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*hagamos un marco, el cual posea 2 paneles uno superior con un texto, y uno inferior con 2 check box,uno para poner
el dicjo texto en nigrita y el otro checkbox para poner el el texto en cursiba
 */
public class PCheckBox {
    public static void main(String[] args) {
        MarcoCheckBOx miMarco=new MarcoCheckBOx();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoCheckBOx extends JFrame{
    public MarcoCheckBOx(){
        setTitle("Primer checkBox");
        setBounds(550,300,550,350);


        PanelCheckBox miPanel=new PanelCheckBox();
        add(miPanel);
        setVisible(true);
    }
}
class PanelCheckBox extends JPanel{
    public PanelCheckBox(){
        setLayout(new BorderLayout());
        Font tipoLetra=new Font("serif",Font.PLAIN,24);//establecer las caracteristicas del tipo de letra
        texto=new JLabel("En algún lugar de la mancha al cual yo no quiero acordar");
        texto.setFont(tipoLetra);//metodo que optiene el tipo de letra

        JPanel panelTxt=new JPanel();
        panelTxt.add(texto);
        add(panelTxt,BorderLayout.CENTER);

        check1=new JCheckBox("Negrita");
        check2=new JCheckBox("Cursiva");

        check2.addActionListener(new oyenteCheckBox());
        check1.addActionListener(new oyenteCheckBox());
        JPanel panelCheck=new JPanel();
        panelCheck.add(check1);
        panelCheck.add(check2);

        add(panelCheck,BorderLayout.SOUTH);
    }
    private class oyenteCheckBox implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo=0;
            if (check1.isSelected()) tipo+=Font.BOLD; //isSelected() metodo para evaluar si el box esta activado
            if (check2.isSelected()) tipo+=Font.ITALIC;
            texto.setFont(new Font("serif",tipo,24));

        }
    }
    private JLabel texto;
    private JCheckBox check1,check2;
}