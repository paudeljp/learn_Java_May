/**
 * An interface in Java is a reference type, similar to a class, that can
 * contain only constants, method signatures, default methods, static methods,
 * and nested types. Interfaces cannot contain instance fields or constructors.
 * They are used to achieve abstraction and multiple inheritance in Java.
 * 
 * Here's an example of using an interface in Java. We will define an interface
 * Vehicle and then create two classes, Car and Bike, that implement this
 * interface.
 */

// Interface
interface Vechiclee {
    // Abstract method (no implementation)
    void start();

    void stop();

    // Car class implements the Vechicle interface
    class Carr implements Vechiclee {
        // providing implementation for the abstract methods
        @Override
        public void start() {
            System.out.println("The car is starting");
        }

        @Override
        public void stop() {
            System.out.println("The car has stopped");
        }
    }

    // Bike class implements the Vechicle interface
    class Bikee implements Vechiclee {
        // Providing implementation for the abstract methods
        @Override
        public void start() {
            System.out.println("The bike is Starting");
        }

        @Override
        public void stop() {
            System.out.println("The bike has stopped");
        }
    }
}

public class oops_Interface_07 {
    public static void main(String[] args) {

        // Creating instance of Car and Bike
        Vechiclee carr = new Carr();
        Vechiclee bikee = new Bikee();

        // Starting the car and bike
        carr.start();
        bikee.start();
        // Stopping the car and bike
        bikee.stop();
        bikee.stop();
    }
}

/**
 * Interface: Defines a contract with abstract methods that implementing classes
 * must provide. In this example, Vehicle is the interface.
 * Implementation: Concrete classes (Car and Bike) implement the interface by
 * providing specific implementations of the methods defined in the interface.
 * Usage: In the Main class, we interact with Car and Bike objects through the
 * Vehicle interface, demonstrating how interfaces enable abstraction and
 * polymorphism.
 * This example demonstrates how interfaces are used to define a contract for
 * classes to implement, allowing for abstraction and the ability to use
 * multiple inheritance in Java.
 */