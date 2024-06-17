// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class exercise_Question_03_function_which_takes_in_2_numbers_and_returns_the_greater_of_those_two{

    public static int GreaterNumber(int a, int b) {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int greater = GreaterNumber(a, b);
        System.out.print("the greater number is: "+greater);
    }
}