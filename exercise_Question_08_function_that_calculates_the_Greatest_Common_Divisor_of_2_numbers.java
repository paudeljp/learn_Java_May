//Write a function that calculates the Greatest Common Divisor of 2 numbers
import java.util.Scanner;
public class exercise_Question_08_function_that_calculates_the_Greatest_Common_Divisor_of_2_numbers{

    public static int GCD(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a  % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("the Greatest Common Divisor of 2 numbers: "+ GCD(num1, num2));
    }
}