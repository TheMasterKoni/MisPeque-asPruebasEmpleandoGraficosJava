package org.example.VentanaEmergente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareaDejadaEnVideo122 {
    public static void main(String[] args) {
        MarcoP m=new MarcoP();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoP extends JFrame{
    public MarcoP(){
        setTitle("Prueba de Dialogos");
        setBounds(400,250,700,630);
        PanelP p=new PanelP();
        add(p);
        setVisible(true);
    }
}
class PanelP extends JPanel{
    public PanelP(){
        setLayout(new GridLayout(2,3));
        JPanel subPanel=new JPanel();

        Box caja=Box.createVerticalBox();
        Box caja1=Box.createVerticalBox();
        Box caja2=Box.createVerticalBox();
        Box caja3=Box.createVerticalBox();
        Box caja4=Box.createVerticalBox();
        Box caja5=Box.createVerticalBox();

        caja.setBorder(BorderFactory.createTitledBorder("Tipos"));
        caja1.setBorder(BorderFactory.createTitledBorder("Tipo de mensaje"));
        caja2.setBorder(BorderFactory.createTitledBorder("Mesange"));
        caja3.setBorder(BorderFactory.createTitledBorder("Tercera caja"));
        caja4.setBorder(BorderFactory.createTitledBorder("Cuarta caja"));
        caja5.setBorder(BorderFactory.createTitledBorder("Quinta caja"));

        //inicializacion de campos de clase
        r=new JRadioButton("showMessageDialog");
        r1=new JRadioButton("showInputDialog");
        r2=new JRadioButton("showConfirDialog");
        r3=new JRadioButton("showOptionDialog");

        r4=new JRadioButton("advertencia");
        r5=new JRadioButton("Interrogante");
        r6=new JRadioButton("alert");
        r7=new JRadioButton("exclamacion");

        r8=new JRadioButton("cadena de objetos");
        r9=new JRadioButton("componetes");
        r10=new JRadioButton("STR");
        r11=new JRadioButton("icono");
        inicialisar=new JButton("inicializar");

        r.addActionListener(new GestionaEventos());
        r1.addActionListener(new GestionaEventos());
        r2.addActionListener(new GestionaEventos());
        r3.addActionListener(new GestionaEventos());

        caja.add(r);
        caja.add(r1);
        caja.add(r2);
        caja.add(r3);

        caja1.add(r4);
        caja1.add(r5);
        caja1.add(r6);
        caja1.add(r7);

        caja2.add(r8);
        caja2.add(r9);
        caja2.add(r10);
        caja2.add(r11);

        add(caja);
        add(caja1);
        add(caja2);
        add(caja3);
        add(caja4);
        add(caja5);
        subPanel.setLayout(new BorderLayout());
        subPanel.add(inicialisar,BorderLayout.CENTER);
        add(subPanel);

    }
    private class GestionaEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==r){
                JOptionPane.showMessageDialog(PanelP.this,"Hola colle");
            } else if (e.getSource()==r1) {
                JOptionPane.showInputDialog("entrada de datos");
            } else if (e.getSource()==r2) {
                JOptionPane.showConfirmDialog(PanelP.this,"desea confirmar 🤨");
            } else if (e.getSource()==r3) {
                JOptionPane.showOptionDialog(PanelP.this,"hola colle","Koni",1,1,null,null,null);
            }
        }
    }
    private JRadioButton r,r1,r2,r3;
    private JRadioButton r4,r5,r6,r7;
    private JRadioButton r8,r9,r10,r11;
    private JButton inicialisar;
}