package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PIneccesaria {
    public static void main(String[] args) {
        MarcoInecesario miMarco=new MarcoInecesario();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoInecesario extends JFrame{
    public MarcoInecesario(){
        setBounds(400,250,600,500);
        PanelInecesario miPanel=new PanelInecesario();
        add(miPanel);
        setVisible(true);
    }
}
class PanelInecesario extends JPanel{
    public PanelInecesario(){

       setLayout(new BorderLayout());
       JPanel subPanel=new JPanel();
       subPanel.setLayout(new FlowLayout());

       JLabel txt=new JLabel("intenta adivinar el numero");
       mayorMenor=new JLabel("",JLabel.CENTER);
       subPanel.add(txt);

       numero=new JTextField(20);
       subPanel.add(numero);
       add(mayorMenor,BorderLayout.CENTER);

       adivinar=new JButton("adivinar");
       adivinar.addActionListener(new OyenteInnecesario());
       subPanel.add(adivinar);

       add(subPanel,BorderLayout.NORTH);
    }
    class OyenteInnecesario implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int numValue=Integer.valueOf(numero.getText());
            System.out.println(numValue);

            if (ramdon<numValue){
                mayorMenor.setText("el numero es menor");
            } else if (ramdon>numValue){
                mayorMenor.setText("el numero es mayor");
            }
        }
    }
    JTextField numero;
    int ramdon;
    JLabel mayorMenor;
    JButton adivinar;
}
