package ArchivosYDiretorios;
import java.io.*;
/*
 File archivo=new File("pruebaArchivo");//nos toma como referencia el lugar donde se guarda la clase de java
        System.out.println(archivo.getAbsoluteFile());//con estas este metodo nos genera la ruta donde se guarda el archivo
        System.out.println(archivo.exists());//metodo que evaua si existe el archivo o no
 */
//VAMOS A LEER TODOS LOS ARCHIVOS DE UN FICHERO
public class Video159File1 {
    public static void main(String[] args) {
        //el campo de clase de la clase File "seperator", nos sirve para usar "/" y nos funcione en todos los sistemas operativos
       File ruta=new File("C:"+File.separator+ "Users" +File.separator+ "USUARIO"+File.separator+"Downloads"+File.separator+"importante");
       System.out.println(ruta.getAbsolutePath());
       String[] nombresArchivos=ruta.list();
       for(int i=0;i<nombresArchivos.length;i++){
           System.out.println(nombresArchivos[i]);
           File f=new File(ruta.getAbsolutePath(),nombresArchivos[i]);
           if (f.isDirectory()){
               String[] archivosSubCarpeta=f.list();
               for (int j=0;j<archivosSubCarpeta.length;j++){
                   System.out.println(archivosSubCarpeta[j]);
               }
           }
       }
    }
}
