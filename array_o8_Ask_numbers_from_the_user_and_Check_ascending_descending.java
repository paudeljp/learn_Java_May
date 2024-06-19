// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

import java.util.*;

public class array_o8_Ask_numbers_from_the_user_and_Check_ascending_descending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        int num = sc.nextInt();

        sc.nextLine();

        int array[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Numbers " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("The entered elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        // Check if the array is in ascending order
        boolean isAscending = true;     // Assume the array is sorted

        for (int i = 0; i < array.length - 1; i++) {       // Loop through the array
            if (array[i] > array[i + 1]) {      // Compare each element with the next one
                isAscending = false;    // If current element is greater, set isAscending to false
            }
            break;  // Exit the loop early

        }
         // Output the result
        if (isAscending) {
            System.out.print("This is ascending");
        } else {
            System.out.print("THis is not ascending");
        }
    }

}