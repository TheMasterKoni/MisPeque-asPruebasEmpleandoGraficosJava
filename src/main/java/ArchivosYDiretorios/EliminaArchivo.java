package ArchivosYDiretorios;

import java.io.File;

public class EliminaArchivo {
    public static void main(String[] args) {
        File ruta=new File("C:"+File.separator+ "Users" +File.separator+ "USUARIO"+File.separator+"Downloads"+File.separator+"importante"+File.separator+"pruebaTexto.txt");
        ruta.delete();//metodo para borrar archivos
    }
}
