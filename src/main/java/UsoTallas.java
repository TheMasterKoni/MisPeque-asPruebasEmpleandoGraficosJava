import java.util.*;
public class UsoTallas {
   // enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE}
    enum Talla{
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        private Talla(String abreviatura){
            this.abreviatura=abreviatura;
        }
        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    }

    public static void main(String[] args) {
       /* Talla s=Talla.MINI;
        Talla M=Talla.MEDIANO;
        Talla L=Talla.GRANDE;
        Talla xl=Talla.MUY_GRANDE;*/

        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe una talla: MINI,MEDIANO,GRANDE,MUY GRANDE");
        String entrada2=entrada.next().toUpperCase();

        Talla laTalla=Enum.valueOf(Talla.class,entrada2);//ESTA PARTE ES UNA GRAN NOVEDAD PORQUE NO ESTAMOS UTILIZANDO EL ESTADO INICIAL DEL CONTRUCTOR
        System.out.println("Talla= "+laTalla);
        System.out.println("abreviatura= "+laTalla.dameAbreviatura());
    }
}
