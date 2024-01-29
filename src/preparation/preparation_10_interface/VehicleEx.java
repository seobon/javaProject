package preparation.preparation_10_interface;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        Car car = new Car();
        Airplane airplane = new Airplane();

        car.setName("Car");
        car.setMaxSpeed(532);
        airplane.setName("Airplane");
        airplane.setMaxSpeed(900);

        vehicleArrayList.add(car);
        vehicleArrayList.add(airplane);

        for (int i = 0; i < vehicleArrayList.size(); i++) {
            System.out.println("=== " + vehicleArrayList.get(i).getName() + " ===");
            vehicleArrayList.get(i).move();
            System.out.println(vehicleArrayList.get(i));
            if (vehicleArrayList.get(i) instanceof Flyable) {
                ((Flyable) vehicleArrayList.get(i)).fly();
            }
        }
    }
}
