package preparation.preparation_09_abstract;

public class Square extends Shape{
    private int width;
    private int height;

    public Square (String Color) {
        setColor(Color);
        setType("Square");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
