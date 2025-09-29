package ArchivosYDiretorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreandoFicheroVideo160 {
    public static void main(String[] args) {
        File ruta=new File("C:"+File.separator+ "Users" +File.separator+ "USUARIO"+File.separator+"Downloads"+File.separator+"importante"+File.separator+"pruebaTexto.txt");
        ruta.mkdir();//crea nuevo directorio, con el nombre de la ultima ruta
        String archivoDestino=ruta.getAbsolutePath();
        try{
            ruta.createNewFile();
        }catch (Exception e){
            System.out.println("No es un fichero");
        }
        Escribiendo accede=new Escribiendo();
        accede.escribir(archivoDestino);
    }
}
class Escribiendo{
    public void escribir(String ruta){
     String frase="Esto es un ejemplo";
     try{
         FileWriter fileWriter=new FileWriter(ruta);
         for (int i=0;i<frase.length();i++){
             fileWriter.write(frase.charAt(i));
         }
         fileWriter.close();
     }catch (IOException e){

     }
    }
}