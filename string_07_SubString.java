public class string_07_SubString {
    public static void main(String[] args) {
        String name = "My name is John Smith";

        // substring(int beginIndex, int endIndex)
        String substr = name.substring(11, name.length()); // length() method automatically calculate the end index.
        // substring(int beginIndex, int endIndex)

        System.out.print(substr);
    }
}
