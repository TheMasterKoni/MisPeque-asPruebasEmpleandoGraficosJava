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

        configuraMenu("arial","Fuente","Arial",9,10,"");
        configuraMenu("courier","Fuente","Courier",9,10,"");
        configuraMenu("verdana","Fuente","Verdana",9,10,"");
        //----------------------------------------------------------------------

       // configuraMenu("Negrita","Estilo","",Font.BOLD,10,"rojo.jpg");
        //configuraMenu("Cursiva","Estilo","",Font.ITALIC,10,"Azul.jpg");

        JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("negrita",new ImageIcon("main/java/org/example/graficos/grial.jpg"));
        JCheckBoxMenuItem cursica=new JCheckBoxMenuItem("Cursiva",new ImageIcon("main/java/org/example/graficos/saber.jpg"));

        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursica.addActionListener(new StyledEditorKit.ItalicAction());

        estilo.add(negrita);
        estilo.add(cursica);
        //----------------------------------------------------------------------
        //valor 9 no coresponde a nada valor 1 corresponder a negrita
       /* configuraMenu("12","Tamaño","",9,12,"");
        configuraMenu("16","Tamaño","",9,16,"");
        configuraMenu("20","Tamaño","",9,20,"");
        configuraMenu("24","Tamaño","",9,24,"");*/

        ButtonGroup grupoTamagno=new ButtonGroup();

        JRadioButton t12=new JRadioButton("12");
        JRadioButton t16=new JRadioButton("16");
        JRadioButton t20=new JRadioButton("20");
        JRadioButton t24=new JRadioButton("24");

        grupoTamagno.add(t12);
        grupoTamagno.add(t16);
        grupoTamagno.add(t20);
        grupoTamagno.add(t24);

        t12.addActionListener(new StyledEditorKit.FontSizeAction("",12));
        t16.addActionListener(new StyledEditorKit.FontSizeAction("",16));
        t20.addActionListener(new StyledEditorKit.FontSizeAction("",20));
        t24.addActionListener(new StyledEditorKit.FontSizeAction("",24));

        tamagno.add(t12);
        tamagno.add(t16);
        tamagno.add(t20);
        tamagno.add(t24);

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
    public void configuraMenu(String rotulo,String menu,String tipoLetra,int estilos,int tan,String rutaIcono){
        JMenuItem elemMenu=new JMenuItem(rotulo,new ImageIcon(rutaIcono));
        if (menu=="Fuente") {
            fuente.add(elemMenu);

            if (tipoLetra == "Arial") {
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Arial"));
            } else if (tipoLetra == "Courier") {
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Courier"));
            } else if (tipoLetra == "Verdana") {
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Verdana"));
            }

        }
    }



    private JTextPane area;
    JMenu fuente,estilo,tamagno;
    Font letras;
    private JLabel getSout;
}
