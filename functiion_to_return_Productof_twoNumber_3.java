import java.util.*;

public class functiion_to_return_Productof_twoNumber_3 {
    public static int product(int a, int b){
                return a * b;
    }

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
     System.out.print("Product is: "+ product(a,b));
   }
}
