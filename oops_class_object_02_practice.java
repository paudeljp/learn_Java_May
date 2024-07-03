
class Car {
    String color;
    String type;

    public void PrintPen() {
        System.out.println("Properties of pen");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class oops_class_object_02_practice {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.type = "Blue";

        car1.PrintPen();
        car1.printColor();
        car1.printType();
    }
}
