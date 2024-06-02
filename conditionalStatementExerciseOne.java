//Check if the entered number is even number or odd
import java.util.*;

public class conditionalStatementExerciseOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        sc.close();
        if(number % 2 == 0){
            System.out.print("the entered number is even");
        }
        else{
            System.out.print("The entered number is odd");
        }
    }
}
