package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class prac_07_Exception {
//    public static void main(String[] args) {
//        int[] Array = {16, 22, 34, 41};
//
//        try {
//            for (int i=0;i<=5;i++) {
//                System.out.println("Array[" + i + "]: " + Array[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스가 범위를 벗어났습니다.");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            // 배열 크기 입력
//            System.out.print("배열 크기를 입력하세요: ");
//            int size = scanner.nextInt();
//
//            if (size <= 0) {
//                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
//            }
//
//            // 배열 생성
//            int[] arr = new int[size];
//
//            // 배열 요소 입력
//            System.out.println(size + "개의 정수를 입력하세요:");
//            int sum = 0;
//            for (int i = 0; i < size; i++) {
//                System.out.print("정수 " + (i + 1) + ": ");
//                arr[i] = scanner.nextInt();
//                sum += arr[i];
//            }
//
//            // 평균 계산
//            double average = (double) sum / size;
//            System.out.println("평균은 " + average + "입니다.");
//        } catch (java.util.InputMismatchException e) {
//            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            // Scanner 닫기
//            scanner.close();
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 배열 크기 입력
            System.out.print("배열 크기를 입력하세요: ");
            int size = scanner.nextInt();

            // 배열 생성
            int[] arr = new int[size];

            // 배열 요소 입력
            System.out.println(size + "개의 정수를 입력하세요:");
            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            // 중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicates(arr);

            // 중복된 요소 출력
            if (duplicates.isEmpty()) {
                System.out.println("중복된 요소가 없습니다.");
            } else {
                System.out.println("중복된 요소: " + duplicates);
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요.");
        } finally {
            // Scanner 닫기
            scanner.close();
        }
    }

    // 중복된 요소 찾는 메소드
    private static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    // 중복된 요소 발견
                    duplicates.add(arr[i]);
                }
            }
        }

        return duplicates;
    }
}
