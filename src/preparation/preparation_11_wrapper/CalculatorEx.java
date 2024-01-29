package preparation.preparation_11_wrapper;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculatorInteger = new Calculator<>(5, 27);
        Calculator calculatorDouble = new Calculator<>(5.27, 2.06);

        System.out.println(calculatorInteger.add());
        System.out.println(calculatorDouble.add());
    }
}
