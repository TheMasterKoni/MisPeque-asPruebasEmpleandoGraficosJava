package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventoFoco {
    public static void main(String[] args) {
        MarcoFoco miMarco=new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setBounds(300,300,645,450);
        setVisible(true);

        add(new PanelFoco());
    }
}

class PanelFoco extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);//quitamos el layout por defecto
        cuadro1 =new JTextField();
        cuadro2 =new JTextField();

        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);
        add(cuadro1);
        add(cuadro2);//esto ultimo es para que se agrege dentro del panel

        LanzaFocos elFoco=new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
    }
    JTextField cuadro1,cuadro2;//para que pueda ser modificada fuera del metodo
    private  class LanzaFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            String email=cuadro1.getText();
            boolean comprobacion=false;

            for(int i=0;i<email.length();i++){
              if (email.charAt(i)=='@'){
                  comprobacion=true;
              }
            }
            if(comprobacion){
                System.out.println("correcto");
            } else if (comprobacion) {
                System.out.println("incorrecto");
            }
        }
    }
}
