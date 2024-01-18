package _03_array;

import java.util.Arrays;
import java.util.Scanner;

public class prac_05 {
    public void getAve(double a, double b, double c, double d, double e) {
        System.out.printf("평균은 %.2f입니다.\n", (a + b + c + d + e) / 5);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        prac_05 pr = new prac_05();
//
//        int[] numbers = new int[5];
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
//        double sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//
//        double ave = sum / 5;
//        System.out.println("평균은 " + ave + "입니다.");
//
//        sc.close();

        // - 배열 길이를 벗어난다면
//        System.out.println(doubleArray[doubleArray.length]); // error

        // 배열 출력
        // - toString(): 배열 내용을 문자열로 변환하여 반환
        // - 배열 이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고 싶을 때
//        System.out.println("intArray: " + Arrays.toString(intArray));
//        System.out.println("charArray: " + Arrays.toString(charArray));
//        System.out.println("doubleArray: " + Arrays.toString(doubleArray));

        // 다차원 배열
        // - 배열 안에 또 다른 배열이 존재하는 배열
        // 2 x 3 배열 생성 및 초기화
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        // 3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println("matrix: ");
        for (int i = 0; i < matrix.length; i++) {
//            System.out.print("matrix.length 1" + matrix.length);
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print("matrix.length 2" + matrix.length);
                // (0.0)
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        // ver.1 반복문으로 요소 하나씩 복사
//        int[] originArray = {1, 2, 3};
//        int[] newArray = new int[5];
//
//        for (int i = 0; i < originArray.length; i++) {
//            newArray[i] = originArray[i];
//        }
//        System.out.println(Arrays.toString(newArray)); // [1, 2, 3, 0, 0]
//
//        String[] originFruits = {"apple", "banana", "kiwi"};
//        String[] newFruits = new String[5];
//
//        System.arraycopy(originFruits, 0, newFruits, 0, originFruits.length);
//        System.out.println(Arrays.toString(newFruits));
//
//        // Arrays 메소드
//        // copyOf(arr, copyArraylength) 메소드
//        int[] originalArray = {1, 2, 3, 4, 5};
//        int[] copiedArray = Arrays.copyOf(originalArray, 3);
//        System.out.println("original Array: " + Arrays.toString(originalArray));
//        System.out.println("copied Array: " + Arrays.toString(copiedArray));
//
//        // copyOfRange(arr, sIdx, eIdx) 메소드
//        int[] rangeArray = Arrays.copyOfRange(originalArray, 1, 4);
//        System.out.println("range Array: " + Arrays.toString(rangeArray));
//
//        int[] filledArray = new int[5];
//        System.out.println("filled Array (before): " + Arrays.toString(filledArray));
//        Arrays.fill(filledArray, 7);
//        System.out.println("filled Array (after): " + Arrays.toString(filledArray));
//
//        // sort(arr) 메소드
//        int[] unsortedArray = {5, 3, 4, 2, 1};
//        Arrays.sort(unsortedArray);
//        System.out.println("unsorted Array: " + Arrays.toString(unsortedArray));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 2, 3};

        boolean arrEqual = Arrays.equals(arr1, arr2);
        boolean arrEqual2 = Arrays.equals(arr1, arr3);

        System.out.println("1 vs 2 " + arrEqual);
        System.out.println("1 vs 3 " + arrEqual2);

        System.out.println("== 1 vs 2 " + (arr1 == arr2));
        System.out.println("== 1 vs 3 " + (arr1 == arr3));

        int[][] deepArray1 = {{1, 2}, {3, 4}};
        int[][] deepArray2 = {{1, 2}, {3, 4}};
        int[][] deepArray3 = {{1, 2}, {3, 5}};

        boolean deepArrEq = Arrays.deepEquals(deepArray1, deepArray2);
        boolean deepArrEq2 = Arrays.deepEquals(deepArray1, deepArray3);

        System.out.println("1 vs 2 " + deepArrEq);
        System.out.println("1 vs 3 " + deepArrEq2);

        // binarySearch( arr, val ) 메소드 (단, 배열은 정렬된 상태여야 함)
        int[] sortedArr = {12, 23, 34, 45, 56};
        int index = Arrays.binarySearch(sortedArr, 45);
        System.out.println("index of 45: " + index);
    }
}