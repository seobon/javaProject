package _05_class._09_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요 시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간: " + (endTime - startTime));

        // ArrayList 소요 시간: 5024700
        // LinkedList 소요 시간: 633300

        // 결과 해석
        // - LinkedList 가 요소 추가에 대해 더 빠른 성능을 냄
        // - ArrayList 는 0번 인덱스에 새로운 요소를 추가하면서, 기존 요소 인덱스를 한 칸씩 뒤로 미는 작업을 하기 때문
    }
}
