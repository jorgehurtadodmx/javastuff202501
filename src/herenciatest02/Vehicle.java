package herenciatest02;

public class Vehicle {
    private String brand;
    private int speed;
    private String type;

    public Vehicle(String brand, int speed, String type) {
        this.brand = brand;
        this.speed = speed;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
