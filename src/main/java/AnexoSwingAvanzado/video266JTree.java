package AnexoSwingAvanzado;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
/*
NOTA ME SALTE JList
JScrollPane
 */

public class video266JTree {
    public static void main(String[] args) {
        marco m=new marco();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class marco extends JFrame{
    public marco(){
        setTitle("Arbol Sencillo");
        setBounds(350,300,600,600);

        //CREAMOS EL OBJ RAIZ (PADRE) // PAIS QUE ES HIJO DE ESTA
        DefaultMutableTreeNode raiz=new DefaultMutableTreeNode("Mundo");
        DefaultMutableTreeNode pais=new DefaultMutableTreeNode("España");
        DefaultMutableTreeNode comunidad=new DefaultMutableTreeNode("Madrid");
        DefaultMutableTreeNode mostoles=new DefaultMutableTreeNode("Mostoles");
        DefaultMutableTreeNode alcobendas=new DefaultMutableTreeNode("Alcobendas");



        DefaultMutableTreeNode santillanaDelMar=new DefaultMutableTreeNode("Santillana del mar");

        // COMO CAMOS DE FORMA LOGICA QUE LA RAIZ(DONDE PARTE TODO) TENDRA A PAISES POR DEJABAJO DE EL
        raiz.add(pais);
        pais.add(comunidad);

        comunidad.add(mostoles);
        comunidad.add(alcobendas);
        comunidad=new DefaultMutableTreeNode("Cantaria");
        pais=new DefaultMutableTreeNode("Alemania");
        raiz.add(pais);
        comunidad.add(santillanaDelMar);

        //UTILIZACION DEL METODO
        creaArboles("Alemania","Baviera");

        JTree arbol=new JTree(raiz);
        PanelArbol panel=new PanelArbol(arbol);
        add(panel);
        setVisible(true);
    }
    public void creaArboles(String arbol,String nodo){
        DefaultMutableTreeNode raiz=new DefaultMutableTreeNode(arbol);
        DefaultMutableTreeNode hijo=new DefaultMutableTreeNode(nodo);

        raiz.add(hijo);
    }
}
class PanelArbol extends JPanel{
    public PanelArbol(JTree miarbol){
        setLayout(new BorderLayout());
        add(miarbol,BorderLayout.NORTH);

    }
}