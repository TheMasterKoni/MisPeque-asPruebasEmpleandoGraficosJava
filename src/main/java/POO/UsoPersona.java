package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 9, 8);
        lasPersonas[1] = new Alumno("Ana Lope", "Biología");

        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
        }
    }
}

// Definición de la clase abstracta Persona (fuera del método main)
abstract class Persona {
    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;
}

class Empleado2 extends Persona {
    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        altaContrata = calendario.getTime();
        idSiguiente++;
        id=idSiguiente;
    }

    public String dameDescripcion() {
        return "Este empleado tiene un id= "+id+" con un sueldo de= " + sueldo;
    }

    public double dameSueldo() { // getter
        return sueldo;
    }

    public Date dameFechaContrato() { // getter
        return altaContrata;
    }

    public void subeSueldo(double porcentaje) { // setter
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private double sueldo;
    private Date altaContrata;
    private int id;
    private static int idSiguiente;
}

class Alumno extends Persona {
    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
    }

    public String dameDescripcion() {
        return "Este alumno está estudiando la carrera " + carrera;
    }

    private String carrera;
}
