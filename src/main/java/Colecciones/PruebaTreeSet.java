package Colecciones;
import java.util.*;
public class PruebaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ordeaPersonas=new TreeSet<String>();
        ordeaPersonas.add("Sandra");
        ordeaPersonas.add("Koni");
        ordeaPersonas.add("Dana");
        for (String r:ordeaPersonas){
            System.out.println(r);
        }
        Articulos primero=new Articulos(1,"primer articulo");
        Articulos segundo=new Articulos(243,"según articulo");
        Articulos tercero=new Articulos(3,"avenida vuelvas"); // le cambio el nombre por para que salga de primero

        TreeSet<Articulos> ordenaArticulos=new TreeSet<Articulos>();
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);
        for (Articulos a: ordenaArticulos) {
            System.out.println(a.getDescripcion());
        }

        //Articulos comparadorArtcilo=new Articulos();
       // TreeSet<Articulos> ordenaArticulos2= new TreeSet<Articulos>(comparadorArtcilo);

        TreeSet<Articulos> ordenaArticulos2= new TreeSet<Articulos>(new Comparator<Articulos>() {
            @Override
            public int compare(Articulos o1, Articulos o2) { //hecho con clase interna
                String descripcionA=o1.getDescripcion();
                String descripcionB=o2.getDescripcion();
                return descripcionA.compareTo(descripcionB);
            }
        });

        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);

        System.out.println();
        for (Articulos a:ordenaArticulos2){
            System.out.println(a.getDescripcion());
        }
    }
}
class Articulos implements Comparable<Articulos>{
    public Articulos(){

    }
  //  @Override
  /*  public int compare(Articulos o1, Articulos o2) {
        String descripcionA=o1.getDescripcion();

        String descripcionB=o2.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }*/

    public Articulos(int num, String descripcion){
        this.num=num;
        desc=descripcion;
    }
    @Override
    public int compareTo(Articulos o) {

        return num - o.num;
    }
    public String getDescripcion(){
        return desc;
    }
    private int num;
    private String desc;
}
class ComparadorArticulos implements Comparator<Articulos>{

    @Override
    public int compare(Articulos o1, Articulos o2) {
        String descripcionA=o1.getDescripcion();

        String descripcionB=o2.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }
}