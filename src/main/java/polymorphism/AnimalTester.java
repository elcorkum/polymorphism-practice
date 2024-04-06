package polymorphism;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();


        Animal bo = new Dog();
        bo.makeSound();

        bo = new Cat();
        bo.makeSound();
        ((Cat) bo).scratch();
    }
}
