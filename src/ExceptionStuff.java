import javax.naming.PartialResultException;
import java.io.IOException;

public class ExceptionStuff {


    public int dividir1(int a, int b) {
        if (b == 0) {
            System.err.println("Error: Division por cero");
            return 0;
        }
        return a / b;
    }

    public int dividir2(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionStuff ex1 = new ExceptionStuff();

        System.out.println(ex1.dividir1(10, 5));
        //System.out.println(ex1.dividir1(10, 0));
        System.out.println("ee");
        try {
            System.out.println(ex1.dividir2(10,0));
        } catch (ArithmeticException  e) {
            System.err.println("capturada" + e.getMessage());
        }
        System.out.println("e");
    }

    //
    public void procesarDatos() throws IOException {
        //
    }
}
