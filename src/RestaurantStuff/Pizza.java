package RestaurantStuff;

public class Pizza extends Plato {
    public Pizza(String nombre, int tiempoPreparaciones, double calorias, double precio, String tipoDeMasa, String ingredientePrincipal, int tamanyo) {
        super(nombre, tiempoPreparaciones, calorias, precio);
        this.tipoDeMasa = tipoDeMasa;
        this.ingredientePrincipal = ingredientePrincipal;
        this.tamanyo = tamanyo;
    }

    @Override
    public String preparar() {
        return "Amasando la base de pizza de " +  tipoDeMasa + ", añadiendo salsa de tomate, espolvoreando queso" +
                " y añadiendo " + ingredientePrincipal + ". Horneando pizza de " + tamanyo + " cm durante " + getTiempoPreparaciones() + " minutos.";
    }

    private String tipoDeMasa;
    private String ingredientePrincipal;
    private int tamanyo;


    public String getTipoDeMasa() {
        return tipoDeMasa;
    }

    public void setTipoDeMasa(String tipoDeMasa) {
        this.tipoDeMasa = tipoDeMasa;
    }

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }
}
