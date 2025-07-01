package org.example.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Pracica guida: video 101,102,103,104 y 105

 */
public class ProcesadorDeTextoVideo101 {
    public static void main(String[] args) {
        MProcesador miMarco=new MProcesador();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MProcesador extends JFrame{
    public MProcesador(){
        setTitle("KoniWord");
        setBounds(440,250,600,500);
        PProcesador miProcesaro=new PProcesador();
        add(miProcesaro);
        setVisible(true);
    }
}
class PProcesador extends JPanel{
    public PProcesador(){
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
        } else if (menu=="Estilo") {
            estilo.add(elemMenu);
        }else if(menu=="Tamaño"){
            tamagno.add(elemMenu);
        }
        elemMenu.addActionListener(new GestionaEventos(rotulo,tipoLetra,estilos,tan));
    }
    private class GestionaEventos implements ActionListener{
        String tipoTxt,menu;//una gestiona el tipoLetra, meintras que la otra detecta el mun pulsado
        int estiloLetra,tamagnoLetra;//para el estilo de la letra (Font.BOLD), y para el tamaño de esta
        GestionaEventos(String elemto,String text2,int stilo2,int tanLetra){//constructor para deectar el menu pulsado
            tipoTxt=text2;
            estiloLetra=stilo2;
            tamagnoLetra=tanLetra;
            menu=elemto;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            letras=area.getFont();

            if(menu.equals("Arial") || menu.equals("Courier") || menu.equals("Verdana")){
                estiloLetra = letras.getStyle();
                tamagnoLetra = letras.getSize();

            } else if (menu=="Cursiva" || menu=="Negrita" ) {
                if (letras.getStyle()==1 || letras.getStyle()==2){
                    estiloLetra=3;
                }// para que admita un tipo de letra mas un estilo de letra

                tipoTxt=letras.getFamily();//getFamily, se refiero al estilo, negrita o curiva o ngrtita + cursiva
                tamagnoLetra=letras.getSize();//para que no se modifique el tamaño que halla
            } else if (menu == "12" || menu == "16" || menu == "20" || menu=="24") {
                estiloLetra=letras.getStyle();
                tipoTxt=letras.getFamily();
            }
            area.setFont(new Font(tipoTxt,estiloLetra,tamagnoLetra));
            getSout.setText("tipo :"+tipoTxt+" estilo :"+String.valueOf(estiloLetra)+" tamaño letra :"+String.valueOf(tamagnoLetra));
        }
    }
    private JTextPane area;
    JMenu fuente,estilo,tamagno;
    Font letras;
    private JLabel getSout;
}
