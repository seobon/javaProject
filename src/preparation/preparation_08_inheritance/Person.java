package preparation.preparation_08_inheritance;

public class Person {
    private int age;
    private String name;

    public Person(String name) {
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("익명");
    }
}