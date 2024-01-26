package preparation.preparation_09_abstract;

public class Son extends Student{
    public Son(String name, String school, int age, int studentID) {
        setName(name);
        setSchool(school);
        setAge(age);
        setStudentID(studentID);
    }

    @Override
    public void todo() {
        System.out.println("오늘 점심은 밥으로 먹어용");
    }
}
