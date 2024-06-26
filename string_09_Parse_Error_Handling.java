// It's often a good idea to include error handling (e.g., try-catch block) to manage potential NumberFormatException when parsing strings to integers:

public class string_09_Parse_Error_Handling {
    public static void main(String[] args) {
        String abc = "123";

        try {
            int num = Integer.parseInt(abc);
            System.out.println(num);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
