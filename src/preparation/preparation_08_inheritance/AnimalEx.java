package preparation.preparation_08_inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        Cat cat = new Cat("샤키", 31);
        cat.makeSound();
        cat.setFlexibility(true);
        cat.Happy();

        Dog dog = new Dog("근덕이", 27);
        dog.makeSound();
        dog.setPersonality("brave");
        dog.seeStranger();
    }
}