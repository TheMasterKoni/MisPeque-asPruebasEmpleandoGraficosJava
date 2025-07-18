package org.example;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MultiplesFuentesVideo76 {
    public static void main(String[] args) {
        MarcoAccion miMarco=new MarcoAccion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setBounds(600,350,600,300);
        setTitle("prueba acciones");

        PanelAccion lamina=new PanelAccion();
        add(lamina);
        setVisible(true);
    }
}
class PanelAccion extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("ctrl A = Color Amarillo",20,20);
        g.drawString("ctrl B = Azul",20,40);
        g.drawString("ctrl R = Rojo",20,60);
    }

    private class AccionColor extends AbstractAction{
        public AccionColor(String nombre, Icon icono, Color botonColor){
            //OBJ de clave y valor
            putValue(Action.NAME,nombre);//constante de clase estatica perteneciente a la clase Action
            putValue(Action.SMALL_ICON,icono); //⬆️ NAME "," la coma es para que le asignemos el valor a la constante ya que sin esta no puede funcionar
            putValue(Action.SHORT_DESCRIPTION,"porner la lamina de color "+nombre);/*cuando colocamos el texto el texto y
        lo concatenamos con la variabre "nombre" (la que tiene el constructor) nos tiene que retornar el parrafo escrito */
            putValue("color_de_fondo",botonColor);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c=(Color)getValue("color_de_fondo");//getvalue rescata el valor de la accion
            setBackground(c);
            System.out.println("nombre: "+getValue(Action.NAME)+ " Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
        }
    }
    public PanelAccion(){
         //creacion de acciones  /  nombre sin String, imagen con la clase imageIcon y color con su variable final
        AccionColor AccionAmarillo=new AccionColor("amarillo",new ImageIcon("Amarillo.JPG"),Color.YELLOW);
        AccionColor AccionAzul=new AccionColor("Azul",new ImageIcon("Azul.JPG"),Color.BLUE);
        AccionColor AccionRojo=new AccionColor("Rojo",new ImageIcon("rojo.JPG"),Color.RED);
        //⬇️ nuevo constructor de JButton
        add(new JButton(AccionAmarillo));//⬆️manera profecional en este caso add(new JButton(AccionAmarillo));
        add(new JButton(AccionAzul));
        add(new JButton(AccionRojo));

        /*
        JButton boton1=new JButton("Amarillo");
        JButton boton2=new JButton("Azul");
        JButton boton3=new JButton("Rojo");

        add(boton1);add(boton2);add(boton3);//añadicion de botones a la lamina*/

        //PASO1: crear mapa de entrada (quien tiene el foco)
        InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        //PASO2:Combinacion de teclas
        KeyStroke teclAmarilla=KeyStroke.getKeyStroke("ctrl A");//metodo static
        KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");
        //PASO3:Asignar combinacion de teclas
        mapaEntrada.put(teclAmarilla,"fondo_amarillo");
        mapaEntrada.put(teclaAzul,"fondo_Azul");
        mapaEntrada.put(teclaRojo,"fondo_Rojo");
        //PASO4:Asignar el objeto a la accion
        ActionMap mapaAccion=getActionMap();
        mapaAccion.put("fondo_amarillo",AccionAmarillo);
        mapaAccion.put("fondo_Azul",AccionAzul);
        mapaAccion.put("fondo_Rojo",AccionRojo);


    }
}
