import java.util.*;

public class array_o5_Search_for_ {

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