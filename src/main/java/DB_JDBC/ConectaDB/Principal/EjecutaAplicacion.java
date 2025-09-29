package DB_JDBC.ConectaDB.Principal;

import DB_JDBC.ConectaDB.Vista.MarcoAplicacion;

import javax.swing.*;

public class EjecutaAplicacion {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoAplicacion mimarco=new MarcoAplicacion();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}
