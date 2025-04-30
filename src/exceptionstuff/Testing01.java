package exceptionstuff;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Testing01 extends ExcepcionPersonalizada{
    public Testing01(String mensaje) {
        super(mensaje);
    }

    //1 excepcion ArithmenticException si divisor es 0
    public static int dividir(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("no se puede dividir por 0");
        }
        return a / b;

    }
    //leer archivo, excepcion IO si no se puede abrir.

    //2
    public static void leerArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("error al leer " + e);
            //si no encuentra, FileNotFoundException
        }
    }



    //public static String leerArchivo(FileReader texto) {
    //    FileReader fileReader = new FileReader();
   // }

    //3. mostrarLongitud, toma string y muestra longitud de cadena, nullpointer si argumento es nulo


    public static void mostrarLongitud(String texto) {
        try {
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("error en " + e);
        }

    }


    public static void lanzarExcepcionPersonalizada(String frutaDeLaMuerte)  throws ExcepcionPersonalizada {
        try {
            if (frutaDeLaMuerte.equals("banana")) {

                throw new RuntimeException("Fruta de la muerte");

            }
        } catch (RuntimeException e) {
                System.out.println("te he salvado la vida " + e );

            }



    }
    public static void main(String[] args) throws ExcepcionPersonalizada {
        System.out.println(dividir(4,2));

        //2
        System.out.println(System.getProperty("user.dir"));
        leerArchivo("testo1.txt"); //lo encuentra
        leerArchivo("testo112.txt"); // nolo encuentra

        //3
        mostrarLongitud("aa");
        mostrarLongitud(null);

        //4
        lanzarExcepcionPersonalizada("banana");
    }

}
