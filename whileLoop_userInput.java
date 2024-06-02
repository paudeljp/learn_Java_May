//Program to print number as per user input using while loop
import java.util.*;
public class whileLoop_userInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            System.out.print("Enter first number:");
            int a = sc.nextInt();
            System.out.print("Enter Second number:");
            int b = sc.nextInt();
            int i = a;
            while(i<= b){
                System.out.println(i);
                i++;
            }
            System.out.print("Do you want to perform again? (Y/y): ");
            choice = sc.next().charAt(0);
        }
        while(choice == 'y' || choice == 'Y');
        sc.close();
    }
}
