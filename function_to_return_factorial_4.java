import java.util.*;

public class function_to_return_factorial_4 {

  public static void printfactorial(int n) {

    if (n <= 0) {
      System.out.println("Invalid Number");
      return;
    }
    // for loop
    int factorial = 1;
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;
    }
    System.out.print(factorial);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printfactorial(n);
  }
}
