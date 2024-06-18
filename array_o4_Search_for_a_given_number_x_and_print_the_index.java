
//Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;

public class array_o4_Search_for_a_given_number_x_and_print_the_index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size: ");
        int size = sc.nextInt();

        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array numbers: ");
            num[i] = sc.nextInt();
        }

        System.out.print("choose any number: ");
        int x = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.print("The index of given number is: " + i);
            }
        }
    }
}