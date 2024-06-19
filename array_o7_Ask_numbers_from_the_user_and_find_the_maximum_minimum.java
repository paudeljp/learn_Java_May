
// Ask_numbers_from_the_user_and_find_the_maximum_minimum_number_in_an_arrayof_integers
 import java.util.*;
public class array_o7_Ask_numbers_from_the_user_and_find_the_maximum_minimum_number_in_an_arrayof_integers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any numbers: ");
        int numb = sc.nextInt();
        sc.nextLine();
        int array[] = new int[numb];

       int max = array[0];
       int min = array[0];

        for(int i = 0; i < numb; i++){
            System.out.print("Entered number "+(i+1)+": ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < numb; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Max number is: "+max);
        System.out.print("Min number is: "+min);
        sc.close();
    }
   
}
 
