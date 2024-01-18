package _02_control_statement;

import java.util.Scanner;

public class prac_04 {
//    public void calc(double x, double y) {
//        System.out.printf("덧셈 결과: %.1f", x + y).println();
//        System.out.printf("뺄셈 결과: %.1f", x - y).println();
//        System.out.printf("나눗셈 결과: %.1f", x / y).println();
//        System.out.printf("곱셈 결과: %.1f", x * y).println();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        prac_04 pr = new prac_04();
//
//        System.out.println("숫자를 두 개 입력하세요 : ");
//        double n1 = sc.nextDouble();
//        double n2 = sc.nextDouble();
//
//        pr.calc(n1, n2);
//        sc.close();
//    }

    public void getArea(int r) {
        System.out.printf("반지름이 %d 인 원의 넓이 : %f", r, r * r * Math.PI).println();
    }

    public void getArea(int x, int y) {
        System.out.printf("가로 %d, 세러 %d 인 직사각형의 넓이 : %d", x, y, x * y).println();
    }

    public void getArea(int w, int h, boolean isTriangle) {
        System.out.printf("밑변 %d, 높이 %d 인 삼각형의 넓이 : %f", w, h, 0.5 * w * h).println();
    }

    public static void main(String[] args) {
        prac_04 pr = new prac_04();

//        System.out.println("숫자를 두 개 입력하세요 : ");
//        double n1 = sc.nextDouble();
//        double n2 = sc.nextDouble();

//        pr.getArea(n1, n2);
//        pr.getArea(n1, n2);
//        pr.getArea(n1, n2);
//        sc.close();
    }
}