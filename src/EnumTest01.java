public class EnumTest01 {
    public EnumTest01(boolean laborable) {
        this.laborable = laborable;
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

    private final boolean laborable;
    public static void main(String[] args) {
        System.out.println(DiaSemana.SABADO);
    }
}
