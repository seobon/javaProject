package coding_test;

import java.util.Scanner;
// import 는 꼭 써주어야 함

public class Java_02 {
    public static void main(String[] args) {
        // 그런데 String[] args 는 왜 쓰는걸까

        // String[] args는 문자열 배열로, 프로그램 실행 시 커맨드 라인에서 입력하는 인자들을 받아옵니다.
        // 이 배열을 통해 사용자가 프로그램 실행 시 제공하는 데이터를 프로그램 내에서 사용할 수 있습니다.

        // 프로그램 실행 시 커맨드 라인을 통해 전달된 인자들을 저장하고, 이를 프로그램 내에서 사용할 수 있게 합니다.
        // 예를 들어, 파일 이름이나 특정 옵션 값 등을 실행 시점에 지정할 수 있습니다.

        // 사용자로부터 입력 받은 데이터를 기반으로 프로그램의 동작을 변경할 수 있어,
        // 프로그램의 활용도와 유연성이 증가합니다

        // 결론: 사용자로부터 값을 입력받기 위해서라는 것 같다

        Scanner scanner = new Scanner(System.in);
        // 코드 마지막 ; 세미콜론 잊지말것

        System.out.print("입력");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println("A는");
        System.out.println(A);
        System.out.println("B는");
        System.out.println(B);

        if (A > B) {
            System.out.print(">");
        } else if (A < B) {
            System.out.print("<");
        } else if (A == B) {
            System.out.print("==");
        }
    }
}
