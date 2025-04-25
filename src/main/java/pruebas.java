public class pruebas {
    public static void main(String[] args) {
        Empleados trabajador1=new Empleados("paco");
        Empleados trabajador2=new Empleados("ana");
        Empleados trabajador3=new Empleados("Antonio");
        Empleados trabajador4=new Empleados("Ellen");
        trabajador1.cambiaSeccion("HHDD");

        System.out.println(trabajador1.devulveDatos());
        System.out.println(trabajador2.devulveDatos());
        System.out.println(trabajador3.devulveDatos());
        System.out.println(trabajador4.devulveDatos());

        System.out.println(Empleados.dameIdSiguiente());
    }
}
 class Empleados {
     public Empleados(String nom) {
         nombre=nom;
         seccion="administracion";

         ID=idSiguiente;
         idSiguiente++;

      }

      public void cambiaSeccion(String seccion){
         this.seccion=seccion;//el this diferencia el campo de clase en este caso el private String(morado) de un argumento el String seccion(blanco)
      }
      public String devulveDatos(){
         return "el nombre es: "+nombre+" la seccion es: "+seccion+" la id es: "+ID;
      }

      public static String dameIdSiguiente(){
         return "el id siguiente es: "+idSiguiente;
      }
     private final String nombre;
     private String seccion;

     private  int ID;
     private static int idSiguiente=1;

 }