
// Ask_numbers_from_the_user_and_find_the_maximum_minimum_number_in_an_arrayof_integers
 import java.util.*;
public class array_o7_Ask_numbers_from_the_user_and_find_the_maximum_minimum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numb = sc.nextInt();
        sc.nextLine();
        
        int array[] = new int[numb];

        for(int i = 0; i < numb; i++){
            System.out.print("Entered number "+(i+1)+": ");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for(int i = 1; i < array.length; i++){
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
 
