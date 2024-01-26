package preparation.preparation_09_abstract;

public class Kim extends Student {
    public Kim(String name, String school, int age, int studentID) {
        setName(name);
        setSchool(school);
        setAge(age);
        setStudentID(studentID);
    }

    @Override
    public void todo() {
        System.out.println("싫어 빵 먹을거야");
    }
}
