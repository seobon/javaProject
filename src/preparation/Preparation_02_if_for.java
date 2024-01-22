package preparation;

import java.util.Scanner;

public class Preparation_02_if_for {
    public static void main(String[] args) {

//        int number = 5;
//        if (number % 3 == 0) {
//            System.out.println("3의 배수입니다.");
//        }
//        else {
//            System.out.println("3의 배수가 아닙니다.");
//        }
//
//        String name = "손주연";
//        if (name.equals("손주연")) {
//            System.out.println("손주연님 환영합니다.");
//        }
//        else {
//            System.out.println("익명님 환영해요.");
//        }
//
//        switch (number%3) {
//            case 0:
//                System.out.println("3의 배수입니다.");
//                break;
//            default:
//                System.out.println("3의 배수가 아닙니다.");
//        }
//
//        for(int i=0; i<10; i++) { // i가 0~9까지 10번 반복
//            System.out.print(i); // 0에서 9까지 출력
//        }
//
//        int i = 0;
//        while (i<10) {
//            System.out.print(i);
//            i++;
//        }
//
//        do {
//            System.out.print(i);
//            i++;
//        }
//        while (i<10);

        // 실습 2
//        System.out.println("나이를 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        if (age <= 7) {
//            System.out.println("유아");
//        } else if (age <= 13) {
//            System.out.println("초등학생");
//        } else if (age <= 16) {
//            System.out.println("중학생");
//        } else if (age <= 19) {
//            System.out.println("고등학생");
//        } else {
//            System.out.println("성인");
//        }

        // 실습 3
//        System.out.println("이름을 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//
//        if (name.equals("손주연")) {
//            System.out.println("은서");
//        } else if (name.equals("추소정")) {
//            System.out.println("엑시");
//        } else {
//            System.out.println("모르겠어요.");
//        }

        // 실습 4
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(i);
        }
    }
}
