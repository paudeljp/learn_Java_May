//Print the sum of first n natural number using for loop
import java.util.*;
public class forLoop_Sum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
    
}
