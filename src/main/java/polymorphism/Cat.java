package polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    public void scratch(){
        System.out.println("Scratch!");
    }
}
