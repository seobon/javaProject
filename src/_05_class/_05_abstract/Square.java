package _05_class._05_abstract;

public class Square extends Shape {
    public int width;
    public int height ;
    public Square(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    // 추상 메소드 구현
    void draw() {
        System.out.println("사각형 그리기!");
    }

    double calculateArea() {
        return width * height;
    }
}
