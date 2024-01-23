package preparation.training12;

import java.util.Scanner;

// 사각형의 넓이를 구하는 Rectangle 클래스
public class Rectangle {
    // 필드(변수) 선언
    // 필드(변수): width, height
    public int width;
    public int height;

    // 생성자: width 와 height 설정할 2개의 숫자를 매개변수로 받기.
    public Rectangle(int widthNum, int heightNum) {
        // 매개변수로 받은 숫자 두 개를 필드(변수)에 할당함
        this.width = widthNum;
        this.height = heightNum;
    }

    // 메소드: width 와 height 를 이용하여 사각형의 넓이를 반환하는 area 메소드 만들기
    public int getArea() {
        return width * height; // 사각형의 넓이를 계산하여 반환하는 메소드
    }
    public static void main(String[] args) {
        // 객체 생성 시에 width 와 height을 사용자에게 입력 받아 생성자로 넘겨주기

        // width 와 height을 사용자에게 입력 받아
        System.out.println("width 와 height 를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int inputWidth = scanner.nextInt();
        int inputHeight = scanner.nextInt();

        // 객체 생성 시에 생성자로 넘겨주기
        Rectangle rectangle = new Rectangle(inputWidth, inputHeight);

        // new Rectangle(inputWidth, inputHeight);
        // : Rectangle 클래스의 생성자를 호출하여 객체를 생성한다.
        //  inputWidth 와 inputHeight 는 사용자로부터 입력받은 가로 길이와 세로 길이이다.
        //  이 값들은 생성자의 매개변수로 전달됩니다.

        // Rectangle rectangle = new Rectangle(inputWidth, inputHeight);
        // : 생성된 객체를 rectangle 변수에 할당한다.
        // 이렇게 하면 rectangle 변수는 Rectangle 클래스의 인스턴스를 참조하게 된다.
        // Rectangle 이라는 틀에 맞춰 만들어진 제품(객체)이 인스턴스다.
        // Rectangle 클래스에 맞춰 만들어진 객체가 new Rectangle(inputWidth, inputHeight)이고,
        // rectangle 이름을 가진 변수에 그 객체를 담았을 뿐이다.
        // 이후에 rectangle 변수를 사용하여 해당 객체의 메소드를 호출하거나 필드에 접근할 수 있다.

        System.out.println(rectangle.getArea()); // 사각형의 넓이 계산
        // rectangle (에 담긴 인스턴스 객체) 안에 있는 메소드(getArea)를 실행시킨다.


        // 즉, 위 코드는

        // Rectangle 이라는 클래스 안에
        // 넘겨받은 매개변수로 이미 선언된 필드(변수) width 와 height 에 값을 할당하는 생성자가 있고,
        // 필드 width 와 height 를 곱하는 메소드가 있다.

        // main 에서 사용자에게 입력받은 수를
        // Rectangle 클래스로 만들어낸 객체(인스턴스)에 방금 입력받은 수를 넣어
        // 이미 선언된 필드(변수) width 와 height 에 값을 할당하고,
        // 인스턴스 안에도 있을 메소드(getArea)를 사용해 넓이를 구하는 함수이다.
    }
}
