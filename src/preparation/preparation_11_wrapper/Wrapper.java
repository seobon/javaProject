package preparation.preparation_11_wrapper;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); // 오토박싱으로 int가 Integer로 변환되어 저장
        numbers.add(2);
        int sum = numbers.get(0) + numbers.get(1); // 오토언박싱으로 Integer가 int로 변환
        System.out.println("합계: " + sum);
    }
}
