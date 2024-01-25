package preparation.preparation_07_trainingClass;

import java.util.ArrayList;

public class Student {
    String name;
    int student_ID;
    int grade;
    public static int totalStudents = 0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int student_ID, int grade) {
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
    }

    // 1. main 메서드는 정적 메서드이므로, 정적 메서드에서는 인스턴스 메서드인 displayInfo를 직접 호출할 수 없다.
    // 해결하기 위해서는 displayInfo 메서드도 정적으로 선언해야 한다.
    // 2. displayInfo 메서드에서 main 메서드에 있는 stArray 배열을 받아오려면,
    // displayInfo 메서드에 stArray를 파라미터로 추가해야 한다.
    public static void displayInfo(ArrayList<Student> stArray) {
        for (int i = 0; i < stArray.size(); i++) {
            System.out.println("=== 학생 정보 ===");
            System.out.println("이름: " + stArray.get(i).name);
            System.out.println("학번: " + stArray.get(i).student_ID);
            System.out.println("학년: " + stArray.get(i).grade);
        }
        System.out.println("총 학생 수는 " + totalStudents + " 입니다.");
    }
    public static void main(String[] args) {
        ArrayList<Student> stArray = new ArrayList<>();

        Student student1 = new Student("손주연", 20170527, 1);
        stArray.add(student1);
        totalStudents++;
        Student student2 = new Student("이루다", 20180206, 2);
        stArray.add(student2);
        totalStudents++;
        Student student3 = new Student("김현정", 20191226, 3);
        stArray.add(student3);
        totalStudents++;

        displayInfo(stArray);
    }
}
