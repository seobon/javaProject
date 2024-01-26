package preparation.preparation_08_inheritance;

public class Cat extends Animal {
    private boolean flexibility;
    public Cat (String name, int age) {
        setSpecies("Cat");
        setName(name);
        setAge(age);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    public void Happy () {
        System.out.println("Purr");
    }
    public boolean isFlexibility() {
        return flexibility;
    }
    public void setFlexibility(boolean flexibility) {
        this.flexibility = flexibility;
    }
}
