import java.util.Arrays;

public class insertionSort_02_practice {
    
    public static void main(String[] args) {
        

        int arr[] = {9,8,7,6,5,4,3,2,1}; // initialization
 
        for(int i = 1 ; i < arr.length ; i++){ // start with 1 not 0;

            int current = arr[i]; // current elements to be inserted

            int j = i - 1; //start comparing with the previous elemets

            while( j >= 0 && current < arr[i-1]){ // comparing
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current; // placement

        }
        System.out.print(Arrays.toString(arr)); //converting arr to string
    }
}
