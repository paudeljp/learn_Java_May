package Abstraction;

public abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("This animal is eating.");
    }
}
