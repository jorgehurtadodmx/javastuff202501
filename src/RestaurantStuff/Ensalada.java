package RestaurantStuff;

public class Ensalada extends Plato{
    private String verduraPrincipal;
    private String aderezo;



    public Ensalada(String nombre, int tiempoPreparaciones, double calorias, double precio, String verduraPrincipal, String aderezo) {
        super(nombre, tiempoPreparaciones, calorias, precio);
        this.verduraPrincipal = verduraPrincipal;
        this.aderezo = aderezo;
    }


    @Override
    public String preparar() {
        return "Lavando y cortando " + verduraPrincipal + " y el resto de vegetales frescos. Mezxclando los ingredientes" +
                "en un bol y añadiendo aderezo de " + aderezo + ". Tiempo de preparación:" + getTiempoPreparaciones() + " minutos.";
    }
}
