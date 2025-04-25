package org.example.graficos;
import javax.swing.*;
import java.awt.*;
public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCnetrado miMarco=new MarcoCnetrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}
class MarcoCnetrado extends JFrame{
    public MarcoCnetrado(){
        Toolkit miPantalla=Toolkit.getDefaultToolkit();//instancia de tipo toolkit tambien lo que considera a la variable una dimencion
        Dimension tamanoPantalla=miPantalla.getScreenSize();//esta instacia solo puede ser asignada a una var de tipo dimencion

        int alturaPantalla=tamanoPantalla.height;//campos de clase de la clase Dimecion para obtener la altura max pantalla
        int anchoPantalla=tamanoPantalla.width;//" " canchura

        setSize(anchoPantalla/2,alturaPantalla/2);//divicion para que devida la mitad de la pantalla padre
        setLocation(anchoPantalla/4,alturaPantalla/4);

        Image miIcono = miPantalla.getImage("look a puppy.JPG");
        setIconImage(miIcono);
    }
}