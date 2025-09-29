package Colecciones;

import java.util.Objects;

public class Libros {
    public Libros(String titulo,String autor,int ISBN){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
    }
    public void getDatos(){
        System.out.println("El titulo es: "+titulo+" el autor es: "+autor+" y su ISBN es: "+ISBN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libros)) return false;
        Libros libros = (Libros) o;
        return ISBN == libros.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    /*public boolean equals(Object obj) {
        if (obj instanceof Libros ){    //instanceof quiere decir instancia de
            Libros otro=(Libros) obj;
            if (this.ISBN==otro.ISBN){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }*/



    private String titulo;
    private String autor;
    private int ISBN;
}
