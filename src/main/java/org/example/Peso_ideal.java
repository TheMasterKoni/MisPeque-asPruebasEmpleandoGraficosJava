package org.example;
import javax.swing.*;
public class Peso_ideal {
   public static void main(String[] args) {
       String genero = "";
       do {
           genero = JOptionPane.showInputDialog("inserte su genero (H/M)");
       }while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);{
           int altura = Integer.parseInt(JOptionPane.showInputDialog("inserta su altura en cm"));

           if (genero.equalsIgnoreCase("masculino")) {
               System.out.println("su peso es: "+(altura-110)+"KG");

           } else if (genero.equalsIgnoreCase("femenino")) {
              int alturaF = Integer.parseInt(JOptionPane.showInputDialog("inserta su altura en cm"));

               System.out.println("su peso es: "+(alturaF-120)+"KG");
           }
       }

   }
}

