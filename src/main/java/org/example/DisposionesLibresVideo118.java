package org.example;

import javax.swing.*;

public class DisposionesLibresVideo118 {
    public static void main(String[] args) {
        MarcoLibre l=new MarcoLibre();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoLibre extends JFrame{
    public MarcoLibre(){
        setTitle("Marco Libre");
        setBounds(400,250,600,500);
        PanelLibre p=new PanelLibre();
        add(p);
        setVisible(true);
    }
}
class PanelLibre extends JPanel{
    public PanelLibre(){
        setLayout(null);//disposicion libre
        JLabel n=new JLabel("Nombre: ");
        JLabel a=new JLabel("Apellido: ");
        JTextField no=new JTextField();
        JTextField ap=new JTextField();

        n.setBounds(20,20,125,25);
        a.setBounds(20,60,125,25);
        no.setBounds(90,20,125,25);
        ap.setBounds(90,60,125,25);
        add(n);
        add(a);
        add(no);
        add(ap);
    }
}