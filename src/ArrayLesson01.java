import java.util.Arrays;

public class ArrayLesson01 {
    public static void main(String[] args) {
        //----------------
        //ignore this, just practicing
       /* int[] numeros = new int[5]; //crea array con 5 enteros, inicados a 0 de momento
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(numeros[2]);
*/
        //----------------
        //primer ejercicio
        int[] arraySuma = new int[5];
        arraySuma[0] = 10;
        arraySuma[1] = 20;
        arraySuma[2] = 30;
        arraySuma[3] = 40;
        arraySuma[4] = 50;
        for (int i = 0; i < arraySuma.length; i++) {
        //    System.out.println(arraySuma[i]);
        }

        //funcion que sume todos los elementos del array
        sumaMethod(arraySuma);
        promedio(arraySuma);
        //valorMaximo(arraySuma);
        int maximo = valorMaximo(arraySuma);
        System.out.println("Valor maximo " + maximo);
      //  System.out.println(Arrays.toString(arraySuma));
        //funcion que muestre el promedio

    }

    //programa que acepte una lista array de ints pro ejemplo y lo sume
    //de momento que muestre la suma de toods los elementos del array con:
    //Suma: [valor]
    private static void sumaMethod(int[] arraySuma) {
        int suma = 0;
        for (int i = 0; i < arraySuma.length; i++) {
            //System.out.println(arraySuma[i]);
            suma += arraySuma[i];
        }

        System.out.println("Suma: " + suma);
    }
    //primero obtener suma total y luego dividir entre cantidad de numeros
    private static void promedio(int[] arraySuma) {
        int suma = 0;
        for (int i = 0; i < arraySuma.length; i++) {
            //System.out.println(arraySuma[i]);
            suma += arraySuma[i];
        }

        int promedio = suma / arraySuma.length;
        System.out.println(promedio);
    }

    //recorrerlos todos y guardar el mayor comparandolo sucesivamente
    private static int valorMaximo(int[] arraySuma) {
        int max = 0;
        for (int i = 0; i < arraySuma.length; i++) {
           if (arraySuma[i] > max) {
               max = arraySuma[i];
           }
        }
        return max;

    }

}
