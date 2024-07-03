import java.util.*;
public class insertionSort_01 {

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};

        // insertion sort
        for (int i =0 ; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j -- ;
            }
            //placement
            arr[j+1] = current;
        }
        System.out.print(Arrays.toString(arr));
    }
}
