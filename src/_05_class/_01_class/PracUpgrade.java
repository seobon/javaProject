package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class PracUpgrade {
    public int width;
    public int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        ArrayList<Integer> rec = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        rec.add(width);
        rec.add(height);
    }
}
