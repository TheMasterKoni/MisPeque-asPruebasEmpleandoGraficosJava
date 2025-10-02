package AnexoSwingAvanzado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class losJTable {
    public static void main(String[] args) {
        marcoT m=new marcoT();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class marcoT extends JFrame{
    public marcoT(){
        setBounds(250,250,500,500);
        setTitle("Los planetas");
        JTable tablaPlanetas=new JTable(datosFila,nombresColumnas);

        add(new JScrollPane(tablaPlanetas),BorderLayout.CENTER);
        JButton btnImprimir=new JButton("Imprimir tabla");
        btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tablaPlanetas.print();
                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });
        JPanel panel=new JPanel();
        panel.add(btnImprimir);
        add(panel,BorderLayout.SOUTH);
        setVisible(true);
    }
    private String [] nombresColumnas={"Nombre","Radio","Lunas","Gaseoso"};
    private Object [][] datosFila={
            {"Mercurio",244,0,false},
            {"Venus",6052.0,0,0,false},
            {"Tierra",6378.0,1,false},
            {"Marte",3397.0,2,false},
            {"Jupiter",71492.0,2,true},
            {"Saturno",60268.0,18,true},
            {"Urano",25559.0,17,true},
            {"Neptuno",24766.0,8,true},
            {"Plutón",1137.0,1,false}
    };
}
