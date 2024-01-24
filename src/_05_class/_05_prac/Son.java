package _05_class._05_prac;

public class Son extends Student {
    public Son(String name, String school, int age, int studentID) {
        super(name, school, age, studentID);
    }

    public void todo() {
        System.out.println("점심으로 뭐 먹을까용?");
    }
}
