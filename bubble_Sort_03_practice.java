public class bubble_Sort_03_practice {
    public static void bubblesort(int arr[]) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
    
    
    public static void main(String[] args) {
        int arr[] = {5,4,9,8,7,9,2,3,1};
        
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = 0 ; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
        }
        bubblesort(arr);
    }
}
