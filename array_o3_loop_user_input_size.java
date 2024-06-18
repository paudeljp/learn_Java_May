import java.util.*;

public class array_o3_loop_user_input_size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any array size: ");
        int size = sc.nextInt();

        int marks[] = new int[size];

        //Input
        for(int i = 0 ; i < size; i++){
            System.out.print("enter numbers: ");
            marks[i] = sc.nextInt();
        }

        //Output
        for (int i = 0; i < size; i++) {
            System.out.println("Output is: "+ marks[i]);
        }
    }
}