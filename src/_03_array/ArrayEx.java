package _03_array;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr1;
        int arr2[];

        String[] temp = null;
        System.out.println(temp);
//        System.out.println(temp[0]); // error

        int[] intArray = {16, 22, 34, 41, 59};
        System.out.println("intArray[0]: " + intArray[0]);
        System.out.println("intArray[1]: " + intArray[1]);
        System.out.println("intArray[2]: " + intArray[2]);
        System.out.println("intArray: " + intArray); // 참조값 저장

        intArray[1] = 77; // 인덱스 1번 항복 값 변경
        System.out.println("intArray[1]: " + intArray[1]);

        // 주의 . 중괄호로 감싼 목록을 배열 변수에 대입할 때, 배열 변수를 미리 선언한 수에는 값 목록을 변수에 대입 불가
        char[] charArray;
//        charArray = {'A', 'B', 'C'} // 컴파일 에러
        // 베얄ㅇ,;'
        charArray = new char[]{'A', 'B', 'C'};
        System.out.println("charArray[0]: " + charArray[0]);
        System.out.println("charArray[1]: " + charArray[1]);

        // - new 연산자로 배열 선언과 배열 생성
        // : new 연산자로 배열 처음 생성하면 배열 항목을 기본 값으로 초기화 됨
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화된 값 : " + doubleArray[0]);
        doubleArray[0] = 0.1;
        doubleArray[1] = 1.1;
        doubleArray[2] = 3.4;
        System.out.println("doubleArray[0] : " + doubleArray[0]);
        System.out.println("doubleArray[1] : " + doubleArray[1]);
        System.out.println("doubleArray[3] : " + doubleArray[2]);

        //////////////////////////////
        // 배열 길이
        // - 배열변수.length;
        // - length 필드는 읽기만 가능, 값 변경 불가능
        System.out.println("doubleArray length : " + doubleArray.length);
    }
}
