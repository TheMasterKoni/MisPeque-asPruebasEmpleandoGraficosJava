package org.example.Exepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
InputMisMatchException es el error que nos aparece cuando se le da un valor que  no es a una variable
mientras se ejecuta

Aqui veremos como podemos crear nuestros propios metodos y que funcionen a pesar de un error con un try cath
 */
public class Video144MisMatchException {
    public static void main(String[] args) {
        System.out.println("Tome una decicion ");
        System.out.println("Decision 1");
        System.out.println("Desicion 2");
        Scanner input= new Scanner(System.in);
        int decicision=input.nextInt();
        if (decicision==1){
            try {
                pedirDatos();
            }catch (InputMismatchException e){
                System.out.println("Que Introducistes en la edad");
            }
        }else {
            System.out.println("Adios");
        }
        input.close();
    }
    public static void pedirDatos() throws InputMismatchException { // lanzamos la clausula throws, para que no se de el error de la linea 27
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce tu nombre por favor");
            String getInput = entrada.nextLine();
            System.out.println("introduce tu edad por favor");
            int edad = entrada.nextInt();//si le pasamos un String nos dara el error que esperamos
            System.out.println("Hola " + getInput + " El año que viene tendras " + (edad + 1) + " años");
            entrada.close();
    }
}
