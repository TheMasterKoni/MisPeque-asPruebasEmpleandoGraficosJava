package ProgramacionGenerica;

import POO.Jefes;

public class HerenciaGenericaTiposComodin {
    public static void main(String[] args) {
        ClaseGenericaVideo165<Empleado> contabilidad=new ClaseGenericaVideo165<Empleado>();
        ClaseGenericaVideo165<Jefes> DirectorGenral=new ClaseGenericaVideo165<Jefes>();
        //ClaseGenericaVideo165<Empleado> nuevoEmpleado=DirectorGenral; error causa de herencia generica
        ClaseGenericaVideo165.soutTrabajador(contabilidad);
      //  ClaseGenericaVideo165.soutTrabajador((ClaseGenericaVideo165<? extends Empleado>) DirectorGenral);
    }
}
