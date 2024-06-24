// Take input from user and print the same numbers in 2 D array

import java.util.*;

public class array_09_TwoD_array_to_Take_Input_Print_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        //initialization of 2D arry

        int numbers[][] = new int[rows][columns];

        // Input
        for(int i =0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
