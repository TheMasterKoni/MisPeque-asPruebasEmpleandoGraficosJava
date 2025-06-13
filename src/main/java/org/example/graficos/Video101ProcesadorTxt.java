package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Pracica guida: video 101,102,103

 */
public class Video101ProcesadorTxt {
    public static void main(String[] args) {
        MarcoProcesador miMarco=new MarcoProcesador();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoProcesador extends JFrame{
    public MarcoProcesador(){
        setTitle("KoniWord");
        setBounds(440,250,600,500);
        PanelProcesador miProcesaro=new PanelProcesador();
        add(miProcesaro);
        setVisible(true);
    }
}
class PanelProcesador extends JPanel{
    public PanelProcesador(){
     setLayout(new BorderLayout());
     JPanel subPanel=new JPanel(new BorderLayout());

     JMenuBar barra=new JMenuBar();
     JMenu fuente=new JMenu("Fuente");
     JMenu stilo=new JMenu("Estilo");
     JMenu tamano=new JMenu("Tamaño");

     barra.add(fuente);
     barra.add(stilo);
     barra.add(tamano);

     JMenuItem arial =new JMenuItem("Arial");
     arial.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
             area.setFont(new Font("arial",Font.PLAIN,12));
         }
     });
     JMenuItem courier=new JMenuItem("courier");
     courier.addActionListener(new EventoProcesador());
     JMenuItem verdana=new JMenuItem("Verdana");
        arial.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("verdana",Font.PLAIN,12));
            }
        });

     JMenuItem negrita=new JMenuItem("negrita");
     JMenuItem curiva=new JMenuItem("cursica");

     JMenuItem doce=new JMenuItem("12");
     JMenuItem catorce=new JMenuItem("14");
     JMenuItem diesicies=new JMenuItem("16");
     JMenuItem diesiocho=new JMenuItem("18");
     JMenuItem veinte=new JMenuItem("20");

     tamano.add(doce);
     tamano.add(catorce);
     tamano.add(diesicies);
     tamano.add(diesiocho);
     tamano.add(veinte);
     stilo.add(negrita);
     stilo.add(curiva);
     fuente.add(arial);
     fuente.add(courier);
     fuente.add(verdana);

     add(barra,BorderLayout.NORTH);

     area =new JTextPane();
     subPanel.add(area);
     add(subPanel,BorderLayout.CENTER);
    }
    private class EventoProcesador implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("courie",Font.PLAIN,12));
        }
    }
    private JTextPane area;
}
