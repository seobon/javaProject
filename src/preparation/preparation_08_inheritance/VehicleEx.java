package preparation.preparation_08_inheritance;

public class VehicleEx {
    public static void main(String[] args) {
        Bus bus = new Bus("hyundai", "City Bus", 2022, 30);
        System.out.println("=== Bus 정보 ===");
        bus.depart();
        bus.running();
        bus.arrive();

        Car car = new Car("Toyota", "Camry", 2023, true);
        System.out.println("=== Car 정보 ===");
        car.depart();
        car.running();
        car.arrive();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "A");
        System.out.println("=== Motorcycle 정보 ===");
        motorcycle.depart();
        motorcycle.running();
        motorcycle.arrive();
    }
}