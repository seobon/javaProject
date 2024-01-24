package preparation.preparation_07_class;

public class Person {
    private int age;
    private String name;

    public Person (String name) {
        this.name = name;
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
    public void setName(String name) { this.name = name; }

    public static void main(String[] args) {
//        Person eunseo = new Person("손주연");
//        eunseo.age = 1;
//        System.out.println(eunseo.name);

        Person eunseo = new Person("손주연");
        eunseo.setAge(1);
        System.out.println(eunseo.getName());
    }
}
