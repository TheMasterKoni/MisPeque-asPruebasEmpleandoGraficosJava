package org.example;

import javax.swing.*;
import java.awt.*;

public class DisposionesLibresVideo118 {
    public static void main(String[] args) {
        MarcoLibre l=new MarcoLibre();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoLibre extends JFrame{
    public MarcoLibre(){
        setTitle("Marco Libre");
        setBounds(400,250,600,500);
        PanelLibre p=new PanelLibre();
        add(p);
        setVisible(true);
    }
}
class PanelLibre extends JPanel{
    public PanelLibre(){
        setLayout(new encolumnas());// null disposicion libre
        setBorder(BorderFactory.createTitledBorder("mi primera disposion creada"));

        JLabel n=new JLabel("Nombre: ");
        JTextField no=new JTextField();
        JLabel a=new JLabel("Apellido: ");
        JTextField ap=new JTextField();
        JLabel edad=new JLabel("Edad: ");
        JTextField fieldEdad=new JTextField();
        JLabel cel=new JLabel("Telefono: ");
        JTextField fieldPhon=new JTextField();

        /*n.setBounds(20,20,125,25);
        a.setBounds(20,60,125,25);
        no.setBounds(90,20,125,25);
        ap.setBounds(90,60,125,25);*/
        add(n);
        add(no);
        add(a);
        add(ap);
        add(edad);
        add(fieldEdad);
        add(cel);
        add(fieldPhon);
    }
}
class encolumnas implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container miContenerdor) {
        int d=miContenerdor.getWidth();
        x=d/2;
        int contador=0;
        int n=miContenerdor.getComponentCount();//metodo que cuenta los componentes agregados al contenedor
        for (int i=0;i<n;i++){
            contador++;
            Component c=miContenerdor.getComponent(i);//metodo que retorno el componente segun su posicion
            c.setBounds(x-100,y,100,20);
            x+=100;//el operador de incremento += incrementa a x+100 = 120, mientras que este mismo es de añdicion en str

            if (contador%2==0){// % operador de residuo, retorna el residuo de una divison, en este caso el if funciona si es un n par para dar otra pareja n
                x=d/2;
                y+=40;
            }
        }

    }
    private int x;
    private int y=20;
}