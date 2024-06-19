//Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;

public class array_o4_Finding_the_index_of_array {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int size = sc.nextInt();

      int number[] = new int[size];

      // input
      for (int i = 0; i < size; i++) {
         System.out.print("Enter numbers: ");
         number[i] = sc.nextInt();
      }

      // Entering the array number
      System.out.print("choose any number: ");
      int x = sc.nextInt();

      // Output
      for (int i = 0; i < number.length; i++) {
         if (number[i] == x) { // Comparing the index number with given number
            System.out.println("the index of given number is: " + i);
         }
      }
   }
}
//This techniques is called linior search in computer
Take an array of names as input from the user and print them on the screen.
