import java.util.*;

public class array_o3_loop_user_input_size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number: ");
        int size = sc.nextInt();

        int marks[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }
}