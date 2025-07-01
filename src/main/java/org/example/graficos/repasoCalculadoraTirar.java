package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class repasoCalculadoraTirar {
    public static void main(String[] args) {
        Marco marco=new Marco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Marco extends JFrame {
    public Marco() {
        setTitle("Calculadora");
        setBounds(500,300,450,300);
        PanelC panel = new PanelC();
        add(panel);
        setVisible(true);
    }
}
class PanelC extends JPanel{
    public PanelC(){
        setLayout(new BorderLayout());
        display=new JButton("");
        display.setEnabled(false);
        add(display,BorderLayout.NORTH);

        panel2=new JPanel();
        panel2.setLayout(new GridLayout(4,4));
        add(panel2,BorderLayout.CENTER);

        ActionListener insert=new IsertNum();
        ActionListener inserO=new GestionOperaciones();
        //ActionListener resul=new GestionDisplay2();

        ponerBotones("9",insert);
        ponerBotones("8",insert);
        ponerBotones("7",insert);
        ponerBotones("6",insert);
        ponerBotones("5",insert);
        ponerBotones("4",insert);
        ponerBotones("3",insert);
        ponerBotones("2",insert);
        ponerBotones("1",insert);
        ponerBotones("0",insert);
        ponerBotones(".",insert);

        ponerBotones("+",inserO);
        ponerBotones("*",inserO);
        ponerBotones("-",inserO);
        ponerBotones("/",inserO);
        ponerBotones("=",inserO);

        display2=new JButton();
        display2.setEnabled(false);
        panel3=new JPanel();
        panel3.add(display2);
        add(panel3,BorderLayout.WEST);

        lastOperation="=";
    }

    public void ponerBotones(String rotulo, ActionListener oyente){
        JButton btn=new JButton(rotulo);
        btn.addActionListener(oyente);
        this.panel2.add(btn);
    }
    private class IsertNum implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada=e.getActionCommand();
            display.getText();
            if (principio){
                display.setText("");
                principio=false;
            }
            display.setText(display.getText() + entrada);
            String getDisplay=display.getText();
            display2.setText(getDisplay);
        }
    }

    private class GestionOperaciones implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String operaciones=e.getActionCommand();
            principio=true;

            lastOperation=operaciones;
            calcular(Double.parseDouble(display.getText()));
        }
        public void calcular(double x) {
            if (lastOperation.equals("+")) {
                resultado += x;
            } else if (lastOperation.equals("-")) {
                resultado -= x;
            } else if (lastOperation.equals("=")) {
                resultado = x;
            } else if (lastOperation.equals("*")) {
                resultado *= x;
            } else if (lastOperation.equals("/")) {
                resultado /= x;
            }
            ecuasion=Double.toString(resultado);

            display.setText("" + resultado);
        }
    }
  private   JButton display;
  private  JPanel panel2;
  private   boolean principio;
  private String lastOperation;
  private double resultado;
  private JPanel panel3;
  private String ecuasion;
  private JButton display2;
}