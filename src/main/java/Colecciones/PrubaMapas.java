package Colecciones;
import java.util.*;
public class PrubaMapas {
    public static void main(String[] args) {
        HashMap<String,Empleado> personal=new HashMap<String,Empleado>();
        personal.put("1",new Empleado("Koni"));
        personal.put("2",new Empleado("Dana"));
        personal.put("3",new Empleado("Jorjo"));
        System.out.println(personal);
        personal.remove("3");
        System.out.println(personal);

        personal.put("2",new Empleado("Angie"));
        System.out.println(personal); //si se repite el valor se remplaza
        System.out.println();
        personal.put("2",new Empleado("Dana"));
        System.out.println(personal);

        System.out.println(personal.entrySet());
        for (Map.Entry<String,Empleado> m:personal.entrySet()){
            String clave=m.getKey();
            Empleado valor=m.getValue();
            System.out.println("Clave= "+clave+" valor= "+valor);
        }
    }
}
class Empleado{
    public Empleado(String nom){
        nombre=nom;
        sueldo=2000;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" con sueldo de: "+sueldo;
    }

    private String nombre;
    private double sueldo;
}
