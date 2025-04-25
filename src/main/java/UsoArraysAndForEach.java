import java.util.Arrays;
import java.util.Scanner;
public class UsoArraysAndForEach {
    public static void main(String[] args) {
       String countries[]={"España","Colombia","Ecuador","Venezuela","Perú","Uruguay","Rusia","Alemania"};

       for(int i=0;i<countries.length;i++){
           System.out.println("county of list "+(i+1)+" "+countries[i]);
       }

       System.out.println("");

        String countries2[]={"Singapur","EEUU","Malacia","Paris","Russia","China","Japon","Brazil"};
        for (String elemento:countries2) {
            System.out.println(elemento);
        }

        Scanner input=new Scanner(System.in);

        String[] countries3=new String[5];
        for (int i=0;i<5;i++){
            countries3[i]="the country for the list "+i+" "+input.nextLine();
        }
        System.out.println(" ");

        for (String element:countries3){
            System.out.println(element);
        }
        System.out.println("");

        int[] randomNumber=new int[10];
        for (int i=0;i<10;i++){
            randomNumber[i]= (int) ((int)100*(Math.random()));
        }
        for (int elemnet3:randomNumber){
            System.out.println(elemnet3);
        }
    }
}
