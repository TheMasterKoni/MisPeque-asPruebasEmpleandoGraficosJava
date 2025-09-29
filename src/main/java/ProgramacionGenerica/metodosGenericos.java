package ProgramacionGenerica;

public class metodosGenericos {
    public static void main(String[] args) {
        String nombres[]={"Jose","Maria","Pepe"};
        System.out.println(MatrizGenerica.getMenor(nombres));

    }
}
class MatrizGenerica{
    public static <T extends Comparable> T getMenor(T[]a){ //hago que la var generica herede de Comparable para acceder al compareTo
      if (a==null || a.length==0){
          return null;
      }
      T elemMenor=a[0];
      for (int i=1;i< a.length;i++){
          if (elemMenor.compareTo(a[i])>0){
              elemMenor=a[i];
          }
      }
      return elemMenor;
    }

}
