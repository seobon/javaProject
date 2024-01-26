package preparation.preparation_08_inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public void depart () {
        System.out.println("차량이 출발합니다. 부릉부릉~ ");
    }

    public void running () {
        System.out.println("갑니다~");
    }

    public void arrive () {
        System.out.println("도착했습니다. 차량이 정지했습니다.");
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
