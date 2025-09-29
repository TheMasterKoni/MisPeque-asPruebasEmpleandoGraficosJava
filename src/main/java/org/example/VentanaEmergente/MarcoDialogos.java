package org.example.VentanaEmergente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class MarcoDialogos extends JFrame {
    public MarcoDialogos() {
        setTitle("Prueba de Dialogos");
        setBounds(500, 240, 600, 450);
        JPanel LCuadricula = new JPanel();
        LCuadricula.setLayout(new GridLayout(2, 3));
        String primero[] = {"Mensaje", "Confirmar", "Opción", "Entrada"};
        LTipo = new LaminaBotones("Tipo", primero);
        LTMensaje = new LaminaBotones("Tipo de Mensaje", new String[]{"ERROR_MESSAGE","WARNING_MESSAGE", "INFORMTATION_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});
        LMensaje = new LaminaBotones("Mensaje", new String[]{"Cadena", "Icono", "Componente", "Otros", "Object[]"});
        LTOpcion = new LaminaBotones("Confirmar", new String[]{"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"});
        LOpciones = new LaminaBotones("Opción", new String[]{"String[]", "Icon[]", "Object[]"});
        LEntrada = new LaminaBotones("Entrada", new String[]{"Campo de texto", "Combo"});
        setLayout(new BorderLayout());
        LCuadricula.add(LTipo);
        LCuadricula.add(LTMensaje);
        LCuadricula.add(LMensaje);
        LCuadricula.add(LTOpcion);
        LCuadricula.add(LOpciones);
        LCuadricula.add(LEntrada);
        JPanel subPanel = new JPanel();
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(new AccionMostrar());
        subPanel.add(btnMostrar);
        add(LCuadricula, BorderLayout.CENTER);
        add(subPanel, BorderLayout.SOUTH);
    }
    public int getTipo(LaminaBotones l){
        String s=l.getSeleccion();
        if (s.equals("ERROR_MESSAGE")|| s.equals("YES_NO_OPTION")){
            return 0;
        } else if (s.equals("INFORMTATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
            return 1;
        } else if (s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
            return 2;
        } else if (s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
            return -1;
        }else if (s.equals("QUESTION_MESSAGE")){
            return 3;
        }else {
            return 0;
        }
    }
    public Object getMensaje(){
        String s=LMensaje.getSeleccion();
        if(s.equals("Cadena")){
            return cadenaMensaje;
        } else if (s.equals("Icono")) {
            return iconMensaje;
        } else if (s.equals("Componente")) {
            return componentMensaje;
        }else if (s.equals("Otros")){
            return objMensaje;
        }else if (s.equals("Object[]")){
            return new Object[]{cadenaMensaje,iconMensaje,componentMensaje,objMensaje};
        }else {
            return null;
        }
    }
    public Object[] getOpciones(LaminaBotones l){
        String s=l.getSeleccion();
        if (s.equals("String[]")){
            return new String[]{"Amarillo","Azúl","Rojo"};
        } else if (s.equals("Icon[]")) {
            return new Object[]{new ImageIcon("rojo.jpg"),new ImageIcon("Amarillo.jpg"),new ImageIcon("Azul.jpg")};
        } else if (s.equals("Object[]")) {
            return new Object[]{cadenaMensaje,iconMensaje,componentMensaje,objMensaje};
        }else return null;
    }
    private class AccionMostrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (LTipo.getSeleccion().equals("Mensaje")) {
                JOptionPane.showMessageDialog(MarcoDialogos.this, getMensaje(), "Tiulo", getTipo(LTMensaje));
            } else if (LTipo.getSeleccion().equals("Confirmar")) {
                JOptionPane.showConfirmDialog(MarcoDialogos.this, getMensaje(), "Titulo", getTipo(LTOpcion), getTipo(LTMensaje));
            } else if (LTipo.getSeleccion().equals("Entrada")) {
                if (LEntrada.getSeleccion().equals("Campo de texto")) {
                    JOptionPane.showInputDialog(MarcoDialogos.this, getMensaje(), "Titulo", getTipo(LTMensaje));
                }else {
                    JOptionPane.showInputDialog(MarcoDialogos.this,getMensaje(),"Titulo",getTipo(LTMensaje),null,new String[]{"Amarillo","Azúl","Rojo"},"Azul");
                }
            } else if (LTipo.getSeleccion().equals("Opción")) {
                JOptionPane.showOptionDialog(MarcoDialogos.this, getMensaje(), "Titulo", 0, getTipo(LTMensaje), null, getOpciones(LOpciones), null);
            }
        }
    }
    private LaminaBotones LTipo, LTMensaje, LMensaje, LTOpcion, LOpciones, LEntrada;
    private String cadenaMensaje = "mensaje";
    private Icon iconMensaje = new ImageIcon("rojo.jpg");
    private Object objMensaje = new Date();
    private Component componentMensaje = new LaminaEjemplo();
}

class LaminaEjemplo extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        Rectangle2D rectangulo=new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setPaint(Color.YELLOW);
        g2.fill(rectangulo);
    }
}
