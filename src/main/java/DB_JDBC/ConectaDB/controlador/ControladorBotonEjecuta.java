package DB_JDBC.ConectaDB.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import DB_JDBC.ConectaDB.Modelo.*;
import DB_JDBC.ConectaDB.Vista.*;

public class ControladorBotonEjecuta implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /*
        public ControladorBotonEjecuta(MarcoAplicacion marco) {
            this.marco = marco;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            /*
            String seleccionOpcion = (String) marco.secciones.getSelectedItem();
            String seleccionaPaises = (String) marco.secciones.getSelectedItem();
                           /*
            resultadoConsulta=obj.filtraBBDD(seleccionOpcion,seleccionaPaises);

            try {
                marco.resultado.setText("");
                while (resultadoConsulta.next()){
                 marco.resultado.append(resultadoConsulta.getString(1));
                    marco.resultado.append(", \n");

                    marco.resultado.append(resultadoConsulta.getString(2));
                    marco.resultado.append(", \n");

                    marco.resultado.append(resultadoConsulta.getString(3));
                    marco.resultado.append(", \n");

                    marco.resultado.append(resultadoConsulta.getString(4));
                    marco.resultado.append(", \n");


                }
            }catch (Exception e2){

            }
        }
        */
        MarcoAplicacion marco;
        ResultSet resultadoConsulta;
    }

