package org.example.graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambiaEstado{
    public static void main(String[] args) {
        MarcoEstado miMArco=new MarcoEstado();
        miMArco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoEstado extends JFrame {
    public MarcoEstado() {
        setVisible(true);
        setTitle("estado");
        setBounds(200,300,500,500);

        CambioEstado nuevoEstado=new CambioEstado();
        addWindowStateListener(nuevoEstado);
    }
}
class CambioEstado implements WindowStateListener {
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("la ventana ha cambiado de estado");
        if(e.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("la ventana se ha maximizado");
        } else if (e.getNewState()==Frame.ICONIFIED) {
            System.out.println("la ventana ha sido oculta");
        } else if (e.getNewState()==Frame.NORMAL) {
            System.out.println("la ventana a vuelto a la normalidad");
        }
    }
}