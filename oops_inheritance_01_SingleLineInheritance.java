
class Circle {
    public void area() {
        System.out.println("Area of circle is");
    }
}

class Calc extends Circle {
    public void printArea(int r) {
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}

public class oops_inheritance_01_SingleLineInheritance {
    public static void main(String[] args) {
        Calc sc = new Calc();
        sc.area();
        sc.printArea(4);
    }
}
