package herenciatest01;

public abstract class Figura {
    protected String color;




    public Figura(String color) {
        this.color = color;
    }



    public abstract double calcularArea();
    public String getColor() {
        return color;
    }

}
