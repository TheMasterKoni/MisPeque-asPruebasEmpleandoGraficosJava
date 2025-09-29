package org.example.Exepciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Video143Exepciones {
    public static void main(String[] args) {
        MarcoFallo m = new MarcoFallo();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFallo extends JFrame {
    MarcoFallo() {
        setBounds(400, 250, 400, 300);
        PanelFallo p = new PanelFallo();
        add(p);
        setVisible(true);
    }
}

class PanelFallo extends JPanel { // <-- CORREGIDO, ahora JPanel
    private Image imagen;

    PanelFallo() {
        try {
            imagen = ImageIO.read(new File("Amarillo.jpg"));
        } catch (IOException e) {
            System.out.println("No ha sido encontrada la imagen");
        }
    }

    @Override
    public void paintComponent(Graphics g) { // <-- CORREGIDO
        super.paintComponent(g);

        if (imagen != null) {
            int anchuraImagen = imagen.getWidth(this);
            int alturaImagen = imagen.getHeight(this);

            g.drawImage(imagen, 0, 0, null);

            for (int i = 0; i < 300; i++) {
                for (int j = 0; j < 200; j++) { // <-- CORREGIDO
                    g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen + i, alturaImagen + j);
                }
            }
        } else {
            g.drawString("NO se ha podido cargar la imagen", 10, 20);
        }
    }
}
