package ProgramacionEnHilosMultitarea;

public class SincronisandoHilos {
    public static void main(String[] args) {
        HilosVarios hilo1=new HilosVarios();

        HilosVarios2 hilos2=new HilosVarios2(hilo1);
        hilos2.start();
        hilo1.start();

        System.out.println("Terminadas las tareas");
    }
}
class HilosVarios extends Thread{

    @Override
    public void run() {
        for (int i=0;i<15;i++){
            System.out.println("Ejecuta Hilo "+getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class HilosVarios2 extends Thread{
    private Thread hilo;
    public HilosVarios2(Thread hilo){
        this.hilo=hilo;

    }
    @Override
    public void run() {
        try {
            hilo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0;i<15;i++){
            System.out.println("Ejecuta Hilo "+getName());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

