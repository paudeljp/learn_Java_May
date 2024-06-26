public class stringBuilder_04_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
