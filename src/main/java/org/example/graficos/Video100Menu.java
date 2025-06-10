package org.example.graficos;

import javax.swing.*;
/*vamos a hacer una barra de menu con la instancia JMenuBar, 3 menus con la instancia JMenu y sus itenes con la
instancia JMenuItem, y para finalizar vamos a agregar un menu dentro de otro menu, que asu ves implente 2 itenes
 */
public class Video100Menu {
    public static void main(String[] args) {
        MarcoMenu miMarco =new MarcoMenu();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoMenu extends JFrame{
    public MarcoMenu(){
        setBounds(400,250,500,400);
        PanelMenu miMenu=new PanelMenu();
        add(miMenu);
        setVisible(true);
    }
}
class PanelMenu extends JPanel{
    public PanelMenu(){
        JMenuBar menuBar=new JMenuBar();//crear barra
        JMenu menu =new JMenu("Archivo");//crear Menus
        JMenu menu1=new JMenu("Edición");
        JMenu menu2=new JMenu("Herramientas");
        JMenuItem item=new JMenuItem("Guardar"); //crear Items
        JMenuItem item2=new JMenuItem("Guardar Como");
        menu.add(item);
        menu.add(item2);
        JMenuItem cortar=new JMenuItem("Cortar");
        JMenuItem copiar=new JMenuItem("Corpiar");
        JMenuItem pegar=new JMenuItem("Pegar");
        menu1.add(cortar);
        menu1.add(copiar);
        menu1.add(pegar);
        JMenuItem general=new JMenuItem("generales");
        menu2.add(general);
        JMenuItem opcion1=new JMenuItem("Opcion 1");
        JMenuItem opcion2=new JMenuItem("Opcion 2");
        JMenu opciones=new JMenu("Opciones");

        menu1.add(opciones);
        opciones.add(opcion1);
        opciones.add(opcion2);
        menuBar.add(menu);
        menuBar.add(menu1);
        menuBar.add(menu2);
        add(menuBar);
    }
}
