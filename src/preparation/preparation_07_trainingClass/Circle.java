package preparation.preparation_07_trainingClass;

import java.util.Scanner;

public class Circle {
    int radius;
    static final double PI = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculagteArea(int radius) {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        System.out.print("원의 반지름을 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int radiusInput = scanner.nextInt();

        Circle circle = new Circle(radiusInput);
        System.out.println("원의 반지름: " + circle.radius);
        System.out.print("원의 넓이: " + circle.calculagteArea(circle.radius));
    }
}