package org.example;
import javax.swing.JOptionPane;
public class Comprobar_gmail_bucle_for {
    public static void main(String[] args) {

        int arroba=0;
        boolean point=false;
        String mail=JOptionPane.showInputDialog("type the gmail");

        for (int i=0;i<mail.length();i++){
           if (mail.charAt(i)=='@'){
               arroba++;
           }
           if (mail.charAt(i)=='.'){
               point=true;
           }
        }
        if (arroba==1 && point==true){
            System.out.println("the mail is true");
        }else{
            System.out.println("the mail is uncorrec");

        }

    }
}
