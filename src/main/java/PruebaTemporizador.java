import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class PruebaTemporizador {
    public static void main(String[] args) {
        DameLaHora oyente=new DameLaHora();
        Timer miTemporizador=new Timer(5000,oyente);

        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"pulsa aceptar para detener");
        System.exit(0);
    }
}
class DameLaHora implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("te pongo la hora cada 5seg "+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}