public class bubble_Sort_02_practice {
    public static void main(String[] args) {
        int arr[] = { 8, 5, 6, 9, 7, 4, 1, 2, 3 };

        boolean sort = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sort = true;
                }
            }
            if (!sort) {
                break;
            }
        }
        for (int i : arr) {  // is an enhanced for loop that iterates through each element in the array arr.
            System.out.print(i + " ");
        }
    }
}
