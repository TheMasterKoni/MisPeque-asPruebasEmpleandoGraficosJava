package org.example;
import java.util.Scanner;
public class FactorialBucleFor {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("type the factorial number");
     int num=input.nextInt();
     int result=1;
     for (int i=num;i>0;i--){
        result=result*i;
     }
      System.out.println("resultado factorizado "+result);
    }

}
