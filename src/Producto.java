public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        this.stock = stock;
    }

    public static void main(String[] args) {
       Producto producto1 = new Producto("producto1", 10, 50);
       producto1.reponer(10);
       producto1.vender(20);
        System.out.println(producto1.stock);
        Producto producto2 = new Producto("producto2", -11,50);
        System.out.println(producto2.precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
//Un método setter solo para el precio, que debe validar que el nuevo precio sea mayor que cero.
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
        System.out.println("Precio ha de ser positivo");
    }
    //reduzca stock en cantidad especificada
    public boolean vender(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("cantidad erronea");
        }
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Vendido. Stock restante " + stock);
            return true;
        } else {
            System.out.println("sin stock");
            return false;
        }
    }
    //Un método reponer(int cantidad) que incremente el stock y valide que la cantidad a reponer sea positiva.
    public int reponer(int cantidad) {
        if (cantidad <=0) {
            throw new IllegalArgumentException("cantidad a reponer ha de ser mayor a 0");
        }
        return stock += cantidad;
    }

}
