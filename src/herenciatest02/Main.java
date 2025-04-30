package herenciatest02;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota",120,"Sedan");
        System.out.println(vehicle.getBrand());
        Car car = new Car("Ford", 180, "SUV","Explorer");
        System.out.println(car.getModel());
    }
}
