package preparation.preparation_09_abstract;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        ArrayList<Shape> shapeArr = new ArrayList<>();

        Circle circle = new Circle("red");
        circle.setRadius(5);

        shapeArr.add(circle);

        Square square = new Square("red");
        square.setWidth(4);
        square.setHeight(6);

        shapeArr.add(square);

        for (Shape shape: shapeArr) {
            System.out.println("=== " + shape.getType() + " 도형의 정보 ===");
            System.out.println("도형의 색상: " + shape.getColor());
            System.out.println("도형의 넓이: " + shape.calculateArea());
        }
    }
}
