package _05_class._05_abstract;

public class ShapeEx {
    public static void main(String[] args) {
        // Shape 객체는 new 연산자로 직접 생성할 수 없지만,
        // 자식 클래스인 Circle, Square 에서 new 연산자로 객체 생성 가능

        Circle circle = new Circle("red", "circle", 5);
        Square square = new Square("blue", "square", 4, 6);

        System.out.println("=== Circle 도형의 정보 ===");
        System.out.println("도형의 색상: " + circle.getColor());
        System.out.println("도형의 넓이: " + circle.calculateArea());

        System.out.println("=== Square 도형의 정보 ===");
        System.out.println("도형의 색상: " + square.getColor());
        System.out.println("도형의 넓이: " + square.calculateArea());
    }
}
