package org.example.Exepciones;

import javax.swing.*;
/*
programa que optiene multiples excepciones
 */
public class Video148MultiplesExcepciones {
    public static void main(String[] args) {
        try {
            division();
        }catch (ArithmeticException e){
            System.out.println("NO SE PERMITE LA DIVISION POR CERO(0)");
        }catch (NumberFormatException e){
            System.out.println("NO HAS INTRODUCIDO UN NUMERO ENTERO");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
        }

    }
    public static void division(){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        System.out.println("El resultado es "+num1/num2);
    }
}
