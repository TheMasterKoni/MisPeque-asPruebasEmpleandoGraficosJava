package DB_JDBC.ConectaDB.controlador;
import DB_JDBC.ConectaDB.Modelo.CargaMenus;
import DB_JDBC.ConectaDB.Vista.MarcoAplicacion;

import java.awt.event.*;
public class ControladorCargaSecciones extends WindowAdapter {

    public ControladorCargaSecciones(MarcoAplicacion marco){
        this.marco=marco;

    }
    @Override
    public void windowOpened(WindowEvent e) {
        obj.ejecutaConsultas();

        try{
            while (obj.rs.next()){
                marco.secciones.addItem(obj.rs.getString(1));
            }

            while (obj.rs2.next()){
                marco.secciones.addItem(obj.rs2);
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }

    CargaMenus obj=new CargaMenus();
    private MarcoAplicacion marco=new MarcoAplicacion();
}
