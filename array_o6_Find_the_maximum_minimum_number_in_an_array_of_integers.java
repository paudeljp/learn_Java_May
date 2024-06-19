
//Find the maximum & minimum number in an array of integers. 

public class array_o6_Find_the_maximum_minimum_number_in_an_array_of_integers {
    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7,8};    // 1. Array Initialization

        int max = num[0];   // 2. Initialize Max and Min
        int min = num[0];

        for (int i = 1; i < num.length; i++){   // 3. Iterate Through the Array
            if (num[i] > max){      // 4. Compare and Update Max
                max = num[i];
            }
            if(num[i] < min){       // 5. Compare and Update Min
                min = num[i];
            }
        }
        System.out.println("The greatest number is: "+max);     // 6. Print the Results
        System.out.print("The smallest number is: "+min);
    }
}

Ask numbers from the user and find the maximum & minimum number in an array of integers. 
