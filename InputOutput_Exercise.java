import java.util.*;

public class InputOutput_Exercise {
    //Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radious of the circle:");
        double radious = sc.nextDouble();
        sc.close();
        double circumference = 2 * Math.PI * radious;
        double area = Math.PI * Math.pow(radious, 2);

        System.out.println("the radious of circle is:" + radious);
        System.out.println("The circumference of circle is: " + circumference);
        System.out.println("the area of circle is: " + area);

    }
}
