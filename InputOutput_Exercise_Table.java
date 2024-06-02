//Make a program that prints the table of a number that is input by the user.
// (HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)

import java.util.*;

public class InputOutput_Exercise_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int number1 = sc.nextInt();
        sc.close();
        int number2 = number1 * 2;
        int number3 = number1 * 3;
        int number4 = number1 * 4;
        int number5 = number1 * 5;
        int number6 = number1 * 6;
        int number7 = number1 * 7;
        int number8 = number1 * 8;
        int number9 = number1 * 9;
        int number10 = number1 * 10;
        System.out.println(number1 + " x 1 = " + number1);
        System.out.println(number1 + " x 2 = " + number2);
        System.out.println(number1 + " x 3 = " + number3);
        System.out.println(number1 + " x 4 = " + number4);
        System.out.println(number1 + " x 5 = " + number5);
        System.out.println(number1 + " x 6 = " + number6);
        System.out.println(number1 + " x 7 = " + number7);
        System.out.println(number1 + " x 8 = " + number8);
        System.out.println(number1 + " x 9 = " + number9);
        System.out.println(number1 + " x 10 = " + number10);

    }

}
