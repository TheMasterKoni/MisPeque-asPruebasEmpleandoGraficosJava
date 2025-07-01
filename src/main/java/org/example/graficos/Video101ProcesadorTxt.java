package org.example.graficos;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Pracica guida: video 101,102,103,104 y 105

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
        JPanel subPanel=new JPanel();

        JMenuBar barra=new JMenuBar();
        fuente=new JMenu("Fuente");
        estilo=new JMenu("Estilo");
        tamagno=new JMenu("Tamaño");

        configuraMenu("arial","Fuente","Arial",9,10);
        configuraMenu("courier","Fuente","Courier",9,10);
        configuraMenu("verdana","Fuente","Verdana",9,10);
        //----------------------------------------------------------------------

        configuraMenu("Negrita","Estilo","",Font.BOLD,10);
        configuraMenu("Cursiva","Estilo","",Font.ITALIC,10);
        //----------------------------------------------------------------------
        //valor 9 no coresponde a nada valor 1 corresponder a negrita
        configuraMenu("12","Tamaño","",9,12);
        configuraMenu("16","Tamaño","",9,16);
        configuraMenu("20","Tamaño","",9,20);
        configuraMenu("24","Tamaño","",9,24);

        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamagno);

        subPanel.add(barra);

        JPanel panelDerecha=new JPanel();
        getSout=new JLabel("");
        panelDerecha.add(getSout);

        add(subPanel,BorderLayout.NORTH);


        area=new JTextPane();
        add(area,BorderLayout.CENTER);
        add(panelDerecha,BorderLayout.EAST);
    }
    /* metodo que nos permite,agregar los Item a sus menus de una manera mas optimizada y eficas
    el primer argumento hace referencia al tipo de letra("arail,courier,verdana"),el segundo argumento a el menu del cual
    va a corgar,el tercero al a la referencia si es negrita o cursiva y por ultimo el tamaño
     */
    public void configuraMenu(String rotulo,String menu,String tipoLetra,int estilos,int tan){
        JMenuItem elemMenu=new JMenuItem(rotulo);
        if (menu=="Fuente"){
            fuente.add(elemMenu);

            if (tipoLetra=="Arial"){
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("","Arial"));
            }else if (tipoLetra=="Courier"){
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("","Courier"));
            }
            else if (tipoLetra=="Verdana"){
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("","Verdana"));
            }

        } else if (menu=="Estilo") {
            estilo.add(elemMenu);
            if (estilos==Font.BOLD) {
                elemMenu.addActionListener(new StyledEditorKit.BoldAction());
            } else if (estilos==Font.ITALIC) {
                elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
            }

        }else if(menu=="Tamaño"){
            tamagno.add(elemMenu);
            elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("",tan));
        }

    }



    private JTextPane area;
    JMenu fuente,estilo,tamagno;
    Font letras;
    private JLabel getSout;
}
