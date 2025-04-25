import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;


public class PruebaTenporizador2 {
    public static void main(String[] args) {
        Reloj miReloj=new Reloj();
        miReloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null,"presiona aceptar para finalisar el programa");
        System.exit(0);

    }
}
class Reloj{

    public void enMarcha(int intervalo,final boolean sonido){
        class DameLaHora2 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora=new Date();
                System.out.println("te pongo la hora cada 3seg");
                if (sonido){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente=new DameLaHora2();
        Timer miTemporisador=new Timer(intervalo,oyente);
        miTemporisador.start();
    }

}