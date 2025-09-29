package ProgramacionEnHilosMultitarea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;
public class UsoThread {
    public static void main(String[] args) {
        MarcoRebotes m=new MarcoRebotes();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
class PelotaIlos implements Runnable{
    private Pelota pelota;
    private Component componente;
    public PelotaIlos(Pelota unaPelota,Component unComponente){
        pelota=unaPelota;
        componente=unComponente;
    }
    @Override
    public void run() {
        //for (int i=1;i<=3000;i++)
        System.out.println("estado del hio al comenzar "+Thread.currentThread().isInterrupted());
        while (!Thread.interrupted()) {
            pelota.muevePelotas(componente.getBounds());
            componente.paint(componente.getGraphics());
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                //e.printStackTrace();
                //System.out.println("Hilo bloqueado imposibe su interrupcion");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("estado del hio al terminar "+Thread.currentThread().isInterrupted());
    }
}
class Pelota{
  public void muevePelotas(Rectangle2D limites){
      x+=dx;
      y=dy;
      if (x<limites.getMinX()){
          x=limites.getMinX();
          dx=-dx;
      }
      if (x + TAMX>= limites.getMaxX()){
          x= limites.getMaxX() - TAMX;
          dx=-dx;
      }
      if (y<limites.getMinY()){
          y=limites.getMinY();
          dy=-dy;
      }
      if (y + TAMY>= limites.getMaxY()){
        y=limites.getMaxY();
        dy=-dy;
      }
  }
  public Ellipse2D getShape(){
      return new Ellipse2D.Double(x,y,TAMX,TAMY);
  }
  private double x=0,y=0,dx=1,dy=1;
  private static final int TAMX=15,TAMY=15;
}
class PanelPelota extends JPanel{
    public void addPelota(Pelota pelota){
        pelotas.add(pelota);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D) g;
        for (Pelota p:pelotas){
            g2d.fill(p.getShape());
        }
    }

    private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}
class MarcoRebotes extends JFrame{
    public MarcoRebotes(){
        setBounds(600,250,600,400);
        setTitle("Rebotes");
        panel =new PanelPelota();
        add(panel,BorderLayout.CENTER);
        JPanel panelBotones=new JPanel();

        start1=new JButton("Hilo1");
        start1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienzaElJuego(e);
            }
        });
        panelBotones.add(start1);

        start2=new JButton("Hilo2");
        start2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienzaElJuego(e);
            }
        });
        panelBotones.add(start2);

        start3=new JButton("Hilo3");
        start3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienzaElJuego(e);
            }
        });
        panelBotones.add(start3);

        stop1=new JButton("deten1");
        stop1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        panelBotones.add(stop1);

        stop2=new JButton("deten2");
        stop2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        panelBotones.add(stop2);

        stop3=new JButton("deten3");
        stop3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        panelBotones.add(stop3);

        add(panelBotones,BorderLayout.SOUTH);

    }

    public void comienzaElJuego(ActionEvent e){
        Pelota pelota=new Pelota();
        panel.addPelota(pelota);
        Runnable r=new PelotaIlos(pelota,panel);

        if (e.getSource().equals(start1)){
            t1=new Thread(r);
            t1.start();
        } else if (e.getSource().equals(start2)) {
            t2=new Thread(r);
            t2.start();
        }else if (e.getSource().equals(start3)){
            t3=new Thread(r);
            t3.start();
        }

    }
    public void detener(ActionEvent event){
        if (event.getSource().equals(stop1)){
            t1.interrupt();
        } else if (event.getSource().equals(stop2)) {
            t2.interrupt();
        } else if (event.getSource().equals(stop3)) {
            t3.interrupt();
        }
    }
    private Thread t1,t2,t3;
    private JButton start1,start2,start3,stop1,stop2,stop3;
    private PanelPelota panel;
}