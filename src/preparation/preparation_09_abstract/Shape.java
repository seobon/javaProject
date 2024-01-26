package preparation.preparation_09_abstract;

public abstract class Shape {
    private String color;
    private String type;

    abstract public double calculateArea();

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
