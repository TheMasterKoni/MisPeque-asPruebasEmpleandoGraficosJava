package org.example.VentanaEmergente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//video 122
public class CuadrosDialogoVideo121 {
    public static void main(String[] args) {
      MarcoDiaogo m=new MarcoDiaogo();
      m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoDiaogo extends JFrame{
    public MarcoDiaogo(){
        setBounds(300,250,600,400);
        setTitle("primer cuadro de dialogo");
        PanelD p=new PanelD();
        add(p);
        setVisible(true);
    }
}
class PanelD extends JPanel{
    public PanelD(){
        //iniciacion de btns
        btn=new JButton("boton 1");
        btn1=new JButton("boton 2");
        btn2=new JButton("boton 3");
        btn3=new JButton("boton 4");

        //poner btns a la escucha
        btn.addActionListener(new AccionBotones());
        btn1.addActionListener(new AccionBotones());
        btn2.addActionListener(new AccionBotones());
        btn3.addActionListener(new AccionBotones());

        //añadir panel btns
        add(btn);
        add(btn1);
        add(btn2);
        add(btn3);
    }
    private class AccionBotones implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btn){
                //los diferenctes constructores de este metodo, hacen referencia a la cantidad de personalisacion de nuestra ventana emergente
                //el param meesage type hace referencia al icono y va desde -1 a 3
                //JOptionPane.showMessageDialog(PanelD.this,"mensaje de prueba");
                JOptionPane.showMessageDialog(PanelD.this,"mensaje prueba","Advertencia",0);
            } else if (e.getSource()==btn1) {
                //los demas constructores de este metodo son exactamente igual que el anterior
               JOptionPane.showInputDialog("Introduce nombre");
            } else if (e.getSource()==btn2) {
                //este ultimo parametro, hace referencia a al numero de opciones que apareceran en el cuadro emergente
               JOptionPane.showConfirmDialog(PanelD.this,"elige la opcion","V Confirmar",2);
            }else {
                //ver los parametros en la API
               JOptionPane.showOptionDialog(PanelD.this,"elige","V Opciones",1,1,null,null,null);
            }

        }
    }

    JButton btn,btn1,btn2,btn3;
}