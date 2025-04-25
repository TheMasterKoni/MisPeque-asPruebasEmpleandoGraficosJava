import javax.swing.JOptionPane;
import java.util.Scanner;

public class Acceso_aplicacion {
    public static void main(String[] args) {

       String clave = "novus";
       String pass = "";

        while (clave.equals(pass) == false) {
        pass = JOptionPane.showInputDialog("type the passport");
        if (clave.equals(pass) == false){
            System.out.println("the passport is wrong");
            }
        }
        System.out.println("the passport is correct  you must continiu ");
    }
}
