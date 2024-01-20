package preparation;

import java.util.Scanner;

public class Preparation_03_method {
    //    public static void hello() {
//        System.out.println("안녕");
//    };
//    public static void main(String[] args) {
//        hello();
//    }

//    public static int sum(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(1, 2));
//    }

    // 정수 두 개를 더하는 메소드
//    public int add(int a, int b) {
//        return a + b;
//    }

    // 실수 두 개를 더하는 메소드
//    public double add(double a, double b) {
//        return a + b;
//    }

    // 정수 세 개를 더하는 메소드
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static void main(String[] args) {
//        Preparation_03_method func = new Preparation_03_method();
//
//        System.out.println(func.add(10, 20));
//        System.out.println(func.add(10.8, 20.4));
//        System.out.println(func.add(10, 20, 40));
//    }

    // 실습 5
    public static void calc(double a, double b) {
        double plus = a + b;
        double minus = a - b;
        double division = a / b;
        double multiplication = a * b;
        System.out.println("덧셈 결과 : " + plus);
        System.out.println("뺄셈 결과 : " + minus);
        System.out.println("나눗셈 결과 : " + division);
        System.out.println("곱셈 결과 : " + multiplication);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        calc(number1, number2);
    }
}
