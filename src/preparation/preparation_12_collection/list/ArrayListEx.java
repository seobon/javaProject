package preparation.preparation_12_collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Book> list = new ArrayList<>();

        // 객체 추가
        list.add(new Book("말포이, 닥치지 않아도 괜찮아", "말포이"));
        list.add(new Book("광희, 두번씩 버려져도 괜찮아", "황광희"));
        list.add(new Book("개발자, 욕하지 않아도 괜찮아", "SB.Kim"));
        list.add(new Book("몰라, 요즘 책 제목 이상해.", "SB.Kim"));

        // 리스트 개수 얻기
        int size = list.size();
        System.out.printf("총 %d 권의 책이 존재합니다. %n%n", size);

        // 특정 인덱스 객체 가져오기
        Book thirdBook = list.get(2);
        System.out.println("세 번째 책 제목: " + thirdBook);

        // 인덱스로 특정 객체 삭제
        list.remove(2);

        // 반복문으로 모든 객체 하나씩 가져오기
        for (Book b : list) {
            System.out.println(b);
        }

        // 모든 객체 삭제
        System.out.println("객체가 비어 있나요? " + list.isEmpty());
        list.clear();
        System.out.println("객체가 비어 있나요? " + list.isEmpty());
    }
}
