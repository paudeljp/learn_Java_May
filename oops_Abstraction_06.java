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

// Abstract class
abstract class Vechicle {
    // Abstract method (no implementation)
    public abstract void start();

    // Concrete method
    public void stop() {
        System.out.println("The vechicle has stopped. ");
    }
}

// Car class extends the abstract Vechicle class
class Car extends Vechicle {
    // Providing implementation for the abstract method
    @Override
    public void start() {
        System.out.println("The car is starting. ");
    }
}

// Bike class extends the abstract Vechicle class

class Bike extends Vechicle {
    // Providing implementation for the abstract method
    @Override
    public void start() {
        System.out.println("The bike is starting.");
    }
}

public class oops_Abstraction_06 {
    public static void main(String[] args) {
        // Creating instance of Car and Bike
        Vechicle car = new Car();
        Vechicle bike = new Bike();

        // Starting the car and bike
        car.start();
        bike.start();

        // Stopping the car and bike
        car.stop();
        bike.stop();
    }
}

/**
 * Output is:
 * The car is starting.
 * The bike is starting.
 * The vehicle has stopped.
 * The vehicle has stopped.
 * 
 */