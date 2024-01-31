package preparation.preparation_11_wrapper;

public class Calculator <T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        setNum1(num1);
        setNum2(num2);
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }


    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }
}
