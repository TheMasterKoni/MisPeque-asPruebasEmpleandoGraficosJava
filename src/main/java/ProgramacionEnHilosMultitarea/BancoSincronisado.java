package ProgramacionEnHilosMultitarea;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*synchronized metodos de Object wait(Long timeOut) notifyAll() metodos que sirven para hacer lo mismo que await(Long timeOut) y signaAll() de la
interfaz Condition la diferencia de estas condiciones de Thread es que con la primero solo podemos hacer una unica condicion,
en cambio con la otra podemos hacer muchas Thread codicionados
*/
public class BancoSincronisado {
    public static void main(String[] args) {
        Banco b=new Banco();
        for (int i=0;i<100;i++){
            EjecucionTransferencia r=new EjecucionTransferencia(b,i,2000);
            Thread hilo=new Thread(r);
            hilo.start();
        }
    }
}
class Banco{

    public void Banco(){
        cuentas=new double[100];
        for(int i=0;i<cuentas.length;i++){
            cuentas[i]=2000;
        }
    //    saldoSuficiente=cierreBanco.newCondition();
    }
    public synchronized void transferencia(int origen,int destino,double cantidad) throws InterruptedException{
       // cierreBanco.lock();

            while (cuentas[origen] < cantidad) {//evalua saldo inferior a la transferencia
             //   System.out.println("-----------------Cantidad Insuficiente: "+origen+" Saldo: "+cuentas[origen]+" Cantidad: "+cantidad);
               // return;
             //   saldoSuficiente.await();
                wait();
            }//else {
               // System.out.println("------------CANTIDAD OK-----------"+cuentas[origen]); }
            System.out.println(Thread.currentThread());
            cuentas[origen] -= cantidad; //descontar el dinero que sale
            System.out.printf("%10.2f de %d para %d", cantidad, origen, destino);
            cuentas[destino] += cantidad;
            System.out.printf(" saldo total: %10.2f%n", getSaldoTotal());

            notifyAll();

           // saldoSuficiente.signalAll();

    }
    public double getSaldoTotal(){
       double sumaCuentas=0;
      for (double a: cuentas){
         sumaCuentas+=a;
     }
      return sumaCuentas;
    }
    private double[] cuentas;
   // private Lock cierreBanco=new ReentrantLock();
    //private Condition saldoSuficiente;
}
class EjecucionTransferencia implements Runnable{
    public EjecucionTransferencia(Banco banco,int origen,double cantidadMax){
        this.banco=banco;
        this.origen=origen;
        this.cantidadMax=cantidadMax;
    }
    @Override
    public void run() {
        while (true){
            int paraCuenta=(int)(100*Math.random());
            double cantidad=cantidadMax*Math.random();
            try {
                banco.transferencia(origen,paraCuenta,cantidad);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private Banco banco;
    private int origen;
    private double cantidadMax;
}