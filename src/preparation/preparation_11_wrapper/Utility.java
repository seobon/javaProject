package preparation.preparation_11_wrapper;


//일반 메서드
//두 개의 문자열을 출력하는 메서드

//public class Utility {
//    public static void printPair(String first, String second) {
//        System.out.println("(" + first + "," + second + ")");
//    }
//
//    public static void main(String[] args) {
//        printPair("은서", "루다");
//    }
//}


//제네릭 메서드
//두 개의 아이템을 출력하는 메서드

public class Utility {
    public static <T> void printPair(T first, T second) {
        System.out.println("(" + first + "," + second + ")");
    }

    public static void main(String[] args) {
        printPair("은서", "루다");
        printPair(170, 156);
        printPair(5.27, 2.06);
    }
}