public class arrayObject {
    public static void main(String[] args) {
        // To initialize an array we use the new operatot and another set of square brackets like this:
        // This statement tells the compiler to set up spave for 25 ints.
        int[] number = new int[15];
        System.out.println(number.length);
        // System.out.println(number.getClass().getName());
        // Now we can set the value of the first int in the array.
        number[0] = 1;
        System.out.println(number[0]);
        number[14] = 15;
        System.out.println(number[14]);
    }

}
