package _05_class._05_prac;

public abstract class Student {
    protected String name;
    protected String school;
    protected int age;
    protected int studentID;

    public Student(String name, String school, int age, int studentID) {
        // 초기화
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentID = studentID;
    }

    abstract void todo();
}
