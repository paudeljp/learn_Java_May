//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class exercise_Question_02_function_to_print_the_sum_of_all_odd_numbers{
    public static int sumofOddNumber(int n) {
        int sum = 0;
        for(int i = 1; i<=n ; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int sum = sumofOddNumber(n);
        System.out.print("the sum of odd number from 1 "+n+"is: " +sum);
    }
}