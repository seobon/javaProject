package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class prac_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> chat = new ArrayList<>();

        String text;
        do {
            System.out.print("문자를 입력해주세요.: ");
            text = sc.nextLine().trim();

            if (!text.equals("exit")) {
                chat.add(text);
            }
        } while (!text.equals("exit"));

        for (String message : chat) {
            System.out.println(message);
        }
    }
}
