package ProgramacionGenerica;

public class UsoClaseGenerica {
    public static void main(String[] args) {
        ClaseGenericaVideo165<String> una=new ClaseGenericaVideo165<String>();
        una.setPrimero("Koni");
        System.out.println(una.getPrimero());
        Persona persona=new Persona("Meri");
        ClaseGenericaVideo165<Persona> dos= new ClaseGenericaVideo165<Persona>();
        dos.setPrimero(persona);
        System.out.println(dos.getPrimero().toString());
    }
}
class Persona{
    public Persona(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    private String nombre;
}