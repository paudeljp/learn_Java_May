//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class exercise_Question_06_function_to_display_the_count_of_positive_negative_and_zeros_entered {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        String check;

        do {
            System.out.print("Enter any number: ");
            int num = sc.nextInt();
            if (num > 0) {
                positive++; //positive = positive + 1
            } else if (num < 0) {
                negative++; //negative = negative + 1
            } else {
                zero++; //zero = zero + 1
            }
            System.out.print("enter y/n: ");
            check = sc.next();
        } while (check.equalsIgnoreCase("y"));
        {
            System.out.println("Count of positive number is: " + positive);
            System.out.println("Count of negative number is: " + negative);
            System.out.println("Count of zero is: " + zero);
            sc.close();
        }
    }
}