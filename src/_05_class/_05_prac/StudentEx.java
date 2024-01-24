package _05_class._05_prac;

public class StudentEx {
    public static void main(String[] args) {
        Son son = new Son("손주연", "우주 고등학교", 17, 20170527);
        Lee lee = new Lee("이루다", "우주 고등학교", 18, 20180206);

        System.out.println("=== 손주연 학생의 정보 ===");
        System.out.println("학교: " + son.school);
        System.out.println("나이: " + son.age);
        System.out.println("학번: " + son.studentID);
        son.todo();

        System.out.println("=== 이루다 학생의 정보 ===");
        System.out.println("학교: " + lee.school);
        System.out.println("나이: " + lee.age);
        System.out.println("학번: " + lee.studentID);
        lee.todo();
    }
}
