
class Car {
    String color;
    String type;

    public void PrintPen() {
        System.out.println("Properties of Car");
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
        car1.type = "Maruti";
        car1.PrintPen();
        car1.printColor();
        car1.printType();

        Car car2 = new Car();
        car2.color = "Blue";
        car2.type = "Honda";
        car2.printColor();
        car2.printType();
        
    }
}
