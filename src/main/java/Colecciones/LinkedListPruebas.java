package Colecciones;
import java.util.*;
public class LinkedListPruebas {
    public static void main(String[] args) {
        LinkedList<String> personas=new LinkedList<String>();
        personas.add("Koni");
        personas.add("Pepe");
        personas.add("Angie");
        personas.add("Dana");
        System.out.println(personas.size());
        ListIterator<String> iterator=personas.listIterator();
        iterator.next();
        iterator.add("Juan");   
        for (String p:personas){
            System.out.println(p);
        }
    }
}
