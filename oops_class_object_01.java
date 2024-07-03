
class Pen {
    // define the properties of pen
    String color;
    String type; // ballpen , gel pen

    public void write() {
        System.out.println("color and type of pen1 and pen2");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }

}

public class oops_class_object_01 {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // object of pen1
        pen1.color = "blue"; // accessign the properties of color
        pen1.type = "gel"; // accessing the properties of type

        pen1.write(); // calling the write function/method

        pen1.printColor(); // calling the printColor method

        pen1.printType(); // calling the printType method

        Pen pen2 = new Pen(); // object of pen2
        pen2.color = "red"; // defining the properties of pen2 color
        pen2.type = "ballpen"; // defining the properties to pen2 type

        pen2.printColor(); // calling and printing the pen2 color

        pen2.printType(); // calling and printing the pen2 type
    }
}
