package ProgramacionGenerica;

public class ClaseGenericaVideo165<T> { //estos simbolos en la clase hace refencia a que la clase ahora es generica
    public ClaseGenericaVideo165(){
        primero=null;
    }
    public void setPrimero(T nuevoValor){
        primero=nuevoValor;
    }
    public T getPrimero(){
        return primero;
    }
    public static void soutTrabajador(ClaseGenericaVideo165<? extends Empleado> p){
        Empleado primero=p.getPrimero();
        System.out.println(primero);
    }
    private T primero;

}
