package herenciatest01;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0, "Rojo");
        Figura rectangulo = new Rectangulo("blue", 6.0, 4.0);

        System.out.println("Circulo - Color: " + circulo.getColor() + "Area: " + circulo.calcularArea());
        System.out.println("Rectangulo - Color: "  + rectangulo.getColor() + ", Area: " + rectangulo.calcularArea());
    }
}
