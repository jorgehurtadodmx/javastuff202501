package RestaurantStuff;

public class Sopa extends Plato {
    private int temperatura; //grados celsius
    private String baseDelCaldo;



    public Sopa(String nombre, int tiempoPreparaciones, double calorias, double precio, int temperatura, String baseDelCaldo) {
        super(nombre, tiempoPreparaciones, calorias, precio);
        this.temperatura = temperatura;
        this.baseDelCaldo = baseDelCaldo;
    }

    @Override
    public String preparar() {
        return "Preparando caldo base de " + baseDelCaldo + ". Añadiendo verduras y especies. Cocinando a fuego lento" +
                "durante " + getTiempoPreparaciones() + " minutos. Servir a " + temperatura + " grados.";
    }
}
