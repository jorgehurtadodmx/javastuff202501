public class SemanaLaboral { public enum DiaSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private final boolean laborable;

    // Constructor del enum
    DiaSemana(boolean laborable) {
        this.laborable = laborable;
    }

    // Método público para saber si es laborable
    public boolean esLaborable() {
        return laborable;
    }
}

    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            if (dia.esLaborable()) {
                System.out.println(dia + " es un día laborable.");
            } else {
                System.out.println(dia + " no es un día laborable.");
            }
        }
    }
}

