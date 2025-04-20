public class FunctionTesting {
    public static void main(String[] args) {
        sumar(4,5);

        int facto = factorial(6);
        System.out.println(facto);
        //factorial(6);


        String saludo = saludoPersonalizado("Jorge");
        System.out.println(saludo);

        boolean parTest = esPar(3);
        System.out.println(parTest);
        //esPar(3);
    }

    // funcion que sume dos numeros y retorne resultado
    public static int sumar(int a, int b) {
       // System.out.println("El resultado de " + a + " y " + b + " es:");
        //System.out.println(a + b);
        //mejorado, solo con return
        return a + b;
    }

    //funcion que retorne factorial de un numero y retorne resultado
    // ejemplo de 5:
    // 5 * 4 * 3 * 2 * 1. Obtener numeros y multiplicarlos
    public static int factorial (int factorial) {
        int resultado = 1;
        for (int i = 1; i <= factorial ; i++) {
            // resultado = i * i;
             resultado  *= i;
        }
        return resultado;
        //System.out.println("resultado es " +  resultado);
    }

    public static String saludoPersonalizado(String nombre) {
        //System.out.println("hola " + nombre);
        return "Hola " + nombre;
    }

    //comprobar numero par y devolver true o false.
    public static boolean esPar(int numero) {
        boolean parOno = true;
        if (numero % 2 == 0) {
            parOno = true;
        } else {
            parOno = false;
        }
        //System.out.println(parOno);
        return parOno;
    }


}
