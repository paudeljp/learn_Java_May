public class string_03_length_of_String {       //Class Definition
    
    //Main Method, The main method is static and public, meaning it can be called without creating an instance of the class, and it takes an array of String arguments.
    public static void main(String[] args) { 
        
        // Variable Declarations and Initialization
        String firstname = "John";
        String secondname = "Smith";

        // String Concatenation
        String fullname = firstname + secondname;

        // Printing the Length of the Concatenated String
        // The length() method of the String class returns the number of characters in the string. For "JohnSmith", the length is 9.
        System.out.println(fullname.length());
    }
}
