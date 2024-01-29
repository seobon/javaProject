package preparation.preparation_12_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prac {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");

        while (true) {
            System.out.print("정수 입력: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if (num != -1) {
                set.add(num);
            } else {
                System.out.println("중복이 제거된 정수 목록: " + set);
                break;
            }
        }
    }
}
