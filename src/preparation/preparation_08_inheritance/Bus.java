package preparation.preparation_08_inheritance;

public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus (String brand, String model, int year, int passengerCapacity) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setPassengerCapacity(passengerCapacity);
    }

    @Override
    public void running () {
        System.out.println("승객을 운송합니다.");
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
