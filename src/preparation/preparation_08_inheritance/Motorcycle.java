package preparation.preparation_08_inheritance;

public class Motorcycle extends Vehicle{
    private String licenseType;

    public Motorcycle (String brand, String model, int year, String licenseType) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setLicenseType(licenseType);
    }

    @Override
    public void running () {
        System.out.println("사고납니다. 쾅!");
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}
