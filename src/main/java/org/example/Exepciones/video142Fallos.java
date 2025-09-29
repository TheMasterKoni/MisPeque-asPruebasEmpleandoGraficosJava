package org.example.Exepciones;

import javax.swing.*;

public class video142Fallos {
    public static void main(String[] args) {
        int [] n=new int[5];
        n[0]=3;
        n[1]=64;
        n[2]=35;
        n[3]=2;
        n[4]=5;

        for (int i=0;i<5;i++){
            System.out.println("posición "+i+" = "+n[i]);
        }
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Hola "+nombre+" Tienes "+edad+" años.  El programa termino su ejecusión");
    }
}
