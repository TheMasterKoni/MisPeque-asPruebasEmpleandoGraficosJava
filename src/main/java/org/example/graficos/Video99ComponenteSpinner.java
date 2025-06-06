package org.example.graficos;

import javax.swing.*;
import java.awt.*;
/*vamos a crear un Spinner, pero con los valores invertidos, metodos nuevos "getNextValue" valor siguiente
y getPreviousValue valor previo
y en ADICION, UTILIZAMOS POR PRIMERA VES, LAS CLASES INTERNAS ANONIMAS(NO NOMBRE)
 */
public class Video99ComponenteSpinner {
    public static void main(String[] args) {
        MarcoSpinner miMarco=new MarcoSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoSpinner extends JFrame{
    public MarcoSpinner(){
        setBounds(400,250,500,400);
        PanelSpinner miPanel=new PanelSpinner();
        add(miPanel);
        setVisible(true);
    }
}
class PanelSpinner extends JPanel{
    public PanelSpinner(){
        String[] tipoLetra=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //  JSpinner spinner=new JSpinner(new SpinnerDateModel());crear spinner de tipo fecha
        JSpinner spinner=new JSpinner(new SpinnerListModel(tipoLetra));
        JSpinner spinner2=new JSpinner(new SpinnerNumberModel(5,0,10,2));
                                        //clase interna anonima ⬇️⬇️
        JSpinner miSpiner =new JSpinner(new SpinnerNumberModel(5,0,10,1){
                    public Object getNextValue(){//sobre escribimos el metodo que nos da el siguiente valor del numero
                    return super.getPreviousValue();//y con este metodo hacemos que tenga el efecto contrario al de elevar el valor numerico
                        }
                    public Object getPreviousValue(){
                    return super.getNextValue();
                }
        });
        Dimension d=new Dimension(200,20);
        spinner.setPreferredSize(d); //metodo para modificar las dimensiones del campo de txt
        JLabel inverse=new JLabel("todas los tipos de letras del SYSTEM...");
        add(inverse);
        add(spinner);
        JLabel doble=new JLabel("2 en 2");
        add(doble);
        add(spinner2);
        JLabel inverse2=new JLabel("inverso");
        add(inverse2);
        add(miSpiner);
    }
  /*  private class MiModeloJSpinner extends SpinnerNumberModel{
        public MiModeloJSpinner(){
            super(5,0,10,1);//el super es para llamar a la clase padre "SpinnerNumberModel"

        }
        public Object getNextValue(){//sobre escribimos el metodo que nos da el siguiente valor del numero
            return super.getPreviousValue();//y con este metodo hacemos que tenga el efecto contrario al de elevar el valor numerico
        }
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    }*/
}