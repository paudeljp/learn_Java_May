import java.util.*;

public class functiion_to_return_sumof_twoNumber_2 {
    
    public static int addfunction(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        int sum = addfunction(a, b);
        System.out.print("Sum of a and b is: "+ sum);

    }
}
