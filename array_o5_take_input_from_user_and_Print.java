
//Take an array of names as input from the user and print them on the screen.
import java.util.*; // imports the necessary utilities.

public class array_o5_take_input_from_user_and_Print { 

    public static void main(String[] args) { // // It defines a class and a main method.
        Scanner sc = new Scanner(System.in);  // This line creates a Scanner object named sc that reads input 
        System.out.print("Enter the number of user: ");
        int num = sc.nextInt(); // It prompts the user to enter the number of names and reads that number.

        sc.nextLine();   // This line reads and discards the newline character left by nextInt().

        String user[] = new String[num]; // This line creates a String array named user with a size of num. This array will hold the names entered by the user.

        for (int i = 0; i < num; i++) {  //  it prompts the user to enter a name and stores the entered name in the user array at the corresponding index.
            System.out.print("Enter name: " + (i + 1) + ": ");
            user[i] = sc.nextLine();
        }

        System.out.println("Users name are: "); // These lines print all the names stored in the user array. The enhanced for loop (for (String name : user)) iterates through each element in the user array and prints it.
        for (String names : user) {
            System.out.println(names);
        }
        sc.close(); // This line closes the Scanner object. It's good practice to close the Scanner when it's no longer needed to free up system resources.
    }

}

