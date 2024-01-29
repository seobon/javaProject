package preparation.preparation_11_wrapper;

import java.util.ArrayList;


//일반 클래스
//addElement()에는 항상 String만 가능

//public class MyCustomList {
//    ArrayList<String> list = new ArrayList<>();
//    public void addElement(String element) {
//        list.add(element);
//    }
//
//    public void removeElement(String element) {
//        list.remove(element);
//    }
//}


//제네릭 클래스
//addElement()에는 원하는 타입의 데이터 삽입 가능

public class MyCustomList <T> {
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }
}