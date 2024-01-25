package preparation.preparation_08_inheritance;

public class Student extends Person {
    private String school;

    public Student(int age, String name) {
        super(name);
        setAge(age);
//        setName(name);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }
}
