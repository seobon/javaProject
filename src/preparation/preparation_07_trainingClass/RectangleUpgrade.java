package preparation.preparation_07_trainingClass;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleUpgrade {
    private int width;
    private int height;

    public RectangleUpgrade() {
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        ArrayList<RectangleUpgrade> rectangleArray = new ArrayList<>();

        while (true) {
            System.out.println("width 와 height 를 입력해주세요.");
            Scanner scanner = new Scanner(System.in);
            int inputWidth = scanner.nextInt();
            int inputHeight = scanner.nextInt();

            RectangleUpgrade rectangleUpgrade = new RectangleUpgrade();
            if (inputWidth != 0 || inputHeight != 0) {
                rectangleUpgrade.setWidth(inputWidth);
                rectangleUpgrade.setHeight(inputHeight);

                rectangleArray.add(rectangleUpgrade);
            } else {
                for (int i = 0; i < rectangleArray.size(); i++) {
                    rectangleUpgrade.setWidth(rectangleArray.get(i).width);
                    rectangleUpgrade.setHeight(rectangleArray.get(i).height);
                    System.out.println("가로 길이는: " + rectangleArray.get(i).width);
                    System.out.println("세로 길이는: " + rectangleArray.get(i).height);
                    System.out.println("넓이는: " + rectangleUpgrade.getArea());
                    System.out.println("-------------------");
                }
                break;
            }
        }
    }
}
