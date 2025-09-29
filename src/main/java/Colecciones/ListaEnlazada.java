package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListaEnlazada {
    public static void main(String[] args) {
        LinkedList<String> paises=new LinkedList<String>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Péru");

        LinkedList<String> capitales=new LinkedList<String>();
        capitales.add("Madrig");
        capitales.add("Bogóta");
        capitales.add("DF");
        capitales.add("Lima");

        /*System.out.println(paises);
        System.out.println(capitales);*/

        ListIterator<String> iterator1=paises.listIterator();
        ListIterator<String> iterator2=capitales.listIterator();

        while (iterator2.hasNext()){
            if (iterator1.hasNext()){
                iterator1.next();
            }
            iterator1.add(iterator2.next());//esto quiere decir que al siguiente elemento de "iter2" lo agregas en "iter1"
        }
        System.out.println(paises); //ahora me fuciona los paises con las ciudades, gracias a las LinkedList
        iterator2=capitales.listIterator();
        while(iterator2.hasNext()){
            iterator2.next();
            if (iterator2.hasNext()){
                iterator2.next();
                iterator2.remove();
            }
        }
        System.out.println(capitales);
        paises.removeAll(capitales);//elimino la coleccion de las capitales
        System.out.println(paises);
    }

}
