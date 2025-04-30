package exceptionstuff;

public class ExcepcionPersonalizada extends Throwable {
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}
