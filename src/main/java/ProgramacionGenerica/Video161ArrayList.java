package ProgramacionGenerica;
import java.util.*;
public class Video161ArrayList {
    public static void main(String[] args) {
        /*Empleado[] listaEmpleados=new Empleado[3];
        listaEmpleados[0]=new Empleado("Koni",12,743289);
        listaEmpleados[1]=new Empleado("Dana",15,435423);
        listaEmpleados[2]=new Empleado("Anji",15,124432);*/
        ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();//<> dentro va el tipo de dato a almacenar
        //listaEmpleados.ensureCapacity(11);//metodo para especificar la cantidad de elementos
        listaEmpleados.add(new Empleado("Koni",12,743289));
        listaEmpleados.add(new Empleado("Dana",15,435423));
        listaEmpleados.add(new Empleado("Anji",15,435423));
        listaEmpleados.set(0,new Empleado("Sarai",17,20));//metodo set, para modificar el lugar donde aparecera el obj

        System.out.println(listaEmpleados.get(2).getDatos());//metodo para mostrar un obj ubicado en cierto indice

        listaEmpleados.trimToSize();//metodo para ahorrar memoria y cierra el crecimiento del ArrayList, optimisa
        System.out.println(listaEmpleados.size()); // metodo que nos da el tamño del arrayList al comienzo de la consola

        Iterator<Empleado> iterador=listaEmpleados.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next().getDatos());
        }

      /*  for(Empleado e:listaEmpleados){
            System.out.println(e.getDatos());
        }*/
    }
}
class Empleado{
    public Empleado(String nombre,int edad,double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }
    public String getDatos(){
        return "El empleado se llama "+nombre+" tiene "+edad+" años y un salario de "+salario;
    }
    private String nombre;
    private int edad;
    private double salario;
}
