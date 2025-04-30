package herenciatest02;

public class Car extends Vehicle {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    public Car(String brand, int speed, String type, String model) {
        super(brand, speed, type);
        this.model = model;
    }
}
