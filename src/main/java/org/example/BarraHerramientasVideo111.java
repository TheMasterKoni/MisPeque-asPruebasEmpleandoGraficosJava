package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BarraHerramientasVideo111 {
    public static void main(String[] args) {
        MarcoBarra miMarco = new MarcoBarra();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Clase marco principal
class MarcoBarra extends JFrame {
    public MarcoBarra() {
        setBounds(600, 350, 600, 300);
        setTitle("Marco con barras");

        // Panel central
        PanelBarra lamina = new PanelBarra();
        add(lamina);
        setVisible(true);

        // Acciones compartidas entre menú y barra
        Action actionAzul = new AccionColor("Azul", new ImageIcon("Azul.JPG"), Color.BLUE, lamina);
        Action actionAmarillo = new AccionColor("Amarillo", new ImageIcon("Amarillo.JPG"), Color.YELLOW, lamina);
        Action actionRojo = new AccionColor("Rojo", new ImageIcon("rojo.JPG"), Color.RED, lamina);

        ImageIcon lo=new ImageIcon("cappi.jpg");
        Image image=lo.getImage().getScaledInstance(40,35,Image.SCALE_SMOOTH);

        Action exit=new AbstractAction("Salir",new ImageIcon(image)) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        // Menú
        JMenu menu = new JMenu("Color");
        menu.add(actionAzul);
        menu.add(actionAmarillo);
        menu.add(actionRojo);

        JMenuBar bar = new JMenuBar();
        bar.add(menu);
        setJMenuBar(bar);

        // Barra de herramientas
        JToolBar toolBar = new JToolBar();
        toolBar.add(actionAzul);
        toolBar.add(actionAmarillo);
        toolBar.add(actionRojo);
        toolBar.addSeparator();;
        toolBar.add(exit);
        add(toolBar, BorderLayout.NORTH);



    }
}

// Panel donde se pintan los colores y se ponen botones
class PanelBarra extends JPanel {

    public PanelBarra() {
        // Acciones locales
      /*  AccionColor AccionAmarillo = new AccionColor("Amarillo", new ImageIcon("Amarillo.JPG"), Color.YELLOW, this);
        AccionColor AccionAzul = new AccionColor("Azul", new ImageIcon("Azul.JPG"), Color.BLUE, this);
        AccionColor AccionRojo = new AccionColor("Rojo", new ImageIcon("rojo.JPG"), Color.RED, this);

        add(new JButton(AccionAmarillo));
        add(new JButton(AccionAzul));
        add(new JButton(AccionRojo));

        // Mapeo de teclas
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");

        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", AccionAmarillo);
        mapaAccion.put("fondo_azul", AccionAzul);
        mapaAccion.put("fondo_rojo", AccionRojo);*/
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("ctrl A = Color Amarillo", 20, 20);
        g.drawString("ctrl B = Azul", 20, 40);
        g.drawString("ctrl R = Rojo", 20, 60);
    }
}

// Clase de acción general, ahora independiente
class AccionColor extends AbstractAction {
    private final JPanel panel;

    public AccionColor(String nombre, Icon icono, Color color, JPanel panel) {
        this.panel = panel;
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
        putValue("color_de_fondo", color);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = (Color) getValue("color_de_fondo");
        panel.setBackground(c);
        System.out.println("Nombre: " + getValue(Action.NAME) + " - Descripción: " + getValue(Action.SHORT_DESCRIPTION));
    }
}
