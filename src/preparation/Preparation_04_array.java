package preparation;

import java.util.Scanner;

public class Preparation_04_array {
    public static void main(String[] args) {
        // 배열 선언
//    int[] intArray;
//    char[] charArray;

        // 배열 생성
//    int[] intArray = new int[10];
//    char[] charArray = new char[20];

        // 배열 초기화
        int[] intArray = { 1, 2, 3, 4, 5 };
//
//        for(int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + " ");
//        };
//
//        System.out.println(Arrays.toString(intArray));

//        int[][] intArray;
//        char[][] charArray;
//        double[][] doubleArray;
//
//        int [][] intArray = new int[2][5];
//        char [][] charArray = new char[2][5];
//        double [][] doubleArray = new double[2][5];

//        int intArray[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        char charArray[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
        double doubleArray[][] = { { 5.27, 2.06 }, { 12.26, 11.06 } };

        for( int value : intArray ) {
            System.out.print( value + " ");
        }


        // 실습 7
        int[] numbers = new int[5];

        System.out.println("다섯 개의 정수를 입력하세요");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / 5;
        System.out.println("평균은 " + average + "입니다.");

        scanner.close();
    }
}
