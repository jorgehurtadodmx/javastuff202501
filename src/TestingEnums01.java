public class TestingEnums01 {
    
    public enum Mes {
        ENERO(31),
        FEBRERO(28),  // En año no bisiesto
        MARZO(31),
        ABRIL(30),
        MAYO(31),
        JUNIO(30),
        JULIO(31),
        AGOSTO(31),
        SEPTIEMBRE(30),
        OCTUBRE(31),
        NOVIEMBRE(30),
        DICIEMBRE(31);



        Mes(int i) {
        }
    }
    public enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO;
    }

    public TestingEnums01(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    private final int dias;
    public static void main(String[] args) {
        //testing de condicional con enum
        DiaSemana hoy = DiaSemana.MIERCOLES;
        if (hoy == DiaSemana.MIERCOLES) {
            System.out.println("es miercoles");
        } else {
            System.out.println("no es miercoles");
        }

        //sentencia switch usando enum
        switch (hoy) {
            case LUNES:
                System.out.println("COMIENZA LA SEMANA SUUU");
                break;
            case MARTES, MIERCOLES:
                System.out.println("Todavia queda....");
                break;
            case SABADO, DOMINGO:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("dia entre semana");
        }

        //obtener todas las constantes como array
        DiaSemana[] todos = DiaSemana.values();
        //direccion memoria
        System.out.println(todos);
        //iterar por ellos.
        for (DiaSemana dia : todos) {
            System.out.println(dia);
        }

        //ha de coincidir con valor de enum o error.
        DiaSemana dia = DiaSemana.valueOf("LUNES");
        System.out.println("value of " + dia);

        //obtener cadenma del enum
        String nombre = DiaSemana.LUNES.name();
        System.out.println(nombre);

        //obtener posicion de enum
        int posicion1 = DiaSemana.LUNES.ordinal();
        System.out.println(posicion1);







        //obtener dias de un mes concreto


    }
}
