package _03_array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers.get(0));

        numbers.set(1, 77);
        System.out.println(numbers);

        numbers.add(1, 7);
        System.out.println(numbers);

        System.out.println(Arrays.asList(99, 33 ,55));
        numbers.addAll(Arrays.asList(99, 33 ,55));
        System.out.println(numbers);

        System.out.println(numbers.indexOf(10));

        numbers.remove(2);
        System.out.println(numbers);
//        numbers.clear();
//        System.out.println(numbers);

        System.out.println(numbers.size());

        for (Integer n : numbers) {
            System.out.print((n + " "));
        }

        // Student 타입의 ArrayList 생성
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 10));

        // 위 코드와 같은 의미
        Student std1 = new Student("Jennie", 14);
        students.add(std1);

        students.add(new Student("주연", 10));
        students.add(new Student("루다", 11));
        students.add(new Student("설아", 15));
        students.add(new Student("소정", 14));

        System.out.println(students); // 이건 주소값
        System.out.println(students.size());

        Student std = students.get(4);
        System.out.println(std.getName() + " 학생은 " + std.getAge() + "살 입니다.");

        System.out.println("=== 학생 명단 ===");
        for (Student student : students) {
            System.out.println(student.getName() + "(" + student.getAge() + "세)");
        }

        System.out.println(Arrays.toString((students.toArray())));
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
}
