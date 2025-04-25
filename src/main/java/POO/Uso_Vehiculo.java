package POO;
import javax.swing.JOptionPane;
public class Uso_Vehiculo {
    public static void main(String[] args) {
       /* plataforma renault=new plataforma();
        System.out.println(renault.getDatosGenrales());

        renault.setColor(JOptionPane.showInputDialog("type the color of car"));
        System.out.println(renault.getColor());

        renault.setAsientos_cuero(JOptionPane.showInputDialog("select the correct option if car get chair of side si/no"));
        System.out.println(renault.getAsientosCuero());

        renault.setClimatizador(JOptionPane.showInputDialog("select the correct option if car get climatizador si/no"));
        System.out.println(renault.getCimatizador());

        System.out.println("the cost final of the plataforma is: "+renault.getPrecioPlataforma());
        System.out.println(renault.getSetPesoTotal());*/

        plataforma miCoche1=new plataforma();
        miCoche1.setColor("rojo");

        Furgoneta miFurgonera1=new Furgoneta(7,580  );
        miFurgonera1.setColor("azul");
        miFurgonera1.setAsientos_cuero("si");
        miFurgonera1.setClimatizador("si");

        System.out.println(miCoche1.getDatosGenrales()+" "+miCoche1.getColor());
        System.out.println(miFurgonera1.getDatosGenrales()+" "+miFurgonera1.dimeDatosFurgoneta()+" "+miFurgonera1.getColor());
    }
}
