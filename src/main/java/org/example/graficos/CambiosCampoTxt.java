package org.example.graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CambiosCampoTxt {
    public static void main(String[] args) {
        MarcoCambios miMarco = new MarcoCambios();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoCambios extends JFrame{
   public MarcoCambios(){
       setBounds(500,500,400,400);
       PanelCambios miPanel=new PanelCambios();
       add(miPanel);

       setTitle("Cambios en campo de texto");
       setVisible(true);

   }
}
class PanelCambios extends JPanel{
    public PanelCambios(){
        JTextField miCampo = new JTextField(20);
        EscuchaCampoTxt miTxt=new EscuchaCampoTxt();
        Document miDoc=miCampo.getDocument();
                                //se debe de crear dicha instancia ya que dicha clase esta a la escucha y posee la interfaz
        miDoc.addDocumentListener(miTxt);//metodo para poner el documento a la escucha
        add(miCampo);
    }
    //NOVEDAD, LA CLASE RECEPTORA QUE IMPLEMENTA DOCUMENTLISTENER
    private class EscuchaCampoTxt implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("has introducido texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("has eliminado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}