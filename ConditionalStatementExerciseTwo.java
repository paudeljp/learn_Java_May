// Take 2 input from the user as a and b , now compare two a and b if equal , print equal, if a > b print a is greater, if a < b, print a is lesser. 

import java.util.*;

public class ConditionalStatementExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.print(a + " and " + b + " are equal");
        } else if (a > b) {

            System.out.println("a is grater");
        } else {
            System.out.println("a is lesser");
        }

    }
}
