package coding_test;

import java.util.Scanner;

public class Java_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("시험 점수를 입력해주세요.");
        int score = scanner.nextInt();
        
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("D");
        } else if (score <= 59 && score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("점수 입력이 잘 못 되었습니다.");
        }
    }
}
