package Colecciones;
import java.util.*;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Clientes clientes1=new Clientes("Koni","743",200000);
        Clientes clientes2=new Clientes("Angie","222",100000);
        Clientes clientes3=new Clientes("Robert","101",20000);
        Clientes clientes4=new Clientes("Dana","203",10000);
        Clientes clientes5=new Clientes("Dana","203",10000);

        Set <Clientes> clientesBanco=new HashSet<Clientes>();
        clientesBanco.add(clientes1);
        clientesBanco.add(clientes2);
        clientesBanco.add(clientes3);
        clientesBanco.add(clientes4);
        clientesBanco.add(clientes5); // este ultimo no aparece porque esta coleccion no admite repetidos


        Iterator<Clientes> ite = clientesBanco.iterator();
        while (ite.hasNext()){
            String nombreClientes= ite.next().getNombre();
            if (nombreClientes.equals("Robert")){
                ite.remove();
            }
        }
        for(Clientes c:clientesBanco) {
            System.out.println(c.getNombre() + " " + c.getNumeroCuenta() + " " + c.getSaldo());
        }

    }

}
