import java.util.*;
public class practice_01_fibonacciSeries{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number: ");
        int num = sc.nextInt();
        int a = 0; int b = 1;
        System.out.print("the fibonassic series for "+num+" is : ");
        for(int i = 0; i < num; i++){
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
     }
}
