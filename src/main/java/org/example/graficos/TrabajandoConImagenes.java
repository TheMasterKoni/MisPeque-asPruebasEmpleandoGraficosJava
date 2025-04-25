package org.example.graficos;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TrabajandoConImagenes {
    public static void main(String[] args) {
        MarcoConImagen  miMarco=new MarcoConImagen ();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoConImagen extends JFrame{
    public MarcoConImagen(){
        setTitle("prueba con color");
        setBounds(750,300,300,200);
        panelConImagen miPnael=new panelConImagen();
        add(miPnael);

        miPnael.setBackground(Color.BLACK);//cambia el color del panel  s
    }
}
class panelConImagen extends JPanel{
    public  panelConImagen (){
        File miImagen=new File("queen mita.JPG");

        try {
            imagen= ImageIO.read(miImagen);
        } catch (IOException e) {
            System.out.println("la imagen no se ha podido encontrar");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchuraImagen=imagen.getWidth(this);
        int altoImagen=imagen.getHeight(this);

        g.drawImage(imagen,0,0,null);
        g.copyArea(0,0,anchuraImagen,altoImagen,736,0);

        /*  for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
            if(j+i>0{ condicional para que no se imprima encima de la otra foto
                g.copyArea(0,0,736,969,736*i,969*j); bucle que imprime la imagen por toda la pantalla
                }
            }
        }
     */

    }
    private Image imagen;
}

