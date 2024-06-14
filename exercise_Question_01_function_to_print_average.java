
//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class exercise_Question_01_function_to_print_average {

    public static int printAverage(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.print("Enter third numbers: ");
        int c = sc.nextInt();
        int avg = printAverage(a, b, c);
        System.out.println("The average of three number is: " + avg);
    }
}