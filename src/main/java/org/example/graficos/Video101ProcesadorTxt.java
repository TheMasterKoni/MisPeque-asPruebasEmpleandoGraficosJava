package org.example.graficos;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/*Pracica guida: video 101,102,103,104 .... video 114 y 115

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
        setBounds(440,250,600,540);
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

          configuraMenu("Negrita","Estilo","",Font.BOLD,10,"rojo.jpg");
          configuraMenu("Cursiva","Estilo","",Font.ITALIC,10,"Azul.jpg");

        ButtonGroup grupoTamagno=new ButtonGroup();

        JRadioButtonMenuItem t12=new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem t16=new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem t20=new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem t24=new JRadioButtonMenuItem("24");

        t12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));

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


        JPopupMenu emergente=new JPopupMenu();
        JCheckBoxMenuItem menu1=new JCheckBoxMenuItem("negrita");
        menu1.addActionListener(new StyledEditorKit.BoldAction());
        JCheckBoxMenuItem menu2=new JCheckBoxMenuItem("cursiva");
        menu2.addActionListener(new StyledEditorKit.ItalicAction());

        emergente.add(menu1);
        emergente.add(menu2);
        area.setComponentPopupMenu(emergente);

        bar=new JToolBar();
        gestionaBarra("rojo.jpg").addActionListener(new StyledEditorKit.BoldAction());
        gestionaBarra("Amarillo.jpg").addActionListener(new StyledEditorKit.ItalicAction());
        bar.addSeparator();
        gestionaBarra("Azul.jpg").addActionListener(new StyledEditorKit.AlignmentAction("izquirda",0));
        gestionaBarra("Amarillo.jpg").addActionListener(new StyledEditorKit.AlignmentAction("centrado",1));
        gestionaBarra("Azul.jpg").addActionListener(new StyledEditorKit.AlignmentAction("derecha",2));
        gestionaBarra("rojo.jpg").addActionListener(new StyledEditorKit.AlignmentAction("justificado",3));
        bar.addSeparator();
        gestionaBarra("Azul.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Azul",Color.BLUE));
        gestionaBarra("rojo.jpg").addActionListener(new StyledEditorKit.ForegroundAction("rojo",Color.RED));
        gestionaBarra("Amarillo.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo",Color.YELLOW));
        bar.setOrientation(1);
        add(bar,BorderLayout.WEST);
    }
    public JButton gestionaBarra(String ruta){
        JButton boton=new JButton(new ImageIcon(ruta));
        bar.add(boton);
        return boton;
    }
    /* metodo que nos permite,agregar los Item a sus menus de una manera mas optimizada y eficas
    el primer argumento hace referencia al tipo de letra("arail,courier,verdana"),el segundo argumento a el menu del cual
    va a corgar,el tercero al a la referencia si es negrita o cursiva y por ultimo el tamaño
     */
    public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tan, String rutaIcono) {
        JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(rutaIcono));

        // Verifica si es el menú Fuente
        if (menu.equals("Fuente")) {
            fuente.add(elemMenu);

            if (tipoLetra.equals("Arial")) {
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Arial"));
            } else if (tipoLetra.equals("Courier")) {
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Courier"));
            } else if (tipoLetra.equals("Verdana")) {
                elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("", "Verdana"));
            }
        }

        // Verifica si es el menú Estilo
        else if (menu.equals("Estilo")) {
            estilo.add(elemMenu);

            if (estilos == Font.BOLD) {
                elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                elemMenu.addActionListener(new StyledEditorKit.BoldAction());
            } else if (estilos == Font.ITALIC) {
                elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
            }
        }

        // Verifica si es el menú Tamaño (si decides usarlo más adelante)
        else if (menu.equals("Tamaño")) {
            tamagno.add(elemMenu);
            elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("", tan));
        }
    }

    private JTextPane area;
    JMenu fuente,estilo,tamagno;
    private JLabel getSout;
    JButton nBar,cBar,subBar,azulBar,rojoBar,AmarilloBar,izquierda,centrado,derecha,justificado;
    JToolBar bar;
}
