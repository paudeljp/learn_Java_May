
//Program to take input from user and print numbers
import java.util.*;

public class foorloop_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter First number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int i;
            for (i = a; i <= b; i++) {
                System.out.println(i);
            }
            System.out.print("Do you want to perform again? enter (y/Y): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
        sc.close();

    }
}
