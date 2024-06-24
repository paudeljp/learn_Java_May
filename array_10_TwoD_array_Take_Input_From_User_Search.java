//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;
public class array_10_TwoD_array_Take_Input_From_User_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of columns: ");
        int cols = sc.nextInt();

        //Initilization
        int array[][] = new int[rows][cols];

        //User Input
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.print("Choose any number: ");
        int x = sc.nextInt();
        
        boolean found = false;

        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < cols; j++){
                if(array[i][j] == x){
                    System.out.print("The indices of x i.e rows "+i+ "and column "+j);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("The number not found");
        }
        sc.close();
    }

}