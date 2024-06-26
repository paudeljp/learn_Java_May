public class string_04_Print_Every_Character_One_by_One {
    public static void main(String[] args) {
        String fname = "John";
        String sname = "Smith";
        String fullname = fname+sname;

        // Loop to Print Each Character
        // The loop runs as long as i is less than the length of the string fullname. fullname.length() returns the number of characters in the string.
        for(int i = 0 ; i < fullname.length() ; i++){

            // Within the loop, this statement prints the character at index i of the string fullname to the console. 
            // The charAt(i) method of the String class returns the character at position i.
        System.out.println(fullname.charAt(i));
        }    
    }   
}

// This program concatenates two strings, "John" and "Smith", to form "JohnSmith". 
// It then uses a for loop to iterate over each character of the concatenated string and prints each character one by one to the console. 