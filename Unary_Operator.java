public class Unary_Operator {
    public static void main(String[] args) {
        int a = 10;

        // Pre-increment
        System.out.println("Pre-increment: " + (++a)); // Output: 11
        // Post-increment
        System.out.println("Post-increment: " + (a++)); // Output: 11
        System.out.println("Value after post-increment: " + a); // Output: 12

        // Pre-decrement
        System.out.println("Pre-decrement: " + (--a)); // Output: 11
        // Post-decrement
        System.out.println("Post-decrement: " + (a--)); // Output: 11
        System.out.println("Value after post-decrement: " + a); // Output: 10
    }
}