package exceptionstuff;

public class TestingTutos01 {
    //1. Codigo con verificacion de error, sin exceptions.
    public static int dividir(int a, int b) {
        if (b == 0) {
            System.err.println("error. Division por 0");
            return 0;
        }
        return a / b;
    }

    //2. con exceptions. Mas limpio, pero todavia con fallos.
    public static int dividir2(int a, int b) throws ArithmeticException {
        return a / b;
    }
    //3. IOException se puede usar como error, es mas generico.
    public static void main(String[] args) {
        //1, "mal"
        System.out.println(dividir(4,2));
        System.out.println(dividir(4,0));

        //2, todavia "mal"
        System.out.println(dividir2(4,0));


    }
}
