package _05_class._03_final;

import java.util.Scanner;

public class Circle {
//    final int radiusConst;
//    final double PI = 3.141592;
//
//    public Circle() {
//        System.out.print("원의 반지름을 입력하세요: ");
//        Scanner scanner = new Scanner(System.in);
//        this.radiusConst = scanner.nextInt();
//    }
//
//    public double calculateArea() {
//        return radiusConst * radiusConst * PI;
//    }
//
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println("원의 반지름: " + circle.radiusConst);
//        System.out.println("원의 넓이: " + circle.calculateArea());
//    }

    // 반지름 final 필드
    private final int radius;
    // PI 상수
    private  static final double PI = 3.141592;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double calculagteArea() {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        int radius = scanner.nextInt();

        Circle circle = new Circle(radius);
        System.out.println("원의 반지름: " + circle.radius);
        System.out.println("원의 넓이: " + circle.calculagteArea());

        scanner.close();
    }
}
