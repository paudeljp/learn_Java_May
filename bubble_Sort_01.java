// This Java program demonstrates the Bubble Sort algorithm, which is used to sort an array of integers in ascending order. 

public class bubble_Sort_01 {
    public static void main(String[] args) {
        // Array Initialization
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {      // Outer Loop: This loop controls the number of passes through the array. Each pass moves the next largest element to its correct position.
            for (int j = 0; j < arr.length - i - 1; j++) {         // Inner Loop: This loop compares adjacent elements and swaps them if they are in the wrong order. The - i part ensures that already sorted elements at the end of the array are not considered in subsequent passes.
                if (arr[j] > arr[j + 1]) {      // Swapping Elements: Checks if the current element is greater than the next element.
                    int temp = arr[j];          // If true, it swaps arr[j] and arr[j + 1] using a temporary variable temp.
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // After sorting the array, the code prints the elements of the sorted array
        for (int i = 0; i < arr.length; i++) {      // Iterates through each element of the array and prints it followed by a space.
            System.out.print(arr[i] + " ");         // Prints a newline character to move to the next line after printing the array.
        }
        System.out.println();
    }   
}
// This code sorts the array {7, 8, 3, 1, 2} into {1, 2, 3, 7, 8} and prints the sorted array.