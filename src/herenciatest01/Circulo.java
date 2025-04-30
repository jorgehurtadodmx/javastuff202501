package herenciatest01;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }




    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }


}
