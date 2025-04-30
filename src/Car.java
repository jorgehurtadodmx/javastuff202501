public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car() {

    }

    public static void main(String[] args) {


        Car miCarro = new Car("Toyota", "Corola", 2020);
        System.out.println(miCarro.getBrand());
        System.out.println(miCarro.getModel());
        System.out.println(miCarro.getYear());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
