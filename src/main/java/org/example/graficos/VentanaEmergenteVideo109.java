package org.example.graficos;

import javax.swing.*;
import java.awt.*;

/*
un menu emergente es aquel que surge cada ves depues de hacer un click derecho
 */
public class VentanaEmergenteVideo109 {
    public static void main(String[] args) {
        FrameEmergente marco=new FrameEmergente();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class FrameEmergente extends JFrame{
    public FrameEmergente(){
        setTitle("primer marco emergente");
        setBounds(500,300,600,500);

        PanelEmergente p=new PanelEmergente();
        add(p);
        setVisible(true);
    }
}
class PanelEmergente extends JPanel{
    public PanelEmergente(){
        //crear panel || definir distribución
        setLayout(new BorderLayout());
        JPanel panelMenu=new JPanel();

        //crear barra || crear menus
        JMenuBar bar=new JMenuBar();
        JMenu fuente=new JMenu("Fuente");
        JMenu estilo=new JMenu("estilo");
        JMenu tamagno=new JMenu("tamaño");

        //añadir todo a la barra || añadir la barra al panel
        bar.add(fuente);
        bar.add(estilo);
        bar.add(tamagno);
        panelMenu.add(bar);
        add(panelMenu,BorderLayout.NORTH);

        JTextPane paneTxt=new JTextPane();
        add(paneTxt,BorderLayout.CENTER);

        JPopupMenu emergente=new JPopupMenu();
        JMenuItem menu1=new JMenuItem("opcion 1");
        JMenuItem menu2=new JMenuItem("opcion 2");
        JMenuItem menu3=new JMenuItem("opcion 3");
        JMenuItem menu4=new JMenuItem("opcion 4");
        emergente.add(menu1);
        emergente.add(menu2);
        emergente.add(menu3);
        emergente.add(menu4);
        paneTxt.setComponentPopupMenu(emergente);
    }
}
