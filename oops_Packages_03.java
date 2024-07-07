// import the Addition and Subtraction classes using the import statement.

import calculator.Addition;
import calculator.Substraction;


public class oops_Packages_03 {
    public static void main(String[] args) {
        Addition addition = new Addition();

        Substraction substraction = new Substraction();

        int sum = addition.add(10, 5);
        int difference = substraction.Substract(10, 5);

        System.out.println("Addition: "+sum);
        System.out.println("Subtraction: "+difference);
    }
}
// In this oops_Packages_03 method, we create instances of Addition and Subtraction classes.
// We use these instances to perform addition and subtraction, and print the results.