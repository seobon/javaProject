package preparation.preparation_08_inheritance;

public class Animal {
    private String species;
    private String name;
    private int age;
    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }
    public String getSpecies() { return species; }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        this.age = age;
    }
}
