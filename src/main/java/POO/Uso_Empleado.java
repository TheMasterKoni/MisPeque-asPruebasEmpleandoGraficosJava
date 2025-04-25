package POO;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
        jefatura jefe_RRHH=new jefatura("juan",55000,2006,9,25);
        jefe_RRHH.estableceIncentivo(2570);

        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("paco gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("javier escobar", 95000, 1995, 6, 2);
        misEmpleados[2] = new Empleado("jorge curioso", 105000, 2002, 3, 15);
        misEmpleados[3] = new Empleado("Antonio Fernandes");
        misEmpleados[4]=jefe_RRHH;//polimorfismo en accion/principio de sustitucion
        misEmpleados[5]=new jefatura("maria",95000,1999,2,26);

        jefatura jefeFinansas = (jefatura) misEmpleados[5];
        jefeFinansas.estableceIncentivo(55000);
        Empleado directorComercial=new jefatura("Sandra",85000,2012,05,05);
        Comparable ejemplo=new Empleado("Elissabeth",95000,2011,06,07);

        System.out.println("el jefe "+jefeFinansas.damenombre()+" tiene un bonus de "+jefeFinansas.estableBonus(500));
        System.out.println(misEmpleados[3].damenombre()+" tiene un bonus de: "+misEmpleados[3].estableBonus(200));

        if (directorComercial instanceof Empleado){
            System.out.println("Es de tipo jefatura");
        }

        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }

        System.out.println(jefeFinansas.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));

        for (Empleado e:misEmpleados) {
            e.subeSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for (Empleado e:misEmpleados) {
            System.out.println("mis empleados: " + e.damenombre() + " sueldo: " + e.damesueldo() + " fecha de alta: " + e.altaContrata);
        }
    }
}
    class Empleado implements Comparable,Trabajadores {
        public Empleado(String nom, double sue, int agno, int mes, int dia) {
            nombre = nom;
            sueldo = sue;
            GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
            altaContrata = calendario.getTime();

            ++idSiguiente;
            id=idSiguiente;
        }

        public Empleado(String nom) {

            this(nom,30000,2000,01,01);
            /*
            sueldo=30000;
            GregorianCalendar calendar = new GregorianCalendar(1999,05,19);
            altaContrata=calendar.getTime();*/
        }

        public String damenombre() {//getter
            return nombre+" ID "+id;
        }

        public double estableBonus(double gratificacion){
            return gratificacion+Trabajadores.bonusBase;
        }

        public double damesueldo() {//getter
            return sueldo;
        }

        public Date dameFechaContrato() { //getter
            return altaContrata;
        }


        public void subeSueldo(double porcentaje) {//setter
            double aumento = sueldo * porcentaje / 100;
            sueldo += aumento;

        }

        @Override
        public int compareTo(Object miObj) {
            Empleado otroEmpleado=(Empleado) miObj;
            if (this.id< otroEmpleado.id){
                return -1;
            }
            if (this.id>otroEmpleado.id){
                return 1;
            }
            return 0;
        }

        private String nombre;
        private double sueldo;
        Date altaContrata;
        private int id=1;
        private static int idSiguiente;

    }

        class jefatura extends Empleado implements Jefes{
        public jefatura(String nom,double sue,int agno,int mes, int dia){
            super(nom, sue, agno, mes, dia);
        }

        public String tomarDecisiones(String decision){
            return "un miembro de la direccion ha tomado la decision de: "+decision;
        }

        public double estableBonus(double gratificacion){
            double prima=2000;
            return Trabajadores.bonusBase+gratificacion+prima;
        }

        public void estableceIncentivo(double b){
            incentivo=b;
        }
        public double dameSuldo(){
            double sueldoJefe=super.damesueldo();
            return sueldoJefe+incentivo;
        }

        private double incentivo;
    }
