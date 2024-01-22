package preparation;

import java.util.ArrayList;
import java.util.Scanner;

public class Preparation_05_arrayList {
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<String> arrayList2 = new ArrayList<>();
    ArrayList<Double> arrayList3 = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> textArrayList = new ArrayList<>();

        while (true) {
            System.out.println("문자를 입력해주세요. : ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.next();
            textArrayList.add(text);
            if (text.equals("exit")) {
                System.out.println(textArrayList);
//                for (int i = 0; i < textArrayList.length; i++) { // error
//                    System.out.println(textArrayList[i]); // error
                for (int i = 0; i < textArrayList.size(); i++) {
                    System.out.println(textArrayList.get(i));
                }
                break;
            }
        }
    }
}
