//For a given matrix of N x M, print its transpose.

import java.util.*;
public class array_11_TwoD_Array_For_a_given_matrix_of_NxM_print_its_transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix array size, rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the matrix array size, rows: ");
        int cols = sc.nextInt();

        //Initializing
        int matrix[][] = new int[rows][cols];

        //User Input
        for(int i = 0; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Transpose of given matrix
        System.out.print("The transpose of given matrix is: \n");
        for(int j = 0 ; j < cols ; j++){
            for(int i = 0 ; i < rows ; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
