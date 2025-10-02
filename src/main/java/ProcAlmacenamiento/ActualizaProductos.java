package ProcAlmacenamiento;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ActualizaProductos {
    public static void main(String[] args) {
        int nPrecio=Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
        String nArticulo=JOptionPane.showInputDialog("Introduce nombre articulo");

        try{
            Connection coneccion= DriverManager.getConnection("jdbc:mysql://localhost:3306/academias","root","");
            CallableStatement misentencia=coneccion.prepareCall("{call actuliza prod(?,?)}");

            misentencia.setInt(1,nPrecio);

            misentencia.setString(1,nArticulo);

            misentencia.execute();
            System.out.println("ACTUALIZACION OK");

            
        }catch (Exception e){

        }
    }
}
