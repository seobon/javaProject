package preparation.preparation_08_inheritance;

public class PersonEx {
    public static void main(String[] args) {
        Student student = new Student(21, "손주연");
        student.setSchool("성균관대학교");

        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getSchool());

        student.printName();
    }
}