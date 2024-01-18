package _02_control_statement;

import java.util.Scanner;

public class prac_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i=0; i<=num; i++) {
            System.out.println(i);
        }
    }


}