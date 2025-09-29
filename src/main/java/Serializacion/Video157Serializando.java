package Serializacion;

import java.io.*;

class Video157Serializacion{
    private static p[] prueba;
    public static void main(String[] args) {
        prueba=new p[3];
        prueba[0]=new p("Koni",321,34,3);
        prueba[1]=new p("Dana",321,321,43);
        prueba[2]=new p("Anji",423,54,6);
    }

    private static class p implements Serializable{
        private p(String n,int dia,int fecha,int year){
            try {
                ObjectOutputStream escribiendo=new ObjectOutputStream(new FileOutputStream("C:/Users/USUARIO/Downloads/Serializacionjava/serializado.txt"));
                escribiendo.writeObject(prueba);
                escribiendo.close();

                ObjectInputStream recuperando=new ObjectInputStream(new FileInputStream("C:/Users/USUARIO/Downloads/Serializacionjava/serializado.txt"));
                p[] pruebaRecuperada=(p[]) recuperando.readObject();
                recuperando.close();

                for (p p : pruebaRecuperada) {
                    System.out.println(p);
                }

            }catch (Exception e){
                System.out.println("No se encontro el fichero especificado");
            }
        }
        private static final long serialVersionUID = 1L;
    }
}

