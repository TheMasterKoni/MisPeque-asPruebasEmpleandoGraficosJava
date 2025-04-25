package org.example;
import java.util.Scanner;
public class guessNumber {
    public static void main(String[] args) {
    int random = (int)(Math.random()*100 );
    Scanner input = new Scanner(System.in);
    int num=0; int intentos = 1;
       do{
            System.out.println("try number "+intentos);
            System.out.println("type the number");
            num = input.nextInt();
            intentos++;

            if (random<num) {
                System.out.println("is low");
            }else if (random>num) {
                System.out.println("is hight");
            }
        } while (num!=random);
        System.out.println("successful");
        }
    }



