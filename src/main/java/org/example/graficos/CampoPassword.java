package org.example.graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/*vamos a crear un marco, que tenga en su interior 4 etiquetas, un JLabel que diga usuario,
una caja de texto, donde escribir el usuario,y un ultimo par de JLabel y JTextField,una que diga contraseña,
y otra para escribir la contraseña (JTextFiel)

creamos un boton con distribucion BorderLayout para que este en la parte sur del marco

tambien simuaremos un comportamiento de contraseña real
 */
public class CampoPassword {
    public static void main(String[] args) {
        MarcoPassword miMarco=new MarcoPassword();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoPassword extends JFrame{
    public MarcoPassword(){
        setBounds(600,350,300,300);
        setTitle("Campo contraseña");

        PanelPassword password=new PanelPassword();
        add(password);

        setVisible(true);
    }
}
class PanelPassword extends JPanel{
    public PanelPassword(){
        setLayout(new BorderLayout());//distribucion que va a odtener nuestra segunda lamina,(estara en el norte)
        JPanel panelSuperior=new JPanel();//creamos seguda lamina
        panelSuperior.setLayout(new GridLayout(2,2));
        add(panelSuperior,BorderLayout.NORTH);

        JLabel user=new JLabel("usuario");
        JLabel password=new JLabel("constraseña");
        JTextField nameUser =new JTextField(10);

        oyentePassword mievento=new oyentePassword();
        contraseña=new JPasswordField();
        contraseña.getDocument().addDocumentListener(mievento);/* instanciamos en la linea 45 al obj oyente, asignamos valor
        a nuestro campo de clase, en la linea 47 optenemos el valor del Documento y por ultimo ponemos al campo de clase contrase
        ña a la escucha*/

        panelSuperior.add(user);//añadimos los elementos a nuestro segundo panel
        panelSuperior.add(nameUser);
        panelSuperior.add(password);
        panelSuperior.add(contraseña);

        JButton enviar=new JButton("enviar");//creamos el boton en la lamina principal, para que este con distribucion Border..
        add(enviar,BorderLayout.SOUTH);

    }
    private class oyentePassword implements DocumentListener{
        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] contrasena;//creamos array
            contrasena=contraseña.getPassword();//metodo que nos optiene una cadena de de tipo char, del componente, donde ...

            if (contrasena.length<8 || contrasena.length >12){
                contraseña.setBackground(Color.RED);
            } else{
                contraseña.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char[] contrasena;//creamos array
            contrasena=contraseña.getPassword();//metodo que nos optiene una cadena de de tipo char, del componente, donde ...

            if (contrasena.length<8 || contrasena.length >12){
                contraseña.setBackground(Color.RED);
            } else{
                contraseña.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }

    JPasswordField contraseña;
}
