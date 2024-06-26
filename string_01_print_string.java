// Print String
import java.util.*;
public class string_01_print_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); //nextLine(); prints full line. whereas next only takes word before the spaces.
        System.out.print("Full Name: "+name);
    }
}
