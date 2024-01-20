package preparation;

import java.util.Scanner;

public class preparation_01_basic_syntax {
    public static void main(String[] args) {
//        System.out.println("안녕");

//        System.out.println("이름, 나이, 키, 결혼 여부를 빈칸으로 분리하여 입력하세요");
//
        Scanner scanner = new Scanner(System.in);
//
//        String name = scanner.next(); // 문자열 읽기
//        int age = scanner.nextInt(); // 정수 읽기
//        double height = scanner.nextDouble(); // 실수 읽기
//        boolean single = scanner.nextBoolean(); // 논리값 읽기
//
//        System.out.print("이름은 " + name + ", ");
//        System.out.print("나이는 " + age + "세, ");
//        System.out.print("키는 " + height + "cm, ");
//        System.out.println("결혼 여부는 " + single + "입니다.");


        // 실습 1
        System.out.println("이름을 입력하세요.");
        String name = scanner.next();
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();

        System.out.println("안녕하세요! " + name + "님(" + age + "세)");
    }
}