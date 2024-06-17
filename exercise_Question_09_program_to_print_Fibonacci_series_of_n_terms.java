/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.*/
import java.util.*;
public class exercise_Question_09_program_to_print_Fibonacci_series_of_n_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // Number of terms
        int a = 0, b = 1;
        
        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); //Prints the current value of a (which starts at 0 and is the first number in the Fibonacci sequence).
            int next = a + b; //Calculates the next number in the sequence by adding a and b.
            a = b;  //Updates a to be the value of b, preparing for the next iteration.
            b = next;   //Updates b to be the value of next, which is the sum of the previous a and b.
        }
    }
}
