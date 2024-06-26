public class string_06_comparing_string {
    public static void main(String[] args) {
        String first = "hello";
        String second = "wello";

        // String Comparison
        if (first.compareTo(second) > 0) {
            System.out.print("First String is greater");
        } else if (first.compareTo(second) < 0) {
            System.out.print("Second String is greater");
        } else {
            System.out.print("both String are equal");
        }
    }
}
