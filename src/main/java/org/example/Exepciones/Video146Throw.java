package org.example.Exepciones;
import javax.swing.JOptionPane;
public class Video146Throw {
    public static void main(String[] args) {
        String mail = JOptionPane.showInputDialog("type the gmail");
        try {
            VerificaGMail(mail);
        }catch (MailErroneo e){
            System.out.println("Error");
            e.printStackTrace();//con este metodo imprimimos la llamda al error
            //es decir que a pesar de que el programa se ejecute nos da pistas de que clase proviene el error
        }
        }
    static int arroba = 0;
    static boolean point = false;
        public static void VerificaGMail(String mail) throws MailErroneo{
            if (mail.length() <= 3) {
                throw new MailErroneo("El mial es demaciado corto"); //acabamos de lanzar un error manualmente, con un if
            }
            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;
                }
                if (mail.charAt(i) == '.') {
                    point = true;
                }
            }
            if (arroba == 1 && point == true) {
                System.out.println("the mail is true");
            } else {
                System.out.println("the mail is uncorrec");

            }
        }
    }
class MailErroneo extends Exception{
    public MailErroneo(){

    }
    public MailErroneo(String mjError){ // este metodo es para personalisar nuestro mensaje de error
        super(mjError);// este super hace referenci a nombrar el porque del error
    }
}
