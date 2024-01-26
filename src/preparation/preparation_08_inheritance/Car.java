package preparation.preparation_08_inheritance;

public class Car extends Vehicle{
    private boolean convertible;

    public Car (String brand, String model, int year, boolean convertible) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setConvertible(convertible);
    }

    @Override
    public void running () {
        System.out.println("주차합니다. 끼익, 쾅!");
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
