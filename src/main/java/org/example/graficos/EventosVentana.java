package org.example.graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosVentana {
    public static void main(String[] args) {
        MarcoVentana miMArco=new MarcoVentana();
        miMArco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana miMarco2=new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        miMarco2.setTitle("ventana 2");
        miMArco.setTitle("ventana 1");
        miMarco2.setBounds(900,300,500,500);
        miMArco.setBounds(200,300,500,500);

    }
}
class MarcoVentana extends JFrame {
    public MarcoVentana() {
        setVisible(true);
        setTitle("Respondiendo");

        MVentana listenerVentana=new MVentana();
        addWindowListener(listenerVentana);
    }
}
class MVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("la ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("ventana desactivada");
    }
}


