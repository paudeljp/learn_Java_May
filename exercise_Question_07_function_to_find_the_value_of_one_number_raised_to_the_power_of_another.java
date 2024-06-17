//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class exercise_Question_07_function_to_find_the_value_of_one_number_raised_to_the_power_of_another{

    public static double powerOf(double x, int n) {
        return Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base number x: ");
        double x = sc.nextDouble();
        System.out.print("enter the exponent n: ");
        int n = sc.nextInt();
        double result = powerOf(x, n);
        System.out.print(result);
    }
}