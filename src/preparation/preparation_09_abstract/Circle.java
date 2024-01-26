package preparation.preparation_09_abstract;

public class Circle extends Shape {
    private int radius;
    private double pi = Math.PI;
    public Circle (String Color) {
        setColor(Color);
        setType("Circle");
    }

    @Override
    public double calculateArea() {
        return radius * radius * pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
