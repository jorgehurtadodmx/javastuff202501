package scannershit;

import java.util.Scanner;

public class ScannerStuff01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //3. solicitar y leer nombre de usuario como cadena de texto.
        System.out.println("Dime nombre");
        String nombre = sc.next();

        //4. solicita edad como entero
        System.out.println("Dime edad");
        int edad = sc.nextInt();

        //5 altura decimal
        System.out.println("Dime altura");
        double altura = sc.nextDouble();

        //6. Resumen de datos a mostrar
        System.out.println("Resumen de datos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("menor de edad");
        }

        sc.close();
    }

}
