package org.example.Debugging;

import javax.swing.*;

public class Video150Debugging1 {
    public static void main(String[] args) {
        int elementos=Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        int nAlet[]=new int[elementos];
        for (int i=0;i<nAlet.length;i++){
            nAlet[i]=(int)(Math.random()*100);
        }
        for(int elem: nAlet){
            System.out.println(elem);
        }
    }
}
