package org.example.graficos;
import javax.swing.*;
import java.awt.*;

//Lograr crear un un panel con botones que no esten alineados por defecto
//empleando la clase no vista FlowLayout

//VIDEO 2:Lograr que los botones esten separados como nostros queramos y no por defecto, borrarmos el FlowLayout
//para poner en parctica lo que es la clase BorderLayout
public class Layout1 {
    public static void main(String[] args) {
        MarcoLayout miMarco=new MarcoLayout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoLayout extends JFrame{
    public MarcoLayout(){
        setBounds(600,350,600,400);
        PanelLayout miLamina=new PanelLayout();//tercer contructor de FlowLayout,nos permite ubicar la separcion de los componentes
        add(miLamina,BorderLayout.NORTH);  //codigo anterior comentado ⬇️
                             /*FlowLayout disposicion=new FlowLayout(FlowLayout.CENTER,75,100);//PASO2: crear instacia y asignar una constante estatica de clase para indicar que se alinie a la izquierda
                             miLamina.setLayout(disposicion);Asimilar la lamina con el layout atraves del metodo setLayout,*/
        Panelayout2 miLamina2=new Panelayout2();
        add(miLamina2,BorderLayout.SOUTH);//con esto impedimos que un panel machaque al otro y se posicionen segun el Marco y el layout
        setVisible(true);
    }
}
class  PanelLayout extends JPanel{//PASO1:Crear botones
     public PanelLayout() {
         //segundo constructor del layout para dar separacion
         setLayout(new FlowLayout(FlowLayout.LEFT));//PASO3:Asimilar la lamina con el layout atraves del metodo setLayout,
         add(new JButton("Boton1"), BorderLayout.NORTH);//NOTA:La clase add perteneciente a componen tiene un constructor
         add(new JButton("Boton2"), BorderLayout.SOUTH);//para dar un segundo parametro para indicar la posicion
     }
}
//AHORA VAMOS A COMBIANAR LOS LAYOUT VISTOS ANTERIORMENTE
class Panelayout2 extends JPanel{
  public Panelayout2(){
    setLayout(new BorderLayout());
    add(new JButton("Boton3"),BorderLayout.WEST);
    add(new JButton("Boton4"),BorderLayout.EAST);
    add(new JButton("Boton5"),BorderLayout.CENTER);//Tambien pude funcionar sin necesidad de especificar la zona al ser el ultimo elemento
}

}