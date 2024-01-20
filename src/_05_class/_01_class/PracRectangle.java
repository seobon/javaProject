package _05_class._01_class;

import java.util.Scanner;

public class PracRectangle {
    private int width;
    private int height;

//    public PracRectangle(int x, int y) {
//        width = x;
//        height = y;
//    }

    public PracRectangle(int width, int height) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드값에 접근
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        PracRectangle rectangle = new PracRectangle(width, height);
        System.out.print("넓이 :" + rectangle.area());

        scanner.close();
    }

}
