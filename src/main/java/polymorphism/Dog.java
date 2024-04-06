package polymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    public void fetch(){
        System.out.println("Fetching...");
    }
}
