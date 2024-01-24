package _05_class._06_prac_2;

public class VehicleEx {
    public static void main(String[] args) {
        // Vehicle 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

        // Car 객체 생성 및 배열에 저장
        Car car = new Car("자동차", 100);
        vehicles[0] = car;

        // Airplane 객체 생성 및 배열에 저장
        Airplane airplane = new Airplane("비행기", 500);
        vehicles[1] = airplane;

        // 추가
        // 상위 -> 하위 : () 명시
        // 하위 -> 상위 : 생략 가능
        // 당연하게도 상위에 있는 건 하위에 있겠지만
        // 하위에 있는 건 상위에 없을 수도 있기 때문이다.

        // 배열 순회
        for (Vehicle vehicle : vehicles) {
            System.out.println("이름 : " + vehicle.getName());
            vehicle.move();

            System.out.println(vehicle instanceof Flyable);
            // instanceof 는 자기 자신이거나 자식일 때 true가 나온다
            //Flyable 구현한 경우 fly() 메서드를 호출
            if (vehicle instanceof Flyable) {
//                vehicle.fly();
                ((Flyable) vehicle).fly(); // 형변환(캐스팅) 해서 fly 실행

//                만약 (vehicle instanceof Airplane) 이었다면 ((Airplane) vehicle).fly();가 됐을 것이다.
                //이렇게 자동으로 맞춰주는 걸 자바의 다용성? 이라고 한단다. 검색해보란다.
                // 캐스팅에는 업캐스팅과 다운캐스팅이 있다.
                // 말 그대로 상위 클래스로 캐스팅하는지 하위 클래스로 캐스팅 하는지 의미하고,
                // 위 (Flyable) 처럼 명시하는 것은 상위 클래스에서 하위 클래스로 캐스팅 하는 것이다.
            }
        }
    }
}
