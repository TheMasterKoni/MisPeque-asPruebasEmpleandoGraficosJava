package Colecciones;

public class UsoLibros {
    public static void main(String[] args) {
        Libros l1=new Libros("49 leyes","koni",777);
        Libros l2=new Libros("49 leyes","koni",777);
        // l1=l2; hace referencia a la misma memoria
        if (l1.equals(l2)){
            System.out.println("es el mismo libro");
            System.out.println(l1.hashCode());
            System.out.println(l2.hashCode());
        }else{
            System.out.println("no es el mismo libro");
            System.out.println(l1.hashCode());
            System.out.println(l2.hashCode());
        }

    }
}
