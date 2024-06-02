//Question: Print the greetings if 1 is pressed print Hello, if 2 is pressed print Namaste, if 3 is pressed print Bonjour

import java.util.*;

public class ConditionalStatementSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.print("Hello");
                break;
            case 2:
                System.out.print("Namaste");
                break;
            case 3:
                System.out.print("Bonjour");
                break;
            default:System.out.print("Invalid number");
                
        }
    }
}