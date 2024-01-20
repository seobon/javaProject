package _03_array;

import java.util.Arrays;
import java.util.Scanner;

public class prac_05 {
    public void getAve(double a, double b, double c, double d, double e) {
        System.out.printf("평균은 %.2f입니다.\n", (a + b + c + d + e) / 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prac_05 pr = new prac_05();

        int[] numbers = new int[5];
//
//        System.out.print("다섯 개의 정수를 입력하세요: ");
//
//        for ( int i = 0; i < numbers.length; i++ ) {
//            numbers[i] = sc.nextInt();
//        }

//        double n1 = sc.nextDouble();
//        double n2 = sc.nextDouble();
//        double n3 = sc.nextDouble();
//        double n4 = sc.nextDouble();
//        double n5 = sc.nextDouble();
//        pr.getAve(n1, n2, n3, n4, n5);

        // 평균 계산
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double ave = sum / 5;
        System.out.println("평균은 " + ave + "입니다.");

        sc.close();
    }
}