public class stringBuilder_03_Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        sb.insert(0, 'S');
        // sb.insert(2, 'n');
        System.out.println(sb); // The output is STony
    }
}
