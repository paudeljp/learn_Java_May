/**
 * Abstraction in Java is the concept of hiding the complex implementation
 * details and showing only the essential features of the object.
 * It is one of the core concepts of Object-Oriented Programming (OOP). In Java,
 * abstraction is achieved using abstract classes and interfaces.
 * 
 * Example: Let's create an example to illustrate abstraction using an abstract
 * class.
 * We'll define an abstract class Vehicle and derive specific vehicle types like
 * Car and Bike from it.
 */

package Abstraction;

public class oops_abstraction {

    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the makeSound method on both objects
        dog.makeSound(); // Outputs: Woof
        cat.makeSound(); // Outputs: Meow

        // Call the eat method on both objects
        dog.eat(); // Outputs: This animal is eating.
        cat.eat(); // Outputs: This animal is eating.
    }

}

/*
 * Abstraction: Achieved by using abstract classes and methods. The Animal
 * class provides a template for its subclasses.
 * Implementation: Specific details are provided by the concrete subclasses (Cat
 * and Dog), which implement the abstract method makeSound().
 * Usage: In the Main class, we create instances of the concrete classes and
 * call their methods, demonstrating the abstraction concept.
 */