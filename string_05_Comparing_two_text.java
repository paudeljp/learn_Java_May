public class string_05_Comparing_two_text {
    public static void main(String[] args) {
        String fname = "aaaa";
        String Sname = "aaaa";
        
        // The compareTo method compares the two strings lexicographically.
        // == 0: This checks if the result of the comparison is zero, meaning the strings are equal.
        if (fname.compareTo(Sname) == 0) {
            System.out.print("String are equal");
        }
        else{
            System.out.print("String are not equal");
        }
    }
}
