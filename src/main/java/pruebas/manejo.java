package pruebas;

import javax.swing.*;
import java.awt.*;

public class manejo extends JFrame{
    public manejo(){
        setBounds(400,250,500,400);

        panel1=new JPanel(new BorderLayout());

        panel1.add(koni, BorderLayout.SOUTH);
        add(panel1);
        setVisible(true);
    }
    private JPanel panel1;
    private JButton koni;
    private JPanel scroll;
}
