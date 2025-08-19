package org.example.VentanaEmergente;
import javax.swing.*;
import java.awt.*;

public class MarcoDialogos extends JFrame {
    public MarcoDialogos(){
        setTitle("Prueba de Dialogos");
        setBounds(500,300,600,450);
        JPanel LCuadricula=new JPanel();
        LCuadricula.setLayout(new GridLayout(2,3));
        String primero[]={"Mensaje","Confirmar","Opción","Entrada"};
        LTipo= new LaminaBotones("Tipo",primero);
        LCuadricula.add(LTipo);
        add(LCuadricula);
    }
    private LaminaBotones LTipo;
}
