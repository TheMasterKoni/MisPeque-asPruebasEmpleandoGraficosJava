package org.example.graficos;


import javax.swing.*;
import java.awt.*;

/*
MANIPULAR EL TAMÑO DE UNA IMGEN LOGO
        ImageIcon logoIcon = new ImageIcon("SIGE.jpeg");
        Image image=logoIcon.getImage().getScaledInstance(60,40,Image.SCALE_SMOOTH);//reducier la imagen (investigar)
        JLabel logoLabel = new JLabel(new ImageIcon(image));//variable que accede al nuevo tamaño
 */
public class MenusConImagenVideo107 {
    public static void main(String[] args) {
        JFrame marco=new JFrame();
        marco.setBounds(500,250,600,500);
        marco.setTitle("mreducir imgane prueba");
        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("esto es un titulo del borded de un panel"));

        ImageIcon ic=new ImageIcon("cappi.jpg");//colocar icono "cappi.jpg"
        Image ir=ic.getImage().getScaledInstance(400,300,Image.SCALE_SMOOTH);//reducir tam icono
        JLabel icono=new JLabel(new ImageIcon(ir));//colocar icono con tam reducido

        panel.add(icono);


        marco.add(panel);
        marco.setVisible(true);
    }
}
