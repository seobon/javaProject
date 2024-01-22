package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Preparation_06_exception {
//    public static void main(String[] args) {
//        int num1 = 4;
//        int num2 = 0;
//
//        try {
//            // 예외가 발생할 가능성이 있는 실행문(try 블록)
//            System.out.println(num1 + " ÷ " + num2 + " = " + (num1/num2));
//        }
//        catch (ArithmeticException e) {
//            // 예외 처리문(catch 블록)
//            System.out.println("0으로 숫자를 나누는 것은 성립되지 않습니다.");
//        }
//        finally {
//            // 예외 발생 여부와 상관없이 무조건 실행되는 문장(finally 블록)
//            // (finally 블록은 생략 가능)
//            System.out.println("이 곳은 finally 블록 입니다.");
//        }
//        System.out.println("이상입니다.");
//    }

    // 실습 9
//    public static void main(String[] args) {
//        int[] arr = { 5, 27, 2, 6 };
//
//        try {
//            for (int i = 0; i <= 5; i++) {
//                System.out.println(arr[i] + " ");
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스가 범위를 벗어났습니다.");
//        }
//        finally {
//            System.out.println("이 곳은 finally 블록 입니다.");
//        }
//        System.out.println("이상입니다.");
//    }

    // 실습 10
//    public static void main(String[] args) {
//        System.out.println("배열의 크기를 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//
//        int size = 0;
//        try {
//            size = scanner.nextInt();
//        }
//        catch (InputMismatchException e) {
//            System.out.println("배열의 크기에는 숫자를 입력해주세요.");
//            return;
//        }
//        finally {
//            System.out.println("배열 크기 확인 과정 끝");
//        }
//
//
//        int[] arr = null;
//        int sum = 0;
//        int ave = 0;
//
//        try {
//            arr = new int[size];
//        }
//        catch (NegativeArraySizeException e) {
//            System.out.println("배열의 크기는 음수 일 수 없습니다.");
//            return;
//        }
//        finally {
//            System.out.println("배열 생성 과정 끝");
//        }
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = i;
//        }
//
//        try {
//            for (int i = 0; i < arr.length; i++) {
//                sum += arr[i];
//            }
//        }
//        catch (NullPointerException e) {
//            System.out.println("배열이 비어있습니다.");
//            return;
//        }
//        finally {
//            System.out.println("총합 계산 끝");
//        }
//
//        try {
//            ave = sum/size;
//        }
//        catch (ArithmeticException e) {
//            System.out.println("배열의 크기는 0일 수 없습니다.");
//            return;
//        }
//        finally {
//            System.out.println("평균 계산 끝");
//        }
//
////        System.out.println(Arrays.toString(arr));
////        System.out.println(sum);
//        System.out.println("평균 : " + ave);
//    }

    // 실습 11
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> duplicationArr = new ArrayList<>();
        int a = 0;
        int b = 0;

        System.out.print("배열의 크기를 입력하십시오: ");
        Scanner sizeScanner = new Scanner(System.in);
        int size = 0;
        try {
            size = sizeScanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("배열의 크기에는 숫자를 입력해주세요.");
            return;
        }
        finally {
            System.out.println("배열 크기 확인 과정 끝");
        }


        System.out.println("배열의 요소를 입력하십시오: ");
        for (int i = 0; i < size; i++) {
            Scanner elScanner = new Scanner(System.in);
            int el = 0;
            try {
                el = elScanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("배열의 요소에는 숫자를 입력해주세요.");
                return;
            }
            finally {
                System.out.println("배열 요소 " + el + " 입력 중");
            }
            arr.add(el);
        }
        System.out.println("배열 요소 입력 과정 끝");

        for (int i = 0; i < arr.size(); i++) {
            a = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                b = arr.get(j);
                if (a == b && !duplicationArr.contains(a)) {
                    duplicationArr.add(a);
                }
            }
        }
        System.out.println("중복된 숫자 서브 배열: " + duplicationArr);
    }
}
