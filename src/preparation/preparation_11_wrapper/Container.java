package preparation.preparation_11_wrapper;

public class Container<T> {
    public T something;

    public static void main(String[] args) {
        Container<Integer> c1 = new Container<Integer>();
        c1.something = 100;
    }

//    public class 클래스명 <T> {
//
//    }
//    public interface 인터페이스명 <E> {
//
//    }
}
