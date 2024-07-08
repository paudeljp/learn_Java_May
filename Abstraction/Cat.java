package Abstraction;

public class Cat extends Animal {
    // Car class extends the abstract Vechicle class
    // Provide implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
