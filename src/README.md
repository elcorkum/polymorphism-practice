POLYMORPHISM

This is the ability to take many forms
An example of polymorphism is where an object has a superclass type but is an instance of a subclass.

```
Animal dog = new Dog();
```
Here is a superclass Animal with a makeSound() method:

```
public class Animal {
    public void makeSound() {
        System.out.println("This animal makes a sound");
    }
}```
```
It is inherited by the Cat subclass and Dog subclass, with have the inherited makeSound method as well as their own methods:
```
public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    public void fetch(){
        System.out.println("Fetching...");
    }
}
```



```
public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
    
    public void scratch(){
        System.out.println("Scratch!");
    }
}
```
When an instance of a Dog object is created of type Dog, it has acces to the inherited method as well as methods specific to the dog class
```
public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
    }
}
```
However when we create an object of type Animal but instantiate it as Dog, only the methods specific to the animal class are available to it.
It cannot access the fetch() method from the Dog class
```
public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
        
        
        Animal bo = new Dog();
        bo.makeSound();
    }
}
```
Since the object is of type Animal we can change it to a Cat instance:
```
public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
        
        
        Animal bo = new Dog();
        bo.makeSound();
        
        bo = new Cat();
        bo.makeSound();
    }
}
```
This is where true polymorphism lives. At this point, when the makeSound() method is called, it runs the one overriden by the Cat class.
When the object was a dog it was able to run the method overridden by the Dog class.

Bo is unable to access the fetch() or scratch() methods because it is of type animal.
We are able to get around this by casting it as a Cat object or Dog object and this allows for access to the subclass methods
```
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
```

We can check the type of object by using the *****instancof***** operator.
```
public void feed(Animal animal){
if(animal instanceof Dog) {
//this code checks whether the instance variable of animal type object is an instance of the Dog type subclass
}
}
```