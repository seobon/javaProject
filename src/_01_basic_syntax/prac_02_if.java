package _01_basic_syntax;

import java.util.Scanner;

public class prac_02_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        if (age < 8) {
            System.out.println("유아");
        } else if (age < 14) {
            System.out.println("중학생");
        } else if (age < 17) {
            System.out.println("중학생");
        } else if (age < 20) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        Scanner sc2 = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc2.nextLine();

        if (name.equals("성춘향")) {
            System.out.println("여자");
        } else if (name.equals("홍길동")) {
            System.out.println("남자");
        } else {
            System.out.println("모르겟어욤");
        }
    }


}