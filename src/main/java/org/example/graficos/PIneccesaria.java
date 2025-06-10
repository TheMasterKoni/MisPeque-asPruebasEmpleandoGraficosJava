package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PIneccesaria {
    public static void main(String[] args) {
        MarcoInecesario miMarco = new MarcoInecesario();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoInecesario extends JFrame {
    public MarcoInecesario() {
        setTitle("Adivina el Número");
        setBounds(400, 250, 600, 500);
        PanelInecesario miPanel = new PanelInecesario();
        add(miPanel);
        setVisible(true);
    }
}

class PanelInecesario extends JPanel {

    public PanelInecesario() {
        setLayout(new BorderLayout());

        // Panel superior
        JPanel subPanel = new JPanel(new FlowLayout());

        JLabel txt = new JLabel("Intenta adivinar el número (1-100):");
        subPanel.add(txt);

        numero = new JTextField(10);
        subPanel.add(numero);

        adivinar = new JButton("Adivinar");
        adivinar.addActionListener(new OyenteInnecesario());
        subPanel.add(adivinar);

        add(subPanel, BorderLayout.NORTH);

        // Mensaje de resultado en el centro
        mayorMenor = new JLabel(" ", JLabel.CENTER);
        mayorMenor.setFont(new Font("Arial", Font.BOLD, 18));
        add(mayorMenor, BorderLayout.CENTER);

        // Inicializa el número aleatorio
        generarNuevoNumero();
    }

    class OyenteInnecesario implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int numValue = Integer.parseInt(numero.getText());

                if (numValue > ramdon) {
                    mayorMenor.setText("El número es más bajo");
                } else if (numValue < ramdon) {
                    mayorMenor.setText("El número es más alto");
                } else {
                    mayorMenor.setText("¡Correcto! Se ha generado un nuevo número.");
                    generarNuevoNumero(); // Reinicia el juego
                }

            } catch (NumberFormatException ex) {
                mayorMenor.setText("Por favor, ingresa un número válido.");
            }

            numero.setText(""); // Limpia el campo de texto
        }
    }

    private void generarNuevoNumero() {
        ramdon = (int) (Math.random() * 100 + 1);
    }

    private JTextField numero;
    private int ramdon;
    private JLabel mayorMenor;
    private JButton adivinar;
}
