public class RecursiveStuff {
    public static void main(String[] args) {

        //factorialRecursivo(4);
        System.out.println(factorialCola(6));
    }

    private static int factorialCola(int n) {
        return factorialRecursivo(n, 1);
    }

    //metodo factorial que se llame a si mismo hasta cumplir su condicion
    private static int factorialRecursivo(int n, int acc) {
        if (n == 0) {
            return acc;
        }
        return factorialRecursivo(n - 1, acc * n);
    }

    // dado un numero, iterar y restar 1 hasta que llegue a 0.
    //la operadcion  multiplica el numero dado (o actual) por el siguiente (-1)
}
