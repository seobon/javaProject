package preparation.preparation_12_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요. '종료'를 입력하면 종료됩니다.");
        String name;
        int age;

        while (true) {
            System.out.print("이름 입력: ");
            name = scanner.nextLine();

            if (!name.equals("종료")) {
                System.out.print("나이 입력: ");
                age = scanner.nextInt();
                scanner.nextLine(); // 엔터 키 소비

                map.put(name, age);
            } else {
                System.out.println("=== 입력받은 이름과 나이 목록 ===");
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
                }
                break;
            }
        }
    }
}