import java.util.Arrays;

public class TrashFile {

    public static void main(String[] args) {
    //declaracion de algunas variables
        byte bito = 1;
        short shorty = 2;
        int inty = 3;
        long longy = 4L;
        float floty = 44F;
        double doblo = 444;
        char charo= 'a';
        boolean bule = true;

        String nombre = "Jorge";

        //conversiones
        //1 int a byte
        inty = bito;
        byte bito1 = (byte) inty;
        //2. float a int
        int intino2 = (int) floty;
        //3. char a int. De char tenemos que hacer un int.
        int intino3 = charo;
        //4. de string a int usando parseInt.
        try {
            int intino4 = Integer.parseInt(nombre);
            System.out.println(intino4 +  "no se imprime por conversion erronea");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        //5.de int a string uisando string valueof.
        String supernombre = String.valueOf(inty);

        //Creacion de array con 5 valores
        int [] valores = new int[5]; //cantidad predefinida
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;
        System.out.println(Arrays.toString(valores));


        // muestra por consola de valores de todas las variables declaradas con una desc de cada una
        System.out.println("Mi byte tiene valor " + bito +  " y su conversion a int fue " + bito1);

        System.out.println("Mi short tiene valor " + shorty + " y mi int tiene valor " + inty + " cuyas conversiones fueron " +
                intino2 + " y " + intino3);
        System.out.println("Además, tengo unos long, float , double, char y boolean cuyos valores, respectivamente son: " +
                longy + ", " + floty + ", " + floty + ", " + doblo + ", " + charo + " y " + bule
        );
    }
}
