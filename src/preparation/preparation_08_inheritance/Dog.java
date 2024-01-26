package preparation.preparation_08_inheritance;

public class Dog extends Animal{
    private String personality;
    public Dog (String name, int age) {
        setSpecies("Dog");
        setName(name);
        setAge(age);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
    public void seeStranger () {
        System.out.println("Growl");
    }
    public String getPersonality() {
        return personality;
    }
    public void setPersonality(String personality) {
        this.personality = personality;
    }
}
