package preparation.preparation_10_interface;

public class Car extends Vehicle{
    @Override
    public void move() {
        System.out.println("도로를 따라 이동 중");
    }
}
