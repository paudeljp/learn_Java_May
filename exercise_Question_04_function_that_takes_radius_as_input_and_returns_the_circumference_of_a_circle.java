//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class exercise_Question_04_function_that_takes_radius_as_input_and_returns_the_circumference_of_a_circle{
    public static double circumference(int r){
        double c = 2*(Math.PI)*r;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radious value: ");
        int r = sc.nextInt();
        double c = circumference(r);
        System.out.print("The circumference is: "+c);
    }
}