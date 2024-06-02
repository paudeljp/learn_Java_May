// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.*; // Import Scanner class for user input

public class ConditionalStatementExerciseCalculator { // Define a class named ConditionalStatementExerciseCalculator
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        double num1, num2; // Declare variables to store numbers and result
        char choice; // Declare a variable to store operator

        do { // Start a do-while loop
            System.out.print("Enter first number: "); // Prompt user to enter first number

            num1 = sc.nextDouble(); // Read the first number from user input

            System.out.println("Enter Operation (+, -, *, /, %) or N to Quit"); // Prompt user to enter operator or 'q'
                                                                                // // to quit
            char operator = sc.next().charAt(0); // Read the operator from user input

            System.out.print("Enter Second Number: "); // Prompt user to enter second number

            num2 = sc.nextDouble(); // Read the second number from user input

            double result = 0;

            switch (operator) { // Start a switch statement based on the operator
                case '+': // If operator is addition
                    result = num1 + num2; // Perform addition
                    System.out.println("Sum = " + result); // Display the result
                    break; // Exit the switch statement
                case '-': // If operator is subtraction
                    result = num1 - num2; // Perform subtraction
                    System.out.println("Diff = " + result); // Display the result
                    break; // Exit the switch statement
                case '*': // If operator is multiplication
                    result = num1 * num2; // Perform multiplication
                    System.out.println("Multiply = " + result); // Display the result
                    break; // Exit the switch statement
                case '/': // If operator is division
                    if (num2 != 0) { // Check if second number is not zero
                        result = num1 / num2; // Perform division
                        System.out.println("Divide = " + result); // Display the result
                    } else { // If second number is zero
                        System.out.println("Cannot devide by Zero"); // Display error message
                    }
                    break; // Exit the switch statement
                case '%': // If operator is modulo
                    if (num2 != 0) { // Check if second number is not zero
                        result = num1 % num2; // Perform modulo
                        System.out.println("Reminder = " + result); // Display the result
                    } else { // If second number is zero
                        System.out.println("Zero is not accepted"); // Display error message
                    }
                    break; // Exit the switch statement
                default: { // If operator is invalid
                    System.out.println("Invalid Input"); // Display error message
                    result = Double.NaN; // NaN - Not a Number
                }
            }
            System.out.print("Do you want to perform another calculation? (Y/N)");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y'); // Repeat the loop until user enters 'n' to quit
        sc.close(); // Close the Scanner object
    }
}
