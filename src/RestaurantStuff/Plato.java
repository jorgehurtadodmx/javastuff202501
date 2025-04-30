package RestaurantStuff;

public abstract class Plato {
    private String nombre;
    private int tiempoPreparaciones; //minutos
    private double calorias;
    private double precio;

    public Plato(String nombre, int tiempoPreparaciones, double calorias, double precio) {
        this.nombre = nombre;
        this.tiempoPreparaciones = tiempoPreparaciones;
        this.calorias = calorias;
        this.precio = precio;
    }

    //Un método concreto servir() que devuelva un String con el mensaje "Sirviendo [nombre del plato]"
    public String servir() {
        return "Sirviendo " + nombre;
    }

    //Un método concreto calcularPrecio() que devuelva el precio base más un 10% adicional (es decir, precio * 1.10)
    public double calcularPrecio() {
        return precio * 1.10;
    }

    public abstract String preparar();
        //instrucciones para cada tiopo de plato¿?


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoPreparaciones() {
        return tiempoPreparaciones;
    }

    public void setTiempoPreparaciones(int tiempoPreparaciones) {
        this.tiempoPreparaciones = tiempoPreparaciones;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
